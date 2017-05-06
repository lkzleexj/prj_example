package com.tarena.demo;

import java.util.Scanner;

public class Demo27
{
	/* 14
	 * 输入某年某月某日判断这一天是这一年的第几天？
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("输入年：");
		int year = sc.nextInt();
		System.out.println("输入月");
		int month = sc.nextInt();
		System.out.println("输入日");
		int day = sc.nextInt();

		if (year >= 1970 && month >= 1 && month <= 12)
		{
			int tday = days(year, month);
			if (day < 1 || day > tday)
			{
				System.out.println("错误");
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
