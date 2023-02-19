 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinhgiaithuacuasonguyen;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class TinhGiaiThuaCuaSoNguyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i,s=1;
        System.out.print("Nhap Vao Mot So Nguyen:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        
        for
            (i=1;i<=n;i++)  
            s = s*i;
        System.out.println("In Ra Ket Qua Cua Giai Thua : "+ s);
        
        
         
    }
    
}
