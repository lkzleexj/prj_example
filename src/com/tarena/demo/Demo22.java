package com.tarena.demo;
public class Demo22 {
/*   9
 * ���һ����ǡ�õ�����������֮�ͣ�������ͳ�Ϊ����������
 * 6=1+2+3;����ҳ�1000���ڵ���������
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
	    	System.out.println(num+"������");
	    }		
	}
}
