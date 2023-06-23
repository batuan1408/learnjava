package Bai1;
import java.util.Scanner;
public class SINHVIEN {
    Scanner sc = new Scanner(System.in);
    public String maSv;
    public String hoTen;
    public int tuoi;
    public float diem;
    public  void nhap(){
        System.out.print("nhap masv: ");
        maSv=sc.nextLine();
        System.out.print("nhap ho va ten: ");
        hoTen=sc.nextLine();
        System.out.print("nhap tuoi: ");
        tuoi=sc.nextInt();
        System.out.print("nhap diem: ");
        diem=sc.nextFloat();

    }
    public void xuat(){
        System.out.println("masv: "+maSv);
        System.out.println("ten sv: "+hoTen);
        System.out.println("tuoi: "+tuoi);
        System.out.println("diem: "+diem);
    }

    public static void main(String[] args) {
        SINHVIEN a = new SINHVIEN();
        SINHVIEN b = new SINHVIEN();
        System.out.println("nhap du lieu cho sinh vien a: ");
        a.nhap();
        System.out.println("nhap du lieu cho sinh vien b: ");
        b.nhap();
        System.out.println("du lieu sinh vien a: ");
        a.xuat();
        System.out.println("du lieu sinh vien b: ");
        b.xuat();


    }


}
