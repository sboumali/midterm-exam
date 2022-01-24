package algorithm;

import java.util.*;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 0; i < array.length; i++) {
            int j = i - 1; //-1
            int point = array[i]; //34
            while (j >= 0 && array[j] > point) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = point;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < (array.length - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if (list.length <= 1) {
            return list;
        }
        int midPoint = array.length / 2;
        int[] left = new int[midPoint];
        int[] right;
        if (array.length % 2 == 0) {
            right = new int[midPoint];
        } else {
            right = new int[midPoint + 1];
        }
        for (int i = 0; i < midPoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < left.length; j++) {
            right[j] = array[midPoint + j];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        list = merge(left, right);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static int[] merge(int[] right, int[] left) {
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer] = right[rightPointer++];
            }
        }
        return result;
    }


    public int[] quickSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        quickSort(array, 0, array.length - 1);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    // Add helper methods for quick sort
    private void quickSort(int[] array, int low, int high) {
        if (low < high + 1) {
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temps = array[index1];
        array[index1] = array[index2];
        array[index2] = temps;
    }

    private int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    private int partition(int[] array, int low, int high) {
        swap(array, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (array[i] < array[low]) {
                swap(array, i, border++);
            }
        }
        swap(array, low, border - 1);
        return border - 1;
    }


    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            minHeap.add(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = minHeap.poll();
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

    }

    public int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        List<Integer>[] buckets = new List[array.length];

        for (int i = 0; i < array.length; i++) {
            buckets[i] = new LinkedList<>();
        }
        for (int num : array) {
            buckets[hash(num)].add(num);
        }
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        int i = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                array[i++] = num;
            }
        }
        return list;
    }

    private static int hash(int num) {
        return num / 10;
    }


    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int temp, index, flag = 1;
        int d = array.length;
        while (flag == 1 || (d > 1)) {
            flag = 0;
            d = (d + 1) / 2;
            for (index = 0; index < array.length - d; index++) {
                if (array[index + d] < array[index]) {
                    temp = array[index + d];
                    array[index + d] = array[index];
                    array[index] = temp;
                    flag = 1;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}