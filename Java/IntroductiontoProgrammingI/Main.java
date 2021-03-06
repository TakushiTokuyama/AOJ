package IntroductiontoProgrammingI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        // MinMaxandSum();
        // PrintaRectangle();
        // PrintaFrame();
        // PrintaChessboard();
        // StructuredProgramming();
        // ReversingNumbers();
        // FindingMissingCards();
        // OfficialHouse();
        // MatrixVectorMultiplication();
        // Grading();
        // Howmanyways();
        // Spreadsheet();
        MatrixMultiplication();
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

        long total = 0;

        for (int number : numbers) {
            total += number;
        }

        System.out.println(numbers[0] + " " + numbers[count - 1] + " " + total);
    }

    private static void PrintaRectangle() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> height_weight = new ArrayList<String>();

        try {
            while (true) {
                String line = reader.readLine();
                if (line.equals("0 0")) {
                    break;
                }
                height_weight.add(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        String newline = System.lineSeparator();

        for (String hw : height_weight) {
            int h = Integer.parseInt(hw.split(" ")[0]);
            int w = Integer.parseInt(hw.split(" ")[1]);
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print("#");
                }
                System.out.print(newline);
            }
            System.out.print(newline);
        }
    }

    private static void PrintaFrame() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> height_weight = new ArrayList<String>();

        try {
            while (true) {
                String line = reader.readLine();
                if (line.equals("0 0")) {
                    break;
                }
                height_weight.add(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        String newline = System.lineSeparator();

        for (String hw : height_weight) {
            int h = Integer.parseInt(hw.split(" ")[0]);
            int w = Integer.parseInt(hw.split(" ")[1]);
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (i == 0 || i == h - 1) {
                        System.out.print("#");
                    } else {
                        if (j == 0 || j == w - 1) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                }
                System.out.print(newline);
            }
            System.out.print(newline);
        }
    }

    private static void PrintaChessboard() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> height_weight = new ArrayList<String>();

        try {
            while (true) {
                String line = reader.readLine();
                if (line.equals("0 0")) {
                    break;
                }
                height_weight.add(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        String newline = System.lineSeparator();

        for (String hw : height_weight) {
            int h = Integer.parseInt(hw.split(" ")[0]);
            int w = Integer.parseInt(hw.split(" ")[1]);
            for (int i = 0; i < h; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < w; j++) {
                        System.out.print(j % 2 == 0 ? "#" : ".");
                    }
                } else {
                    for (int j = 0; j < w; j++) {
                        System.out.print(j % 2 == 0 ? "." : "#");
                    }
                }
                System.out.print(newline);
            }
            System.out.print(newline);
        }
    }

    private static void StructuredProgramming() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 10 == 3 || String.valueOf(i).contains("3")) {
                System.out.print(" " + i);
            }
        }
    }

    private static void ReversingNumbers() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n;
        Integer[] numbers;

        try {
            n = reader.readLine();
            String line = reader.readLine();

            numbers = new Integer[Integer.parseInt(n)];

            String[] strs = line.split(" ");

            for (int i = 0; i < strs.length; i++) {
                numbers[i] = Integer.parseInt(strs[i]);
            }

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        for (int i = Integer.parseInt(n) - 1; 0 <= i; i--) {
            System.out.print(numbers[i]);

            if (i != 0) {
                System.out.print(" ");
            } else if (i == 0) {
                System.out.println("");
            }
        }
    }

    private static void FindingMissingCards() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[][] input_cards;

        int n;

        try {
            String str_n = reader.readLine();

            n = Integer.parseInt(str_n);

            input_cards = new String[n][2];

            for (int i = 0; i < n; i++) {
                String line = reader.readLine();

                String[] strs = line.split(" ");

                input_cards[i][0] = strs[0];
                input_cards[i][1] = strs[1];
            }

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        int output_cards[][] = new int[4][14];

        // S,H,C,D
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(input_cards[i][1]);
            if (input_cards[i][0].equals("S")) {
                output_cards[0][number] = number;
            } else if (input_cards[i][0].equals("H")) {
                output_cards[1][number] = number;
            } else if (input_cards[i][0].equals("C")) {
                output_cards[2][number] = number;
            } else if (input_cards[i][0].equals("D")) {
                output_cards[3][number] = number;
            }
        }

        String s = "";

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                s = "S";
            } else if (i == 1) {
                s = "H";
            } else if (i == 2) {
                s = "C";
            } else if (i == 3) {
                s = "D";
            }
            for (int j = 1; j <= 13; j++) {
                if (output_cards[i][j] == 0) {
                    System.out.println(s + " " + j);
                }
            }
        }
    }

    private static void OfficialHouse() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // b, f, r, v
        String[] input;

        // 区切り
        final String delimiter = "####################";

        try {
            String str = reader.readLine();

            int n = Integer.parseInt(str);

            input = new String[n];

            for (int i = 0; i < n; i++) {
                String line = reader.readLine();
                input[i] = line;
            }

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        // 4棟 ３階 10部屋
        int[][][] output = new int[4][3][10];

        for (int i = 0; i < input.length; i++) {

            String[] schoolBuildingInfo = input[i].split(" ");

            int Mune = Integer.parseInt(schoolBuildingInfo[0]) - 1;

            int floor = Integer.parseInt(schoolBuildingInfo[1]) - 1;

            int room = Integer.parseInt(schoolBuildingInfo[2]) - 1;

            int retirement = Integer.parseInt(schoolBuildingInfo[3]);

            output[Mune][floor][room] += retirement;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(" ");
                    System.out.print(output[i][j][k]);
                }
                System.out.println("");
            }
            if (i != 3) {
                System.out.println(delimiter);
            }
        }
    }

    private static void MatrixVectorMultiplication() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // n行 m列
        int n, m;

        int[][] a;
        int[] b;

        try {
            String str = reader.readLine();

            String[] nm = str.split(" ");

            n = Integer.parseInt(nm[0]);
            m = Integer.parseInt(nm[1]);

            a = new int[n][m];

            for (int i = 0; i < n; i++) {
                String line = reader.readLine();
                String[] strs = line.split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(strs[j]);
                }
            }

            b = new int[m];

            for (int i = 0; i < m; i++) {
                String line = reader.readLine();
                b[i] = Integer.parseInt(line);
            }

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        for (int i = 0; i < n; i++) {
            var total = 0;
            for (int j = 0; j < m; j++) {
                total += a[i][j] * b[j];
            }
            System.out.println(total);
        }
    }

    private static void Grading() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 中間試験の点数 m 期末試験の点数 f 再試験の点数 r
        int m, f, r;

        List<String> result = new ArrayList<String>();

        try {
            while (true) {
                String str = reader.readLine();

                String[] strs = str.split(" ");

                m = Integer.parseInt(strs[0]);
                f = Integer.parseInt(strs[1]);
                r = Integer.parseInt(strs[2]);

                if (m == -1 && f == -1 && r == -1) {
                    result.forEach(i -> System.out.println(i));
                    break;
                }

                if (m == -1 || f == -1) {
                    result.add("F");
                } else if (m + f >= 80) {
                    result.add("A");
                } else if (m + f >= 65) {
                    result.add("B");
                } else if (m + f >= 50) {
                    result.add("C");
                } else if (m + f >= 30 && r >= 50) {
                    result.add("C");
                } else if (m + f >= 30) {
                    result.add("D");
                } else {
                    result.add("F");
                }
            }

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static void Howmanyways() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 結果格納用
        List<Integer> result = new ArrayList<Integer>();

        int n, m;

        try {
            while (true) {
                String line = reader.readLine();

                String[] str = line.split(" ");

                n = Integer.parseInt(str[0]);

                m = Integer.parseInt(str[1]);

                if (str[0].equals("0") && str[1].equals("0")) {
                    result.forEach(i -> System.out.println(i));
                    break;
                }

                List<String> list = new ArrayList<String>();

                // 1 - n までの数の中から、合計がmの値を求める
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        for (int k = 1; k <= n; k++) {
                            // 合計がm かつ 重複した組み合わせ以外
                            if (m - (i + j + k) == 0 && !(i == j || i == k || j == k)) {
                                int[] numbers = new int[3];
                                numbers[0] = i;
                                numbers[1] = j;
                                numbers[2] = k;
                                Arrays.sort(numbers);
                                String number = String.valueOf(numbers[0]) + String.valueOf(numbers[1])
                                        + String.valueOf(numbers[2]);
                                list.add(number);
                            }
                        }
                    }
                }

                // 重複を取り除いた組み合わせ
                result.add(list.stream().distinct().collect(Collectors.toList()).size());
            }

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static void Spreadsheet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[][] array;

        int r, c;

        try {
            String rcs = reader.readLine();

            String[] rc = rcs.split(" ");

            r = Integer.parseInt(rc[0]);
            c = Integer.parseInt(rc[1]);

            array = new String[r][1];

            for (int i = 0; i < r; i++) {
                String line = reader.readLine();
                String[] str_numbers = line.split(" ");

                StringBuilder sb = new StringBuilder();
                int total = 0;

                for (int j = 0; j < c; j++) {
                    sb.append(str_numbers[j] + " ");
                    total += Integer.parseInt(str_numbers[j]);

                    if (j == c - 1) {
                        sb.append(total);
                        array[i][0] = sb.toString();
                        sb.setLength(0);
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        int[] lastRow = new int[c + 1];

        for (String[] arr : array) {
            for (String str : arr) {
                System.out.println(str);
                String[] strs = str.split(" ");

                for (int j = 0; j < strs.length; j++) {
                    lastRow[j] += Integer.parseInt(strs[j]);
                }
            }
        }

        int k = 0;
        for (int i : lastRow) {
            k++;
            if (lastRow.length == k) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }

    private static void MatrixMultiplication() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // n,m,l
        int[] nml;
        long[][] nm;
        long[][] ml;

        try {

            // n,m,l
            String firstLine = reader.readLine();

            nml = Arrays.stream(firstLine.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();

            // nm
            nm = new long[nml[0]][nml[1]];

            for (int i = 0; i < nml[0]; i++) {
                String line = reader.readLine();
                String[] n = line.split(" ");
                for (int k = 0; k < nml[1]; k++) {
                    nm[i][k] = Long.parseLong(n[k]);
                }
            }

            // ml
            ml = new long[nml[1]][nml[2]];

            for (int i = 0; i < nml[1]; i++) {
                String line = reader.readLine();
                String[] m = line.split(" ");
                for (int k = 0; k < nml[2]; k++) {
                    ml[i][k] = Long.parseLong(m[k]);
                }
            }

            reader.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        String newline = System.lineSeparator();
        int result = 0;

        for (int i = 0; i < nm.length; i++) {
            for (int k = 0; k < ml[0].length; k++) {
                for (int l = 0; l < ml.length; l++) {
                    result += nm[i][l] * ml[l][k];
                }

                System.out.print(result);

                if (nml[2] - 1 != k) {
                    System.out.print(" ");
                }
                result = 0;
            }
            System.out.print(newline);
        }
    }
}