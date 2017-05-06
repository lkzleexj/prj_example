package com.tarena.demo;

import java.util.Scanner;

public class Demo21
{
	/*  8
	 * 求s=a+aa+aaa+aaaa+a……a的值，其中a是一个数字，例如
	 * 2+22+222+2222+22222（此时共有5个数相加），几个数相加由键盘控制
	 */
	//
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入a的值1~9");
		int a = sc.nextInt();
		System.out.println("请输入几个数相加：");
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
				System.out.println("输入错误");
			}
		}
		else
		{
			System.out.println("a输入有误！");
		}
	}
}
