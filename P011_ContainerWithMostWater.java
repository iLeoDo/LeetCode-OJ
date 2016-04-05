
public class P011_ContainerWithMostWater{
    public int maxArea(int[] height) {
        int left = 0；
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right])*(right-left));
            if (height[left] < height[right])  left++;
            else  right--;
        }

        return maxArea;
    }
}
