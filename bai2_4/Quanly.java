package bai2_4;

import java.util.Scanner;

public class Quanly {
    private String maql;
    private String hoTen;

    public void setMaql(String maql) {
        this.maql = maql;
    }

    public String getMaql() {
        return maql;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ma quan ly: ");
        this.maql=sc.nextLine();
        System.out.printf("nhap ho ten quan ly: ");
        this.hoTen=sc.nextLine();


    }
    public void xuat(){
        System.out.println("ma quan ly: "+maql);
        System.out.println("ho ten quan ly: "+hoTen);
    }
}
