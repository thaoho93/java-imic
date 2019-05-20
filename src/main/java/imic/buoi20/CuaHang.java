package imic.buoi20;

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

    public static double doanhthu() {
        String dsBanDuoc = "CCTSCTSTTT";
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
        double doanhthu1h = countC * new CaPhe().price + countS * new Soda().price + countT * new TraSua().price;

        return doanhthu1h;
    }
}
