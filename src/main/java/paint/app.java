package paint;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brian Nguyen
 */

/*
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.

Challenges
Revise the program to ensure that inputs are entered as numeric values.
Don’t allow the user to proceed if the value entered is not numeric.
Implement support for a round room.
Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.
 */

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double perGallon = 350;
        System.out.print("Enter length: ");

        double length = in.nextDouble();

        System.out.print("Enter width: ");

        double width = in.nextDouble();

        double totalSq = length*width;

        int gallon = (int)Math.ceil(totalSq/perGallon);
        //to round to the nearest whole number

        System.out.println("You will need to purchase " + gallon + " gallons of paint to cover " + totalSq + " square feet");
    }
}
