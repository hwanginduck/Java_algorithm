package toy_project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean isStop = false;
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		Expense_Board expense_Board = new Expense_Board();
		//조회
		Expense_List expense_List = new Expense_List();
		
		
		do {
			System.out.println("원하는 메뉴를 입력하세요");
			System.out.println("1. 수입 내용 추가");
			System.out.println("2. 수입 목록 조회");
			System.out.println("3. 수입 내용 삭제");
			
			System.out.println("4. 지출 내용 추가");
			System.out.println("5. 지출 목록 조회");
			System.out.println("6. 지출 내용 삭제");
			
			System.out.println("7. 종료");
			
			String menu = sc.next();
			
			switch(menu) {
			
			case "1" : expense_Board.ExpenseWrite(sc);
			break;
			case "2" : expense_Board.ExpenseWrite(sc);
			break;
			case "3" : expense_Board.ExpenseWrite(sc);
			break;
			case "4" : expense_Board.ExpenseWrite(sc);
			break;
			case "5" : expense_List.Expense_List_view(sc);
			break;
			case "6" : expense_Board.ExpenseWrite(sc);
			break;
			case "7" : isStop = true;
			
			}
			
		}while(!isStop);
	}

}
