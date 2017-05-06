package com.tarena.demo;
import java.util.Scanner;
public class Demo3 {
	/*从控制台输入任意两个整数，求其中较大的整数的值并输出
	 * 条件运算符
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int num1=sc.nextInt();
		System.out.println("请输入第二个整数");
		int num2=sc.nextInt();
		int result=num1>=num2?num1:num2;
		System.out.println("较大的数是："+result);
	}
}

