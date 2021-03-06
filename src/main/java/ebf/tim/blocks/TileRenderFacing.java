package ebf.tim.blocks;

import ebf.tim.TrainsInMotion;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class TileRenderFacing extends TileEntity {
    public byte facing =-1;
    private Integer blockGLID =null;
    private AxisAlignedBB boundingBox = null;
    private BlockDynamic host;

    public TileRenderFacing(BlockDynamic block){
        host=block;
    }

    public TileRenderFacing setFacing(int direction){
        facing=(byte) direction;
        this.markDirty();
        return this;
    }

    @Override
    public void func_145828_a(CrashReportCategory r){
        if(r==null){
            if(blockGLID ==null){
                if(host.texture!=null) {
                    Minecraft.getMinecraft().getTextureManager().bindTexture(host.texture);
                }
                blockGLID=org.lwjgl.opengl.GL11.glGenLists(1);
                org.lwjgl.opengl.GL11.glNewList(blockGLID, org.lwjgl.opengl.GL11.GL_COMPILE);
                GL11.glPushMatrix();
                if(host.texture==null){
                    GL11.glDisable(GL11.GL_TEXTURE_2D);
                }
                TextureManager.adjustLightFixture(worldObj,xCoord,yCoord,zCoord);
                GL11.glTranslatef(0.5f,0.5f,0.5f);
                if(host.rotates){
                    switch (facing){
                        //north
                        case 0:{GL11.glRotatef(90,0,1,0);break;}
                        //east
                        case 1:{GL11.glRotatef(180,0,1,0);break;}
                        //south
                        case 2:{GL11.glRotatef(270,0,1,0);break;}
                        //west
                        case 3:{break;}
                    }
                }

                if(host.model!=null) {
                    host.model.render(null, 0, 0, 0, 0, 0, 0);
                } else {
                    cube.render();
                }

                if(host.texture==null){
                    GL11.glEnable(GL11.GL_TEXTURE_2D);
                }
                GL11.glPopMatrix();
                org.lwjgl.opengl.GL11.glEndList();

            } else {

                if(!org.lwjgl.opengl.GL11.glIsList(blockGLID)){
                    blockGLID=null;
                    return;
                }
                if(host.texture==null){
                    GL11.glDisable(GL11.GL_TEXTURE_2D);
                    org.lwjgl.opengl.GL11.glCallList(blockGLID);
                    GL11.glEnable(GL11.GL_TEXTURE_2D);
                } else {
                    org.lwjgl.opengl.GL11.glCallList(blockGLID);
                }
                if(ebf.tim.utility.ClientProxy.disableCache){
                    org.lwjgl.opengl.GL11.glDeleteLists(blockGLID,1);
                    blockGLID =null;
                }
            }
        } else{
            super.func_145828_a(r);
        }
    }

    @Override
    public boolean canUpdate(){return false;}

    @Override
    public void updateEntity(){}

    @Override
    public boolean shouldRefresh(Block oldBlock, Block newBlock, int oldMeta, int newMeta, World world, int x, int y, int z) {
        return (oldBlock != newBlock);
    }

    @Override
    public void markDirty() {
        super.markDirty();
        if(this.worldObj != null) {
            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
            worldObj.markTileEntityChunkModified(xCoord, yCoord, zCoord, this);
            this.worldObj.func_147453_f(this.xCoord, this.yCoord, this.zCoord, host);
            if (worldObj.isRemote && blockGLID != null) {
                org.lwjgl.opengl.GL11.glDeleteLists(blockGLID, 1);
                blockGLID = null;
            }
        }
    }

    @Override
    public void onChunkUnload() {
        if(TrainsInMotion.proxy.isClient() && blockGLID!=null){
            org.lwjgl.opengl.GL11.glDeleteLists(blockGLID, 1);
            blockGLID = null;
        }
    }

    @Override
    public S35PacketUpdateTileEntity getDescriptionPacket() {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        writeToNBT(nbttagcompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, nbttagcompound);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        super.onDataPacket(net, pkt);
        if(pkt ==null){return;}
        readFromNBT(pkt.func_148857_g());
        markDirty();
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (boundingBox == null) {
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord+1, yCoord, zCoord+1);
        }
        return boundingBox;
    }

    @Override
    public void writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);
        if(host.rotates) {
            tag.setByte("f", facing);
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        super.readFromNBT(tag);
        if(host.rotates) {
            facing = tag.getByte("f");
        }
        markDirty();
    }

    private static final ModelRendererTurbo cube = new ModelRendererTurbo((ModelBase) null, 0,0,64,32).addBox(-8,-8,-8,16,16,16);

}
