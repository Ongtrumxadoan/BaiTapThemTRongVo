/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiemtrasochinhphuong;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class KiemTraSoChinhPhuong {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        double sqr; 
        System.out.print ("Nhap Mot So Nguyen Bat ki: ");
        Scanner input =new Scanner (System.in);
        n = input.nextInt();
       
        sqr = Math.sqrt(n) ;
        
        
       if  (sqr*sqr ==n)
       {
           System.out.println( n+ " La So Chinh Phuong");
           System.out.println("---------------------");
       }
    else
        {
           System.out.println( n  +" Khong Phai So Chinh Phuong");
            System.out.println("-----------------------------");
        }
    }
    
}
