/**
 * Class Name: VariableEx02.java
 * 작성자: sist
 * 작성일: 2019. 11. 1.
 */
package kr.co.sist;

/**
 * @author sist
 *
 */
public class VariableEx02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//--------------------
		//값 교환
		//--------------------
		
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("변경 전");
		System.out.println("x="+x+" y="+y);
		System.out.println("=============");
		
		//값 교환 : sort에 사용.
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("변경 후");
		System.out.println("x="+x+" y="+y);
		System.out.println("=============");
		
		//상수
		final int MAX_NUM = 100;
		//MAX_NUM = 200; //상수는 값을 변경할 수 없다.
		
		//상수 사용
		final int WIDTH = 20; //폭
		final int HEIGHT = 10; //높이
		//삼각형 면적을 구하는 공식
		int triangle = (WIDTH * HEIGHT)/2; 
		
		//VS
		int lTriangle = (20 * 10)/2; //literal
		
		//ENUM: 추후에 

	}

}
