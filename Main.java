import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        BMI person = new BMI(weight, height);
        System.out.println("BMI is " + person.getBMI());
        System.out.println(person.diagnoseBMI());
    }
}
