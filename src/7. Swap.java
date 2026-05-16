import java.util.Scanner;

class Swap {
    public  static void main(String[] args){
        System.out.println("Swapping of two numbers");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();

        int temp = b;
        b = a;
        a = temp;

        System.out.println("Swapping Success....");
        System.out.println("Value of a: " + a );
        System.out.print("Value of b: " + b );
    }
}

