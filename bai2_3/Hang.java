package bai2_3;
import  java.util.Scanner;
public class Hang {
    private String maHang;
    private String tenHang;
    private double donGia;

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDonGia() {
        return donGia;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.printf("nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.printf("nhap don gia: ");
        donGia = sc.nextDouble();
    }
    public void xuat(){
        System.out.printf("%-20s%-20s%-20f\n",maHang,tenHang,donGia);
    }
}
