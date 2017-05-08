package com.tarena.demo;

import java.util.Scanner;

public class Demo43
{
	/*  32
	 * 取一个整数a从右端开始的4~7位
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个大于等于7位的整数：");
		int num = sc.nextInt();
		if (num >= 1000000)
		{
			int a = (num % 10000000) / 1000000;//7位
			int b = ((num % 10000000) % 1000000) / 100000;//6位
			int c = (((num % 10000000) % 1000000) % 100000) / 10000;//5位
			int d = ((((num % 10000000) % 1000000) % 100000) % 10000) / 1000;//4位
			System.out.println("第7位：" + a);
			System.out.println("第6位：" + b);
			System.out.println("第5位：" + c);
			System.out.println("第4位：" + d);
		}
		else
		{
			System.out.println("输入值过小！！");
		}
	}
}
