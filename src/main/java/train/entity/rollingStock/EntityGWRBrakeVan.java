package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityGWRBrakeVan extends GenericRailTransport {

    public EntityGWRBrakeVan(World worldObj) {
        super(worldObj);
    }

    public EntityGWRBrakeVan(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityGWRBrakeVan((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "GWR Toad Brake Van";}
    @Override
    public String transportcountry(){return "us";}
    @Override
    public String transportYear(){return "1894-1947";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.WORKCAR.singleton();
    }
    @Override
    public float weightKg(){return 18143.7f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelGWRBrakeVan()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GWRBrakeVan.png","GWRBrakeVan", "description.GWRBrakeVan"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"GWRBrakeVan";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.crafting_table, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), 
                new ItemStack(Blocks.planks, 8), null, new ItemStack(ItemIDs.woodenCab.item, 1), 
                null, null, new ItemStack(Blocks.furnace, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.6f, -0.2f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.8f,2.6f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{2.0f, -2.0f};}



    //these only change in very specific use cases.
    @Override
    public boolean shouldRiderSit(){
        return true;
    }
    @Override
    public Item getItem(){return thisItem;}
    @Override
    public float getMaxFuel(){return 1;}

}