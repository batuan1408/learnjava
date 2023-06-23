package bai2_4;


import bai2_3.Phieu;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private Quanly x = new Quanly();
    private May y[];
    private int n;

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public float getDienTich() {
        return dienTich;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ma phong: ");
        this.maPhong=sc.nextLine();
        System.out.printf("nhap ten phong: ");
        this.tenPhong=sc.nextLine();
        System.out.printf("nhap dien tich phong: ");
        this.dienTich=sc.nextFloat();
        x.nhap();
        System.out.printf("nhap so luong may: ");
        this.n=sc.nextInt();
        y= new May[n];
        for(int i=0;i<n;i++){
            y[i]=new May();
        }
        for(int i=0;i<n;i++){
            System.out.println("nhap thong tin may; "+(i+1));
            y[i].nhap();
        }

    }
    public void xuat(){
        System.out.println("ma phong: "+maPhong);
        System.out.println("ten phong: "+tenPhong);
        System.out.println("dien tich: "+dienTich);
        x.xuat();
        System.out.printf("%-20s%-20s%-20s\n","ma may","kieu may","tinh trang");
        for(int i=0;i<n;i++){
            y[i].xuat();
        }

    }

    public static void main(String[] args) {
        PhongMay a = new PhongMay();
        a.nhap();
        a.xuat();

    }
}
