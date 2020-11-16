/**
 * 
 */
package kr.co.sist01.literal;

/**
 * @author sist
 *
 */
public class Literal01 {
//	문자 리터럴과 문자열 리터럴
//	문자 리터럴: 하나의 문자 ex) 'A'
//	문자열 리터럴: 문자열 ex) "Hello"

// kr.co.sist01.패키지
// kr.co.sist02.패키지
// ...
// kr.co.sist0N.패키지

	public static void main(String[] args) {
		//character literal
		System.out.println('A');
		System.out.println(' ');//초기값 ' ' //스페이스바 없으면 불가능
		
		//String
		System.out.println("Java 세상에 오신 걸 환영합니다.");
		System.out.println(""); //공백문자 //스페이스바 없어도 가능
		
		//8진수
		//16진수
		System.out.println("8진수 101은 \101 입니다."); //8진수 101은 A 입니다.
		System.out.println("16진수0061은 \u0061 입니다."); //16진수0061은 a 입니다.
		
		//내가 해본 것
		System.out.println("\102"); //B

	}

}
