/**
 * Chair class represents the legs and materials of a chair
 */
public class Chair {
    /**
     * The number of legs on the chair
     * The material used for the chair
     */
    private int legs;
    private String material;
    
    // Constructors 
    /**
     * First Constructor that takes no parameters and sets legs to 4 and material to wood
     */
    public Chair () {
        this.legs = 4;
        this.material = "wood"; 
    }
    /**
     * Second constructor that takes one parameter used to set the legs and set the material to wood
     * @param legs The number of legs the chair has.
     */
    public Chair (int legs) {
        this.legs = legs;
        this.material = "wood";
    }
    /**
     * Third constructor that takes 2 parameters, using them to set the legs and material
     * @param legs The number of legs the chair has.
     * @param material Chair material type
     */
    public Chair (int legs, String material) {
        this.legs = legs;
        this.material = material;
    }
    //Getters
    /**
     * Returns the number of legs the chair has
     * @return number of legs
     */
    public int getLegs() {
        return this.legs;
    }
    /**
     * Returns the material the chair is made of
     * @return material of chair
     */
    public String getMaterial() {
        return this.material; 
    }

}