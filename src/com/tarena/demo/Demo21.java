package com.tarena.demo;

import java.util.Scanner;

public class Demo21
{
	/*  8
	 * ��s=a+aa+aaa+aaaa+a����a��ֵ������a��һ�����֣�����
	 * 2+22+222+2222+22222����ʱ����5������ӣ�������������ɼ��̿���
	 */
	//
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������a��ֵ1~9");
		int a = sc.nextInt();
		System.out.println("�����뼸������ӣ�");
		int num = sc.nextInt();
		sum(a, num);

	}

	static void sum(int a, int num)
	{
		if (a >= 1 && a <= 9)
		{
			if (num >= 1)
			{
				int sum = 0;
				int t = 0;
				for (int i = 1; i <= num; i++)
				{
					t = t + a * (int) Math.pow(10, i - 1);
					System.out.println(t);
					sum = sum + t;
				}
				System.out.println("sum=" + sum);
			}
			else
			{
				System.out.println("�������");
			}
		}
		else
		{
			System.out.println("a��������");
		}
	}
}
