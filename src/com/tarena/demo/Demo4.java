package com.tarena.demo;
import java.util.Scanner;
public class Demo4 {
/*   1
 * �������⣺��һ�����ӣ���3������ÿ����һ�����ӣ����ӳ���3���º��ֻ�
 * �����ӣ��������Ӳ�������ÿ������������
 * ���Ӱ��Լ��㣬������Ӷ�������2����
 */
	public static void main(String[] args) {
		System.out.println("������֪�������������·ݣ�");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=tu(num);
		System.out.println("sum="+sum);		
	}
	static int tu(int num){
		int sum=0;
		if(num==1||num==2){
			sum=1*2;
		}else if(num<1){
			System.out.println("�����·�̫С");
			sum=0;
		}else{
			sum=tu(num-1)+tu(num-2);	
		}
		return sum;
	}
}
