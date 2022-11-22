
package com.mycompany.uts_oop;

/**
 *
 * @author AMALYA SYOHIBA
 */
class Laptop{
    String Merk;
    String Warna;
    String JenisProcessor;
    String UkuranLayar;
}
public class UTS_OOP {

   public static void main(String[] args) {
        Laptop Laptopku = new Laptop();
        Laptopku.Merk="ACER";
        Laptopku.Warna="PINK";
        Laptopku.JenisProcessor="Core i3";
        Laptopku.UkuranLayar="12 inch";
    
        System.out.println("Merk              ="+Laptopku.Merk);
        System.out.println("Warna             ="+Laptopku.Warna);
        System.out.println("Jenis processor   ="+Laptopku.JenisProcessor);
        System.out.println("Ukuran Layar      ="+Laptopku.UkuranLayar);
    }
}
