import java.util.ArrayList;

import DSStack.TrapingrainWater;
import StackInterviewBit.RedundantBraces;
import StackInterviewBit.SimplifyDirectoryPath;
import StackInterviewBit.SlidingWindowMaximum;

class Hello {
    public static void main(String arges[]) {
        int[] arr = { 3, 1, 2, 1, 3, 1, 2, 2, 1, 1, 2, 3, 3, 1, 3, 3, 3, 2, 3, 3, 1, 1, 1, 3, 3, 1, 3, 1, 3, 3, 1, 1, 3, 2, 2, 3, 1, 2, 1, 3, 3, 3, 2, 1, 1, 2, 1 };
        ArrayList<Integer> array_list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++)
            array_list.add((arr[i]));
        int[] arrB = {4,2,0,3,2,5 };
        ArrayList<Integer> array_listB = new ArrayList<Integer>();
        for (int i = 0; i < arrB.length; i++)
            array_listB.add((arrB[i]));
        TrapingrainWater t = new TrapingrainWater();
        SlidingWindowMaximum s = new SlidingWindowMaximum();
        SimplifyDirectoryPath d = new SimplifyDirectoryPath();
        RedundantBraces r = new RedundantBraces();
        System.out.println(r.braces("(a/b)+(b*d)+(a*a)+a"));
    }
}