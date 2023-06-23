package java_1.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<String> a =new ArrayList<String>();
//        a.add("cuong");
//        a.add("tuan");
//        a.add("phuong");
//        a.add("hanh");
//        a.add(2,"nam");
//        a.remove(2);
////        a.clear();
//        a.set(2,"giang");
//        String s = a.get(2);
//        int b=a.size();
//        int c=a.indexOf("giang");
//        System.out.print(c);
//        boolean checkcontain = a.contains("nam");
//        boolean checkempty=a.isEmpty();
//        System.out.print(checkempty);
//        System.out.print(checkcontain);
//        System.out.print(b);
//        System.out.printf(s);
        ArrayList<Double> t = new ArrayList<Double>();
        double nhap;
        int n;
        System.out.print("nhap so luong phan tu trong danh sach: ");
        n = sc.nextInt();
        System.out.print("nhap danh sach cac so: ");
        for (int i = 0; i < n; i++) {
            nhap = sc.nextDouble();
            t.add(nhap);
        }
        double tong = 0;
        for (Double x : t) {
            tong += x;
        }
        System.out.print("tong: " + tong);
    }
}
