package lop_doituong;

import java.util.Scanner;

public class SINHVIEN {
    public String hoTen;
    public double diemTB;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ho ten sinh vien: ");
        this.hoTen = sc.nextLine();
        System.out.printf("nhap diem trung binh cua sinh vien: ");
        this.diemTB = sc.nextDouble();
    }

    public String xepLoai() {
        if (this.diemTB < 5)
            return " hoc luc trung binh";
        else if (this.diemTB < 8 && this.diemTB > 6)
            return " hoc luc kha";
        else
            return "hoc luc gioi";
    }

    public void xuat() {
        System.out.println("ho ten sinh vien: " + this.hoTen);
        System.out.println("diem trung binh: " + this.diemTB);
        System.out.println("hoc luc : " + xepLoai());
    }

    public SINHVIEN() {

    }

    public SINHVIEN(String hoTen, double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public static void main(String[] args) {
        SINHVIEN a = new SINHVIEN();
        SINHVIEN b = new SINHVIEN("nguyen ba tuan", 9);
        a.nhap();
        a.xuat();
        b.xuat();
    }


}
