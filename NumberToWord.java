package SS1BT2;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Mời nhập vào số : ");
        String  data = scn.nextLine();
        String[] arr = data.split("");
        for (int i =0 ; i < data.length() ; i ++) {
            convert(arr[i]);
        }



    }

    public static void convert(String data) {
        switch (data) {
            case "1":
                System.out.print("Một ");
                break;
            case "2":
                System.out.print("Hai ");
                break;
            case "3":
                System.out.print("Ba ");
                break;
            case "4":
                System.out.print("Bốn ");
                break;
            case "5":
                System.out.print("Năm ");
                break;
            case "6":
                System.out.print("Sáu ");
                break;
            case "7":
                System.out.print("Bảy ");
                break;
            case "8":
                System.out.print("Tám ");
                break;
            case "9":
                System.out.print("Chín ");
                break;
            default:
                System.out.print("Vượt quá khả năng");
        }
    }
}
