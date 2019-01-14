import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr) {
        int last = -1;
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i : arr) {
            if (last != i) {
                arrayList.add(i);
                last = i;
            }
        }

        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}