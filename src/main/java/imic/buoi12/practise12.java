package imic.buoi12;

public class practise12
{
    static double [] bang1 = {-3, 7, -1.5, 3.7, 10, 7, 0, 7, -1.5};

    public static void inGiaTriTuyetDoi(){
        for (double a:bang1){System.out.println(Math.abs(a));}
    }

    public static void inGiaTriTran (){
        double max=bang1[0];
        for (int b=0; b<bang1.length; b++){
            max = Math.max(bang1[b], max);
        }
        System.out.println(max);

    }

    public static void inGiaTriSan(){
        double min=bang1[0];
        for (int c=0; c<bang1.length; c++){
            min = Math.min(bang1[c], min);
        }
        System.out.println(min);

    }
}
