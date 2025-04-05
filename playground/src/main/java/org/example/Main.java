package org.example;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {

            System.out.println("문자열 입력");
            String line = br.readLine();
            bw.write(line + "\n");

            System.out.println("숫자 2개 공백으로 구분해서 입력");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a) + "\n");
            bw.write(String.valueOf(b));

            bw.flush();
        }
    }
}