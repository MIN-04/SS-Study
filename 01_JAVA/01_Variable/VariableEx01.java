package kr.co.sist;

public class VariableEx01 {
	//���� ����Ģ: ī�����̽�
	//1. ��ҹ��� ����, ���̿� ������ ����.
	//2. ���� ����ؼ��� �ȵȴ�.
	//3. ���ڷ� �����ؼ��� �ȵȴ�.
	//4. Ư�� ���ڴ� '_', '$'�� ��밡��
	
	
	public static void main(String[] args) {
		int year; //���� ����
		year = 0; //���� �ʱ�ȭ
		
		int age = 25;
		
		System.out.println("year:"+year); //�ܼ� ���
		System.out.println("age:"+age);
		
		System.out.println("===============");
		
		year = age + 2000; //age+2000 -> 29+2000
		age  = age + 1;    //age+1 -> 29 + 1
		
		System.out.println("year:"+year);
		System.out.println("age:"+age);

	}

}
