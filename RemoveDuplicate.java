package leet;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {


        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;

        n = removeDuplicate(arr, n);
        System.out.println(n);
        // Print updated array
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
    }
    public static int removeDuplicate(int[] num, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (num[i] != num[i + 1]) {
                temp[j++] = num[i];
            }
        }
        temp[j++] = num[n - 1];

        for (int i = 0; i < j; i++)
            num[i] = temp[i];

        return j;

    }



}
