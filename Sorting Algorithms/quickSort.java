public class quickSort {

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1);
        quickSort(arr, pidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int j = si - 1;
        for (int i = si; i < ei; i++) {
            if (arr[i] < pivot) {
                int temp = arr[++j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        arr[ei] = arr[++j];
        arr[j] = pivot;
        return j;
    }

    public static void main(String[] args) {
	    int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        quickSort(arr, 0, n-1);
    }
}
