package Bailam;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("hãy nhập cân của bạn nhé! :");
        double weight = sc.nextDouble();

        System.out.print("hãy nhập chiều cao của bạn nhé! :");
        double height = sc.nextDouble();

        double bmi = weight/Math.pow(height,2);

        if(bmi<18){
            System.out.println("thiếu cân");
        }else if(bmi <25.0){
            System.out.println("bình thường");
        } else if (bmi <30.0) {
            System.out.println("thừa cân");
        }else{
            System.out.println("béo phì");
        }
    }
}
