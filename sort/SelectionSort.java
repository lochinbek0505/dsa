package sort;

class SelectionSort {


    public static void main(String[] args) {

        int nums[] = {1, 4, 2, 5, 3, 12, 23, 10, 7};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;
        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        //birinchi for bilan hamma array qismlari aylanib chiqyabdi
        for (int i = 0; i < size - 1; i++) {
            //i index minIndex sifatida qaralyabdi
            minIndex = i;
            //i+1 indexdan boshlab har bir index ga qarab chiqyabdi minIndexni topish uchun
            for (int j = i + 1; j < size; j++) {
                //          har safar j dan bitta oldingi index ni minIndex bilan solishtiryabdi va agar minIndex dan kichik bo'lsa joyini almashtiryabdi
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
                //TEMP ga min indexni saqlayabdi
                temp = nums[minIndex];
                //min index joyiga yangi o'zgaruvchini beryabdi
                nums[minIndex] = nums[i];
                //oxirida min indexga
                nums[i] = temp;
            }

        }


        System.out.println();

        System.out.println("After sorting:");
        for (int num : nums) {

            System.out.print(num + " ");
        }

    }


}