package com.tarena.demo;

public class Demo54
{
	/*  43
	 *��0-7������ɵ������ĸ���
	 */
	public static void main(String[] args)
	{
		int n = 24, sum = 28;
		for (int i = 3; i <= 7; i++)// λ��
		{
			n = n * (9 - i);
			sum = sum + n;
		}
		System.out.println("sum=" + sum);
	}
}
