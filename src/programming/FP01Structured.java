package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		printEvenNumbersInListStructered(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

	}

	private static void printEvenNumbersInListStructered(List<Integer> numbers) {
		for (int number : numbers) {
			if (number % 2 == 0)
				System.out.println(number);
		}

	}

}
