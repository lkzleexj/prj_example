package com.tarena.demo;
import java.util.Scanner;
public class Demo2 {
/*�ӿ���̨�����������������������нϴ��������ֵ�����
 * (if-else)
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ��������");
		int num1=sc.nextInt();
		System.out.println("������ڶ���������");
		int num2=sc.nextInt();
		if(num1>=num2){
			System.out.println("�ϴ��ֵ�ǣ�"+num1);
		}else{
			System.out.println("�ϴ��ֵ�ǣ�"+num2);
		}
	}
}

