package org.example.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* LCS(Longest Common Subsequence) : 최장 공통 부분 수열
 * 두 개의 문자열(또는 수열)에서, 각 문자열의 원래 순서를 유지하면서
 * 공통으로 나타나는 부분 수열 중에서 가장 긴 수열을 찾는 문제이다.
 * 예를 들어, 문자열 "ABCBDAB"과 "BDCABA"가 주어졌을 때,
 * 공통 부분 수열인 "BCBA" 또는 "BDAB" 등이 있을 수 있으며, 이들 중 길이가 가장 긴 수열을 찾는다.
 * */
public class I_LCS {
    static char[] arr1;
    static char[] arr2;
    static Integer[][] dp;

    public static Integer solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));

        arr1 = br.readLine().toCharArray();
        arr2 = br.readLine().toCharArray();

        dp = new Integer[arr1.length][arr2.length];

        return lcs(arr1.length - 1, arr2.length - 1);
    }

    static int lcs(int x, int y) {
        return 0;
    }
}