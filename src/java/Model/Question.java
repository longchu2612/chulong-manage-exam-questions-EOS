/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Question {
    private int maCh;
    private String hinhThucCh;
    private String noiDung;
    private String maMon;
    private String doKho;
    private Subject subject;
    private ArrayList<Answer> list;   

    public ArrayList<Answer> getList() {
        return list;
    }

    public void setList(ArrayList<Answer> list) {
        this.list = list;
    }
   
   
    
    
    
    

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Question(int maCh, String hinhThucCh, String noiDung, String maMon, String doKho, Subject subject) {
        this.maCh = maCh;
        this.hinhThucCh = hinhThucCh;
        this.noiDung = noiDung;
        this.maMon = maMon;
        this.doKho = doKho;
        this.subject = subject;
    }
    
    
    

   

    public Question() {
    }

    public int getMaCh() {
        return maCh;
    }

    public String getHinhThucCh() {
        return hinhThucCh;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getDoKho() {
        return doKho;
    }

    public void setMaCh(int maCh) {
        this.maCh = maCh;
    }

    public void setHinhThucCh(String hinhThucCh) {
        this.hinhThucCh = hinhThucCh;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public void setDoKho(String doKho) {
        this.doKho = doKho;
    }
    
    
}
