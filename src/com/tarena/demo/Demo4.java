package com.tarena.demo;
import java.util.Scanner;
public class Demo4 {
/*   1
 * 兔子问题：有一对兔子，从3个月起每月生一对兔子，兔子长到3个月后又会
 * 生兔子，假如兔子不死，问每个月兔子总数
 * 兔子按对计算，最后兔子对数乘以2即可
 */
	public static void main(String[] args) {
		System.out.println("输入想知道兔子总数的月份：");
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
			System.out.println("输入月份太小");
			sum=0;
		}else{
			sum=tu(num-1)+tu(num-2);	
		}
		return sum;
	}
}
