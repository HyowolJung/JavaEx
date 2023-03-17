package loof;

public class LoofFor {
	public static void main(String[] args) {
		// 반복문 - for문
		// for(초기식; 조건식; 증감식){코드블럭}
		// 초기식 -> 조건식 -> 코드블럭 -> 증감식 -> 조건식
		// 1~100까지의 합을 구해봅시다
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println("for문" + i);
			sum = sum + i;
			sum += i;
		}
		int i = 0;
		// i = 0 - 4
		while (i++ < 5) {
			System.out.println("while" + i);
		}
		System.out.println("1부터 100까지의 합: " + sum);
		
		
	}
}
