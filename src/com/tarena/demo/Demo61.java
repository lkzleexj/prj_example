package com.tarena.demo;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Demo61
{
	/*  50
	 * �����ѧ����ÿ��ѧ����3�ſεĳɼ����Ӽ��������������ݣ�����
	 * ѧ���ţ����ſεĳɼ��������ƽ���ɼ�����ԭ�е����ݺͼ������
	 * ƽ���ɼ�����ڴ����ļ���stud����
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
