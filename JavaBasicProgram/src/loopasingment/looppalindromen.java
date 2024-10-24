package loopasingment;

import java.util.Scanner;

public final class looppalindromen {

	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int reversedNum = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }

		// TODO Auto-generated method stub

	}

}
