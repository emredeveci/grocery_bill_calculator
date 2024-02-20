import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable declarations of vegetables, and how much they cost per kilogram
        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.0;
        double pearWeight, appleWeight, tomatoWeight, bananaWeight, eggplantWeight;
        double total;

        Scanner scanner = new Scanner(System.in);

        //ask the user for inputs
        System.out.print("Enter the weight of your pears in kilograms: ");
        pearWeight = scanner.nextDouble();

        System.out.print("Enter the weight of your apples in kilograms: ");
        appleWeight = scanner.nextDouble();

        System.out.print("Enter the weight of your tomatoes in kilograms: ");
        tomatoWeight = scanner.nextDouble();

        System.out.print("Enter the weight of your bananas in kilograms: ");
        bananaWeight = scanner.nextDouble();

        System.out.print("Enter the weight of your eggplants in kilograms: ");
        eggplantWeight = scanner.nextDouble();

        //calculate the total price and print
        total = (pearPrice * pearWeight) + (applePrice * appleWeight) + (tomatoPrice * tomatoWeight) + (bananaPrice * bananaWeight) + (eggplantPrice * eggplantWeight);
        System.out.println("Your total is " + total + " Turkish Liras");
    }
}