package com.tarena.demo;

import java.util.Scanner;

public class Demo39
{
	/*  28
	 * ��10������������
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����10��������������");
		int[] ary =
		{ sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt() };
		for (int i = 0; i <= ary.length - 1; i++)
		{
			for (int j = i + 1; j <= ary.length - 1; j++)
			{
				if (ary[i] >= ary[j])
				{//��С��������
					int t = ary[i];
					ary[i] = ary[j];
					ary[j] = t;
				}
			}
		}
		for (int num : ary)
		{
			System.out.println(num);
		}
	}
}
