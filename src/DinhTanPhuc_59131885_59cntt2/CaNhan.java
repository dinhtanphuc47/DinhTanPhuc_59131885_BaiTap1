/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DinhTanPhuc_59131885_59cntt2;

/**
 *
 * @author admin
 */
public abstract class CaNhan {
    // attributes
    protected String hoTen;
    protected int tuoi;
    protected String diaChi;
    protected String sdt;


    public CaNhan() {
      hoTen = "";
      tuoi = 0;
      diaChi = "";
      sdt = "";
    }
    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
      this.hoTen = hoTen;
      this.tuoi = tuoi;
      this.diaChi = diaChi;
      this.sdt = sdt;
    }

    // getter, setter
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
    public void setSdt(String sdt) { this.sdt = sdt; }
    public String getHoTen() { return this.hoTen; }
    public int getTuoi() { return this.tuoi; }
    public String getDiaChi() { return this.diaChi; }
    public String getSdt() { return this.sdt; }
    // hien thi thong tin
    public abstract String hienThiTT();
}