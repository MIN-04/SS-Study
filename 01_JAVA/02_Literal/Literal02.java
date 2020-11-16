package kr.co.sist01.literal;

public class Literal02 {
//	이스케이프 시퀀스: 역슬래시(\)와 한 개의 문자와 결합하여 작성	
//	\n	개행(줄바꿈), 아스키코드: 10
//	\t	탭. 스크린 커서를 다음 탭으로 옮김.
//	\r	캐리지 리턴. 스크린 커서를 현재 줄의 처음으로, 아스키코드: 13
//	\\	역슬래시 문자 출력
//	\"	큰 따옴표를 출력.
//	\b	백스페이스
//	\\u	유니코드 문자 16진수 문자코드 (h:0~9, A~F)
//	₩101	8진수 (0~7)
// Encoding: 문자를 숫자로 변환 <-> Decoding: 숫자를 문자로 변환
// ---------------------------------------------------
// Encoding: 'A' -> 65
// Decoding: 65 ->'A'

	public static void main(String[] args) {
		System.out.println("작은 따옴표: \'"); //작은 따옴표: '
		System.out.println("tab문자: abc\tdef\tghi"); //tab문자: abc	def	ghi
		System.out.println("개행(줄바꿈):\n");
		System.out.println("c:\\"); //c:\
		System.out.println(" \"Hello\" world."); // "Hello" world.
		
		
		

	}
}
