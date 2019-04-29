package com.pokerbean.leetcode.string;

import java.util.ArrayDeque;

/**
 * created by IntelliJ IDEA
 *
 * @author: pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2019-04-29 16:27
 * @desc: ReverseInteger
 */
public class ReverseInteger {

    public static Integer reverseInt(Integer origin) {
        String originStr = origin.toString();
        boolean isNegative = false;
        if (originStr.contains("-")) {
            isNegative = true;
            originStr = originStr.substring(1);
        }

        if (originStr.length() <= 1) {
            return origin;
        }

        char[] chars = originStr.toCharArray();
        // 32位
        ArrayDeque stack = new ArrayDeque();
        for (char num : chars) {
            stack.push(num);
        }
        char[] des = new char[chars.length];
        int index = 0;
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            des[index] = (char) pop;
            index++;
        }
        String finalString = new String(des);
        if (isNegative) {
            finalString = "-" + finalString;
        }
        int result = 0;
        try {
            result = Integer.parseInt(finalString);
        } catch (NumberFormatException e) {
            System.out.println("整数溢出");
        }
        return result;
    }

    public static void main(String[] args) {
        Integer integer = reverseInt(1534236469);
        System.out.println(integer);
    }
}
