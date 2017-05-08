package com.tarena.demo;

public class Demo32
{
	/*  21
	 * Çó1£¡+2£¡+3£¡+4£¡+¡­¡­+20£¡=£¿
	 */
	public static void main(String[] args)
	{
		int n = 1, sum = 0;
		for (int i = 1; i <= 20; i++)
		{
			n = n * i;
			sum = sum + n;
		}
		System.out.println("sum=" + sum);
	}
}
