package IntroductiontoProgrammingI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // HelloWorld();
        // XCubic();
        // Rectangle();
        // Watch();
        // SmallLargeorEqual();
        // range();
        // SortingThreeNumbers();
        CircleinaRectangle();
    }

    private static void HelloWorld() {
        System.out.println("Hello World");
    }

    private static void XCubic() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 入力
        int n;

        try {

            String N = reader.readLine();
            n = Integer.parseInt(N);

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        System.out.println(n * n * n);
    }

    private static void Rectangle() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 縦
        int a;
        // 横
        int b;

        try {

            String line = reader.readLine();
            String[] strs = line.split(" ");

            a = Integer.parseInt(strs[0]);

            b = Integer.parseInt(strs[1]);

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        System.out.println(a * b + " " + 2 * (a + b));
    }

    private static void Watch() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 秒
        int S;

        try {

            String line = reader.readLine();
            S = Integer.parseInt(line);

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        // hh:mm:ss 0nasi max 24h
        if (S < 60) {
            System.out.println("0:0:" + S);
        } else if (S < 3600) {
            System.out.println("0:" + S / 60 + ":" + S % 60);
        } else {
            System.out.println(S / 3600 + ":" + (S % 3600) / 60 + ":" + S % 60);
        }
    }

    private static void SmallLargeorEqual() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // a
        int a;
        // b
        int b;

        try {

            String line = reader.readLine();
            String[] strs = line.split(" ");

            a = Integer.parseInt(strs[0]);
            b = Integer.parseInt(strs[1]);

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        if (a < b) {
            System.out.println("a < b");
        }

        if (a > b) {
            System.out.println("a > b");
        }

        if (a == b) {
            System.out.println("a == b");
        }
    }

    private static void range() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // a
        int a;
        // b
        int b;
        // c
        int c;

        try {

            String line = reader.readLine();
            String[] strs = line.split(" ");

            a = Integer.parseInt(strs[0]);
            b = Integer.parseInt(strs[1]);
            c = Integer.parseInt(strs[2]);

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static void SortingThreeNumbers() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // a,b,c
        String[] strs = new String[3];

        try {

            String line = reader.readLine();
            strs = line.split(" ");

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        Arrays.sort(strs);
        System.out.println(strs[0] + " " + strs[1] + " " + strs[2]);
    }

    private static void CircleinaRectangle() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // W,H,x,y,r
        int W;
        int H;
        int x;
        int y;
        int r;

        try {

            String line = reader.readLine();
            String[] strs = line.split(" ");

            W = Integer.parseInt(strs[0]);
            H = Integer.parseInt(strs[1]);
            x = Integer.parseInt(strs[2]);
            y = Integer.parseInt(strs[3]);
            r = Integer.parseInt(strs[4]);

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        // 4つのパターンに分ける
        if ((0 < x && 0 < y) && (x + r <= W && y + r <= H)) {
            System.out.println("Yes");
        } else if ((x < 0 && 0 < y) && (W <= x - r && y + r <= H)) {
            System.out.println("Yes");
        } else if ((x < 0 && y < 0) && (x + r <= W && H <= y - r)) {
            System.out.println("Yes");
        } else if ((0 < x && y < 0) && (W <= x - r && H <= y - r)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}