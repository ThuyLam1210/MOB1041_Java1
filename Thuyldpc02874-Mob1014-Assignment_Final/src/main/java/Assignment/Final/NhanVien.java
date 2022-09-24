/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment.Final;

/**
 *
 * @author Lâm Diễm Thuý
 */
import java.util.Scanner;


public abstract class NhanVien {
    
    String hoTen, maNV;
    double luong;
    
    public NhanVien() {
    }

    public NhanVien(String hoTen, String maNV, double luong) {
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public abstract double getThuNhap();
    
    public double getThueThuNhap(double luong){
        double thueTN=0;
        if(luong >15000)
            thueTN = 0.12 * luong;
        else if(luong >= 9000 || luong <=15000)
            thueTN = 0.1 *luong;
        else if(luong<9000)
            thueTN=0*luong;
        
        return thueTN;
    }
     
     
    public void Input(Scanner s){
            Pattern check = new Pattern();
            
            do{
                System.out.println("Moi Nhap Vao Ho Va Ten(VD: Nguyen Van A): ");
                hoTen = s.nextLine();
                if(check.ktHoTen(hoTen)){
                    break;
                }
                System.out.println("Ho Ten nhap vao khong hop le!Moi nhap lai!");
            }while(true);
            do{
                System.out.println("Moi nhap vao Ma So Nhan Vien(VD: A01): ");
                maNV =s.nextLine();
                if(check.ktMaNV(maNV)){
                    break;
                }
                System.out.println("Ma Nhan Vien nhap vao khong hop le!Moi nhap lai!");
            }while(true);
            do{
               
                System.out.println("Moi nhap vao Luong Nhan Vien: ");
                luong = s.nextDouble();
                if(luong>0){
                    break;
                }
                System.out.println("Muc luong khong the nho hon 0!Moi nhap lai!");
            }while(true);
            
    }
    public void Output(){
        System.out.println("Ho Ten: "+hoTen+" - Ma NV: "+maNV+" - Luong Co Ban: "+luong+" - Thue Thu Nhap: "+getThueThuNhap(luong)+" - Tong Thu Nhap: "+getThuNhap());
    }
   
    
}
