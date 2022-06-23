import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
 background(51,204,255);  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    //sun 
    sunColour(255, 255, 0);
    float sunMeasure = sun(50, 50, 80, 80);

    //cloud
    cloudColour(255, 255, 255);
    float cloudMeasure1 = cloud(190, 30, 130, 40);

    //cloud
    cloudColour(255, 255, 255);
    float cloudMeasure2 = cloud(290, 30, 130, 40);

    //house
    houseColour(255, 255, 153);
    float houseMeasure = house(100, 155, 200, 200);
    
    // Window
    windowColour(255, 255, 255);
    float windowMeasure1 = window(110, 280, 50, 50);

    // Window
    windowColour(255, 255, 255);
    float windowMeasure2 = window(238, 280, 50, 50);
    
    // Window
     windowColour(255, 255, 255);
    float windowMeasure3 = window(112, 200, 75, 50);

    // Window
    windowColour(255, 255, 255);
    float windowMeasure4 = window(213, 200, 75, 50);

    // House Roof
    houseroofColour(255, 153, 0);
    float houseroofMeasure = houseroof(200, 75, 325, 175, 75, 175);

    // Tree Leaves
    treeColour(0, 255, 51);
    float treeMeasure = tree(65, 220, 100, 100);

    // Tree Trunk
    treetrunkColour(102, 51, 0);
    float treetrunkMeasure = treetrunk(55, 270, 20, 100);

   // Bush
    bushColour(0, 153, 0);
    float bushMeasure = bush(315, 330, 60, 60);

    // Bush
    bushColour(0, 102, 0);
    float bushMeasure1 = bush(340, 350, 60, 60);

    // Bush
    bushColour(0, 204,0);
    float bushMeasure2 = bush(300, 350, 60, 60);

    //grass
    grassColour(0, 204, 0);
    float grassMeasure = grass(0, 380, 400, 50);

  }

 /**
 * Method for the sun
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public float sun(float X1, float Y1, float X2, float Y2){
    ellipse(X1, Y1, X2, Y2);
    return(X2 - X1) * (Y2 - Y1);
  }
 /**
 * Method for the colour of the sun
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void sunColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
  }
 /**
 * Method for the clouds
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public float cloud(float X1, float Y1, float X2, float Y2){
    ellipse(X1, Y1, X2, Y2);
    return(X2 - X1) * (Y2 - Y1);
  }
 /**
 * Method for the colour of the clouds
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void cloudColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
  }
 /**
 * Method for the house
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public float house(float X1, float Y1, float X2, float Y2){
    rect(X1, Y1, X2, Y2);
    return(X2 - X1) * (Y2 - Y1);
  }
 /**
 * Method for the colour of the house
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void houseColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
 }
 /**
 * Method for the window
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public float window(float X1, float Y1, float X2, float Y2){
    rect(X1, Y1, X2, Y2);
    return(X2 - X1) * (Y2 - Y1);
  }
 /**
 * Method for the colour of the windows
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void windowColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
 }
 /**
 * Method for the house roof
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public float houseroof(float X1, float Y1, float X2, float Y2, float X3, float Y3){
   triangle(X1, Y1, X2, Y2, X3, Y3);
   return(X3 - X2 - X1) * (Y3 - Y2 - Y1);
  }
 /**
 * Method for the colour of the house roof
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void houseroofColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
 }
 /**
 * Method for the tree
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public float tree(float X1, float Y1, float X2, float Y2){
    ellipse(X1, Y1, X2, Y2);
    return(X2 - X1) * (Y2 - Y1);
  }
 /**
 * Method for the colour of the tree
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void treeColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
   }
 /**
 * Method for the tree trunk
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public float treetrunk(float X1, float Y1, float X2, float Y2){
    rect(X1, Y1, X2, Y2);
    return(X2 - X1) * (Y2 - Y1);
  }
 /**
 * Method for the colour of the tree trunk
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void treetrunkColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
   }
 /**
 * Method for the bush
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public float bush(float X1, float Y1, float X2, float Y2){
    ellipse(X1, Y1, X2, Y2);
    return(X2 - X1) * (Y2 - Y1);
  }
 /**
 * Method for the colour of the bush
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void bushColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
   }
 /**
 * Method for the grass
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public float grass(float X1, float Y1, float X2, float Y2){
    rect(X1, Y1, X2, Y2);
    return(X2 - X1) * (Y2 - Y1);
  }
 /**
 * Method for the colour of the grass
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void grassColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
   
}
}