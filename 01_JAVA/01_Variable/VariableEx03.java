/**
 * Class Name: VariableEx03.java
 * 작성자: sist
 * 작성일: 2019. 11. 1.
 */
package kr.co.sist;

/**
 * @author sist
 *
 */
public class VariableEx03 {

	/**
	 *@Method Name:main
	 *@작성일:2019. 11. 1.
	 *@작성자:sist
	 *@설명:@param args
	 */
	public static void main(String[] args) {
		char ch = 'A';
		char tab = '\t';
		System.out.println("ch:"+tab+ch);
		System.out.println("tab:"+tab); //스페이스 4칸
		
		int i = 100;
		int biNum = 0b10; //2진수
		int oct = 010; //8진수
		int hex = 0x100; //16진수
		System.out.println("i:"+i);
		System.out.println("biNum:"+biNum);
		System.out.println("oct:"+oct);
		System.out.println("hex:"+hex);
		
		//long,float,double
		//double은 접미사 생략 가능
		//정수 리터럴 접미사 : L, f, d
		long longValue = 1000000L;
		System.out.println("longValue:"+longValue);
		
		//실수 리터럴 접미사 : f, d
		float floatValue = 3.14f;
		System.out.println("floatValue:"+floatValue);
		
		double doubleValue = 3.14d;
		System.out.println("doubleValue:"+doubleValue);
		

	}

}
