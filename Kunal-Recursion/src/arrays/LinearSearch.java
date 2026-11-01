package arrays;

public class LinearSearch {
    public static int linear(int[] arr, int index, int target) {
        // Base case: if the index reaches the end of the array, the target isn't found
        if (index == arr.length) {
            return -1;
        }

        // Base case: if the target is found at the current index
        if (arr[index] == target) {
            return index;
        }

        // Recursive call to check the next index
        return linear(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 9, 1};
        int ans = linear(arr, 0, 9);
        System.out.println(ans);
    }
}