package com.tarena.demo;
import java.util.Scanner;
public class Demo1 {
/*
 * �ӿ���̨���������һ���������жϸ������Ƿ��ܱ�3������
 * ���Ҳ��ܱ�4�����������ܱ�24����������������������true��
 * ��֮���false
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����������һ��������");
		int num=sc.nextInt();
		if((num%3==0 && num%4!=0)||(num%24==0)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
