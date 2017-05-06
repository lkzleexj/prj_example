package com.tarena.demo;

import java.util.Scanner;

public class Demo27
{
	/* 14
	 * ����ĳ��ĳ��ĳ���ж���һ������һ��ĵڼ��죿
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�����꣺");
		int year = sc.nextInt();
		System.out.println("������");
		int month = sc.nextInt();
		System.out.println("������");
		int day = sc.nextInt();

		if (year >= 1970 && month >= 1 && month <= 12)
		{
			int tday = days(year, month);
			if (day < 1 || day > tday)
			{
				System.out.println("����");
				return;
			}
			int days = day;
			for (int i = 1; i < month; i++)
			{
				days = days + days(year, i);
			}
			System.out.println("days=" + days);
		}
	}

	static int days(int year, int month)
	{
		int days = 0;
		switch (month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
					days = 29;
				}
				else
				{
					days = 28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			default:
				days = 0;
		}
		return days;

	}
}
