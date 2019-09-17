package com.example.student.myapplication;

public class NguoiMau {
    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(int quocTich) {
        this.quocTich = quocTich;
    }

    public NguoiMau(int img, String ten, int nam, int quocTich) {
        this.img = img;
        this.ten = ten;
        this.nam = nam;
        this.quocTich = quocTich;
    }

    public NguoiMau() {
    }

    @Override
    public String toString() {
        return this.ten + "\n" + this.nam;
    }

    private int img;
    private String ten;
    private int nam;
    private int quocTich;
}
