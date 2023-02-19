/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package docmotsonguyengom3chuso;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class DocMotSoNguyenGom3ChuSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int n;
        // dau tien dung do while de khi ko nam trong pham vi se bat nhap lai
        do{ 
            System.out.print("Nhap Mot So Nguyen Gom Ba Chu So:");
            Scanner input = new Scanner (System.in);
            n = input.nextInt(); 
                if( n<=99 || n>=1000)
            {  
                System.out.println ("Sai. Nhap Lai");
            }
            } while ( n<=99 || n>=1000);
            


            int hangtram    = n/100 ;
            int hangchuc    = (n%100)/10;
            int hangdonvi   = n%10 ;
            
            
            
     switch (hangtram)    
             {
                 case 1 : 
                     System.out.print("mot tram ");
                     break;
                 case 2 : 
                     System.out.print("hai tram ");
                     break;
                 case 3 : 
                     System.out.print("ba tram ");
                     break;
                 case 4 : 
                     System.out.print("bon tram ");
                     break;
                 case 5 : 
                     System.out.print("nam tram ");
                     break;
                 case 6 : 
                     System.out.print("sau tram ");
                     break;
                 case 7 : 
                     System.out.print("bay tram ");
                     break;
                 case 8 : 
                     System.out.print("tam tram ");
                     break;
                 case 9 : 
                     System.out.print("chin tram ");
                  break ;
             }
      switch (hangchuc)
             {
                   case 1 : 
                     System.out.print("muoi ");
                     break;
                 case 2 : 
                     System.out.print("hai muoi ");
                     break;
                 case 3 : 
                     System.out.print("ba muoi ");
                     break;
                 case 4 : 
                     System.out.print("bon muoi ");
                     break;
                 case 5 : 
                     System.out.print("nam muoi ");
                     break;
                 case 6 : 
                     System.out.print("sau muoi ");
                     break;
                 case 7 : 
                     System.out.print("bay muoi ");
                     break;
                 case 8 : 
                     System.out.print("tam muoi ");
                     break;
                 case 9 : 
                     System.out.print("chin muoi ");
                  break ;
                  default:
                      System.out.print("le ");
             }
      switch (hangdonvi)
             {
                   case 1 : 
                     System.out.print("mot");
                     break;
                     
                 case 2 : 
                     System.out.print("hai ");
                     break;
                 case 3 : 
                     System.out.print("ba ");
                     break;
                 case 4 : 
                     System.out.print("bon   ");
                     break;
                 case 5 : 
                     System.out.print("nam   ");
                     break;
                 case 6 : 
                     System.out.print("sau  ");
                     break;
                 case 7 : 
                     System.out.print("bay   ");
                     break;
                 case 8 : 
                     System.out.print("tam   ");
                     break;
                 case 9 : 
                     System.out.print("chin   ");
                  break ;
                  
                
                      
            }
        }
}
    
