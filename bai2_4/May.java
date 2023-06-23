package bai2_4;

import java.util.Scanner;

public class May {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ma may: ");
        this.maMay = sc.nextLine();
        System.out.printf("nhap kieu may: ");
        this.kieuMay=sc.nextLine();
        System.out.printf("nhao tinh trang may: ");
        this.tinhTrang=sc.nextLine();
    }
    public void xuat(){
        System.out.printf("%-20s%-20s%-20s\n",maMay,kieuMay,tinhTrang);
    }
}
