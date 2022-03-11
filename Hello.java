import java.util.ArrayList;

import StackInterviewBit.EvaluateExpression;

class Hello {
    public static void main(String arges[]) {
        int[] arr = { 3, 1, 2, 1, 3, 1, 2, 2, 1, 1, 2, 3, 3, 1, 3, 3, 3, 2, 3, 3, 1, 1, 1, 3, 3, 1, 3, 1, 3, 3, 1, 1, 3, 2, 2, 3, 1, 2, 1, 3, 3, 3, 2, 1, 1, 2, 1 };
        ArrayList<Integer> array_list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++)
            array_list.add((arr[i]));
        ArrayList<String> array_listB = new ArrayList<String>();
        // for (int i = 0; i < arrB.length; i++)
        //     array_listB.add((arrB[i]));
        String[] str = { "5", "1", "2", "+", "4", "*", "+", "3", "-" };
        for (int i = 0; i < str.length; i++)
            array_listB.add((str[i]));
        EvaluateExpression e = new EvaluateExpression();
        System.out.println(e.evalRPN(array_listB));
    }
}