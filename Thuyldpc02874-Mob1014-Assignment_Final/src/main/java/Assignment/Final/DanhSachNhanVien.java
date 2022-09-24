/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment.Final;

/**
 *
 * @author Lâm Diễm Thuý
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachNhanVien {
    private ArrayList<NhanVien> list = new ArrayList<>();
    //NHẬP VÀO DANH SÁCH NHÂN VIÊN
    public void Input(){
         Scanner s = new Scanner(System.in);
        list.clear();
       do{
           System.out.println("Nhap loai nhan vien (Nhan Enter de Thoat!)");
           System.out.println("Chon 1-Hanh Chinh 2-Truong Phong 3-Tiep Thi: ");
           String loai = s.nextLine();
           
           if(loai == null || loai.equals(""))
               break;
           
           int iloai = Integer.parseInt(loai);
           
           switch(iloai){
               case 1:
                   NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                   nvhc.Input(s);
                   list.add(nvhc);
                   break;
               case 2:
                   TruongPhong tp = new TruongPhong();
                   tp.Input(s);
                   list.add(tp);
                   break;
               case 3:
                   NhanVienTiepThi nvtt = new NhanVienTiepThi();
                   nvtt.Input(s);
                   list.add(nvtt);
                   break;
           }
           s.nextLine();
       }while(true);
    }
    
   // public void Input(){
       // Scanner sc = new Scanner(System.in);
       // list.clear();
       // do{
         //   System.out.println("Nhap vap loai nhan vien(1->4): ");
          //  System.out.println(" 1 Nhan Vien Hanh Chinh!");
          //  System.out.println(" 2 Nhan Vien Tiep Thi!");
          //  System.out.println(" 3 Truong Phong!");
           // System.out.println(" 4 Thoat!");
           // String loaiNV = sc.nextLine();
            
           // if(loaiNV.equals("4")){
                
           //     break;
           // }
            // int loai = Integer.parseInt(loaiNV);
            // switch(loai){
            //     case 1: 
                 //   System.out.println("");
                  //   NhanVienHanhChinh hc = new NhanVienHanhChinh();
                  //   hc.Input(sc);
                  //   list.add(hc);
               //  case 2:
               //      System.out.println("");
               //      NhanVienTiepThi tt = new NhanVienTiepThi();
                //     tt.Input(sc);
                //     list.add(tt);
                // case 3:
                //     System.out.println("");
                //    TruongPhong tp = new TruongPhong();
                 //    tp.Input(sc);
                 //    list.add(tp);
            // }
      //  }while(true);
   // }
    //XUẤT DANH SÁCH NHÂN VIÊN VỪA NHẬP
    public void Output(){
        System.out.println("\t\t\t\t DANH SACH NHAN VIEN -_- ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                
        for(NhanVien nv: list){
            if(nv instanceof NhanVienHanhChinh){
                ((NhanVienHanhChinh)nv).Output();
            }else if(nv instanceof NhanVienTiepThi){
                ((NhanVienTiepThi)nv).Output();
            }else if(nv instanceof TruongPhong){
                ((TruongPhong)nv).Output();
            }System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        }
    }
    //TÌM VÀ HIỂN THỊ NHÂN VIÊN THEO MÃ
    public void timvaHienThitheoMa(Scanner s){
        s.nextLine();
        System.out.println("Nhap Ma Nhan Vien Ban Can Tim: ");
        String ma = s.nextLine();

        NhanVien nvFound = null;
        for (NhanVien nv : list) {

            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                nvFound = nv;
                break;
            }
        }
        if (nvFound != null) {
            System.out.println("Thong Tin Nhan Vien: ");
            nvFound.Output();
        } else {
            System.out.println("Khong Tim Thay Ma Nhan Vien Vua Nhap!");
        }
    }
    //Xóa nhân viên theo mã
    public void xoaNhanVienTheoMa(Scanner s) {
        System.out.println("Nhap Ma Nhan Vien Can Xoa: ");
      
        String ma = s.nextLine();
        NhanVien nvFound = null;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                nvFound = nv;
                break;
            }
        }
        if (nvFound != null) {
            list.remove(nvFound);
            System.out.println("Nhan vien da duoc xoa!");
        } else {
            System.out.println("Khong tim duoc nhan vien ban can tim trong danh sach!");
        }

    }
    
    //CẬP NHẬT THÔNG TIN NHÂN VIÊN THEO MÃ NHẬP TỪ BÀN PHÍM
    public void capNhapNhanVienTheoMa(Scanner s) {
        System.out.println("CAP NHAT LAI THONG TIN NHAN VIEN THEO MA ");
        System.out.println("Nhap ma nhan vien: ");
       
        String ma = s.nextLine();
        NhanVien nvFound = null;
        for (NhanVien item : list) {
            if (item.getMaNV().equalsIgnoreCase(ma)) {
                nvFound = item;
                break;
            }
        }
        if (nvFound != null) {
            System.out.println("Nhap thong tin cap nhat cho nhan vien: ");

            if (nvFound instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) nvFound).Input(s);

            } else if (nvFound instanceof TruongPhong) {
                ((TruongPhong) nvFound).Input(s);

            } else if (nvFound instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) nvFound).Input(s);
            }
        } else {
            System.out.println("Khong tim thay ma nhan vien");
        }

    }
    //Chức năng 6: Tìm các nhân viên theo khoảng lương nhập từ bàn phím.
    public void timTheoKhoangLuong(Scanner s){
        s.nextLine();
        System.out.println("Nhap Vao Khoang Luong Thap Nhat: ");
        double min = s.nextDouble();
        System.out.println("Nhap Vao Khoang Luong Cao Nhat: ");
        double max = s.nextDouble();
        boolean tim = false;
        for(NhanVien nv : list){
            if(nv.getLuong()>=min&&nv.getLuong()<=max){
                nv.Output();
                System.out.println();
                tim = true;
        }
            if(tim = false){
                System.out.println("Khong co nhan vien co muc luong trong khoang can tim!");
            }
    }
    }
    
    
    //Chức năng 8: Sắp xếp danh sách nhân viên theo thu nhập tăng dần
    public void sapXepNhanVienTheoThuNhap() {

        Collections.sort(list, (a, b) -> (int) (a.getThuNhap() - b.getThuNhap()));

   }
    //Chức năng 7: Sắp xếp Nhân viên theo tên
    public void sapXepTheoTen(){
        Collections.sort(list, (a,b)->a.getHoTen().compareTo(b.getHoTen()));
    }
    //Chức Năng 9: Hiển thị 5 nhân viên có thu nhập cao nhất trong danh sách
    public void hienThiTop5() {
        System.out.println("Top 5 nhân viên thu nhập cao nhất");
        Collections.sort(list, (a, b) -> (int) (b.getThuNhap() - a.getThuNhap()));
        for (int i = 0; i < 5 && i < list.size(); i++) {
            list.get(i).Output();
            System.out.println("\n=================================================================================");

        }
    }

  

}
