package ifelse;

public class Lotto {

	public static void main(String[] args) {
		//1부터 45까지의 수 중에서 무작위로 5개의 숫자를 출력
		//카운트 : 숫자를 출력할 때 마다 1씩 증가
		int i = 0;
		while(true) {
			int lotto = (int)(Math.random() * 45 + 1);
			//System.out.println(lotto + " ");
			System.out.println(lotto);
			i++;
			if(i == 6) {
				break;
			}
		}
	}
}
