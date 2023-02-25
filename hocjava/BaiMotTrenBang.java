/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hocjava;
    class lophinhvuong
    {
     int a =4,Sht;
     int S = a*a;
     
       class lophinhtron
            {
                 
                 float r =3;
                 double dt = Math.abs(r)*Math.PI ;
                 
                 
            }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getSht() {
        return Sht;
    }

    public void setSht(int Sht) {
        this.Sht = Sht;
    }

    public int getS() {
        return S;
    }

    public void setS(int S) {
        this.S = S;
    }
          
}
/**
 *
 * @author Admin
 */
public class BaiMotTrenBang {
    public static void main (String [] args){
         
        lophinhvuong lopvuong = new lophinhvuong() ;  
        lophinhvuong.lophinhtron loptron = lopvuong.new lophinhtron();
        System.out.println ("Dien Tich Hinh Vuong La: "+lopvuong.S+ "\n"+"Dien Tich Hinh Tron La: "+ Math.ceil(loptron.dt*100)/100);
        
    }
}
 