package Bai1.DATE_TYPE;

import  java.util.Scanner;
public class NhanSu {
    Scanner sc = new Scanner(System.in);
    public String maNhanSu;
    public String hoTen;
    public DATE ns = new DATE();
    public void nhap(){
        System.out.print("ma nhan su: ");
        maNhanSu = sc.nextLine();
        System.out.print("ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("nhap ngay sinh: ");
        ns.nhap();
    }
    public void xuat(){
        System.out.printf("%-20s%-20s",maNhanSu,hoTen);
        ns.xuat();
    }

    public static void main(String[] args) {
        NhanSu a = new NhanSu();
        System.out.println("nhap thong tin nhan su: ");
        a.nhap();
        System.out.println("thong tin nhan su moi la: ");
        a.xuat();
    }
}
