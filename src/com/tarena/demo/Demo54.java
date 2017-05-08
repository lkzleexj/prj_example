package com.tarena.demo;

public class Demo54
{
	/*  43
	 *求0-7所能组成的奇数的个数
	 */
	public static void main(String[] args)
	{
		int n = 24, sum = 28;
		for (int i = 3; i <= 7; i++)// 位数
		{
			n = n * (9 - i);
			sum = sum + n;
		}
		System.out.println("sum=" + sum);
	}
}
