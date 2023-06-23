package String_Regx;

import java.util.Scanner;
import java_1.Arraylist.SVHaUI;
public class exemble {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("\tHọ và tên: Nguyễn bá tuấn\r\n\t tuổi: 20");
        //toLowerCase : đổi in thường;
        //toUpperCase : đổi in hoa;
        //trim        : cắt các ký tự trắng 2 đầu chuỗi;
        //length      : lấy độ dài chuỗi
        //substring   : lấy chuỗi con;
        //charAt(index): lấy ký tự tại vị trí;
        //replaceAll(find,replace) : tiìm kiếm và thay thế tất cả;
        //split(separator) : tách chuỗi thành mảng;
        //equals      : so sánh có bằng phân biệt hoa/ thường;
        //equalsIgnoreCase : so sánh bằng không phân biệt hoa/ thường;
        //containts   : kiểm tra có chứa hay không;
        //startsWith  : kiểm tra có bắt đầu bởi hay không;
        //endsWith    : kiểm tra có kết thúc bưởi hay không;
        //matches     : so khớp với hay không;
        //indexOf     : tìm vị trí xuaats hiện đầu tiên của chuooix con;
        //lastIndexOf : tìm vị trí xuất hiện cuối cùng của chuỗi con;




        //DeMo1  LOG IN:

//        System.out.print("UserName: ");
//        String userName = sc.nextLine();
//        System.out.print("Password: ");
//        String password = sc.nextLine();
//        if(userName.equalsIgnoreCase("Nguyen ba tuan")&&password.length()>=8){
//            System.out.println("LOG IN successfull!");
//        }else{
//            System.out.println("ERROR!");
//        }
//



        //DeMo2 Manage Students;

//        int n;
//        System.out.print("so luong sinh vien: ");
//        n = sc.nextInt();
//        sc.nextLine();
//        SVHaUI[] a = new SVHaUI[n];
//        for(int i=0;i<n;i++){
//            a[i] = new SVHaUI();
//        }
//        for (int i=0;i<n;i++){
//            a[i].nhap();
//        }
//        for(int i=0;i<n;i++){
//            if(a[i].getHoTen().endsWith("Tuan")||a[i].getHoTen().startsWith("Nguyen")){
//                System.out.println("Ho ten: "+a[i].getHoTen().toUpperCase());
//            }
//        }
//        for (int i=0;i<n;i++){
//            if(!a[i].getHoTen().startsWith("My")&&!a[i].getHoTen().endsWith("My")&&a[i].getHoTen().contains("My")){
//                int lastIndex = a[i].getHoTen().lastIndexOf(" ");
//                System.out.println(a[i].getHoTen().substring(lastIndex+1));
//            }
//        }
//

        //DeMo3 find and replace
//
//        String content = sc.nextLine();
//        String find = sc.nextLine();
//        String replace = sc.nextLine();
//        String result =  content.replaceAll(find,replace);
//        System.out.println(result);
//
//

        //DeMo4

//        String chuoi = sc.nextLine();
//        String[] daySo = chuoi.split(",");
//        for (int i=0;i<daySo.length;i++){
//            int x = Integer.parseInt(daySo[i]);
//            if(x%2==0){
//                System.out.println(x);
//            }
//        }



    }
}
