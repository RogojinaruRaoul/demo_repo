package automation;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introdu numarul:");
		int a = s.nextInt();
		boolean x = isOddNumber(a);
		System.out.println(x);
		s.close();

	}

	public static boolean isOddNumber(int i) {
		boolean result = true;
		if (i % 2 != 0) {
			result = true;
		} else {
			result = false;
		}

		return result;

	}

}
