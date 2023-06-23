package Bai2.Bai2_1;
import java.util.Scanner;
public class Hang {
    public static Scanner sc = new Scanner(System.in);
    private String mahang;
    private String tenhang;
    private NSX x = new NSX();

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public NSX getX() {
        return x;
    }

    public void setX(NSX x) {
        this.x = x;
    }
    public void nhap(){
        System.out.printf("nhap ma hang: ");
        mahang=sc.nextLine();
        System.out.printf("nhap ten hang: ");
        tenhang=sc.nextLine();
        x.nhap();
    }
    public void xuat(){
        System.out.println("ma hang: "+getMahang());
        System.out.println("ten hang: "+getTenhang());
        x.xuat();
    }

    public static void main(String[] args) {
        Hang a = new Hang();
        a.nhap();
        a.xuat();

    }


}
