/*
    Find the kth largest element in an unsorted array. Note that it is the kth
    largest element in the sorted order, not the kth distinct element.

    For example,
    Given [3,2,1,5,6,4] and k = 2, return 5.

    Note:
    You may assume k is always valid, 1 ≤ k ≤ array's length.

    @tags: Divide and Conquer, Heap
 */
public class P215_KthLargestElementInAnArray{
    public int findKthLargest(int[] nums, int k) {
        int index = quickSelect(nums,0,nums.length-1,nums.length-k);
        return nums[index];
    }

    private void swap(int[] nums,int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    private int quickSelect(int[] nums,int low,int high,int k){

        int i = low, j = high, pivot = nums[high];
        while(i<j){
            if(nums[i] > pivot){
                j--;
                swap(nums,i,j);
            }else{
                i++;
            }
        }
        swap(nums,i,high);

        // pivot
        if(i == k) return i;
        // target is on the left side of pivot;
        else if(i > k) return quickSelect(nums,low,i-1,k);
        // target is on the right side of pivot;
        else return quickSelect(nums,i+1,high,k);

    }
}
