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
public class NhanVien {

    public static void main(String[] args) {

        String TenNhanVien;
        double LuongCoBan;
        double HeSoLuong;
        double LuongMax;
        double TinhLuong;
        double TangLuong, k;

        Scanner input = new Scanner(System.in);

        System.out.print("Ten Nhan vien La : ");
        TenNhanVien = input.nextLine();

        System.out.print("Luong Co Ban Cua Nhan Vien La :");
        LuongCoBan = input.nextDouble();

        System.out.print("He So Luong Ban Dau Cua Nhan Vien: ");
        HeSoLuong = input.nextDouble();

        System.out.print("Luong Toi Da Cua Nhan Vien: ");
        LuongMax = input.nextDouble();

        TinhLuong = LuongCoBan * HeSoLuong;
        System.out.println("Luong Cua Nhan Vien " + TenNhanVien + " La: " + TinhLuong);

        System.out.print("He So Luong Duoc Tang:");
        k = input.nextDouble();

        TangLuong = LuongCoBan * (HeSoLuong + k);
        System.out.println("Luong Sau Khi Tang :" + TangLuong);
        System.out.println("He So LUong Cuoi Cung LA: " + (HeSoLuong + k));
        boolean tam = true;
        if (TangLuong > LuongMax) {
            System.out.println("Luong Khong Cho Phep Thay Doi");
            tam = false;

        } else if (TangLuong < LuongMax) {
            System.out.println("Luong Cho Phep Thay Doi ");

        }

        System.out.println("-------------- inrattin-----------------");
        System.out.println("Ho Va Ten Cua Nhan Vien LA : "
                + TenNhanVien + "\n" + "Luong Co Ban: " + LuongCoBan
                + "\n" + "He So LUong Ban Dau: " + HeSoLuong + "\n" + "He So LUong Luc Sau LA: " + (HeSoLuong + k)
        );
        if (tam == true) {
            System.out.println("Luong Cuoi Cung Khi Duoc Nhan LA: " + TangLuong);
        } else {
            System.out.println("Luong Cuoi Cung Khi Duoc Nhan LA: " + TinhLuong);
        }

    }

}
