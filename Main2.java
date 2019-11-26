package by.htp.les05.main;

public class Main2 {

	public static void main(String[] args) {
		// 2. В целочисленной последовательности есть нулевые элементы. Создать массив
		// из номеров этих элементов.

		int[] mas = { 56, 0, 1, 19, 6, 0, 2, 4, 0, 25, 7 };
		int countZeroElement = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				countZeroElement++;
			}
		}

		printMas(mas);

		System.out.println();
		System.out.printf("% 2d ", countZeroElement);
		System.out.println();

		int[] masZeroElementIndex = new int[countZeroElement];
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				masZeroElementIndex[j] = i;
				j++;
			}

		}
		printMas(masZeroElementIndex);

	}

	public static void printMas(int[] mas) {
		int i;
		for (i = 0; i < mas.length; i++) {
			System.out.printf("% 6d ", mas[i]);
		}
	}
}
