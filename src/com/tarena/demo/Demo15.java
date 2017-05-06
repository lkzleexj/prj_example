package com.tarena.demo;
public class Demo15 {
//   19
//     *
//    ***
//   *****
//  *******
//   *****
//    ***
//     *
	public static void main(String[] args) {
		for(int i=1;i<=4;i++){ //先打印上面4行
			for(int j=4-i;j>=0;j--){  //打印空格
				System.out.print(" "); 
			}
			for(int k=1;k<=2*i-1;k++){ //打印*
				System.out.print("*");
			}
			System.out.println();//换行
		}
		for(int i=1;i<=3;i++){ //打印后3行
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=2*(3-i)+1;k>=1;k--){
				System.out.print("*");
			}
			System.out.println();//换行
		}
	}
}
