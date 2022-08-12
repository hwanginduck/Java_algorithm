package toy_project;

import java.util.Scanner;

public class Expense_List {

	//입력 목록 출력
	public static void ExpenseListView(Scanner sc) {
		BoardSVC input = new BoardSVC();
		
		if((input.boardList.size())>0) {
			for(int i=0; i<input.boardList.size(); i++) {
				System.out.println(input.boardList.get(i).toString());
			}
		}else {
			System.out.println("등록된 내역이 없습니다.");
		}
	}

	
	
	
}
