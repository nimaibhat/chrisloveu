import java.util.Scanner;

public class SandwichRunner {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String pretty = "=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+";
        System.out.println(pretty + "\n" + pretty + "\n");

        System.out.print("Please enter the type of meat you want on your sandwich: ");
        String meat = input.nextLine();

        System.out.print("Please enter the type of cheese you want on your sandwich: ");
        String cheese = input.nextLine();

        System.out.print("Please enter the type of bread you want on your sandwich: ");
        String bread = input.nextLine();

        Sandwich randomSandwich = new Sandwich();
        Sandwich chosenSandwich = new Sandwich(meat, bread, cheese);

        System.out.println(pretty + "\n" + pretty + "\n");
        System.out.println("Your chosen lunch is: ");
        System.out.println(chosenSandwich);

        System.out.println(pretty + "\n" + pretty + "\n");
        System.out.println("Your random lunch is: ");
        System.out.println(randomSandwich);
        System.out.println(pretty + "\n" + pretty + "\n");

        input.close();
    }
}
