/**
 * Created by Shadowera on 2016/3/22.
 */
public class BinarySearch {
    public static void main(String[] args){
        int[] a=new int[]{1,2,5,7,8,11,30};
        System.out.println(rank(a,9));
    }
    public static int rank(int[] a, int key) {
        int high = a.length - 1;
        int low = 0;
        int mid = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
