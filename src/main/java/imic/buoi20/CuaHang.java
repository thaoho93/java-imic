package imic.buoi20;

import java.util.ArrayList;
import java.util.List;

public class CuaHang {

    static DoUong[] menu = new DoUong[3];


    public CuaHang() {
        menu[0] = new CaPhe();
        menu[1] = new TraSua();
        menu[2] = new Soda();
    }

    public static void inMenu() {
        CuaHang ch = new CuaHang();
        for (DoUong i : ch.menu) {
            System.out.println(i.toString());
        }
    }

    public static double doanhthu(String dsBanDuoc) {
        int countC = 0;
        int countT = 0;
        int countS = 0;
        for (int i = 0; i < dsBanDuoc.length(); i++) {
            char c = dsBanDuoc.charAt(i);
            switch (c) {
                case 'C':
                    countC++;
                    break;
                case 'T':
                    countT++;
                    break;
                default:
                    countS++;
            }
        }
        System.out.println("Da ban duoc Ca phe : " + countC);
        System.out.println("Da ban duoc Tra sua : " + countT);
        System.out.println("Da ban duoc Soda : " + countS);
        double doanhthu = countC * new CaPhe().price + countS * new Soda().price + countT * new TraSua().price;

        return doanhthu;
    }

    public static double doanhThuSize(String dsBanDuoc, String sizeDoUong) {
        List<DoUong> listBanDuoc = chuyenDoi(dsBanDuoc);
        setSize(listBanDuoc, sizeDoUong);
        double doanhThuSize = 0;
        for (DoUong i:listBanDuoc){
            doanhThuSize += i.getPrice();
        }
        return doanhThuSize;
    }

    public static void inHoaDon(String dsBanDuoc, String sizeDoUong){
        List<DoUong> listBanDuoc = chuyenDoi(dsBanDuoc);
        setSize(listBanDuoc, sizeDoUong);
        double doanhThuSize = 0;
        int stt = 1;
        for (DoUong i:listBanDuoc){
            System.out.println(String.format("%d. %s - Size: %c - Gia: %.3fVND", stt, i.name,i.size,i.getPrice() ));
            doanhThuSize += i.getPrice();
            stt++;
        }
        System.out.println(String.format("Tong cong = %.3fVND", doanhThuSize));
    }

    public static void setSize(List<DoUong> dsDoUong, String sizeDoUong){
        for (int i = 0; i < sizeDoUong.length(); i++) {
            char c = sizeDoUong.charAt(i);
            switch (c) {
                case 'M':
                    dsDoUong.get(i).size = 'M';
                    break;
                case 'L':
                    dsDoUong.get(i).size = 'L';
                    break;
                default:
                    break;
            }
        }
    }

    public static List<DoUong> chuyenDoi(String dsBanDuoc) {
        List<DoUong> listBanDuoc = new ArrayList<>();
        for (int i = 0; i < dsBanDuoc.length(); i++) {
            char c = dsBanDuoc.charAt(i);
            switch (c) {
                case 'C':
                    listBanDuoc.add(new CaPhe());
                    break;
                case 'T':
                    listBanDuoc.add(new TraSua());
                    break;
                default:
                    listBanDuoc.add(new Soda());
            }
        }
        return listBanDuoc;
    }
}
