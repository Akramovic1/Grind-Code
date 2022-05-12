public class SquaresOfASortedArray_Easy {
    public int[] sortedSquares(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[arr.length];
        for(int i = result.length - 1; i >= 0; i--){
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if(leftSquare <= rightSquare){
                result[i] = rightSquare;
                right--;
            }else{
                result[i] = leftSquare;
                left++;
            }
        }
        return result;
    }
}
