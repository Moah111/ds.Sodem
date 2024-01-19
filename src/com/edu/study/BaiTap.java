package com.edu.study;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;


public class BaiTap {
	public static void nhapLieu(int a[] ){
		Scanner ds = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("dulieu : "+(i+1)+" la ");
			a[i] = ds.nextInt();
		}
		System.out.println("");
		// thu di ha
		
	}
	
	public static void inRa(int a[]){
		System.out.println("Danh Sach So Trong Mang La : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	
	public static void tGTNN(int a[]){
		int gtnn = a[1];
		int vtri = 0;
		for (int i = 0; i < a.length; i++) {
			if(gtnn > a[i]){
				gtnn = a[i];
				vtri = i;
			}
	
		}
		System.out.println("Gia Tri Nho Nhat La " + gtnn+ " : O Vi tri : " + vtri );
		System.out.println("");
	}
	
	public static void tinhTong(int a[]){
		int tong = 0;
		for (int i = 0; i < a.length; i++) {	
			tong = tong +a[i];
		}
		System.out.println("Tong Cua Danh Sach La : "+ tong);
		System.out.println("");
	}
	
	public static void soLe(int a[]){
		System.out.print("So Le La : ");
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0){
				System.out.print(a[i]+ " ");
			}
		}
		System.out.println("");
	}
	
	
	public static void ktEnd(){
		System.out.println("Ket Thuc Chuong trinh .");
	}
	public static void menu(){
		System.out.println("----------------------------");
		System.out.println("1. In Ra Danh Sach         -");
		System.out.println("2. Tinh Gia Tri Nho Nhat   -");
		System.out.println("3. Tinh tong               -");
		System.out.println("4. In Ra So Le             -");
		System.out.println("5. Nhap Lai Du Lieu        -");
		System.out.println("6. Thoat                   -");
		System.out.println("----------------------------");
	}
	
	
	
	public static void main(String[] args) throws Exception{
		int a;
		int chon;
		docFile();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Danh Sach Du Lieu :" );
		a = scanner.nextInt();
		int ds[] = new int [a];
		nhapLieu(ds); 
		luuFile(ds);
		for (int i = 1; i > 0 ; i++) {
			menu();
			chon = scanner.nextInt();
			System.out.println("khach hang da chon "+ chon);
			if(chon==1){
				inRa(ds);
			}
			if(chon==2){
				tGTNN(ds);
			}
			if(chon==3){
				tinhTong(ds);
			}
			if(chon==4){
				soLe(ds);
			}
			if(chon==5){
				System.out.println("1. Danh Sach Du Lieu :" );
				int slpt = scanner.nextInt();
				ds = new int [slpt];
				nhapLieu(ds);
			}
			if(chon==6){
				ktEnd(); break;
			}
		}
		

	}
	
	public static void luuFile(int ds[]) throws Exception{
		List ds1 = Arrays.asList(ds);
		System.out.println(ds1);
		File file  = new File("data.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileOutputStream  fos = new FileOutputStream("src\\data.txt");
		for (int i = 0; i < ds.length; i++) {
		String value = ds[i] +"";
		int ascii = (int) value.toCharArray()[0] ;
		System.out.println(ascii);
		fos.write (ascii);
		fos.write(32);
		}
	}
	public static void docFile() throws IOException{
		FileInputStream fis = new FileInputStream("src\\data.txt");
		int ascii ;
		while((ascii = fis.read())!= -1){
			System.out.println(ascii);
		}
	}
	

}
