package org.example;


import java.io.*;
import java.util.StringTokenizer;

public class StringTest {
    public static void main(StringTest[] args) {

        /**
         * try-with-resources 문법
         * {} 블록을 벗어나면 자동으로 br과 bw는 자동으로 close
         * 명시적으로 close를 사용안해도 됨
         */
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
