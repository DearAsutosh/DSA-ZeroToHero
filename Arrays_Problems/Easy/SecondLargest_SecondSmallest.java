package Arrays_Problems.Easy;

public class SecondLargest_SecondSmallest {
    public static int secondMaxSolution(int[] arr) {
        if (arr.length < 2) return -1;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secMax = max;
                max = num;
            } else if (num > secMax && num != max) {
                secMax = num;
            }
        }
        return secMax;
    }

    public static int secondMinSolution(int[] arr) {
        if (arr.length < 2) return -1;
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for (int i : arr) {
            if (min > i) {
                secMin = min;
                min = i;
            } else if (i < secMin && i != min) {
                secMin = i;
            }
        }
        return secMin;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 12, 1, 32, 11 };
        System.out.println("Second Largest Element :" + secondMaxSolution(arr));
        System.out.println("Second Smallest Element :" + secondMinSolution(arr));
    }

}
