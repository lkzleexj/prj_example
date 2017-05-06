package com.tarena.demo;
import java.util.Scanner;
public class Demo8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入行：");
		int row=sc.nextInt();
		System.out.println("输入列：");
		int line=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=line;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
