package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by sz048 on 2017/12/20.
 */

public class TwoSum
{
    public static int[] twoSum (int[] numbers, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int complement = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            complement = target - numbers[i];

            if (null != map.get(complement))
                return new int[]{map.get(complement), i};

            map.put(numbers[i], i);
        }

        throw new IllegalArgumentException("Not found target numbers.");

    }



    public static void main (String[] args)
    {
        int target = 11;

        int[] input = {5, 1, 2, 9, 4, 8, 6, 7};

        int[] ret = twoSum(input, target);

        System.out.print("Index: " + ret[0] + " " + ret[1]);

        return;
    }
}