import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Max FitzGerrell
 * @version 8/20/2025
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("0. Celsius to Fahrenheit");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Feet to Meters");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Ounces to Milliliters");
        System.out.println("5. Milliliters to Ounces");
        System.out.println("6. Kilometers to Miles");
        System.out.println("7. Miles to Kilometers");
        System.out.println("8. Knots to MPH");
        System.out.println("9. MPH to Knots");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit2 = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius2 = (fahrenheit2 - 32) * 9.0 / 5.0;
            System.out.println(fahrenheit2 + " degrees Fahrenheit is " + celsius2 + " degrees celsius");
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet/3.281;
            System.out.println(feet + " Feet is " + meters + " Meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters2 = keyboard.nextDouble();
            keyboard.nextLine();
            double feet2 = meters2 * 3.281;
            System.out.println(meters2 + " Meters is " + feet2 + " Feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.574;
            System.out.println(ounces + " Ounces is " + milliliters + " Milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Milliliters: ");
            double milliliters2 = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces2 = milliliters2/29.574;
            System.out.println(milliliters2 + " Milliliters is " + ounces2 + " Ounces");
        }

    }
}