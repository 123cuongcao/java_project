package Bailam;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập a:");
        double a = sc.nextDouble();
        System.out.print("nhập b:");
        double b = sc.nextDouble();
        System.out.print("nhập c:");
        double c = sc.nextDouble();
        if(a!=0){
            System.out.println("phương trình có nghiệm là: "+((c-b)/a));
        }else{
            if(b == c){
                System.out.println("phương trình vô số nghiệm !");
            }else{
                System.out.println("phương trình vô nghiệm");
            }
        }

    }
}
