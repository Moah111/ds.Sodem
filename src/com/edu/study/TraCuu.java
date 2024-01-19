package com.edu.study;
import java.util.Scanner;


public class TraCuu {
	public static void NhapMang(int a[], int n){
			Scanner x = new Scanner(System.in);
			for (int i = 0; i < n; i++) {
				System.out.println("a["+i+"]");
				a[i]= x.nextInt();				
			}
	}
	
	public static void HienMang(int a[], int n){
		System.out.println("Mang Vua Nhap la : ");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]+"");
		}
		System.out.println("");
	}
	
	public static void TongMang(int a[], int n){
		float sum=0;
		for (int i = 0; i < n; i++) {
			sum=sum+a[i];
		}
		System.out.println("Tong Mang Vua Nhap La :" + sum);
	}
	
	
	public static void SoLe(int a[], int n){
		System.out.println("Cac So Le Trong Mang La: ");
		for (int i = 0; i < n; i++) {
			if(a[i]%2!=0){
				System.out.println(a[i]+" ");
			}
		}
		System.out.println("");
	}
	public static void Min(int a[],int n){
		int gtnn = a[0];
		int vt = 0;
		for (int i = 0; i < n; i++) {
			if(a[i]<gtnn){
				gtnn = a[i];
				vt=i;
			}
		}
		vt = vt + 1;
		System.out.println("Gia Tri Nho Nhat La : " + gtnn + " : Vi Tri " + vt);
	}
	public static void menu(){
		
		System.out.println("1. Hien Mang");
		System.out.println("2. Tong Mang");
		System.out.println("3. In So Le");
		System.out.println(("4. In Gia tri Nho Nhat"));
		System.out.println("5. Thoat");
	}
	public static void main(String[] args){
		int n;
		int chon;
		Scanner x = new Scanner(System.in);
		System.out.println("Nhap Phan Tu Cua Mang");
		n = x.nextInt();
		int a[] = new int [n];
		NhapMang(a,n); 
		do{
			menu();
			System.out.println("Lua Chon :");
			chon = x.nextInt();
			switch(chon){
			
			case 1: HienMang(a,n); break;
			case 2: TongMang(a,n); break;
			case 3: SoLe(a,n); break;
			case 4: Min(a,n); break;
			}
		}while(chon != 0);
		

	}
}





