package bmi;

import java.util.Scanner;

/*
접근 제한자 class 클래스 이름{
	- 필드 : 속성을 정의
	- 메서드 : 기능을 정의
		- 메인(Main) 메서드: 프로그램의 시작, 실행을 담당 
	- 생성자 : 객체가 생성할 때 사용
	 	- new를 만나면 생성자를 통해서 객체가 생성됨
}
*/
abstract class BBmi {

	// int j = 0; // 필드, 전역변수

	public static void main(String[] args) {
		// 변수 선언
		// 타입 변수명 = new 타입(파라미터=매개변수);
		// 기본변수는 메모리에 값을 가지고 있다
		// 참조변수는 메모리의 주소값을 가지고 있다
		// int i = 0; // 지역 변수
		System.out.println("Bmi를 계산해 드립니다.");
		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.println("키를 입력해 주세요(m) 숫자만 입력 가능합니다");
			double height = scanner.nextDouble();
			System.out.println("몸무게를 입력해주세요(kg) 숫자만 입력 가능합니다");

			double weight = scanner.nextDouble();

			double bmi = weight / (height * height);
			System.out.printf("당신의 bmi는 %.1f 입니다.\n", bmi);

			// 삼항 연산자
			// 변수 = (조건)?참:거짓;
			String bmiRes = (bmi <= 18.5) ? "저체중" : (bmi <= 22.9) ? "정상" : (bmi <= 24.9) ? "과체중" : "비만";

			System.out.println(bmiRes + "입니다.");
			
			System.out.println("종료하려면 q를, 계속하려면 아무키나 입력하세요");
			String exit = scanner.next();
			if("q".equals(exit)){
				break;
			}			
		}
		scanner.close();
		System.out.println("프로그램이 종료되었습니다.");
	}
}



//if (bmi <= 18.5) {
//System.out.println("저체중");
//} else if (bmi > 18.5 && bmi <= 22.9) {
//System.out.println("정상");
//} else if (bmi > 22.9 && bmi <= 24.9) {
//System.out.println("과체중");
//} else if (bmi <= 25) {
//System.out.println("비만");
//}