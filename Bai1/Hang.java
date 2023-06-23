package Bai1;
import java.util.Scanner;
public class Hang {
    public static Scanner sc = new Scanner(System.in);
     public String mahang;
     public String tenhang;
     public float dongia;
     public int soluong;
     public void nhap(){
         sc.nextLine();
         System.out.print("ma hang: ");
         mahang=sc.nextLine();

         System.out.print("ten hang: ");
         tenhang = sc.nextLine();

         System.out.print("don gia: ");
         dongia = sc.nextFloat();

         System.out.print("so luong: ");
         soluong=sc.nextInt();
     }
     public void xuat(){

         System.out.printf("%-20s%-20s%-20f%-20d",mahang,tenhang,dongia,soluong);
     }

    public static void main(String[] args) {
         int n;
         System.out.print("nhap so luong hang: ");
         n=sc.nextInt();
         Hang a[]=new Hang[n];
         for(int i=0;i<n;i++){
             a[i] = new Hang();
         }
         for (int i=0;i<n;i++){
             System.out.println("nhap thong tin hang " + (i+1));
             a[i].nhap();
         }
         System.out.printf("%-20s%-20s%-20s%-20s","ma hang","ten hang","don gia","so luong");
         System.out.println();
         for(int i=0;i<n;i++){
             a[i].xuat();
             System.out.println();
         }
    }
}
