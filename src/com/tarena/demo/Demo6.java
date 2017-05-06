package com.tarena.demo;
public class Demo6 {
/*   3
 * 打印所有的水仙花数，水仙花是指一个三位数，
 * 就是各位数字的立方和等于该数本身
 * 水仙花数是三位数
 */
	static void shuixianhua(){
		for(int i=100;i<=999;i++){
			int k=i/100,g=(i%100)/10,m=(i%100)%10;
			if(k*k*k+g*g*g+m*m*m==i){
				System.out.println(i+"是水仙花数");
			}
		}
	}
	public static void main(String[] args) {
		shuixianhua();	
	}
}
