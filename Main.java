import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        1.Write a program that prints the numbers from 1 to 100 such that:
//          If the number is a multiple of 3, you need to print "Fizz" instead of that
//          number.

//        for(int i =1 ; i<=100 ; i++){
//            if(i/3 == 1) System.out.println("Fizz");
//            if(i/5 == 1) System.out.println("Buzz");
//            if(i/15 ==1 ) System.out.println("FizzBuzz");
//        }


        //2.Write a Java program to reverse a string.
        //Test Data: Input a string: The quick brown fox Expected Output: Reverse
        //string: xof nworb kciuq ehT

//        String str = "The quick brown fox";
//        String nStr = "";
//        for(int i = str.length()-1 ; i>=0 ; i--) nStr+=str.charAt(i);
//        System.out.printf("Revers string: %s"+nStr);


        //3.Write a program to find the factorial value of any number entered
        //through the keyboard.

//
//        System.out.print("Enter a number: ");
//        int num = scan.nextInt();
//        for(int i  = num-1;i>0;i--) num *= i;
//        System.out.println(num);

        //4.Two numbers are entered through the keyboard. Write a program to find
        //the value of one number raised to the power of another. (Do not use Java
        //built-in method)

//        System.out.print("Enter base number: ");
//        int base = scan.nextInt();
//        System.out.print("Enter exponent number: ");
//        int exponent = scan.nextInt();
//
//        int res = 1;
//        for(int i =1;i<=exponent ; i++) res*= base;
//        System.out.println(res);

            //5.Write a program that reads a set of integers, and then prints the sum of
        //the even and odd integers.

//        int [] ar = {1,2,3,4,5};
//        int oddSum = 0;
//        int evenSum = 0;
//        for (int i = 0 ; i<ar.length ;i++){
//            if (ar[i]%2==0) evenSum+=ar[i];
//            else oddSum+=ar[i];
//        }
//        System.out.printf("the sum of even: %d and the sum of odd: %d",evenSum,oddSum);

        //6.Write a program that prompts the user to input a positive integer. It
        //should then output a message indicating whether the number is a prime
        //number.

//        System.out.print("Enter a positive number= ");
//        int num = scan.nextInt();
//        boolean prime = true;
//        for(int i  = num-1;i>1;i--) if(num%i==0){
//            prime =false;
//            break;
//        }
//
//        if(prime) System.out.println("It's a prime");
//        else System.out.println("It's not a prime");


        //7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        //another for loop to print the days (Days 1 -7) for each week.

//            for(int i = 1 ; i<=4;i++){
//                System.out.println("Week"+i);
//                for(int j = 1 ;j<=7 ;j++){
//                    System.out.println("Day"+j);
//
//                }
//            }

        //8.Write a program thats check if the word is a palindrome or not. hint: A
        //string is said to be a palindrome if it is the same if we start reading it from
        //left to right or right to left.

//        System.out.print("Write a word: ");
//        String str = scan.next();
//        String newStr = "";
//        for(int i = str.length()-1;i>=0;i--) newStr+=str.charAt(i);
//        if(newStr.equals(str)) System.out.println("palindrome");
//        else System.out.println("is not palindrome ");
    }
}