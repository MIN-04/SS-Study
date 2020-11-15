package kr.co.sist;

public class VariableEx01 {
	//변수 명명규칙: 카멜케이스
	//1. 대소문자 구분, 길이에 제한이 없다.
	//2. 예약어를 사용해서는 안된다.
	//3. 숫자로 시작해서는 안된다.
	//4. 특수 문자는 '_', '$'만 사용가능
	
	
	public static void main(String[] args) {
		int year; //변수 선언
		year = 0; //변수 초기화
		
		int age = 25;
		
		System.out.println("year:"+year); //콘솔 출력
		System.out.println("age:"+age);
		
		System.out.println("===============");
		
		year = age + 2000; //age+2000 -> 29+2000
		age  = age + 1;    //age+1 -> 29 + 1
		
		System.out.println("year:"+year);
		System.out.println("age:"+age);

	}

}
