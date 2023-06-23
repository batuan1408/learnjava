package String_Regx.lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String[] name = fullName.split(" ");
        System.out.println("Ho: "+name[0].toUpperCase());
        if (name.length>3); {


        System.out.println("HO dem: ");
        for (int i=1;i<name.length-1;i++){
            System.out.print(name[i].toUpperCase()+" ");
        }
    }
        System.out.println("\nTen: "+name[name.length-1].toUpperCase());
    }
}
