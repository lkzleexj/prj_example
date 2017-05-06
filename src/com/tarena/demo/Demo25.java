package com.tarena.demo;

import java.util.Scanner;

public class Demo25
{
	/*   12
	 * 企业发放的奖金根据利润提成。利润低于或等于10万元，奖金可提10%；
	 * 利润高于10万，低于20万，低于10万的部分按10%提成，高于10万的部分按7.5%
	 * 20万到40万之间，高于20万的部分，可提成5%；
	 * 40万到60万之间，高于40万的可提成3%；
	 * 60万到100万之间，高于60万的可提成1.5%
	 * 100万以上，高于100万的部分按1%提成，从键盘上输入当月利润，
	 * 求应发多少奖金？
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入当月利润：");
		double li = sc.nextDouble();
		double comm = 0;
		if (li >= 0 && li <= 100000)
		{
			comm = li * 0.1;
		}
		else if (li > 100000 && li <= 200000)
		{
			comm = 100000 * 0.1 + (li - 100000) * 0.075;
		}
		else if (li > 200000 && li <= 400000)
		{
			comm = 100000 * 0.1 + 100000 * 0.075 + (li - 200000) * 0.05;
		}
		else if (li > 400000 && li <= 600000)
		{
			comm = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + (li - 400000) * 0.03;
		}
		else if (li > 600000 && li <= 1000000)
		{
			comm = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + (li - 600000) * 0.015;
		}
		else if (li > 1000000)
		{
			comm = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + 400000 * 0.015 + (li - 1000000)
					* 0.01;
		}
		else
		{
			System.out.println("输入错误");
		}
		System.out.println("奖金是：" + comm);
	}
}
