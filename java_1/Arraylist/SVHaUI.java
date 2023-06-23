package java_1.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SVHaUI {
    public static Scanner sc = new Scanner(System.in);
    private String hoTen;
    private Double diemTB;

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public static void main(String[] args) {

        ArrayList<SVHaUI> a = new ArrayList<SVHaUI>();

        int n;
        System.out.print("nhap so luong sinh vien: ");
        n = sc.nextInt();
        SVHaUI[] b = new SVHaUI[n];
        for (int i = 0; i < n; i++) {
            b[i] = new SVHaUI();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin sinh vien " + (i + 1));
            b[i].nhap();
            a.add(b[i]);
        }
        System.out.println("thong tin sinh vien: ");
        for (SVHaUI x : a) {
            x.xuat();
        }

//        for (SVHaUI x : a) {
//            if (x.getDiemTB() > 5) {
//                x.xuat();
//            }
//        }
//        String hoTen;
//        System.out.print("nhap ho ten sinh vien muon tim kiem");
//        sc.nextLine();
//        hoTen = sc.nextLine();
//        int d=0;
//        for (SVHaUI x : a) {
//            if (x.getHoTen().equals(hoTen.toLowerCase())) {
//                System.out.println("sinh vien co ten" + "tuan" + "la: ");
//                x.xuat();
//            }else{
//                d++;
//            }
//
//        }
//        if(d!=0){
//            System.out.println("khong tim thay ten sinh vien.");
//        }
//       for(int i=0;i<n;i++){
//           SVHaUI x = a.get(i);
//           if(x.getHoTen().equals(hoTen.toLowerCase())){
//               System.out.printf("sua ten thanh: ");
//               String name = sc.nextLine();
//               x.setHoTen(name);
//               a.set(i,x);
//           }
//       }
//        System.out.println("thong tin sinh vien: ");
//        for (SVHaUI x : a) {
//            x.xuat();
//        }
//
//        for(int i=0;i<n;i++){
//            SVHaUI x = a.get(i);
//            if(x.getHoTen().equals(hoTen.toLowerCase())){
//                a.remove(i);
//            }
//        }
        Comparator<SVHaUI> comp = new Comparator<SVHaUI>() {
            @Override
            public int compare(SVHaUI o1, SVHaUI o2) {
                return o1.diemTB > o2.diemTB ? 1 : -1;
            }
        };
        Collections.sort(a,comp);
        for (SVHaUI x : a) {
            x.xuat();
        }
        Comparator<SVHaUI> compa = new Comparator<SVHaUI>() {
            @Override
            public int compare(SVHaUI o1, SVHaUI o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
        Collections.sort(a,compa);
        for (SVHaUI x : a) {
            x.xuat();
        }



    }


    public String getHoTen() {
        return this.hoTen;
    }


    public Double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(Double diemTB) {
        this.diemTB = diemTB;
    }

    public void nhap() {
        sc.nextLine();
        System.out.print("nhap ho ten sinh vien: ");
        this.hoTen = sc.nextLine();
        System.out.print("nhap diem trung binh cua sinh vien: ");
        this.diemTB = sc.nextDouble();
    }

    public void xuat() {
        System.out.printf("%-40s%-20f\n", hoTen, diemTB);
    }
}
