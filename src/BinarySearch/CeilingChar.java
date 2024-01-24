package BinarySearch;

public class CeilingChar {

    public static void main(String[] args) {

        char[] arr = {'a', 'c', 'f', 'y'};
        System.out.println(getCeilingChar(arr, 'b')) ;
    }

    static char getCeilingChar(char[] arr, char target) {

        int start = 0;
        int end = arr.length-1;
        while(start <= end) {

            int mid = start + (end -start)/2;
            char midElement = arr[mid];
            if (target<midElement) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
