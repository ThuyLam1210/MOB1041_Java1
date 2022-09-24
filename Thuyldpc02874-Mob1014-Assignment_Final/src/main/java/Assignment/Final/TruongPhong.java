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

public class TruongPhong extends NhanVien{
    private double tienTrachNhiem;

    public TruongPhong() {
    }
    
    public TruongPhong(double tienTrachNhiem, String hoTen, String maNV, double luong) {
        super(hoTen, maNV, luong);
        this.tienTrachNhiem = tienTrachNhiem;
    }

    public double getTienTrachNhiem() {
        return tienTrachNhiem;
    }

    public void setTienTrachNhiem(double tienTrachNhiem) {
        this.tienTrachNhiem = tienTrachNhiem;
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
    @Override
    public void Input(Scanner s){
        super.Input(s);
        do{
        System.out.println("Nhap vao Tien Trach Nhiem: ");
        
        tienTrachNhiem = s.nextDouble();
        s.nextLine();
        if(tienTrachNhiem>=0){
            break;
        }
            System.out.println("So Tien Trach Nhiem Nhap vao khong dung!Moi nhap lai!");
        }while(true);
    }
    @Override
    public void Output(){
        super.Output();
        System.out.println(" - Tien Trach Nhiem: "+tienTrachNhiem);
    }
    @Override
    public double getThuNhap() {
        return (getLuong()+tienTrachNhiem)-getThueThuNhap(luong);
        
    }
    
    
}
