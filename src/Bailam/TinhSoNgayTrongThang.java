package Bailam;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập tháng muốn biết :");
        int month = sc.nextInt();

        switch(month){
            case 2:
                System.out.println("tháng"+month+"có 28 hoặc 29 ngày");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("tháng"+month+"có 31 ngày");
                break;
            case 4,6,9,11:
                System.out.println("tháng"+month+"có 30 ngày");
                break;
            default:
                System.out.println("nhập lại");
                break;
        }
    }
}
