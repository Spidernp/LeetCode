package leet;

import java.util.*;

public class SumClosest
{
    public List<List<Integer>> Sum(int[] nums) {

            Arrays.sort(nums);
            int target = 0;
            List<List<Integer>> ans = new ArrayList<>();
            Set<List<Integer>> set = new HashSet<>();

            for(int i=0; i<nums.length; i++) {
                int j = i+1;
                int k = nums.length-1;

                while(j<k) {
                    int sum = nums[i]+nums[j]+nums[k];

                    System.out.println("["+i+","+j+","+k+"]");
                    System.out.println(nums[i]+"+"+nums[j]+"+"+nums[k]+"="+sum);

                    if(sum == target) {
                        System.out.println("["+i+","+j+","+k+"]");

                        System.out.println(nums[i]+"+"+nums[j]+"+"+nums[k]+"="+sum);

                        set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                    }
                    else if(sum < target) {
                        System.out.println("j++" + j);
                        j++;
                    }
                    else{
                        System.out.println("k--   =" + k);
                        k--;
                    }

                }
            }
            ans.addAll(set);
            return ans;


        }

    public static void main(String[] args) {
        SumClosest t1=new SumClosest();
        System.out.println(t1.Sum(new int[]{1,-2,3,1,5,6}));
    }
}
