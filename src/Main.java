import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 5, 9, 2, 4, 8, 7, 6,12,5,7,1);
        System.out.println(findLeaders(arr));
    }

    public static List<Integer> findLeaders(List<Integer> arr) {
        List<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            Integer potentialLeader = arr.get(i);
            boolean isLeader = true;
            for (int j = i + 1; j < arr.size(); j++) {
                if (potentialLeader < arr.get(j)) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(potentialLeader);
            }
        }
        return leaders;
    }
}

