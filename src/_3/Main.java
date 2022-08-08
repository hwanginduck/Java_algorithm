package _3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
//		배열 두개를 생성, 입력을 받은 숫자를 저장할 배열, 각 숫자에 맞게 횟수를 카운팅 할 배열
		int []inputNum = new int[10];
		int []count = new int[10];
//		입력 받을 배열에 숫자를 받아 저장한다.
		for(int i=0; i<10; i++) {
			inputNum[i] = scan.nextInt();		
		}
//		입력 받은 배열을 카운할 배열에 넣고, 그 숫자에 해당하는 배열란에 +1을 누적 시켜준다.
		for(int i=0; i<10; i++) {
			count[inputNum[i]]++;
		}
		
		int MaxNum = 0; // 제일 많이 나온 수
		int MaxCount = 0; // 제일 많이 나온 수의 횟수
		
		for(int i=0; i<10; i++) {
//			최초 MaxCount는 0, count 배열에는 위에서 수행한 각 숫자의 해당란에 나온 횟수만큼 누적이 되어 있다 
			if(MaxCount < count[i]) {
//				그 누적 된 숫자로 MaxCount를 갱신 시켜줘서 더 높은 값이 나왔을때만 갱신을 시켜준다.
				MaxCount = count[i];
//				갱신될때, 해당하는 칸의 번호가 제일 많이 나온수 이기 때문에 그 숫자로 갱신을 시켜준다.
				MaxNum = i;
			}
		}
		System.out.println("최빈수는 "+MaxNum +"최빈수의 횟수는 " +MaxCount);
	
	}
}
