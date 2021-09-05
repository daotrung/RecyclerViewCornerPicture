package com.daotrung.bai1;

public class Food {
    public String Name ;
    public String Fan ;
    public String BaiViet ;
    public String Nhom ;
    public int Hinh ;

    public Food(String name, String fan, String baiViet, String nhom, int hinh) {
        Name = name;
        Fan = fan;
        BaiViet = baiViet;
        Nhom = nhom;
        Hinh = hinh;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFan() {
        return Fan;
    }

    public void setFan(String fan) {
        Fan = fan;
    }

    public String getBaiViet() {
        return BaiViet;
    }

    public void setBaiViet(String baiViet) {
        BaiViet = baiViet;
    }

    public String getNhom() {
        return Nhom;
    }

    public void setNhom(String nhom) {
        Nhom = nhom;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
