package com.tarena.demo;
public class Demo6 {
/*   3
 * ��ӡ���е�ˮ�ɻ�����ˮ�ɻ���ָһ����λ����
 * ���Ǹ�λ���ֵ������͵��ڸ�������
 * ˮ�ɻ�������λ��
 */
	static void shuixianhua(){
		for(int i=100;i<=999;i++){
			int k=i/100,g=(i%100)/10,m=(i%100)%10;
			if(k*k*k+g*g*g+m*m*m==i){
				System.out.println(i+"��ˮ�ɻ���");
			}
		}
	}
	public static void main(String[] args) {
		shuixianhua();	
	}
}
