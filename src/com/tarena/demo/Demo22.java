package com.tarena.demo;
public class Demo22 {
/*   9
 * 如果一个数恰好等于它的因子之和，这个数就称为完数。例如
 * 6=1+2+3;编程找出1000以内的所有完数
 */
	public static void main(String[] args) {
	    for(int num=1;num<=1000;num++){
	    	wanshu(num);
	    }		
	}
	static void wanshu(int num){
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum=sum+i;
			}
		} 
	    if(sum==num){
	    	System.out.println(num+"是完数");
	    }		
	}
}
