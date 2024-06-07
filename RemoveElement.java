package leet;

public class RemoveElement
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int element=2;

        int n=removeElement(arr,element);

    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                System.out.println(nums[i]);
                i++;
            }
        }
        return i;
    }
}
