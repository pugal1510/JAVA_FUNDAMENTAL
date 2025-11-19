package Array;
//sorted and need to check the how many unique constrains
public class Sorted {
    public static void main(String[] args) {
        int[] num = {0,0,1,1,1,2,2,3,3,4};
        int n = num.length;
        int i = 0;//left


        for (int j = 1; j < n; j++) {
            if(num[i]!=num[j])
            {
                i++;
                num[i]=num[j];

            }

        }
        System.out.println (i+1);



    }
}
