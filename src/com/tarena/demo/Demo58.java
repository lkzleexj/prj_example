package com.tarena.demo;

import java.util.Scanner;

public class Demo58
{
	/*  47
	 * ��ȡ7������1-50��������ֵ��ÿ��ȡһ��ֵ�������ӡ����ֵ������*
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("��1������");
		f(sc.nextInt());
		System.out.println("��2������");
		f(sc.nextInt());
		System.out.println("��3������");
		f(sc.nextInt());
		System.out.println("��4������");
		f(sc.nextInt());
		System.out.println("��5������");
		f(sc.nextInt());
		System.out.println("��6������");
		f(sc.nextInt());
		System.out.println("��7������");
		f(sc.nextInt());
	}

	static void f(int num)
	{
		if (num >= 1 && num <= 50)
		{
			for (int i = 1; i <= num; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		else
		{
			System.out.println("������󣡣�");
		}
	}
}
