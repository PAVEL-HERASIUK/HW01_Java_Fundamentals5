package by.htp.les05.main;

public class Main20 {

	public static void main(String[] args) {
		// 20. Дан целочисленный массив с количеством элементов п. Сжать массив,
		// выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание.
		// Дополнительный массив не использовать.
		
		int[] mas = { 3, 6, 9, 35, 19, 4, 16, 62, 1, 87 };

		for (int i = 1; i < mas.length; i = i + 2) {

			mas[i] = 0;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
	}
}
