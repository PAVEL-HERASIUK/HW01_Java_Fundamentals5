package by.htp.les05.main;

import java.util.Random;

public class Main11 {

	public static void main(String[] args) {
		// 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых
		// остаток от деления на М равен L (0 < L < М-1).

		int[] mas = new int[10];
		int m = 5;
		int l = 2;

		randomValue(mas);
		printMas(mas);
		resultCalc(mas, m, l);
	}

	public static void resultCalc(int[] mas, int m, int l) {
		if ((l > 0) && (l < m - 1)) {
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] % m == l) {
					System.out.print(mas[i] + "; ");
				}
			}
		}
	}

	public static void randomValue(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(20);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("% 3d ", mas[i]);
		}
		System.out.println();
	}
}
