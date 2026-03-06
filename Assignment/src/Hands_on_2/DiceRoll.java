package Hands_on_2;

import java.util.Random;

public class DiceRoll {

	public static void main(String[] args) {
		Random random = new Random();
		int[] freq = new int[6];
		for (int i = 0; i < 100; i++) {
			int roll = random.nextInt(6) + 1;
			freq[roll - 1]++;
		}
		System.out.println("Dice rolled 100 times:");
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + " occurred " + freq[i] + " times");
		}
	}
}