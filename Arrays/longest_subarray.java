import java.util.HashMap;

public class longest_subarray {

    public static int longest(int[] arr, int k) {
        // Map stores <PrefixSum, FirstOccurrenceIndex>
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // Case 1: The entire subarray from index 0 to i equals k
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: Check if (sum - k) exists in the map
            int rem = sum - k;
            if (mpp.containsKey(rem)) {
                int len = i - mpp.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Case 3: Only add sum to map if it's NOT already there
            // This ensures we keep the leftmost index for the longest possible length
            if (!mpp.containsKey(sum)) {
                mpp.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3; 

        System.out.println("Longest subarray length: " + longest(arr, k));
    }
}