/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author asus
 */
public class Answer {
    private int maDa;
    private int maCh;
    private String noiDung;
    private boolean dungSai;

    public Answer(int maDa, int maCh, String noiDung, boolean dungSai) {
        this.maDa = maDa;
        this.maCh = maCh;
        this.noiDung = noiDung;
        this.dungSai = dungSai;
    }

    public Answer() {
    }

    public int getMaDa() {
        return maDa;
    }

    public int getMaCh() {
        return maCh;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public boolean isDungSai() {
        return dungSai;
    }

    public void setMaDa(int maDa) {
        this.maDa = maDa;
    }

    public void setMaCh(int maCh) {
        this.maCh = maCh;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public void setDungSai(boolean dungSai) {
        this.dungSai = dungSai;
    }
    
    
}
