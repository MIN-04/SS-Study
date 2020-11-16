/**
 * 
 */
package kr.co.sist02.keyin;
import java.util.Scanner;
/**
 * @author sist
 *
 */
public class KeyBoardinput02 {

	/**
	*@Method Name:main
	*@작성일: 2019. 11. 4.
	*@작성자: sist
	*@설명:
	*@param args
	*/
	public static void main(String[] args) {
		System.out.println("원주율은 얼마 입니까?>>");
		Scanner scanner = new Scanner(System.in);
		
		String strInput = scanner.nextLine();
		//3.14
		double pi = Double.parseDouble(strInput);
		
		System.out.println("원주율은 "+pi+"입니다.");
		
		//복습
		//문자열을 숫자로 바꾸기
		System.out.println("원주율은 얼마입니까?>>");
		Scanner scanner1 = new Scanner(System.in);
		String strInput1 = scanner1.nextLine();
		double pi1 = Double.parseDouble(strInput1);
		System.out.println("원주율은 "+pi1+"입니다.");

	}

}
