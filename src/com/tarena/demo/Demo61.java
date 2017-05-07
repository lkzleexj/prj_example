package com.tarena.demo;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Demo61
{
	/*  50
	 * 有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括
	 * 学生号，三门课的成绩）计算出平均成绩，况原有的数据和计算出的
	 * 平均成绩存放在磁盘文件“stud”中
	 */
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		double[] ary1 =
		{ sc.nextInt(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble() };
		double[] ary2 =
		{ sc.nextInt(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble() };
		double[] ary3 =
		{ sc.nextInt(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble() };
		double[] ary4 =
		{ sc.nextInt(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble() };
		double[] ary5 =
		{ sc.nextInt(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble() };
		double avg1 = (ary1[1] + ary1[2] + ary1[3]) / 3;
		double avg2 = (ary2[1] + ary2[2] + ary2[3]) / 3;
		double avg3 = (ary3[1] + ary3[2] + ary3[3]) / 3;
		double avg4 = (ary4[1] + ary4[2] + ary4[3]) / 3;
		double avg5 = (ary5[1] + ary5[2] + ary5[3]) / 3;
		System.out.println(avg1 + "," + avg2 + "," + avg3 + "," + avg4 + "," + avg5);
		File file = new File("stud.txt");
		FileWriter input = new FileWriter(file);
		input.write();
		input.close();
	}
}
