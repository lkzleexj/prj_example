package com.tarena.demo;

public class Demo23
{
	//   10
	//һ���100�׸߶��������壬ÿ����غ�����ԭ�߶ȵ�һ�룬������
	//�����ڵ�10�����ʱ�������������ף���10�η�����ߣ�
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
		System.out.println("��ʮ�η����߶ȣ�" + t);
	}
}
