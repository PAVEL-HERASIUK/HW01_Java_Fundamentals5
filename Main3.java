package by.htp.les05.main;

import java.util.Random;

public class Main3 {

	public static void main(String[] args) {
		// 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
		// встречается раньше - положительное или отрицательное.

		int[] mas = new int[7];
		
		randNum(mas);
		printMas(mas);
		findNum(mas);
	}

	public static void findNum(int[] mas) {
		int i = 0;
		while (i < mas.length) {
			if (mas[i] < 0) {
				System.out.println("  ");
				System.out.println("Первое число отрицательное!");
				break;
			} else {
				System.out.println("   ");
				System.out.println("Первое число положительное!");
				break;
			}
		}
	}

	public static void randNum(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (rand.nextInt(7) - 1);
		}
	}

	public static void printMas(int[] mas) {
		int i;
		for (i = 0; i < mas.length; i++) {
			System.out.printf(" % 3d ", mas[i]);
		}
	}
}
