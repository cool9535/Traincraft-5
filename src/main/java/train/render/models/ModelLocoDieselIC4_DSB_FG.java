// Date: 2017-04-23 7:14:42 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package train.render.models;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelLocoDieselIC4_DSB_FG extends ModelBase
{
  //fields
  ModelRendererTurbo Left1;
  ModelRendererTurbo Left2;
  ModelRendererTurbo Left3;
  ModelRendererTurbo Floor1;
  ModelRendererTurbo Floor2;
  ModelRendererTurbo Ceiling;
  ModelRendererTurbo Right1;
  ModelRendererTurbo Right2;
  ModelRendererTurbo Right3;
  ModelRendererTurbo WallToCab;
  ModelRendererTurbo MiddleWall1;
  ModelRendererTurbo MiddleWall2;
  ModelRendererTurbo BackWall;
  ModelRendererTurbo Wheels1;
  ModelRendererTurbo Wheels2;
  ModelRendererTurbo Seats1;
  ModelRendererTurbo Seats2;
  ModelRendererTurbo Seats3;
  ModelRendererTurbo Seats4;
  ModelRendererTurbo Seats5;
  ModelRendererTurbo Seats6;
  ModelRendererTurbo Seats7;
  ModelRendererTurbo Seats8;
  ModelRendererTurbo Seats9;
  ModelRendererTurbo Seats10;
  ModelRendererTurbo Seats11;
  ModelRendererTurbo Seats12;
  ModelRendererTurbo Seats13;
  ModelRendererTurbo Seats14;
  ModelRendererTurbo Seats15;
  ModelRendererTurbo Seats16;
  ModelRendererTurbo Seats17;
  ModelRendererTurbo Seats18;
  ModelRendererTurbo Seats19;
  ModelRendererTurbo Seats20;
  ModelRendererTurbo Seats21;
  ModelRendererTurbo Seats22;
  ModelRendererTurbo Seats23;
  ModelRendererTurbo Seats24;
  ModelRendererTurbo Seats25;
  ModelRendererTurbo Seats26;
  ModelRendererTurbo Seats27;
  ModelRendererTurbo Seats28;
  ModelRendererTurbo Seats29;
  ModelRendererTurbo Seats30;
  ModelRendererTurbo Seats31;
  ModelRendererTurbo Seats32;
  ModelRendererTurbo Seats33;
  ModelRendererTurbo Seats34;
  ModelRendererTurbo Seats35;
  ModelRendererTurbo Seats36;
  ModelRendererTurbo Seats37;
  ModelRendererTurbo Seats38;
  ModelRendererTurbo Seats39;
  ModelRendererTurbo Seats40;
  ModelRendererTurbo Seats41;
  ModelRendererTurbo Seats42;
  ModelRendererTurbo Seats43;
  ModelRendererTurbo Seats44;
  ModelRendererTurbo Seats45;
  ModelRendererTurbo Seats46;
  ModelRendererTurbo Seats47;
  ModelRendererTurbo Seats48;
  ModelRendererTurbo Right4;
  ModelRendererTurbo Left4;
  ModelRendererTurbo Bottom;
  ModelRendererTurbo TranConnector1;
  ModelRendererTurbo TranConnector2;
  ModelRendererTurbo TranConnector3;
  ModelRendererTurbo TranConnector4;
  ModelRendererTurbo TrainConnector5;
  ModelRendererTurbo TrainConnector6;
  ModelRendererTurbo TrainConnector7;
  ModelRendererTurbo TrainConnector8;
  ModelRendererTurbo TrainConnector9;
  ModelRendererTurbo TrainConnector10;
  ModelRendererTurbo TranConnector11;
  ModelRendererTurbo TranConnector12;
  ModelRendererTurbo TrainConnector13;
  ModelRendererTurbo TrainConnector14;
  ModelRendererTurbo TranConnector15;
  ModelRendererTurbo TranConnector16;

  public ModelLocoDieselIC4_DSB_FG()
  {
    int textureWidth = 256;
    int textureHeight = 256;

    Left1 = new ModelRendererTurbo(this, 202, 0, textureWidth, textureHeight);
    Left1.addBox(0F, 0F, 0F, 2, 111, 6);
    Left1.setRotationPoint(9F, 18F, -1F);
    Left1.mirror = true;
    setRotation(Left1, 1.570796F, 0F, 0.2230717F);
    Left2 = new ModelRendererTurbo(this, 111, 0, textureWidth, textureHeight);
    Left2.addBox(0F, 0F, 0F, 2, 111, 15);
    Left2.setRotationPoint(10.1F, 13F, -1F);
    Left2.mirror = true;
    setRotation(Left2, 1.570796F, 0F, 0F);
    Left3 = new ModelRendererTurbo(this, 146, 0, textureWidth, textureHeight);
    Left3.addBox(0F, 0F, 0F, 2, 111, 6);
    Left3.setRotationPoint(10.25F, -1F, -1F);
    Left3.mirror = true;
    setRotation(Left3, 1.570796F, 0F, -0.2230717F);
    Floor1 = new ModelRendererTurbo(this, 0, 0, textureWidth, textureHeight);
    Floor1.addBox(0F, 0F, 0F, 20, 117, 1);
    Floor1.setRotationPoint(-10F, 18F, -4F);
    Floor1.mirror = true;
    setRotation(Floor1, 1.570796F, 0F, 0F);
    Floor2 = new ModelRendererTurbo(this, 25, 125, textureWidth, textureHeight);
    Floor2.addBox(0F, 0F, 0F, 21, 117, 1);
    Floor2.setRotationPoint(-10F, 14F, -4F);
    Floor2.mirror = true;
    setRotation(Floor2, 1.570796F, 0F, 0F);
    Ceiling = new ModelRendererTurbo(this, 163, 0, textureWidth, textureHeight);
    Ceiling.addBox(0F, 0F, 0F, 18, 111, 1);
    Ceiling.setRotationPoint(-8F, -6F, -1F);
    Ceiling.mirror = true;
    setRotation(Ceiling, 1.570796F, 0F, 0F);
    Right1 = new ModelRendererTurbo(this, 59, 0, textureWidth, textureHeight);
    Right1.addBox(0F, 0F, 0F, 2, 111, 6);
    Right1.setRotationPoint(-10F, 18.3F, -1F);
    Right1.mirror = true;
    setRotation(Right1, 1.570796F, 0F, -0.2230717F);
    Right2 = new ModelRendererTurbo(this, 76, 0, textureWidth, textureHeight);
    Right2.addBox(0F, 0F, 0F, 2, 111, 15);
    Right2.setRotationPoint(-11.2F, 13F, -1F);
    Right2.mirror = true;
    setRotation(Right2, 1.570796F, 0F, 0F);
    Right3 = new ModelRendererTurbo(this, 42, 0, textureWidth, textureHeight);
    Right3.addBox(0F, 0F, 0F, 2, 111, 6);
    Right3.setRotationPoint(-11F, -2F, -1F);
    Right3.mirror = true;
    setRotation(Right3, 1.570796F, 0F, 0.3346075F);
    WallToCab = new ModelRendererTurbo(this, 196, 234, textureWidth, textureHeight);
    WallToCab.addBox(0F, 0F, 0F, 20, 20, 1);
    WallToCab.setRotationPoint(-10F, -6F, 0F);
    WallToCab.mirror = true;
    setRotation(WallToCab, 0F, 0F, 0F);
    MiddleWall1 = new ModelRendererTurbo(this, 196, 212, textureWidth, textureHeight);
    MiddleWall1.addBox(0F, 0F, 0F, 20, 20, 1);
    MiddleWall1.setRotationPoint(-10F, -6F, 68F);
    MiddleWall1.mirror = true;
    setRotation(MiddleWall1, 0F, 0F, 0F);
    MiddleWall2 = new ModelRendererTurbo(this, 196, 168, textureWidth, textureHeight);
    MiddleWall2.addBox(0F, 0F, 0F, 20, 20, 1);
    MiddleWall2.setRotationPoint(-9F, -6F, 48F);
    MiddleWall2.mirror = true;
    setRotation(MiddleWall2, 0F, 0F, 0F);
    BackWall = new ModelRendererTurbo(this, 196, 190, textureWidth, textureHeight);
    BackWall.addBox(0F, 0F, 0F, 21, 20, 1);
    BackWall.setRotationPoint(-10F, -6F, 108F);
    BackWall.mirror = true;
    setRotation(BackWall, 0F, 0F, 0F);
    Wheels1 = new ModelRendererTurbo(this, 124, 186, textureWidth, textureHeight);
    Wheels1.addBox(0F, 0F, 0F, 6, 21, 10);
    Wheels1.setRotationPoint(11F, 18F, -5F);
    Wheels1.mirror = true;
    setRotation(Wheels1, 0F, 0F, 1.570796F);
    Wheels2 = new ModelRendererTurbo(this, 134, 151, textureWidth, textureHeight);
    Wheels2.addBox(0F, 0F, 0F, 6, 21, 11);
    Wheels2.setRotationPoint(11F, 18F, 104F);
    Wheels2.mirror = true;
    setRotation(Wheels2, 0F, 0F, 1.570796F);
    Seats1 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats1.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats1.setRotationPoint(-9F, 12F, 11F);
    Seats1.mirror = true;
    setRotation(Seats1, 0F, 0F, 0F);
    Seats2 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats2.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats2.setRotationPoint(3F, 12F, 11F);
    Seats2.mirror = true;
    setRotation(Seats2, 0F, 0F, 0F);
    Seats3 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats3.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats3.setRotationPoint(-9F, 12F, 20F);
    Seats3.mirror = true;
    setRotation(Seats3, 0F, 0F, 0F);
    Seats4 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats4.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats4.setRotationPoint(3F, 12F, 20F);
    Seats4.mirror = true;
    setRotation(Seats4, 0F, 0F, 0F);
    Seats5 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats5.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats5.setRotationPoint(-9F, 12F, 30F);
    Seats5.mirror = true;
    setRotation(Seats5, 0F, 0F, 0F);
    Seats6 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats6.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats6.setRotationPoint(3F, 12F, 30F);
    Seats6.mirror = true;
    setRotation(Seats6, 0F, 0F, 0F);
    Seats7 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats7.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats7.setRotationPoint(-9F, 12F, 40F);
    Seats7.mirror = true;
    setRotation(Seats7, 0F, 0F, 0F);
    Seats8 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats8.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats8.setRotationPoint(3F, 12F, 40F);
    Seats8.mirror = true;
    setRotation(Seats8, 0F, 0F, 0F);
    Seats9 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats9.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats9.setRotationPoint(3F, 12F, 70F);
    Seats9.mirror = true;
    setRotation(Seats9, 0F, 0F, 0F);
    Seats10 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats10.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats10.setRotationPoint(-9F, 12F, 70F);
    Seats10.mirror = true;
    setRotation(Seats10, 0F, 0F, 0F);
    Seats11 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats11.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats11.setRotationPoint(-9F, 12F, 80F);
    Seats11.mirror = true;
    setRotation(Seats11, 0F, 0F, 0F);
    Seats12 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats12.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats12.setRotationPoint(3F, 12F, 80F);
    Seats12.mirror = true;
    setRotation(Seats12, 0F, 0F, 0F);
    Seats13 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats13.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats13.setRotationPoint(3F, 12F, 90F);
    Seats13.mirror = true;
    setRotation(Seats13, 0F, 0F, 0F);
    Seats14 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats14.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats14.setRotationPoint(-9F, 12F, 90F);
    Seats14.mirror = true;
    setRotation(Seats14, 0F, 0F, 0F);
    Seats15 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats15.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats15.setRotationPoint(3F, 12F, 100F);
    Seats15.mirror = true;
    setRotation(Seats15, 0F, 0F, 0F);
    Seats16 = new ModelRendererTurbo(this, 136, 148, textureWidth, textureHeight);
    Seats16.addBox(0F, 0F, 0F, 7, 2, 1);
    Seats16.setRotationPoint(-9F, 12F, 100F);
    Seats16.mirror = true;
    setRotation(Seats16, 0F, 0F, 0F);
    Seats17 = new ModelRendererTurbo(this, 136, 134, textureWidth, textureHeight);
    Seats17.addBox(0F, 0F, 0F, 1, 7, 3);
    Seats17.setRotationPoint(10F, 11F, 11F);
    Seats17.mirror = true;
    setRotation(Seats17, 0F, 0F, 1.570796F);
    Seats18 = new ModelRendererTurbo(this, 136, 134, textureWidth, textureHeight);
    Seats18.addBox(0F, 0F, 0F, 1, 7, 3);
    Seats18.setRotationPoint(-2F, 11F, 11F);
    Seats18.mirror = true;
    setRotation(Seats18, 0F, 0F, 1.570796F);
    Seats19 = new ModelRendererTurbo(this, 136, 134, textureWidth, textureHeight);
    Seats19.addBox(0F, 0F, 0F, 1, 7, 3);
    Seats19.setRotationPoint(-2F, 11F, 70F);
    Seats19.mirror = true;
    setRotation(Seats19, 0F, 0F, 1.570796F);
    Seats20 = new ModelRendererTurbo(this, 136, 134, textureWidth, textureHeight);
    Seats20.addBox(0F, 0F, 0F, 1, 7, 3);
    Seats20.setRotationPoint(10F, 11F, 70F);
    Seats20.mirror = true;
    setRotation(Seats20, 0F, 0F, 1.570796F);
    Seats21 = new ModelRendererTurbo(this, 136, 120, textureWidth, textureHeight);
    Seats21.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats21.setRotationPoint(-2F, 11F, 18F);
    Seats21.mirror = true;
    setRotation(Seats21, 0F, 0F, 1.570796F);
    Seats22 = new ModelRendererTurbo(this, 136, 120, textureWidth, textureHeight);
    Seats22.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats22.setRotationPoint(10F, 11F, 18F);
    Seats22.mirror = true;
    setRotation(Seats22, 0F, 0F, 1.570796F);
    Seats23 = new ModelRendererTurbo(this, 136, 120, textureWidth, textureHeight);
    Seats23.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats23.setRotationPoint(10F, 11F, 28F);
    Seats23.mirror = true;
    setRotation(Seats23, 0F, 0F, 1.570796F);
    Seats24 = new ModelRendererTurbo(this, 136, 120, textureWidth, textureHeight);
    Seats24.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats24.setRotationPoint(-2F, 11F, 28F);
    Seats24.mirror = true;
    setRotation(Seats24, 0F, 0F, 1.570796F);
    Seats25 = new ModelRendererTurbo(this, 136, 120, textureWidth, textureHeight);
    Seats25.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats25.setRotationPoint(-2F, 11F, 38F);
    Seats25.mirror = true;
    setRotation(Seats25, 0F, 0F, 1.570796F);
    Seats26 = new ModelRendererTurbo(this, 136, 120, textureWidth, textureHeight);
    Seats26.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats26.setRotationPoint(10F, 11F, 78F);
    Seats26.mirror = true;
    setRotation(Seats26, 0F, 0F, 1.570796F);
    Seats27 = new ModelRendererTurbo(this, 136, 120, textureWidth, textureHeight);
    Seats27.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats27.setRotationPoint(-2F, 11F, 78F);
    Seats27.mirror = true;
    setRotation(Seats27, 0F, 0F, 1.570796F);
    Seats28 = new ModelRendererTurbo(this, 136, 120, textureWidth, textureHeight);
    Seats28.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats28.setRotationPoint(-2F, 11F, 88F);
    Seats28.mirror = true;
    setRotation(Seats28, 0F, 0F, 1.570796F);
    Seats29 = new ModelRendererTurbo(this, 138, 120, textureWidth, textureHeight);
    Seats29.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats29.setRotationPoint(10F, 11F, 88F);
    Seats29.mirror = true;
    setRotation(Seats29, 0F, 0F, 1.570796F);
    Seats30 = new ModelRendererTurbo(this, 136, 120, textureWidth, textureHeight);
    Seats30.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats30.setRotationPoint(-2F, 11F, 98F);
    Seats30.mirror = true;
    setRotation(Seats30, 0F, 0F, 1.570796F);
    Seats31 = new ModelRendererTurbo(this, 136, 120, textureWidth, textureHeight);
    Seats31.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats31.setRotationPoint(10F, 11F, 98F);
    Seats31.mirror = true;
    setRotation(Seats31, 0F, 0F, 1.570796F);
    Seats32 = new ModelRendererTurbo(this, 178, 223, textureWidth, textureHeight);
    Seats32.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats32.setRotationPoint(3F, 6F, 11F);
    Seats32.mirror = true;
    setRotation(Seats32, 0F, 0F, 0F);
    Seats33 = new ModelRendererTurbo(this, 178, 223, textureWidth, textureHeight);
    Seats33.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats33.setRotationPoint(-9F, 6F, 11F);
    Seats33.mirror = true;
    setRotation(Seats33, 0F, 0F, 0F);
    Seats34 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats34.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats34.setRotationPoint(-9F, 6F, 20F);
    Seats34.mirror = true;
    setRotation(Seats34, 0F, 0F, 0F);
    Seats35 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats35.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats35.setRotationPoint(3F, 6F, 20F);
    Seats35.mirror = true;
    setRotation(Seats35, 0F, 0F, 0F);
    Seats36 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats36.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats36.setRotationPoint(-9F, 6F, 30F);
    Seats36.mirror = true;
    setRotation(Seats36, 0F, 0F, 0F);
    Seats37 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats37.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats37.setRotationPoint(3F, 6F, 30F);
    Seats37.mirror = true;
    setRotation(Seats37, 0F, 0F, 0F);
    Seats38 = new ModelRendererTurbo(this, 136, 120, textureWidth, textureHeight);
    Seats38.addBox(0F, 0F, 0F, 1, 7, 5);
    Seats38.setRotationPoint(10F, 11F, 38F);
    Seats38.mirror = true;
    setRotation(Seats38, 0F, 0F, 1.570796F);
    Seats39 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats39.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats39.setRotationPoint(-9F, 6F, 40F);
    Seats39.mirror = true;
    setRotation(Seats39, 0F, 0F, 0F);
    Seats40 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats40.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats40.setRotationPoint(3F, 6F, 40F);
    Seats40.mirror = true;
    setRotation(Seats40, 0F, 0F, 0F);
    Seats41 = new ModelRendererTurbo(this, 178, 223, textureWidth, textureHeight);
    Seats41.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats41.setRotationPoint(-9F, 6F, 70F);
    Seats41.mirror = true;
    setRotation(Seats41, 0F, 0F, 0F);
    Seats42 = new ModelRendererTurbo(this, 178, 223, textureWidth, textureHeight);
    Seats42.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats42.setRotationPoint(3F, 6F, 70F);
    Seats42.mirror = true;
    setRotation(Seats42, 0F, 0F, 0F);
    Seats43 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats43.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats43.setRotationPoint(-9F, 6F, 80F);
    Seats43.mirror = true;
    setRotation(Seats43, 0F, 0F, 0F);
    Seats44 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats44.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats44.setRotationPoint(3F, 6F, 80F);
    Seats44.mirror = true;
    setRotation(Seats44, 0F, 0F, 0F);
    Seats45 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats45.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats45.setRotationPoint(-9F, 6F, 90F);
    Seats45.mirror = true;
    setRotation(Seats45, 0F, 0F, 0F);
    Seats46 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats46.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats46.setRotationPoint(3F, 6F, 90F);
    Seats46.mirror = true;
    setRotation(Seats46, 0F, 0F, 0F);
    Seats47 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats47.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats47.setRotationPoint(-9F, 6F, 100F);
    Seats47.mirror = true;
    setRotation(Seats47, 0F, 0F, 0F);
    Seats48 = new ModelRendererTurbo(this, 178, 216, textureWidth, textureHeight);
    Seats48.addBox(0F, 0F, 0F, 7, 5, 1);
    Seats48.setRotationPoint(3F, 6F, 100F);
    Seats48.mirror = true;
    setRotation(Seats48, 0F, 0F, 0F);
    Right4 = new ModelRendererTurbo(this, 172, 128, textureWidth, textureHeight);
    Right4.addBox(0F, 0F, 0F, 1, 97, 4);
    Right4.setRotationPoint(-9F, 22F, 6F);
    Right4.mirror = true;
    setRotation(Right4, 1.570796F, 0F, -0.2974289F);
    Left4 = new ModelRendererTurbo(this, 246, 146, textureWidth, textureHeight);
    Left4.addBox(0F, 0F, 0F, 1, 97, 4);
    Left4.setRotationPoint(9F, 22F, 6F);
    Left4.mirror = true;
    setRotation(Left4, 1.570796F, 0F, 0.2974289F);
    Bottom = new ModelRendererTurbo(this, 220, 0, textureWidth, textureHeight);
    Bottom.addBox(0F, 0F, 0F, 17, 95, 1);
    Bottom.setRotationPoint(-8F, 22F, 6F);
    Bottom.mirror = true;
    setRotation(Bottom, 1.570796F, 0F, 0F);
    TranConnector1 = new ModelRendererTurbo(this, 0, 114, textureWidth, textureHeight);
    TranConnector1.addBox(0F, 0F, 0F, 2, 16, 3);
    TranConnector1.setRotationPoint(-11F, -2F, -4F);
    TranConnector1.mirror = true;
    setRotation(TranConnector1, 0F, 0F, 0F);
    TranConnector2 = new ModelRendererTurbo(this, 0, 114, textureWidth, textureHeight);
    TranConnector2.addBox(0F, 0F, 0F, 2, 16, 3);
    TranConnector2.setRotationPoint(9.5F, -2F, -4F);
    TranConnector2.mirror = true;
    setRotation(TranConnector2, 0F, 0F, 0F);
    TranConnector3 = new ModelRendererTurbo(this, 0, 114, textureWidth, textureHeight);
    TranConnector3.addBox(0F, 0F, 0F, 2, 16, 3);
    TranConnector3.setRotationPoint(-11F, -2F, 110F);
    TranConnector3.mirror = true;
    setRotation(TranConnector3, 0F, 0F, 0F);
    TranConnector4 = new ModelRendererTurbo(this, 0, 114, textureWidth, textureHeight);
    TranConnector4.addBox(0F, 0F, 0F, 2, 16, 3);
    TranConnector4.setRotationPoint(9.5F, -2F, 110F);
    TranConnector4.mirror = true;
    setRotation(TranConnector4, 0F, 0F, 0F);
    TrainConnector5 = new ModelRendererTurbo(this, 0, 134, textureWidth, textureHeight);
    TrainConnector5.addBox(0F, 0F, 0F, 2, 5, 3);
    TrainConnector5.setRotationPoint(-9F, -6F, -4F);
    TrainConnector5.mirror = true;
    setRotation(TrainConnector5, 0F, 0F, 0.4461433F);
    TrainConnector6 = new ModelRendererTurbo(this, 0, 144, textureWidth, textureHeight);
    TrainConnector6.addBox(0F, 0F, 0F, 2, 3, 3);
    TrainConnector6.setRotationPoint(9.7F, 13F, -4F);
    TrainConnector6.mirror = true;
    setRotation(TrainConnector6, 0F, 0F, 0.4461433F);
    TrainConnector7 = new ModelRendererTurbo(this, 0, 144, textureWidth, textureHeight);
    TrainConnector7.addBox(0F, 0F, 0F, 2, 3, 3);
    TrainConnector7.setRotationPoint(-11F, 14F, -4F);
    TrainConnector7.mirror = true;
    setRotation(TrainConnector7, 0F, 0F, -0.4461433F);
    TrainConnector8 = new ModelRendererTurbo(this, 0, 144, textureWidth, textureHeight);
    TrainConnector8.addBox(0F, 0F, 0F, 2, 5, 3);
    TrainConnector8.setRotationPoint(-11F, 14F, 110F);
    TrainConnector8.mirror = true;
    setRotation(TrainConnector8, 0F, 0F, -0.4461433F);
    TrainConnector9 = new ModelRendererTurbo(this, 0, 144, textureWidth, textureHeight);
    TrainConnector9.addBox(0F, 0F, 0F, 2, 5, 3);
    TrainConnector9.setRotationPoint(9.5F, 13F, 110F);
    TrainConnector9.mirror = true;
    setRotation(TrainConnector9, 0F, 0F, 0.4461433F);
    TrainConnector10 = new ModelRendererTurbo(this, 0, 134, textureWidth, textureHeight);
    TrainConnector10.addBox(0F, 0F, 0F, 2, 5, 3);
    TrainConnector10.setRotationPoint(7.6F, -5F, -4F);
    TrainConnector10.mirror = true;
    setRotation(TrainConnector10, 0F, 0F, -0.4833219F);
    TranConnector11 = new ModelRendererTurbo(this, 0, 152, textureWidth, textureHeight);
    TranConnector11.addBox(0F, 0F, 0F, 2, 18, 3);
    TranConnector11.setRotationPoint(9F, -6F, -4F);
    TranConnector11.mirror = true;
    setRotation(TranConnector11, 0F, 0F, 1.570796F);
    TranConnector12 = new ModelRendererTurbo(this, 0, 176, textureWidth, textureHeight);
    TranConnector12.addBox(0F, 0F, 0F, 2, 20, 3);
    TranConnector12.setRotationPoint(10.2F, 15F, -4F);
    TranConnector12.mirror = true;
    setRotation(TranConnector12, 0F, 0F, 1.570796F);
    TrainConnector13 = new ModelRendererTurbo(this, 0, 200, textureWidth, textureHeight);
    TrainConnector13.addBox(0F, 0F, 0F, 2, 4, 3);
    TrainConnector13.setRotationPoint(8.2F, -4F, 110F);
    TrainConnector13.mirror = true;
    setRotation(TrainConnector13, 0F, 0F, -0.4833219F);
    TrainConnector14 = new ModelRendererTurbo(this, 0, 200, textureWidth, textureHeight);
    TrainConnector14.addBox(0F, 0F, 0F, 2, 4, 3);
    TrainConnector14.setRotationPoint(-9.4F, -5F, 110F);
    TrainConnector14.mirror = true;
    setRotation(TrainConnector14, 0F, 0F, 0.4833219F);
    TranConnector15 = new ModelRendererTurbo(this, 0, 208, textureWidth, textureHeight);
    TranConnector15.addBox(0F, 0F, 0F, 2, 19, 3);
    TranConnector15.setRotationPoint(10F, -5F, 110F);
    TranConnector15.mirror = true;
    setRotation(TranConnector15, 0F, 0F, 1.570796F);
    TranConnector16 = new ModelRendererTurbo(this, 0, 176, textureWidth, textureHeight);
    TranConnector16.addBox(0F, 0F, 0F, 2, 19, 3);
    TranConnector16.setRotationPoint(10F, 16F, 110F);
    TranConnector16.mirror = true;
    setRotation(TranConnector16, 0F, 0F, 1.570796F);

    bodyModel=new ModelRendererTurbo[]{Left1,Left2,Left3,Floor1,Floor2,Ceiling,Right1,Right2,Right3,WallToCab,MiddleWall1,MiddleWall2,BackWall,Wheels1,Wheels2,Seats1,Seats2,Seats3,Seats4,
            Seats5,Seats6,Seats7,Seats8,Seats9,Seats10,Seats11,Seats12,Seats13,Seats14,Seats15,Seats16,Seats17,Seats18,Seats19,Seats20,Seats21,Seats22,Seats23,Seats24,Seats25,Seats26,Seats27,
            Seats28,Seats29,Seats30,Seats31,Seats32,Seats33,Seats34,Seats35,Seats36,Seats37,Seats38,Seats39,Seats40,Seats41,Seats42,Seats43,Seats44,Seats45,Seats46,Seats47,Seats48,Right4,
            Left4,Bottom,TranConnector1,TranConnector2,TranConnector3,TranConnector4,TrainConnector5,TrainConnector6,TrainConnector7,TrainConnector8,TrainConnector9,TrainConnector10,TranConnector11,
            TranConnector12,TrainConnector13,TrainConnector14,TranConnector15,TranConnector16
    };
    fixRotation(bodyModel);


  }

  private void setRotation(ModelRendererTurbo model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }


}
