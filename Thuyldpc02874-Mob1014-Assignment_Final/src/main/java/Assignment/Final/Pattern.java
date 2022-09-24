/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment.Final;

/**
 *
 * @author Lâm Diễm Thuý
 */
public class Pattern {
     public boolean ktMaNV(String sc){
        String pattern = "[a-zA-Z]{1}\\d{2}"; 
        return sc.matches(pattern);
    }
   

    public boolean ktHoTen(String sc) {
        String pattern = "[a-zA-Z\\s]{1,30}";
        return sc.matches(pattern);
    }
}
