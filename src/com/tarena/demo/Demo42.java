package com.tarena.demo;

public class Demo42
{
	/*  31
	 * 将一个数组逆序输出
	 */
	public static void main(String[] args)
	{
		int[] ary =
		{ 2, 5, 7, 67, 34, 90 };
		for (int i = ary.length - 1; i >= 0; i--)
		{
			System.out.println(ary[i]);
		}
	}
}
