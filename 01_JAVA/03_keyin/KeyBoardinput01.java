/**
 * 
 */
package kr.co.sist02.keyin;

import java.util.Scanner;

/**
 * @author sist
 *
 */
public class KeyBoardinput01 {

	/**
	*@Method Name:main
	*@작성일: 2019. 11. 4.
	*@작성자: sist
	*@설명: Console에서 데이터 입력 받기.
	*@param args
	*/
	public static void main(String[] args) {
		// 메시지
		System.out.println("당신은 몇 살입니까?>>");
		
		//입력: keyboard 입력
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		//String -> Int
		int age = Integer.parseInt(str);
		
		System.out.println("당신은 "+age+"살 입니다.");
		
		//내가 해본 것
		//next + {자료형}() : 뒤에 사용한 자료형에 맞는 값을 받을 수 있다.
		//nextLine() : 문자열 전체를 입력받는 것.
		//next() : 공백 이전의 문자열을 받아온다.
		
		//int -> nextInt();
		System.out.println("숫자를 입력하시오.>>");
		Scanner scanner1 = new Scanner(System.in);
		int num = scanner1.nextInt();
		System.out.println("입력한 숫자는 "+num+"입니다.");
		
		//String -> next();
		System.out.println("문자를 입력하시오.>>");
		Scanner scanner2 = new Scanner(System.in);
		String str1 = scanner2.next();
		System.out.println("입력한 문자는 "+str1+"입니다.");
		
		//nextLine(); //자료형 변환
		System.out.println("문자를 숫자로 바꾸기. 문자를 입력하시오.>>");
		Scanner scanner3 = new Scanner(System.in);
		String str2 = scanner.nextLine();
		int num1 = Integer.parseInt(str2);
		System.out.println("입력한 숫자는 "+num1+"입니다.");
		
		System.out.println("숫자를 문자로 바꾸기. 숫자를 입력하시오.>>"); //
		Scanner scanner4 = new Scanner(System.in);
		//int num2 = scanner4.nextLine(); //nextLine()은 정수 받아 올 수 없다.
		int num2 = scanner4.nextInt();
		
		
		
		
		
		
		
	}

}
