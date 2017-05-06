package com.tarena.demo;

public class Demo23
{
	//   10
	//一球从100米高度自由落体，每次落地后反跳回原高度的一半，在落下
	//求它在第10次落地时，共经过多少米？第10次反弹多高？
	public static void main(String[] args)
	{
		double t = 0;
		double sum = 100;
		for (int i = 1; i <= 10; i++)
		{
			t = 100 * Math.pow(0.5, i);
			sum = sum + t;
		}
		System.out.println("sum=" + sum);
		System.out.println("第十次反弹高度：" + t);
	}
}
