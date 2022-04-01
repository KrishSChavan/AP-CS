package sorting;

class QuickSort{
    public int partition(int[] a, int left, int right) {
        int pivot = a[left];
        while(left<=right) {
            while(a[left] < pivot)
                left++;
            while(a[right] > pivot)
                right--;
            if(left<=right) {
                int tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }
    
    
    public void recursiveQuickSort(int[] a, int i, int j) {
       int idx = partition(a, i, j);
       if(i < idx-1) {
           recursiveQuickSort(a, i, idx-1);
        }
       if(j > idx) {
           recursiveQuickSort(a, idx, j);
        }
    }

}
