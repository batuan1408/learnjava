package Bai1;
import java.util.Scanner;
public class Hcn {
   Scanner sc = new Scanner(System.in);

    public float D;
    public float R;

    public void nhap(){
        System.out.print("nhap chieu dai hcn: ");
        D = sc.nextFloat();
        System.out.print("nhap chieu rong hcn");
        R = sc.nextFloat();
    }
    public void ve(){
        for(int i=0;i<R;i++){
            for(int j =0;j<D;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public float dienTich(float D,float R){
        return D*R;
    }
    public float chuVi(float D,float R){
        return 2*(D+R);
    }

    public static void main(String[] args) {
        Hcn x = new Hcn();
        x.nhap();
        x.ve();
        System.out.println("dien tich hinh chu nhat: "+x.dienTich(x.D,x.R));
        System.out.println("chu vi hinh chu nhat : "+x.chuVi(x.D,x.R));
    }
}
