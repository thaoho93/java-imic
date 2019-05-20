package imic.buoi20;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuaHangTest {

    @Test
    public void inMenu() {
        CuaHang.inMenu();
    }

    @Test
    public void doanhthu() {
        double ketQuaDoanhThu1h = CuaHang.doanhthu("CCTSCTSTTT");
        System.out.println("Doanh thu 1h la: " + ketQuaDoanhThu1h);

        double ketQuaDoanhThu5h = CuaHang.doanhthu("CCTSCTSTTTTSCSCTTTSCCSTCSSSTTTTTT");
        System.out.println("Doanh thu 5h la: " + ketQuaDoanhThu5h);
    }

    @Test
    public void doanhThuSize() {
        double ketqua = CuaHang.doanhThuSize("CCTSCTSTTT", "SMSSLSLLSM");
        System.out.println("Doanh thu theo size la: " + ketqua);
    }

    @Test
    public void inHoaDon() {
        CuaHang.inHoaDon("CCTSCTSTTT","SMSSLSLLSM");
    }
}