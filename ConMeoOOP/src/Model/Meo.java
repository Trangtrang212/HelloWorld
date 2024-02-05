package Model;

import Lib.InputHelper;

public abstract class Meo {
    protected int id;
    protected String tenMeo;
    protected int tuoi;
    protected boolean gioiTinh;
    private String tiengKeu = "meo meo";

    public Meo() {
    }

    public Meo(int id, String tenMeo, int tuoi, boolean gioiTinh, String tiengKeu) {
        this.id = id;
        this.tenMeo = tenMeo;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.tiengKeu = tiengKeu;
    }

    public int getId() {
        return id;
    }

    public String getTenMeo() {
        return tenMeo;
    }

    public void setTenMeo(String tenMeo) {
        this.tenMeo = tenMeo;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public void input() {
        id = InputHelper.inputNumber("Nhap id: ", "Sai kieu du lieu");
        setTenMeo(InputHelper.inputString("Nhap ten: ", "Do dai ten ko phu hop", 1, 50));
        setTuoi(InputHelper.inputNumber("Nhap tuoi meo: ", "Sai kieu du lieu"));
        setGioiTinh(InputHelper.inputBoolean("Nhap gioi tinh: 0/1 ", "Sai du lieu"));
    }

    public void display() {
        System.out.printf("\nId: %d, ", getId());
        System.out.printf("Ten meo: %s, ", getTenMeo());
        System.out.printf("Tuoi: %d, ", getTuoi());
        System.out.printf("Gioi tinh: %s, ", isGioiTinh() ? "meo cai" : "meo duc");
    }
}
