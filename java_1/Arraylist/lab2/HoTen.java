package java_1.Arraylist.lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class HoTen {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> hoTen = new ArrayList<String>();

    }


    public static int nhap(ArrayList<String> hoTen) {
        int soLuongNhap= 0;

        while(true){
            System.out.println("nhap ho ten: ");
            String hoten=sc.nextLine();
            hoTen.add(hoten);
            soLuongNhap++;
            System.out.println("ban co muon nhap them(Y/N?): ");
            String luachon = sc.nextLine();
            if (luachon.equals("N")){
                break;
            }
        }
        return soLuongNhap;

    }
    public static void xuat(ArrayList<String > hoTen){
        System.out.println("Danh sach ho ten: ");
        for (String x:hoTen) {
            System.out.println(x);
        }
    }
    public static void sapXep(ArrayList<String > hoTen,int soLuongNhap){
        String x;
        String y;
        for(int i=0;i<soLuongNhap;i++){
            for(int j=i+1;j<soLuongNhap;j++){
                x=hoTen.get(i);
                y=hoTen.get(j);

            }

        }

    }
}
