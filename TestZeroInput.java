package com.programs;
import java.util.Scanner;
class InputException  extends Exception
{
    public InputException (String str)
    {

        super(str);
    }
}
public class TestZeroInput {


    static void validate(int n, int p) throws InputException {
        if (n == 0 || p == 0) {


            throw new InputException("n and p should not be zero.");
        }
    }
        static void validate1(int n, int p) throws InputException {
            if (n < 0 || p < 0) {


                throw new InputException("n and p should not be negative.");
            }
    }
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            int n, p;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the base: ");
            n = sc.nextInt();
            System.out.print("Enter the exponent: ");
            p = sc.nextInt();
            try {

                validate(n, p);
                validate1(n, p);
            } catch (InputException ex) {

                System.out.println(ex);
                System.exit(0);
            }


            double power = Math.pow(n, p);
            System.out.println(n + " to the power " + p + " is: " + power);
        }
    
	}
}



