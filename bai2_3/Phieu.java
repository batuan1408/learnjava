package bai2_3;

import java.util.Scanner;

public class Phieu {
    private String maphieu;
    private Hang x[]  ;
    private int  n;

    public void setMaphieu(String maphieu) {
        this.maphieu = maphieu;
    }

    public String getMaphieu() {
        return maphieu;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ma phieu: ");
        this.maphieu=sc.nextLine();
        System.out.printf("nhap so luong hang: ");
        this.n=sc.nextInt();
        x= new Hang[n];
        for(int i=0;i<n;i++){
            x[i]=new Hang();
        }
        for(int i=0;i<n;i++){
            System.out.println("nhap thong tin hang thu: "+(i+1));
            x[i].nhap();
        }
    }
    public void xuat(){
        System.out.println("ma phieu: "+ maphieu);
        System.out.printf("%-20s%-20s%-20s\n","ma hang","ten hang","don gia");
        for(int i=0;i<n;i++){
            x[i].xuat();
        }
    }

    public static void main(String[] args) {
        Phieu a = new Phieu();
        a.nhap();
        a.xuat();
    }
}
