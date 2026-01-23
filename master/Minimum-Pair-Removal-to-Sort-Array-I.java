import java.util.ArrayList;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        int ops = 0;

        while (!isNonDecreasing(list)) {
            int minSum = Integer.MAX_VALUE;
            int idx = 0;

            // find leftmost minimum sum pair
            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            // replace pair with their sum
            list.remove(idx + 1);
            list.set(idx, minSum);
            ops++;
        }

        return ops;
    }

    private boolean isNonDecreasing(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
