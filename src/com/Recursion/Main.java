package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	You have n dice and each die has k faces numbered from 1 to k.
    Given three integers n, k, and target, return the number of possible
    ways (out of the kn total ways) to roll the dice so the sum of the face-up
    numbers equals target. Since the answer may be too large, return it modulo 109 + 7.
    Example 1:
    Input: n = 1, k = 6, target = 3
    Output: 1
    Explanation: You throw one die with 6 faces.
    There is only one way to get a sum of 3.
    Example 2:
    Input: n = 2, k = 6, target = 7
    Output: 6
    Explanation: You throw two dice, each with 6 faces.
    There are 6 ways to get a sum of 7: 1+6, 2+5, 3+4, 4+3, 5+2, 6+1.
    Example 3:
    Input: n = 30, k = 30, target = 500
    Output: 222616187
    Explanation: The answer must be returned modulo 109 + 7
	 */
        diceRoll("", 3);
        ArrayList<String> list = diceRollList("",3);
        System.out.println(list);
    }

    public static void diceRoll(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            diceRoll(p + i, target - i);
        }
    }
// in this the iteration will be till target because if the sum is  then why will we take 5 and 6.
// and if the target will become zero will return the first answer.


    // Now returning the answer in an arraylist.
    public static ArrayList<String> diceRollList(String p,int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            ans.addAll(diceRollList(p+i,target-i));
        }
        return ans;
    }


}