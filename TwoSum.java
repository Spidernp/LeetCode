package leet;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{

        public int[] twoSum(int[] nums, int target)
        {
            Map<Integer,Integer> hm=new HashMap<>();
            for (int i=0;i<nums.length;i++) {

                int temp = target - nums[i];
                if (hm.containsKey(temp))
                {
                    return new int[]{ hm.get(temp), i };
                }
                hm.put(nums[i], i);
            }
            return new int[0];


        }

    public static void main(String[] args) {
        TwoSum t1=new TwoSum();
        int[] result=t1.twoSum(new int[]{1,2,3,4,5},6);
//        System.out.println(Arrays.toString(result));


        int age = 31;
        assert age == 18 : "Not valid";
        System.out.println("Age is " + age);
        }

}

