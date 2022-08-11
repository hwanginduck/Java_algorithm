package toy_project;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	
	ArrayList<insert> boardList;
	
	public BoardSVC() {
		boardList = new ArrayList<insert>();
	}
	
	//입력 처리 메소드
	public void ExpenceWrite(Scanner sc) {
		
		System.out.println("안내에 따라 입력하세요");
		System.out.println("ID를 입력하세요.");
		String id = sc.next();
		
		System.out.println("지불일을 입력하세요");
		System.out.println("(예 : 22/01/01)");
		String ipaydate = sc.next();
		
		System.out.println("목적을 입력하세요");
		System.out.println("식료품 / 유흥비 / 식사 / 등등");
		String itype = sc.next();
		
		System.out.println("지불 방법을 입력하세요");
		System.out.println("현금 / 신용카드 / 체크카드 / 이체");
		String ipay = sc.next();
		
		System.out.println("금액을 입력하세요");
		int iamount = sc.nextInt();
		
		System.out.println("할부개월을 숫자로 입력하세요");
		int iperiod = sc.nextInt();
		
		System.out.println("간단한 메모를 입력하세요");
		String inote = sc.next();
		
		insert insert = new insert(id, ipaydate, itype, ipay, iamount, iperiod, inote);
		addAction(insert);
		
	}
	
	//입력
	public void addAction(insert insert) {
		boardList.add(insert);
	}
	//입력 목록 출력
	public void ExpenseListView(Scanner sc) {
		if(boardList.size()>0) {
			for(int i=0; i<boardList.size(); i++) {
				System.out.println(boardList.get(i).toString());
			}
		}else {
			System.out.println("등록된 내역이 없습니다.");
		}
	}

	
}
