package Array;

public class Twopointers {
    public static void main(String[] args) {
        int[] a = {5, 2, 3, 4, 6};//l
        int[] b = {6, 1, 0, 99};//r
        int[] arr1 = new int[a.length];
        int[] arr2 = new int[b.length];
        int[] num ;

        int left = 0;
        int right = 0;

        while (a[left]<b[right] || a[left]>b[right]) {
            if(a[left]<b[right]) {
                num = new int[]{
                        a[left]
                };
                System.out.println(num.length);
//                lengtright++;
            } else{
                int num1=b[right];
                System.out.println(num1);
//                left++;

            }
        }
//        while (a[left] < b[right]) {
//            num = new int[a[left]];
//            System.out.println(num.length);
//            left++;
//        }


    }
}

