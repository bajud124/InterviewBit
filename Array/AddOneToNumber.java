package Array;
import java.util.ArrayList;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 0;
        int temp = A.get(A.size() - 1) + 1;
        int index = A.size() - 1;
        if (temp > 9) {
            carry = 1;
            while (carry == 1 && index >= 0) {
                carry = A.get(index) + carry > 9 ? 1 : 0;
                A.set(index, A.get(index) + carry > 9 ? 0 : A.get(index) + 1);
                index--;
            }
        } else {
            A.set(A.size() - 1, temp);
        }
        if (carry == 1) {
            A.add(0, 1);
        }
        while (A.get(0) == 0) {
            A.remove(0);
        }
        return A;
    }
}
