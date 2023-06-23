package lop_doituong;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.giamGia = giamGia;
        this.donGia = donGia;
    }

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    private double getThueNhapKhau() {
        return this.donGia * 0.1;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten san pham: ");
        this.tenSp = sc.nextLine();
        System.out.printf("nhap don gia: ");
        this.donGia = sc.nextDouble();
        System.out.printf("nhap giam gia: ");
        this.giamGia = sc.nextDouble();

    }

    public void xuat() {
        System.out.println("ten san pham: " + this.tenSp);
        System.out.println("don gia: " + this.donGia);
        System.out.println("giam gia: " + this.giamGia);
        System.out.println("thue nhap khau: " + getThueNhapKhau());
    }

    public static void main(String[] args) {
        SanPham a = new SanPham("tivi", 10000, 10);
        SanPham b = new SanPham("dienthoai", 20000);
        a.xuat();
        b.xuat();

    }
}
