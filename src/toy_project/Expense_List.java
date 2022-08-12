package toy_project;

import java.util.Scanner;

public class Expense_List {

	Expense_Board expense_Board = new Expense_Board();
	//입력 목록 출력
	public void Expense_List_view(Scanner sc) {
		//Expense_Board ExpenceWrite = new Expense_Board();
		
		
		if(expense_Board.boardList.size()>0) {
			for(int i=0; i<expense_Board.boardList.size(); i++) {
				System.out.println(expense_Board.boardList.get(i).toString());
			}
		}else {
			System.out.println("등록된 내역이 없습니다.");
		}
	}

	
	
	
}
