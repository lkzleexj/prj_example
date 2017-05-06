package com.tarena.demo;
import java.util.Scanner;
public class Demo1 {
/*
 * 从控制台输入任意的一个整数，判断该整数是否能被3整除，
 * 并且不能被4整除，或者能被24整除，如果满足条件，输出true，
 * 反之输出false
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入任意一个整数：");
		int num=sc.nextInt();
		if((num%3==0 && num%4!=0)||(num%24==0)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
