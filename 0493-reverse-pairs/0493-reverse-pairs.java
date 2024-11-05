import java.util.*;   
class Solution {
        public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public int countpairs(int []nums,int low,int mid,int high)
    {
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && nums[i]> 2L *nums[right])
            {
                right++;
            }
            count+=(right-(mid+1));
        }
        return count;
    }
    public int mergesort(int [] nums,int low,int high)
    {
          int count=0;
          if(low>=high) return 0;
          int mid=(low+high)/2;
          count+=mergesort(nums,low,mid);
          count+=mergesort(nums,mid+1,high);
          count+=countpairs(nums,low,mid,high);
          merge(nums,low,mid,high);
           return count;
    }
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
}