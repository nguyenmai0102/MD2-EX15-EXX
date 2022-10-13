package baitaptamgiac;

import baitaptamgiac.IllegalTringleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTringleException {
        Scanner scanner = new Scanner(System.in) ;
        try {
            System.out.println(" nhap vao canh thu nhat");
            float a=  Float.parseFloat(scanner.nextLine());
            System.out.println("nhap vaoo canh thu 2");
            float b = Float.parseFloat(scanner.nextLine());
            System.out.println("nhap vao canh thu 3");
            float c =  Float.parseFloat(scanner.nextLine());

            if (a+b<c ||a+c<b || b+c<a){
                throw new IllegalTringleException(" day khong phai la 3 canh cua mot tam giac");

            }else {
                System.out.println(" day la 3 canh cua mot tam giac");
            }
        }catch (NumberFormatException ex) {
            throw new IllegalTringleException("Khong phai 3 canh cua tam giac") ;
        }



    }
}