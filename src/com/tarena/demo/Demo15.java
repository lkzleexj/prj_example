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
		for(int i=1;i<=4;i++){ //�ȴ�ӡ����4��
			for(int j=4-i;j>=0;j--){  //��ӡ�ո�
				System.out.print(" "); 
			}
			for(int k=1;k<=2*i-1;k++){ //��ӡ*
				System.out.print("*");
			}
			System.out.println();//����
		}
		for(int i=1;i<=3;i++){ //��ӡ��3��
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=2*(3-i)+1;k>=1;k--){
				System.out.print("*");
			}
			System.out.println();//����
		}
	}
}
