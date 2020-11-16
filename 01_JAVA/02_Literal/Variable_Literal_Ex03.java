package kr.co.sist01.literal;

public class Variable_Literal_Ex03 {

	public static void main(String[] args) {
		//3. 다음과 같이 화면에 출력하는 코드를 작성 하세요.
		//8진수
		//(8^1)*1 + (8^0)*0 //8
		System.out.println(010); //8
		System.out.println(012); //10
		System.out.println(015); //13
		System.out.println("======================");
		System.out.println("|     16진수     |");
		System.out.println("======================");
		//16진수 0x
		System.out.println(0x8); //8
		System.out.println(0xA); //10
		System.out.println(0xD); //13 //대소문자 구분하지 않음.
	}

}
