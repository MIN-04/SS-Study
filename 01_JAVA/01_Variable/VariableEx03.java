/**
 * Class Name: VariableEx03.java
 * �ۼ���: sist
 * �ۼ���: 2019. 11. 1.
 */
package kr.co.sist;

/**
 * @author sist
 *
 */
public class VariableEx03 {

	/**
	 *@Method Name:main
	 *@�ۼ���:2019. 11. 1.
	 *@�ۼ���:sist
	 *@����:@param args
	 */
	public static void main(String[] args) {
		char ch = 'A';
		char tab = '\t';
		System.out.println("ch:"+tab+ch);
		System.out.println("tab:"+tab); //�����̽� 4ĭ
		
		int i = 100;
		int biNum = 0b10; //2����
		int oct = 010; //8����
		int hex = 0x100; //16����
		System.out.println("i:"+i);
		System.out.println("biNum:"+biNum);
		System.out.println("oct:"+oct);
		System.out.println("hex:"+hex);
		
		//long,float,double
		//double�� ���̻� ���� ����
		//���� ���ͷ� ���̻� : L, f, d
		long longValue = 1000000L;
		System.out.println("longValue:"+longValue);
		
		//�Ǽ� ���ͷ� ���̻� : f, d
		float floatValue = 3.14f;
		System.out.println("floatValue:"+floatValue);
		
		double doubleValue = 3.14d;
		System.out.println("doubleValue:"+doubleValue);
		

	}

}
