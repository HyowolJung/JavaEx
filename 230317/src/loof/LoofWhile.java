package loof;

public class LoofWhile {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		while (++i <= 100) {
			sum = sum + i;

			System.out.println("1~100까지의 합: " + sum);
		}

	}

}
