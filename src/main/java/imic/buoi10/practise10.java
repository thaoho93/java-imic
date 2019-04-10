package imic.buoi10;

public class practise10 {
    public static int daySoFn(int n) {
        int Fn = 1;
        int[] F = new int[n];
        F[0] = 0;
        F[1] = 1;
        F[2] = 1;
        for (int x = 2; x < n; x++) {
            F[x] = F[x - 1] + F[x - 2];
            Fn = F[x];
        }

        return Fn;


    }


    public static int uocSoLN(int a, int b) {
        int uSLN = 1;
        for (int c = 1; c <= a || c <= b; c++) {
            if (a % c == 0 && b % c == 0) {
                uSLN = c;
            }
        }
        return uSLN;
    }

    public static int boiSoNN(int x, int y) {
        int bSNN = 1;
        for (int i = 1; i <= x * y; i++) {
            if (i % x == 0 && i % y == 0) {
                bSNN = i;
                break;
            }
        }
        return bSNN;

    }

    public static void soNguyento(int d) {
        int soNT = 1;
        int soUoc = 0;
        for (int e = 1; e <= d; e++) {
            if (d % e == 0) {
                soUoc++;
            }
        }
        if (soUoc > 2) {
            System.out.println("So " + d + " khong phai so nguyen to");
        } else {
            System.out.println("So " + d + " la so nguyen to");
        }
    }


}

