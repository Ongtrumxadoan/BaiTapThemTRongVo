/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hocjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhaiBao1VecTo {

    public static void main(String[] args) {
        int x, y, k, xy,xk,yk,nvh;
        Scanner input = new Scanner(System.in);
      
        System.out.print("Nhap Vecto X La: ");
            x = input.nextInt();
        
        System.out.print("Nhap Vecto Y La: ");
            y = input.nextInt();
        
        System.out.print("Nhap Hang So k La: ");
            k = input.nextInt();
        xy = x + y;
        System.out.println("Cong Vecto Cua XY La: " + xy);
           System.out.println("---------------------------------------------------");
         
        
         xy = x - y;
        System.out.println("Tru Vecto Cua XY La: " + xy);
           System.out.println("---------------------------------------------------");
         
        
        xk=x*k;
                System.out.println("Nhan Voi 1 Hang So Cua vecto x va hang so k La: " + xk);
                System.out.println("---------------------------------------------------");
         
        yk = y*k;
               System.out.println("Nhan Voi 1 Hang So Cua vecto x va hang so k La: " + yk);
               System.out.println("---------------------------------------------------");
               
        nvh =x*y ;
               System.out.println("Nhan Vo Huong Cua vecto x va vecto y  La: " + nvh);
               System.out.println("---------------------------------------------------");

    }

}
