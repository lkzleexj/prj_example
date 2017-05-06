package com.tarena.demo;
import java.util.Scanner;
public class Demo2 {
/*从控制台输入任意两个整数，求其中较大的整数的值并输出
 * (if-else)
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int num1=sc.nextInt();
		System.out.println("请输入第二个整数：");
		int num2=sc.nextInt();
		if(num1>=num2){
			System.out.println("较大的值是："+num1);
		}else{
			System.out.println("较大的值是："+num2);
		}
	}
}

