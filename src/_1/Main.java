package _1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] arg) {
	
	Student stu1 = new Student("손오공", "1234");
	Student stu2 = new Student("사오정", "1235");
	Student stu3 = new Student("저팔계", "1236");
	
	ArrayList<Student> list = new ArrayList<Student>();
	
	list.add(stu1);
	list.add(stu2);
	list.add(stu3);
	
	Scanner scan = new Scanner(System.in);
	
	while(true){
		
		System.out.println("검색하시려면 'y' 그만하시려면 'n'");
	
		String input = scan.next();

		if(input.equals("y")) {
		
			System.out.println("검색하고 하는 이름을 입력하세요");

			String name = scan.next();
			
			for(Student stu : list) {
				if(stu.getName().equals(name)) {
					System.out.println(stu.getNo());
					break;
				}else if(!stu.getName().equals(name)){
					System.out.println("검색하려는 학생이 없습니다.");
					break;
				}
			}
		}else if(input.equals("n")) {
			System.out.println("검색을 종료합니다.");
			break;
		}
		
	}
	
	}

}
