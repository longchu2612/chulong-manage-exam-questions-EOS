/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author asus
 */
public class Employee {
    private String maNV;
    private String ten;
    private String user_name;
    private String password;
    private String ngaySinh;
    private Boolean quyen;
    private int phanQuyen;

    public Employee() {
    }

    public Employee(String maNV, String ten, String user_name, String password, String ngaySinh, Boolean quyen, int phanQuyen) {
        this.maNV = maNV;
        this.ten = ten;
        this.user_name = user_name;
        this.password = password;
        this.ngaySinh = ngaySinh;
        this.quyen = quyen;
        this.phanQuyen = phanQuyen;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTen() {
        return ten;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public Boolean getQuyen() {
        return quyen;
    }

    public int getPhanQuyen() {
        return phanQuyen;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setQuyen(Boolean quyen) {
        this.quyen = quyen;
    }

    public void setPhanQuyen(int phanQuyen) {
        this.phanQuyen = phanQuyen;
    }
    
    
}
