package com.tarena.demo;
import java.util.Scanner;
public class Demo17 {
/*   5
 * ���������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60~89
 * ֮�����B��ʾ��60��һ�µ���C��ʾ
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����ɼ���");
		int score=sc.nextInt();
		char result=(score>=60)?(score>=90?'A':'B'):'C';
		System.out.println(result);
	}
}
