package com.tarena.demo;
public class Demo5 {
/*   2
 * �ж�101~200֮���ж��ٸ���������������е�����
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
			System.out.println(i+"������");
		}
		return num;
	}
	public static void main(String[] args) {
		int num=sushu();
		System.out.println("�����У�"+num+"��");		
	}
}
