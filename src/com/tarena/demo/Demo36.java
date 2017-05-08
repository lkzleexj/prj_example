package com.tarena.demo;

import java.util.Scanner;

public class Demo36
{
	/*   25
	 * 一个五位数，判断它是不是回文数，即12321是回文数，
	 * 个位与万位相等，十位与千位相等
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		huiwen(num);
	}

	static void huiwen(int num)
	{
		if (num >= 10000 && num <= 99999)
		{
			int a = num / 10000;//万位
			int b = (num % 10000) / 1000;//千位
			int c = ((num % 10000) % 1000) / 100;//百位
			int d = (((num % 10000) % 1000) % 100) / 10;//十位
			int e = (((num % 10000) % 1000) % 100) % 10;//个位
			if (a == e && b == d)
			{
				System.out.println(num + "是回文");
			}
			else
			{
				System.out.println(num + "不是回文");
			}
		}
		else
		{
			System.out.println("输入错误！！");
		}
	}
}
