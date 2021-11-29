package IntroductiontoProgrammingI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // HelloWorld();
        // XCubic();
        // Rectangle();
        // Watch();
        // SmallLargeorEqual();
        // range();
        // SortingThreeNumbers();
        // CircleinaRectangle();
        // PrintManyHelloWorld();
        // PrintTestCases();
        // SwappingTwoNumbers();
        // HowManyDivisors();
        // ABProblem();
        // Circle();
        // SimpleCalculator();
        MinMaxandSum();
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

    private static void PrintManyHelloWorld() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello World");
        }
    }

    private static void PrintTestCases() {
        Scanner scan = new Scanner(System.in);

        int i = 1;
        int x = 1;

        while (true) {
            x = scan.nextInt();
            if (x == 0) {
                break;
            }
            System.out.println("Case " + i++ + ": " + x);
        }
    }

    private static void SwappingTwoNumbers() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String line = scan.nextLine();

            String[] strs = line.split(" ");

            if (strs[0].equals("0") && strs[1].equals("0")) {
                break;
            }

            if (Integer.parseInt(strs[0]) < Integer.parseInt(strs[1])) {
                System.out.println(strs[0] + " " + strs[1]);
            } else {
                System.out.println(strs[1] + " " + strs[0]);
            }
        }
    }

    private static void HowManyDivisors() {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        String[] strs = line.split(" ");

        int a = Integer.parseInt(strs[0]);

        int b = Integer.parseInt(strs[1]);

        int c = Integer.parseInt(strs[2]);

        int answer = 0;

        while (a <= b) {
            if (c % a == 0) {
                answer++;
            }
            a++;
        }

        System.out.println(answer);
    }

    private static void ABProblem() {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        String[] strs = line.split(" ");

        int a = Integer.parseInt(strs[0]);

        int b = Integer.parseInt(strs[1]);

        // 浮動小数点数の扱いに注意 型変換を行う
        System.out.println(a / b + " " + a % b + " " + String.format("%.8f", ((double) a / (double) b)));
    }

    private static void Circle() {
        Scanner scan = new Scanner(System.in);

        double r = scan.nextDouble();

        // 面積:半径 * 半径 * 3.14 周:直径 * 3.14
        System.out.println(
                String.format("%.6f", r * r * 3.141592653589) + " " + String.format("%.6f", 2 * r * 3.141592653589));
    }

    private static void SimpleCalculator() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String line = scan.nextLine();
            String[] strs = line.split(" ");

            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[2]);

            String op = strs[1];

            if (op.equals("?")) {
                break;
            }

            if (op.equals("+")) {
                System.out.println(a + b);
            }

            if (op.equals("-")) {
                System.out.println(a - b);
            }

            if (op.equals("*")) {
                System.out.println(a * b);
            }

            if (op.equals("/")) {
                System.out.println(a / b);
            }
        }
    }

    private static void MinMaxandSum() {
        Scanner scan = new Scanner(System.in);

        // n個の整数
        int count = scan.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = scan.nextInt();
        }

        Arrays.sort(numbers);

        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        System.out.println(numbers[0] + " " + numbers[count - 1] + " " + total);
    }
}