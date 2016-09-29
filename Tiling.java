/* Cost of Tile to Cover W x H Floor
Calculate the total cost of tile it would take to cover a floor plan of width
and height, using a cost entered by the user.
Programmer:       Victoria Brown
Date:             September 2016
Tiling.java */

import java.util.Scanner;

public class Tiling {

  public static void main(String[] args) {

	  double width;
	  double height;
	  double area;
	  double cost;
	  double totalCost;

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the width in feet: ");
    width = input.nextDouble();
    System.out.println("Please enter the height in feet: ");
    height = input.nextDouble();

    area = width * height;

    System.out.println("The area you're trying to tile is: " + area);
    System.out.println("Please enter the cost per foot for tile: ");
    cost = input.nextDouble();

    totalCost = area * cost;

    System.out.println("The total cost is $" + totalCost);

  }

}
