import java.util.Arrays;

public class MergeSortExample {
    // Merge Sort Function (முக்கிய Sorting Function)
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {  // Base Condition (1 element இருந்தால் Stop செய்யும்)
            int mid = left + (right - left) / 2; // மைய இடத்தை கண்டுபிடிக்கிறது

            mergeSort(arr, left, mid);  // Left Side-ஐ Sort செய்கிறது
            mergeSort(arr, mid + 1, right); // Right Side-ஐ Sort செய்கிறது
            merge(arr, left, mid, right); // Merge செய்து Final Sorting
        }
    }

    // Merge Function (இரண்டு Sorted Arrays-ஐ ஒன்று சேர்க்கும்)
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];  // Left Side Array
        int[] rightArr = new int[n2]; // Right Side Array

        // Left Array Data Copy
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];

        // Right Array Data Copy
        for (int i = 0; i < n2; i++)
            rightArr[i] = arr[mid + 1 + i];

        // Merge செய்யும் Logic
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Left Array-ல் மீதமுள்ள எண்கள் copy செய்கிறது
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Right Array-ல் மீதமுள்ள எண்கள் copy செய்கிறது
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 4};

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Merge Sort Output: " + Arrays.toString(numbers));
    }
}
