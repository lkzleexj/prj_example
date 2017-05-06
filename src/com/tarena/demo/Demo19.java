package com.tarena.demo;

public class Demo19 {
//   16
//打印九九乘法表
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"  ");
			}
			System.out.println();//换行
		}
	}
}
