package org.logicalreasoning;

public class LogicalReasoning {
	public static void main(String[] args) {

		// 20 to 70 only divisible by 4
		for (int i = 20; i <= 70; i++) {
			int rem = i % 4;
			if (rem == 0) {
				System.out.println("Divisible by 4:" + i);
			}

		}
		System.out.println("=============================================================");

		// 200 to 50 only divisible by 15
		for (int j = 200; j >= 50; j--) {
			int reminder = j % 15;
			if (reminder == 5) {
				System.out.println("Divisible by 15:" + j);

			}
		}
		System.out.println("================================================================");
		// incremented by 3 from the range 10 to 100
		int a = 10;
		int b = 100;
		for (int k = a; k <= b; k += 3) {

			System.out.println("incremented by 3: " + k);
		}
	}
}