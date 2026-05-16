import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Simple Interest Calculation");
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter P: ");
        int P = input.nextInt();

        System.out.print("Enter R: ");
        float R = input.nextFloat();

        System.out.print("Enter T: ");
        float T = input.nextFloat();

        float SimpleInterest = (P*R*T)/100;

        System.out.println("Calculated Simple Interest: Rs." + SimpleInterest);
    }
}
