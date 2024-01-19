package com.edu.study;


	
	import java.util.Scanner;
	public class Bai1 {
	    //nhap mang
	    public static void nhapmang(int a[], int n){
	        Scanner x = new Scanner(System.in);
	        for(int i=0;i<n;i++){
	            System.out.print("a["+i+"]: ");
	            a[i]=x.nextInt();
	        }
	    }
	    //hien mang
	    public static void hienmang(int a[], int n){
	        System.out.print("Mang vua nhap la: ");
	        for(int i=0;i<n;i++){
	            System.out.print(a[i]+" ");
	        }
	        System.out.println("");
	    }
	    // tinh tong mang
	    public static void tongmang(int a[], int n){
	        float sum=0;
	        for(int i=0;i<n;i++){
	            sum=sum+a[i];
	        }
	        System.out.println("Tong mang vua nhap la: "+sum);
	    }
	    // tim phan tu le trong mang
	    public static void phantule(int a[], int n){
	        
	        System.out.print("Cac phan tu le trong mang la:");
	        for(int i=0;i<n;i++){
	            if(a[i]%2!=0){
	                System.out.print(a[i]+" ");
	            }
	        }
	        System.out.println("");
	    }
	    
	    // tim phan tu nho nhat trong mang
	    public static void min(int a[], int n){
	        int gtnn=a[0];
	        int vt = 0;
	        for(int i=0;i<n;i++){
	            if(a[i]<gtnn){
	                gtnn=a[i];
	                vt=i;
	            }
	        }
	        vt=vt+1;
	        System.out.println("Phan tu nho nhat la:"+gtnn+" vi tri: "+vt);
	    }
	    
	    public static void menu(){
	        System.out.println("1. Nhap mang");
	        System.out.println("2. Hien mang");
	        System.out.println("3. Tong mang");
	        System.out.println("4. In phan tu le");
	        System.out.println("5. Phan tu nho nhat");
	        System.out.println("6. Thoat");
	    }
	    
	    public static void main(String[] args) {
	        int n;
	        int chon;
	        Scanner x = new Scanner(System.in);
	        System.out.print("Nhap so phan tu cua mang: ");
	        n=x.nextInt();
	        int a[] = new int [n];
	        do{
	            menu();
	            System.out.println("Luachon:");
	            chon=x.nextInt();
	            switch(chon){
	                case 1: nhapmang(a,n); break;
	                case 2: hienmang(a,n); break;
	                case 3: tongmang(a,n); break;
	                case 4: phantule(a,n); break;
	                case 5: min(a,n); break;
	            }
	            
	        }while(chon!=0);
	    }
	}


