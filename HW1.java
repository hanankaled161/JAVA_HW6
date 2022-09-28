//Write a program that reads an initial investment balance
// and an interest rate, then prints the number of years it takes for
// the investment to reach one million dollars.

import java.util.Scanner;

/**
 * Created by Qursan on 25/09/22.
 */
public class HW1 {
    public static void main(String[] args) {
         int year=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the investment balance");
        double investmentBalance = in.nextDouble();
        System.out.println("enter the interest rate");
        double interestRate = in.nextDouble();
        while (investmentBalance < 1000000)
        {
            investmentBalance = investmentBalance + interestRate;
            year++;
        }
        System.out.println("years it takes to reach one million =" + year);
    }
}