class MergeSOrt {

    void merge(char a[], int start, int mid, int end) {

        int i, j, k;
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        for (i = 0; i < n1; i++)
            LeftArray[i] = a[start + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        i = 0;
        j = 0;
        k = start;

        while (i < n1 && j < n2) {

            if (LeftArray[i] <= RightArray[j]) {
                a[k] = (char) LeftArray[i];
                i++;
            } else {
                a[k] = (char) RightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = (char) LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = (char) RightArray[j];
            j++;
            k++;
        }
    }

    void mergeSort(char a[], int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    void printArray(char a[], int n) {

        int i;
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

public class mergecharcter {

    public static void main(String[] args) {
        char[] array = { 'a', 'x', 'y', 'b', 'A', 'T', 't' };
        int leng = array.length;
        MergeSOrt m1 = new MergeSOrt();
        System.out.println("\nBefore sorting  - ");
        m1.printArray(array, leng);
        m1.mergeSort(array, 0, leng - 1);
        System.out.println("\nAfter sorting  - ");
        m1.printArray(array, leng);
        System.out.println("");

    }

}