package com.tarena.demo;

import java.util.Scanner;

public class Demo28
{
	/*  15
	 * ������������x,y,z���������������С�������
	 */
	public static void main(String[] args)
	{
		int[] ary = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		ary[0] = sc.nextInt();
		System.out.println("������ڶ�����");
		ary[1] = sc.nextInt();
		System.out.println("�������������");
		ary[2] = sc.nextInt();
		for (int i = 0; i <= ary.length - 1; i++)
		{
			for (int j = i + 1; j <= ary.length - 1; j++)
			{
				int t;
				if (ary[i] >= ary[j])
				{
					t = ary[i];
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
