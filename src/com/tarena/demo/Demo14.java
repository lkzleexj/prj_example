package com.tarena.demo;
import java.util.Scanner;
public class Demo14 {
/*
 * �ӿ���̨����3����������Ϊ�����ε������ߣ��ж��ܲ��ܹ���������
 * ���ܣ��жϣ�ֱ�������Σ��ȱߵģ�������
 */
	static void riangle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("������������Ϊ��һ���ߣ�");
		int a=sc.nextInt();
		System.out.println("������������Ϊ�ڶ����ߣ�");
		int b=sc.nextInt();
		System.out.println("������������Ϊ�������ߣ�");
		int c=sc.nextInt();
		if(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a){
			if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
				System.out.println(a+","+b+","+c+"���Թ���ֱ��������");
			}else if(a==b&&a==c){
				System.out.println(a+","+b+","+c+"���Թ��ɵȱ�������");
			}else if(a==b||b==c||a==c){
				System.out.println(a+","+b+","+c+"���Թ��ɵ���������");
			}else{
				System.out.println(a+","+b+","+c+"���Թ���һ��������");
			}
		}else{
			System.out.println(a+","+b+","+c+"���ܹ���������");
		}
	}
	public static void main(String[] args) {
		riangle();
	}
}
