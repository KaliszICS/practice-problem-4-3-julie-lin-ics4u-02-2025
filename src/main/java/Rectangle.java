/**
 * Rectangle class representing the sides, length and width 
 */
public class Rectangle {
    /**
     * The length of the rectangle
     * The width of the rectangle
     */
    private double length;
    private double width;

    // Constructors 
    /**
     * Rectangle constructor that takes no parameters and sets length to 4 and width to 8.
     */
    public Rectangle () {
        this.length = 4;
        this.width = 8;
    }
    /**
     * Second rectangle Constructor that takes one parameter used to set the length and set the width to 8.
     * @param length The length of rectangle
     */
    public Rectangle (double length) {
        this.length = length;
        this.width = 8;
    }
    /**
     * Third rectangle constructor that takes two parameters and uses them to set the length and width
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     */
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    // Getters
    /**
     * Gets the length of the rectangle
     * @return the length of the rectangle
     */
    public double getLength (){
        return this.length;
    }
    /**
     * Gets the width of the rectangle 
     * @return the width of the rectangle 
     */
    public double getWidth () {
        return this.width;
    }
}