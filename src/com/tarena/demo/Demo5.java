package com.tarena.demo;
public class Demo5 {
/*   2
 * 判断101~200之间有多少个素数，并输出所有的素数
 */
	static int sushu(){
		int num=0;
		for(int i=101;i<=200;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					break;
				}
			}
			num=num+1;
			System.out.println(i+"是素数");
		}
		return num;
	}
	public static void main(String[] args) {
		int num=sushu();
		System.out.println("素数有："+num+"个");		
	}
}
