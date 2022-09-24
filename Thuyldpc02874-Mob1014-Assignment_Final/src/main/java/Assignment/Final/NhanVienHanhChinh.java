/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment.Final;

import java.util.logging.Logger;

/**
 *
 * @author Lâm Diễm Thuý
 */
public class NhanVienHanhChinh extends NhanVien{

    public NhanVienHanhChinh() {
    }

    public NhanVienHanhChinh(String hoTen, String maNV, double luong) {
        super(hoTen, maNV, luong);
    }
    
   
    
    @Override
    public double getThuNhap() {
        return getLuong()-getThueThuNhap(luong);
    }
     
}
