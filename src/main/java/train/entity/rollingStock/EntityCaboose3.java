package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityCaboose3 extends GenericRailTransport {

    public EntityCaboose3(World worldObj) {
        super(worldObj);
    }

    public EntityCaboose3(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityCaboose3((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Caboose Black";}
    @Override
    public String transportcountry(){return "us";}
    @Override
    public String transportYear(){return "1863";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.WORKCAR.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelCaboose3()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.44f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, -90.0f, -180.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/caboose3.png","caboose3", "description.caboose3"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"caboose3";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.planks, 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2),
                new ItemStack(Items.iron_ingot, 2), null, new ItemStack(ItemIDs.woodenCab.item, 1),
                null, null, new ItemStack(ItemIDs.seats.item, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{2.5999999046325684f,2.1f,1.1f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.0399999618530273f, -1.0399999618530273f};}



    //these only change in very specific use cases.
    @Override
    public boolean shouldRiderSit(){
        return false;
    }
    @Override
    public Item getItem(){return thisItem;}
    @Override
    public float getMaxFuel(){return 1;}

}
