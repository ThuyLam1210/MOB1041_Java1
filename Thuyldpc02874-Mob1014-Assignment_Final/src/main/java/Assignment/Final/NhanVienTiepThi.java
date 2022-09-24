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

public class NhanVienTiepThi extends NhanVien{
    private double  doanhSo;
    private double  hueHong;
    
    public NhanVienTiepThi() {
    }

    public NhanVienTiepThi(double hueHong, double doanhSo, String hoTen, String maNV, double luong) {
        super(hoTen, maNV, luong);
        this.hueHong = hueHong;
        this.doanhSo = doanhSo;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
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
        System.out.println("Moi nhap vao Doanh So Ban Hang :");
        doanhSo = s.nextDouble();
        if(doanhSo>=0){
            break;
        }
            System.out.println("Luu Y: Doanh So Ban Hang Khong dung!Moi Nhap Lai!"); 
       }while(true);
        do{
            System.out.println("Moi nhap vao Ti Le Hue Hong(Tu 0-100%): ");
            
            hueHong = s.nextDouble();
            if(hueHong>=0||hueHong<=100){
                break;
            }System.out.println("Ti Le hue hong nhap vao khong dung! Moi Nhap lai!");
        }while(true);
      
    }
    @Override
    public void Output(){
        super.Output();
        System.out.println(" - Doanh So: "+doanhSo+" - Hue Hong: "+hueHong+"%");
    }
    
    @Override
    public double getThuNhap() {
        return (getLuong()+doanhSo*hueHong)-getThueThuNhap(luong);
    }
    
}
