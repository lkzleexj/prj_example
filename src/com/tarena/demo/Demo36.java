package com.tarena.demo;

import java.util.Scanner;

public class Demo36
{
	/*   25
	 * һ����λ�����ж����ǲ��ǻ���������12321�ǻ�������
	 * ��λ����λ��ȣ�ʮλ��ǧλ���
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
			int a = num / 10000;//��λ
			int b = (num % 10000) / 1000;//ǧλ
			int c = ((num % 10000) % 1000) / 100;//��λ
			int d = (((num % 10000) % 1000) % 100) / 10;//ʮλ
			int e = (((num % 10000) % 1000) % 100) % 10;//��λ
			if (a == e && b == d)
			{
				System.out.println(num + "�ǻ���");
			}
			else
			{
				System.out.println(num + "���ǻ���");
			}
		}
		else
		{
			System.out.println("������󣡣�");
		}
	}
}
