package com.tarena.demo;

import java.util.Scanner;

public class Demo43
{
	/*  32
	 * ȡһ������a���Ҷ˿�ʼ��4~7λ
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ڵ���7λ��������");
		int num = sc.nextInt();
		if (num >= 1000000)
		{
			int a = (num % 10000000) / 1000000;//7λ
			int b = ((num % 10000000) % 1000000) / 100000;//6λ
			int c = (((num % 10000000) % 1000000) % 100000) / 10000;//5λ
			int d = ((((num % 10000000) % 1000000) % 100000) % 10000) / 1000;//4λ
			System.out.println("��7λ��" + a);
			System.out.println("��6λ��" + b);
			System.out.println("��5λ��" + c);
			System.out.println("��4λ��" + d);
		}
		else
		{
			System.out.println("����ֵ��С����");
		}
	}
}
