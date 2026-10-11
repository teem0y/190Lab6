import java.util.Scanner;
/**
 * Program Desc:
 * Stores a triangle's name, base, and height. Reads those values 
 * from the keyboard, displays them, and computes the triangle's area.
 * @author Tobey Agapito
 * @version 1.0
 * @since 10/10/2026
 */
public class Triangle {
    private String name;
    private double base;
    private double height;

    /**
     * No-arg constructor that sets name to "Unknown", base to 0.0, and height to 0.0 */
    public Triangle() {
        name = "Unknown";
        base = 0.0;
        height = 0.0;
    }

    /** Constructor that sets name, base, and height to the given values
     * @param inName   the name of the triangle
     * @param inBase   the base dimension of the triangle
     * @param inHeight the height dimension of the triangle */
    public Triangle(String inName, double inBase, double inHeight) {
        name = inName;
        base = inBase;
        height = inHeight;
    }

    /**
     * Displays the triangle's name, base, height, and area
     * Rounds the area to one decimal place and outputs the value to the next line */
    public void writeOutput() {
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("Triangle area is: %.1f%n", getArea());
    }

    /**
     * Asks user for the triangle's name, base, and height and stores the values entered */
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the triangle's name: ");
        name = keyboard.nextLine();
        System.out.print("What is the triangle's base: ");
        base = keyboard.nextDouble();
        System.out.print("What is the triangle's height: ");
        height = keyboard.nextDouble();
    }

    /**
     * Sets the name of the triangle
     * @param newName the new name of the triangle 
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Sets the base of the trianlge
     * @param newBase the new base dimension of the triangle 
     */
    public void setBase(double newBase) {
        base = newBase;
    }

    /**
     * Sets the height of the triangle
     * @param newHeight the new height dimension of the triangle 
     */
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    /**
     * Calculates the area of the triangle (0.5 * base * height)
     * @return the area of the triangle 
     */
    private double getArea() {
        return 0.5 * base * height;
    }
}