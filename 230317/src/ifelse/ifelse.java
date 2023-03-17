package ifelse;

public class ifelse {
	public static void main(String[] args) {
		// Math.random()
		// 0.0 ~ 1.0 사이의 무작위수를 추출하여 double 타입으로 반환
		// 0.000000....1 - 0.99999999....9
		// 10을 곱했을때 0-9
		// 100을 곱했을때 00-99
		
		double num = Math.random();
		int numRes = (int)((num*6)+1);
		System.out.println("주사위: " + numRes);
		
		switch (numRes) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
			break;
		//1-6에 해당되지 않는 경우에 실행됨
		default :
			System.out.println("디폴트");
			break;
		}
		
		double rotto1 = (int)(Math.random()*100);
		double rotto2 = (int)(Math.random()*100);
		double rotto3 = (int)(Math.random()*100);
		double rotto4 = (int)(Math.random()*100);
		double rotto5 = (int)(Math.random()*100);
		
		System.out.println("당신의 복권번호는 다음과 같습니다.");
		System.out.printf("%.0f \n",rotto1);
		System.out.printf("%.0f \n",rotto2);
		System.out.printf("%.0f \n",rotto3);
		System.out.printf("%.0f \n",rotto4);
		System.out.printf("%.0f \n",rotto5);
	}
}
