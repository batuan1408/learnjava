package java_1.Arraylist.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SanPham {
    public static Scanner sc = new Scanner(System.in);
    private String name;
    private float price;

    public SanPham() {
    }
    public SanPham(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input() {
        System.out.print("ten san pham:     ");
        this.name = sc.nextLine();
        System.out.print("don gia san pham: ");
        this.price = sc.nextFloat();
    }
    public void output() {
        System.out.printf("%-20s%-20f\n",this.name,this.price);
    }

    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        int i = 0;
        while(true){

            SanPham a = new SanPham();
            System.out.println("nhap thong tin san pham thu: "+(i+1));
            a.input();
            list.add(a);
            i++;
            System.out.print("nhap them(y/n): ");
            sc.nextLine();
            String check = sc.nextLine();
            if(check.equals("n")) {
                break;
            }
        }
        System.out.println(i);
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.price < o2.price ? 1 : -1;
            }
        };
        Collections.sort(list,comp);
        System.out.println("danh sach san pham sau khi sap xep: ");
        for (SanPham x : list) {
            x.output();
        }
        String nameProduct;
        System.out.print("Ten san pham muon xoa:  ");
        nameProduct = sc.nextLine();
        int d = 0;
        for (SanPham x : list) {
            if(x.getName().equals(nameProduct)){
                d++;
                list.remove(x);
                i--;
            }
        }
        if(d==0){
            System.out.println("Khong the xoa");
        }else {
            System.out.println("Xoa thanh cong");
        }
        float sumPrice = 0;
        for (SanPham x : list
             ) {
            sumPrice += x.getPrice();
        }
        System.out.println("Gia trung binh: "+(sumPrice/(i*1.0)));

    }
}
