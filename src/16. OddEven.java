import java.util.Scanner;

class OddEven {
    static void main(String[] args) {
        System.out.println("Odd Even Checking");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        int n = input.nextInt();

        if(n == 0){
            System.out.println("Oops! Neither even nor odd");
        }
        else if(n%2 != 0){
            System.out.println(n + " is an odd number");
        }
        else if(n%2 == 0){
            System.out.println(n + " is an even number");
        }

    }
}
