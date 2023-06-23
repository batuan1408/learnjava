package java_1.Arraylist.colections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class colections {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Nhap cau hoi: ");
            String s = sc.nextLine();
            a.add(s);
        }
        for (String x:a) {
            System.out.println(x);
        }
        Collections.shuffle(a);
        for (String x: a) {
            System.out.println(x);
        }
//          ArrayList<Integer> a = new ArrayList<Integer>();
//          a.add(3);
//          a.add(9);
//          a.add(8);
//          a.add(2);
//        System.out.println(Collections.binarySearch(a,9));
//        //Collections.fill(a,2);
//        for ( Integer x: a) {
//            System.out.print(x+" ");
//        }
//        System.out.println( );
//        Collections.shuffle(a);
//        for ( Integer x: a) {
//            System.out.print(x+" ");
//        }
//        Collections.sort(a);
//        System.out.println( );
//        for ( Integer x: a) {
//            System.out.print(x+" ");
//        }
//        Collections.reverse(a);
//        System.out.println( );
//        for ( Integer x: a) {
//            System.out.print(x+" ");
//        }
//        Collections.rotate(a,3);
//        System.out.println( );
//        for ( Integer x: a) {
//            System.out.print(x+" ");
//        }


    }
}
