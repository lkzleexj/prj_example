package com.tarena.demo;

import java.util.Scanner;

public class Demo7 {
/*  4
 * ��һ���������ֽ���������
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
		System.out.println("������Ҫ�ֽ���������������");
		int num=sc.nextInt();
		fenjie(num);
	}

}
