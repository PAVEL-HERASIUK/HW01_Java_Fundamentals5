package by.htp.les05.main;

import java.util.Random;

public class Main13 {

	public static void main(String[] args) {
		// 13. Определить количество элементов последовательности натуральных чисел,
		// кратных числу М и заключенных в промежутке от L до N.
		int l = 1;
		int m = 6;
		int n = 60;
		int[] mas = new int[20];

		randomValue(mas);
		printMas(mas);

		resultCalc(mas, m, l, n);
	}

	public static void resultCalc(int[] mas, int m, int l, int n) {
		int k = 0;
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % m == 0) && (mas[i] > l) && (mas[i] < n)) {
				k++;
			}
		}
		System.out.println("Количество элементов указано: " + k);
	}

	public static void randomValue(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(60);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("% 3d ", mas[i]);
		}
		System.out.println("\n");
	}
}
