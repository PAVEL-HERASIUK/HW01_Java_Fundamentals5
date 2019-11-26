package by.htp.les05.main;

public class Main12 {

	public static void main(String[] args) {
		// 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
		// порядковые номера которых являются простыми числами.

		double[] mas1 = new double[] { 1, 3,3 , 35,1 ,  88,  99  };

		double sum = 0;

		for (int i = 2; i < mas1.length; i++) {
			if ((i == 2) || (i % 2 != 0)) {
				sum = sum + mas1[i];
				System.out.print(mas1[i] + "   ");
			}
		}
		System.out.println();
		System.out.println(sum);
	}
}
