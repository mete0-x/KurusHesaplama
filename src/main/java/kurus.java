/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class kurus {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int bes = 0;
    int on = 0;
    int yirmibes = 0;
    int elli = 0;
    double toplam= 0;
    System.out.println("****************************************************");
    System.out.println("lütfen değerleri giriniz :");
    System.out.println("****************************************************");
    System.out.println("5 kuruş :");
    bes = scanner.nextInt();
    System.out.println("10 kurus :");
    on = scanner.nextInt();
    System.out.println("25 kurus :");
    yirmibes = scanner.nextInt();
    System.out.println("50 kurus :");
    elli = scanner.nextInt();

    toplam =(double)(0.05*bes)+(0.10*on)+(0.25*yirmibes)+(0.50*elli);
        System.out.println("toplsam :"+toplam);
 
  }
}
