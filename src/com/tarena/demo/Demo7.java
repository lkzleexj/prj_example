package com.tarena.demo;

import java.util.Scanner;

public class Demo7 {
/*  4
 * 将一个正整数分解质因数。
 */
	static void fenjie(int num){
		for(int i=2;i<=num-1;i++){
			
			while(num%i==0){
				num=num/i;

			}
           
		}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要分解质因数的整数：");
		int num=sc.nextInt();
		fenjie(num);
	}

}
