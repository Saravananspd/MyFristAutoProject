package Maths;

import java.util.Scanner;

class calculation
{
    // adding two numbers
    int add(int a, int b){
        return a + b;
    }

    // subtracting two numbers
    int sub(int a, int b) {
        return a - b;
    }

    // multiply two numbers
    int mul(int a, int b){
        return a * b;
    }

    //divide two numbers
    int div(int a, int b){
        return a/b;
    }
}


public class Main {

    public static void main(String[] args) {

        System.out.println("Kindly enter what calculation you need to perform");
        System.out.println("add, sub, mul, div");
        System.out.println("Enter the value of a: ");
        System.out.println("Enter the value of b: ");


        Scanner input = new Scanner(System.in);
        String ca = input.next();
        Integer a = input.nextInt();
        Integer b = input.nextInt();

        calculation cal = new calculation();

        if(ca.equals("add") ){
            int c = cal.add(a,b);
            System.out.println("Your result is: "+ c);
        }
        else if (ca.equals("sub")) {
            int c = cal.sub(a,b);
            System.out.println("Your result is: "+ c);
        }
        else if (ca.equals("mul")){
            int c = cal.mul(a,b);
            System.out.println("Your result is: "+ c);
        }
        else  {
            double c = cal.div(a,b);
            System.out.println("Your result is: "+ c);
        }
    }

}

