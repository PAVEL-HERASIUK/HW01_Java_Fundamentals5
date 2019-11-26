package by.htp.les05.main;

public class Main6 {

	public static void main(String[] args) {
		// 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
		// числовой оси, содержащую все эти числа
		int i = 0;
		int[] mas = new int[20];
		mas[i] = (int) (Math.random() * 100);

		int min = mas[0];
		int max = mas[0];

		for (i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		System.out.println("Наименьшая длина оси = " + (max - min));
	}
}
