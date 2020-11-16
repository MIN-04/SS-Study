/**
 * 
 */
package kr.co.sist02.keyin;

import java.util.Scanner;

/**
 * @author sist
 *
 */
public class KeyBoardinput03 {

	/**
	*@Method Name:main
	*@작성일: 2019. 11. 4.
	*@작성자: sist
	*@설명: 입력을 2개 받기.
	*@param args
	*/
	public static void main(String[] args) {
		System.out.println("키와 몸무게를 입력하세요.>>");
		Scanner scanner=new Scanner(System.in);
		String strHeight = scanner.nextLine(); //키 입력
		String strWeight = scanner.nextLine(); //몸무게 입력
		
		double height = Double.parseDouble(strHeight);
		double weight = Double.parseDouble(strWeight);
		
		System.out.println("키는 "+height+"센티미터 입니다.");
		System.out.println("몸무게는 "+weight+"킬로그램 입니다.");
	}

}
