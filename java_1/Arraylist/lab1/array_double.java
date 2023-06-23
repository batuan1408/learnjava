package java_1.Arraylist.lab1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class array_double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        while (true){
            Double x = sc.nextDouble();
            list.add(x);
            System.out.print("nhap them(y/n)?");
            String luachon=sc.nextLine();
            if(luachon.equals("n")){
                break;
            }
        }
        Double tong = (double) 0;
        for(Double x:list){
            System.out.println(x);
            tong+=x;
        }
        System.out.println(tong);


    }
}
