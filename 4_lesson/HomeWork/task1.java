import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		/**
		 * Реализовать консольное приложение, которое:
		 * 
		 * 1. Принимает от пользователя строку вида text~num
		 * 
		 * 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию
		 * num
		 * 2. Если введено print~num, выводит строку из позиции num в связном списке и
		 * удаляет её из списка
		 * 3. Если введено exit завершаем программу
		 * 
		 * Пример:
		 * string~4
		 * num~3
		 * print~3
		 * > num
		 * print~4
		 * > string
		 * my_value~1
		 * print~1
		 * >my_value
		 */

		menu();

	}

	public static String[] parseInput(String input) {
		return input.split("~");
	}

	public static void menu() {
		boolean play = true;
		Scanner sc = new Scanner(System.in);
		LinkedList<String> store = new LinkedList<>();
		String[] tmp = new String[2];
		while (play) {
			tmp = parseInput(sc.nextLine());
			try {
				switch (tmp[0]) {
					case "exit":
						play = false;
						sc.close();
						break;
					case "print":
						try {
							System.out.println(store.get(Integer.parseInt(tmp[1])));
							store.set(Integer.parseInt(tmp[1]), null);
						} catch (IndexOutOfBoundsException e) {
							System.out.println("null");
						}
						break;
					default:
						while (store.size() <= Integer.parseInt(tmp[1])) {
							store.add(null);
						}
						store.set(Integer.parseInt(tmp[1]), tmp[0]);
						break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Неверный индекс, введите число!");
			}
		}
	}
}
