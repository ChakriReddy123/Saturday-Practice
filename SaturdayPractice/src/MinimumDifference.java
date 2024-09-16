import java.util.Arrays;

class MinimumDifference{

    int getMinDiff(int[] a, int n, int k) {
        Arrays.sort(a);
        int max = 0, min = 0;
        int ans = a[n-1] - a[0];
        int lar = a[n-1] - k, sml = a[0] + k;
        for (int i = 0; i < n - 1; i++) {
            min = Math.min(sml, a[i + 1] - k);
            max = Math.max(lar, a[i] + k);
            if (min < 0) continue;
            ans = Math.min(ans, max - min);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        MinimumDifference md = new MinimumDifference();
        
        int heights[] = {1,5,8,10};
        int k = 2;
        int result = md.getMinDiff(heights, heights.length, k);
        System.out.println("The minimized height difference is: " + result);
    }
}
