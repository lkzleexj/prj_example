package com.tarena.demo;

public class Demo16 {
//     *
//    * *
//   *   *
//  *     *
//   *   *
//    * *
//     *
	public static void main(String[] args) {
		for(int i=1;i<=4;i++){//��ӡǰ4��
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				if(k==1||k==2*i-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++){ //��ӡ��3��
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=2*(3-i)+1;k>=1;k--){
				if(k==2*(3-i)+1||k==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
