package com.tarena.demo;

import java.util.Scanner;

public class Demo58
{
	/*  47
	 * 读取7个数（1-50）的整数值，每读取一个值，程序打印出该值个数的*
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("第1个数：");
		f(sc.nextInt());
		System.out.println("第2个数：");
		f(sc.nextInt());
		System.out.println("第3个数：");
		f(sc.nextInt());
		System.out.println("第4个数：");
		f(sc.nextInt());
		System.out.println("第5个数：");
		f(sc.nextInt());
		System.out.println("第6个数：");
		f(sc.nextInt());
		System.out.println("第7个数：");
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
			System.out.println("输入错误！！");
		}
	}
}
