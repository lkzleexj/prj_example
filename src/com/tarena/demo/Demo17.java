package com.tarena.demo;
import java.util.Scanner;
public class Demo17 {
/*   5
 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60~89
 * 之间的用B表示，60分一下的用C表示
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入成绩：");
		int score=sc.nextInt();
		char result=(score>=60)?(score>=90?'A':'B'):'C';
		System.out.println(result);
	}
}
