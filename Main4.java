package by.htp.les05.main;

public class Main4 {

	public static void main(String[] args) {
		// 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить,
		// будет ли она возрастающей.
		int[] mas = new int[] { -5, -2, -1, 0, 9, 12, 42, 89, 123 };
		int a = 0;
		int b = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= b) {
				b = mas[i];
				a++;
			} else {
				System.out.println("Последовательность невозрастающая");
				break;
			}
		}

		if (a == mas.length) {
			System.out.println("Последовательноcть возрастающая");
		}
	}
}
