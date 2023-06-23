package Bai1;
import java.util.Scanner;
public class Sach {
    public static Scanner sc = new Scanner(System.in);
    public String masach;
    public String tensach;
    public String nxb;
    public int sotrang;
    public float giatien;
    public void nhap(){
        sc.nextLine();
        System.out.print("ma sach: ");
        masach=sc.nextLine();
        System.out.print("ten sach: ");
        tensach=sc.nextLine();
        System.out.print("nha xuat ban: ");
        nxb = sc.nextLine();
        System.out.print("so trang:" );
        sotrang=sc.nextInt();
        System.out.print("gia tien: ");
        giatien=sc.nextFloat();
    }
    public void xuat(){
        System.out.printf("%-20s%-20s%-30s%-20d%-20f",masach,tensach,nxb,sotrang,giatien);
    }

    public static void main(String[] args) {
        int n;
        System.out.print("nhap so luong cuon sach: ");
        n = sc.nextInt();
        Sach a[]=new Sach[n];
        for(int i=0;i<n;i++){
            a[i]=new Sach();
        }
        for (int i=0;i<n;i++){
            System.out.println("nhap thong tin cuon sach "+(i+1));
            a[i].nhap();
        }
        System.out.printf("%-20s%-20s%-30s%-20s%-20s","ma sach","ten sach","nha xuat ban","so trang","gia tien");
        for(int i=0;i<n;i++){
            System.out.println();
            a[i].xuat();

        }
    }
}
