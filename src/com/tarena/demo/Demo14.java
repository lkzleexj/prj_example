package com.tarena.demo;
import java.util.Scanner;
public class Demo14 {
/*
 * 从控制台输入3个整数，作为三角形的三条边，判断能不能构成三角形
 * 若能，判断：直角三角形，等边的，等腰的
 */
	static void riangle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入整数作为第一条边：");
		int a=sc.nextInt();
		System.out.println("请输入整数作为第二条边：");
		int b=sc.nextInt();
		System.out.println("请输入整数作为第三条边：");
		int c=sc.nextInt();
		if(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a){
			if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
				System.out.println(a+","+b+","+c+"可以构成直角三角形");
			}else if(a==b&&a==c){
				System.out.println(a+","+b+","+c+"可以构成等边三角形");
			}else if(a==b||b==c||a==c){
				System.out.println(a+","+b+","+c+"可以构成等腰三角形");
			}else{
				System.out.println(a+","+b+","+c+"可以构成一般三角形");
			}
		}else{
			System.out.println(a+","+b+","+c+"不能构成三角形");
		}
	}
	public static void main(String[] args) {
		riangle();
	}
}
