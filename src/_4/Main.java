package _4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		입력받은 수를 2진수로 바꾸는 방법!
		// TODO Auto-generated method stub
//		입력을 받기 위한 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
//		input 변수에 입력을 받음.
		int input = sc.nextInt();
//		여기서 배열의 크기는 별로 중요하지 않다.
		int arr[] = new int[input];
//		중간 input을 나누는 과정에서 목을 저장해줄 변수를 지정
		int mok = input;
		int i = 0;
//		while문의 조건은 목이 0보다 클때만 하고, 0일때 한번만 실행해주고 멈춰야 하기 때문에 조건은 0보다 크다
		while( mok > 0) {
//			배열에 넣어주는 숫자는 목의 나머지를 입력
			arr[i] = mok%2;
//			배열에 넣어줬으면 다시 목을 2로 나누어 준다.
			mok /= 2;
//			i는 1을 증가시켜준다.
			i++;
		}
//		밑의 for문을돌리기 전에 위에서 while문을 빠져나오기전 i를 1증가 시켜줬기 때문에 -- 시켜준다.
		i--;
//		for문에서 굳이 int i 등으로 표시하지 않고, 위에서 선언했기때문에 위에서 내가 반복한 것을 역수행 하기 위해
//		이런식으로도 표현이 가능하다.
		for( ;i>=0; i--) {
			System.out.print(arr[i]);
		}
		
	}

}
