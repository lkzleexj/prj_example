package com.tarena.demo;

public class Demo40
{
	/*  29
	 * 求一个3*3矩阵对角线元素之和
	 */
	public static void main(String[] args)
	{
		int[][] ary =
		{
		{ 23, 12, 13 },
		{ 2, 55, 34 },
		{ 21, 4, 45 } };
		int sum = 0;
		for (int i = 0; i <= ary.length - 1; i++)
		{
			sum = sum + ary[i][i];
		}
		System.out.println("sum=" + sum);
	}
}
