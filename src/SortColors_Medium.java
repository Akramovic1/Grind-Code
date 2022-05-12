public class SortColors_Medium {
    public void sortColors(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int i = 0;
        while(i <= right && i < arr.length){
            if(arr[i] == 0)
                swap(arr, i++, left++);
            else if(arr[i] == 2)
                swap(arr, i, right--);
            else
                i++;
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
