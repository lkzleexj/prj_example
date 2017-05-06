package com.tarena.demo;
public class Demo9 {
//*
//**
//***
//****
//*****
//****
//***
//**
//*
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){ //先显示前5行
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println(); //换行
		}
		for(int i=1;i<5;i++){
			for(int j=5-i;j>=1;j--){
				System.out.print("*");
			}
			System.out.println();//换行
		}
		
	}
}
