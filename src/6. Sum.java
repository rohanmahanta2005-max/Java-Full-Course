import java.util.Scanner;

 class Sum {
    public static void main(String[] args){
        System.out.println("Welcome to Calculator");

        System.out.print("Enter a: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        int sum = a+b;

        System.out.print("Sum of 2 numbers: " +  sum);

    }
}
