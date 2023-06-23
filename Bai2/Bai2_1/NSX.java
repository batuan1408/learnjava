package Bai2.Bai2_1;
import java.util.Scanner;
public class NSX {
    public  static Scanner sc = new Scanner(System.in);
    private String mansx;
    private String tennsx;
    private String dcnsx;

    public String getMansx() {
        return mansx;
    }

    public String getTennsx() {
        return tennsx;
    }

    public void setTennsx(String tennsx) {
        this.tennsx = tennsx;
    }

    public void setMansx(String mansx) {
        this.mansx = mansx;
    }

    public String getDcnsx() {
        return dcnsx;
    }

    public void setDcnsx(String dcnsx) {
        this.dcnsx = dcnsx;
    }
    public void nhap(){
        System.out.printf("nhap ma nha san xuat: ");
        this.mansx = sc.nextLine();
        System.out.printf("nhap ten nha san xuat: ");
        this.tennsx=sc.next();
        sc.nextLine();
        System.out.print("nhap dia chi nha san xuat: ");
        this.dcnsx=sc.nextLine();
    }
    public void xuat(){
        System.out.println("ma nah san xuat"+getMansx());
        System.out.println("ten nha san xuat: "+getTennsx());
        System.out.println("dia chi nha san xuat: "+getDcnsx());
    }
}
