package com.tarena.demo;
import java.util.Scanner;
public class Demo3 {
	/*�ӿ���̨�����������������������нϴ��������ֵ�����
	 * ���������
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ��������");
		int num1=sc.nextInt();
		System.out.println("������ڶ�������");
		int num2=sc.nextInt();
		int result=num1>=num2?num1:num2;
		System.out.println("�ϴ�����ǣ�"+result);
	}
}

