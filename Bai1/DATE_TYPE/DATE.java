package Bai1.DATE_TYPE;
import java.util.Scanner;
public class DATE {
    Scanner sc = new Scanner(System.in);
    public int day;
    public int month;
    public int year;
    public void nhap(){
        System.out.print("day: ");
        day=sc.nextInt();
        System.out.print("month: ");
        month = sc.nextInt();
        System.out.print("year: ");
        year = sc.nextInt();
    }
    public void xuat(){
        System.out.printf("%-20d%-20d%-20d",day,month,year);
    }
}
