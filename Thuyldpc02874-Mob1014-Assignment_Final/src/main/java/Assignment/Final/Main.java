/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment.Final;

import java.util.Scanner;

/**
 *
 * @author Lâm Diễm Thuý
    *Input: Nhập vào một Chức năng bất kì(Nhập số từ 1-10)->>Nếu Sai bắt nhập lại
    *OutPut:In ra màn hình 1 trong 10 chức năng:
    *       1. Nhập danh sách nhân viên từ bàn phím.
    *       2. Xuất danh sách nhân viên ra màn hình.
    *       3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.
    *       4. Xóa nhân viên theo mã nhập từ bàn phím.
    *       5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím
    *       6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.
    *       7. Sắp xếp nhân viên theo họ và tên.
    *       8. Sắp xếp nhân viên theo thu nhập.
    *       9. Xuất 5 nhân viên có thu nhập cao nhất.
    *      10. Thoát Chương trình.!!!
 * 
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DanhSachNhanVien ds = new DanhSachNhanVien();
        
        int luaChon = 0;
        do{
            try{
                System.out.println("\n");
                System.out.println("\t\t+========================*-*-*-*-*-*-*-*-*-*=========================+");
                System.out.println("\t\t+                        MENU CHUONG TRINH                           +");
                System.out.println("\t\t+--------------------------------------------------------------------+");
                System.out.println("\t\t+          1.Nhap danh sach nhan vien tu ban phim!                   +");
                System.out.println("\t\t+          2.Xuat danh sach nhan vien ra man hinh!                   +");
                System.out.println("\t\t+          3.Tim va hien thi nhan vien theo ma nhap tu ban phim!     +");
                System.out.println("\t\t+          4.Xoa nhan vien theo ma nhap tu ban phim!                 +");
                System.out.println("\t\t+          5.Cap nhat thong tin nhan vien theo ma nhap tu ban phim!  +");
                System.out.println("\t\t+          6.Tim cac nhan vien theo khoang luong nhap tu ban phim!   +");
                System.out.println("\t\t+          7.Sap xep nhan vien theo ho và ten!                       +");
                System.out.println("\t\t+          8.Sap xep nhan vien theo thu nhap!                        +");
                System.out.println("\t\t+          9.Xuat 5 nhan vien co thu nhap cao nhat!                  +");
                System.out.println("\t\t+         10.Thoat!                                                  +");
                System.out.println("\t\t+===========================*-*-*-*-*-*-*-*-*========================+");
                System.out.println("\t\t\t          Ban lua chon chuc nang nao? ");
                luaChon = s.nextInt();
                
                switch(luaChon){
                case 1:
                    System.out.println("\t\t\t Ban da chon chuc nang 1!");
                    System.out.println("\t\t\t Day la chuc nang Nhap danh sach nhan vien tu ban phim!");
                    ds.Input();
                    break;

                case 2:
                    System.out.println("\t\t\t Ban da chon chuc nang 2!");
                    System.out.println("\t\t\t Day la chuc nang  Xuat danh sach nhan vien ra man hinh!");
                    ds.Output();
                    break;
                case 3:
                    System.out.println("\t\t\t Ban da chon chuc nang 3!");
                    System.out.println("\t\t\t Day la chuc nang Tim va hien thi nhan vien theo ma nhap tu ban phim!");
                    s.nextLine();
                    ds.timvaHienThitheoMa(s);
                    
                    break;
                case 4:
                    System.out.println("\t\t\t Ban da chon chuc nang 4!");
                    System.out.println("\t\t\t Day la chuc nang Xoa nhan vien theo ma nhap tu ban phim!");
                    s.nextLine();
                    ds.xoaNhanVienTheoMa(s);
                    System.out.println("Danh sach Nhan Vien Sau khi xoa: ");
                    ds.Output();
                    break;
                case 5:
                    System.out.println("\t\t\t Ban da chon chuc nang 5!");
                    System.out.println("\t\t\t Day la chuc nang Cap nhat thong tin nhan vien theo ma nhap tu ban phim!");
                    s.nextLine();
                    ds.capNhapNhanVienTheoMa(s);
                    System.out.println("Danh sách nhân viên mới cập nhật");
                    ds.Output();
                    break;
                case 6:
                    System.out.println("\t\t\t Ban da chon chuc nang 6!");
                    System.out.println("\t\t\t Day la chuc nang Tim cac nhan vien theo khoang luong nhap tu ban phim!");
                     ds.timTheoKhoangLuong(s);
                    break;
                case 7:
                    System.out.println("\t\t\t Ban da chon chuc nang 7!");
                    System.out.println("\t\t\t Day la chuc nang Sap xep nhan vien theo ho và ten!");
                   
                    ds.sapXepTheoTen();
                    ds.Output();
                    break;
                case 8:
                    System.out.println("\t\t\t Ban da chon chuc nang 8!");
                    System.out.println("\t\t\t Day la chuc nang Sap xep nhan vien theo thu nhap!");
                    
                   ds.sapXepNhanVienTheoThuNhap();
                   ds.Output();
                    break;
                 case 9:
                    System.out.println("\t\t\t Ban da chon chuc nang 10!");
                    System.out.println("\t\t\t Day la chuc nang Xuat 5 nhan vien co thu nhap cao nhat!");
                    ds.hienThiTop5();
                    break;
                 case 10:        
                    System.out.println("\t\t\t Ban da chon Thoat chuong trinh!");
                     System.out.println("\t\t\t\t CHAO TAM BIET ^-^!!! ");
                    System.exit(0);//Thoát chương trình
                    
                    break;
                  
                default:
                    System.out.println("\t\t\t Ban da chon sai!Vui long lua chon tu 1->10!");
                 
                    break;
                }
            }catch(Exception ex){
                System.out.println("\t\t\t Vui long nhap so!!");
            }
            System.out.println("");
            System.out.println("\t\t\t Ban co muon tiep tuc chuong trinh?(Yes/No) ");
            s.nextLine();
             do{
                 
                System.out.println("\t\t\t Nhan 'y' de Next hoac Nhan 'n' de Stop: ");
                String next = s.nextLine();
                if(next.equalsIgnoreCase("y")){
                    
                    break;
                }else
                    System.out.println("\t\t\t\t  CHAO TAM BIET ^-^ ");
                    System.exit(0);
             }while(true);
        }while(true);
    }
}
