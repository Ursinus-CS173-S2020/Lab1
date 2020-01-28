/*
 * Purpose: To implement Kepler's Third Law of planetary motion, 
 * which can be used to determine how many days a year is on other planets
 * given their mass and the semi-major axis of their elliptical orbit
 */
package lab1;
import java.util.Scanner;


public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double AU_TO_METERS = 1.495979e11;
        // TODO: Define constants for *M*, the mass of the sun in kg
        // and *G*, the gravitational constant in m^3/(kg*sec)
        
        Scanner in = new Scanner(System.in);
        // First, input the mass *m*
        System.out.println("Please input the mass in kilograms");
        double m = in.nextDouble();
        
        // Next, input the semi-major axis
        System.out.println("Please input the semi-major axis in astronomical units");
        double a = in.nextDouble();
        // TODO: Convert *a* from astronomical units to meters

        
        // TODO: Implement the formula and store it in result
        double yearDays = 0.0;
        System.out.println("A year is " + yearDays + " days");
    }
    
}
