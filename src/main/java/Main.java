public class Main {

    public static void main(String[] args) {
        int[] arr = {2,1};
        swap(arr,0,1);
    }

    static void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

}
