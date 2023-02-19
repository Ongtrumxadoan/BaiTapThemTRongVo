/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xeploaihocsinh;
import java. util.Scanner;
/**
 *
 * @author Admin
 */
public class XepLoaiHocSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float diemhocsinh; 
        System.out.print("Nhap Diem Cua Hoc Sinh Vo Day:");
        Scanner input = new Scanner (System.in);
        diemhocsinh = input.nextFloat();
       
        if ( diemhocsinh <5 ) 
                        {   
                            System.out.println("Xep Loai Cua Hoc Sinh Loai Kem.");
                        }
        else
            if (diemhocsinh <7)
               {
                  System.out.println ("Xep Loai Cua Hoc Sinh Loai Trung Binh.");        
                }
        else 
            if (diemhocsinh <8)
                {
                  System.out.println ("Xep Loai Cua Hoc Sinh Loai Kha.");    
                }
        else
            if (diemhocsinh >8)
                {
                  System.out.println ("Xep Loai Cua Hoc Sinh Loai Gioi.");  

                }
         
                     
                            
        }

    }
 
             

    
  