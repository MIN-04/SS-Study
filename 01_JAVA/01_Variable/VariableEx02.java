/**
 * Class Name: VariableEx02.java
 * �ۼ���: sist
 * �ۼ���: 2019. 11. 1.
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
		//�� ��ȯ
		//--------------------
		
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("���� ��");
		System.out.println("x="+x+" y="+y);
		System.out.println("=============");
		
		//�� ��ȯ : sort�� ���.
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("���� ��");
		System.out.println("x="+x+" y="+y);
		System.out.println("=============");
		
		//���
		final int MAX_NUM = 100;
		//MAX_NUM = 200; //����� ���� ������ �� ����.
		
		//��� ���
		final int WIDTH = 20; //��
		final int HEIGHT = 10; //����
		//�ﰢ�� ������ ���ϴ� ����
		int triangle = (WIDTH * HEIGHT)/2; 
		
		//VS
		int lTriangle = (20 * 10)/2; //literal
		
		//ENUM: ���Ŀ� 

	}

}
