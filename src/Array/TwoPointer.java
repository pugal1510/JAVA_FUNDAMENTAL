package Array;

public class TwoPointer {
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 4, 7, 8, 11, 12};
        int target = 9;
        int left = 0;
        int right = num.length - 1;

        while (left < right) {
            int sum = num[left] + num[right];

            if (sum == target) {
                System.out.println("pair found"+" "+num[left] + "+"
                        + num[right]);
                break ;
            }

            else if (sum > target) {
                right--;
            } else {
                left++;
            }

        }
    }

}
