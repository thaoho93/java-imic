package imic.buoi10;

import java.util.Scanner;

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

    public static void lietKeSNT(int f) {
        System.out.println("Cac so nguyen to nho hon n la ");
        for (int g = 1; g < f; g++) {
            int soUocf = 0;
            for (int k = 1; k <= g; k++) {
                if (g % k == 0) {
                    soUocf++;
                }
            }
            if (soUocf == 2) {
                System.out.print(g + " ");


            }
        }
    }

    public static void phanTichThuaSo(int h) {
        int H = h;
        System.out.print("Phan tich thua so cua " + h + " = ");
        while (H > 1) {
            for (int j = 1; j <= h; j++) {
                if (h % j == 0) {
                    int uoc = 0;
                    for (int q = 1; q <= j; q++) {
                        if (j % q == 0) {
                            uoc++;
                        }
                    }
                    if (uoc == 2) {
                        if (H % j == 0) {
                            H = H / j;
                            System.out.print(j);
                            j = 0;
                        } else {
                            continue;
                        }
                        if (H == 1) {
                            break;
                        } else {
                            System.out.print(" x ");
                        }
                    }
                }
            }
        }


    }

    public static void tongSoNguyen(int w) {
        int sum = 0;
        int W = w;
        int s = 0;
        int[] tongW = new int[w];
        System.out.print("Tong cac chu so cua so nguyen " + w + " = ");
        for (s = 0; W >= 1; s++) {
            int x = W % 10;
            W = W / 10;
            sum += x;
            tongW[s] = x;
        }
        for (int v = s - 1; v >= 0; v--) {
            System.out.print(tongW[v]);
            if (v == 0) {
                break;
            }
            System.out.print(" + ");
        }
        System.out.print(" = " + sum);
    }

    public static void soThuanNghich(int y) {
        int[] arrY = new int[y];
        int Y = y;
        int i = 0;
        int j = 0;
        for (i = 0; Y >= 1; i++) {
            arrY[i] = Y % 10;
            Y = Y / 10;
        }
        for (j = 0; j < i; j++) {
            if (arrY[j] != arrY[i - j - 1]) {
                System.out.println(y + " khong phai la so thuan nghich");
                break;
            }

        }
        if (j == i) {
            System.out.println(y + " la so thuan nghich");
        }

    }
}









