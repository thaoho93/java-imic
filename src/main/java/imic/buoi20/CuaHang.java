package imic.buoi20;

public class CuaHang {

    static DoUong[] menu = new DoUong[3];


    public CuaHang() {
        menu[0] = new CaPhe();
        menu[1] = new TraSua();
        menu[2] = new Soda();
    }
    public static void inMenu(){
        CuaHang ch = new CuaHang();
        for (DoUong i:ch.menu){
            System.out.println(i.toString());
        }
    }
}
