package sort;

public class InsertionSort {

    public static void main(String[] args) {
//                      key
        int nums[] = {4, 1, 2, 5, 3, 12, 23, 10, 7};

        int size = nums.length;
        int temp = 0;
        int minIndex = -1;
        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }


        for (int i = 1; i < size; i++) {

            int key = nums[i];
            int j=i-1;

            while (j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
            System.out.println();
            for (int num : nums) {

                System.out.print(num + " ");
            }
        }


        System.out.println();

        System.out.println("After sorting:");
        for (int num : nums) {

            System.out.print(num + " ");
        }

    }

}
