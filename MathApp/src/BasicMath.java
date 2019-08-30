/**
 Author: Thoithoi Shougrakpam
 Date: Friday, August 30, 2019
 Description: A simple math app which inputs integers and outputs sum, average, product, largest, and smallest.
 */
import java.util.Scanner;

public class BasicMath {

    public static void main(String[] args) {
        //getting input from user to iterate over it and ask for more inputs
    Scanner sc =  new Scanner(System.in);
    System.out.println("How many integers will be entered? ");
    int num = sc.nextInt();
    sc.nextLine();
    //initializing int values
    int sum= 0;
    int product= 1;
    int avg= 0;
    int totalnum= num;
    //using Integer.MIN_ Value & Integer.MAX_VALUE because we cannot assume the range of numbers given to us
        //if we set 0 for these values then we cannot check the numbers for negative numbers.
    int Lar= Integer.MIN_VALUE;
    int Small= Integer.MAX_VALUE;
        //iterating over num and getting more inputs
        //learned this method from : Stackoverflow

        //protecting the program if the user enter 0 for number of integers to be entered
    if (num!=0) {
        while (--num + 1 > 0) {

            System.out.println("Enter an integer: ");
            int val = sc.nextInt();
            sum = sum + val; //the sum
            product = product * val; //the product

            //if statement to check largest and smallest
            if (val > Lar) {
                Lar = val;
            }
            if (val < Small) {
                Small = val;
            }
        }
        if (sum != 0) {
            avg = sum / totalnum;
        } else {
            System.out.println("Done");
        }

        //System.out.printf("Largest: %d\n Smallest: %d\n Sum: %d\n Product: %d\n Average: %d", Lar, Small, sum, product, avg);
        System.out.printf("Largest: %d\n", Lar);
        System.out.printf("Smallest: %d\n", Small);
        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Product: %d\n", product);
        System.out.printf("Average: %d", avg);
    }
    else{
        System.out.println("No integers entered!");
    }
    }

    
}
