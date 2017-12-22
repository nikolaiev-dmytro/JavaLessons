package lesson4;

import java.util.Arrays;
import java.util.Random;

public class Lesson4 {
    Random r = new Random();

    public void main() {
  /*      int[] arr1 = new int[10];
        arr1=createArray(arr1);
*/
        /*System.out.println("Random=" + getRnd(arr1));
        int[] arr2 = new int[11];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[10] = 4;
        getArr(arr2);*/
/*        System.out.println("ARR1");
        getArr(arr1);*/
        /*int[] arr2 = new int[15];
        copy(arr1,arr2);
        System.out.println("ARR2");
        getArr(arr2);*/

        int[] arr1=new int[100_000];
        int[] arr2=new int[100_000];
        int[] arr3=new int[100_000];
        int[] arr4=new int[100_000];
        int[] arr5=new int[100_000];
        int[] arr6=new int[100_000];
        int[] arr7=new int[100_000];
        arr1=createArray(arr1);
        copy(arr1,arr2);
        copy(arr1,arr3);
        copy(arr1,arr6);
        copy(arr1,arr7);
        arr4 = Arrays.copyOf(arr1,arr1.length);
        arr5 = Arrays.copyOf(arr1,arr1.length);

        long a=System.currentTimeMillis();
        bubbleSort(arr1);
        long b= System.currentTimeMillis();
        System.out.println("Sort time(Bubble)="+(b-a));
        a=System.currentTimeMillis();
        shakerSort(arr2);
        b= System.currentTimeMillis();
        System.out.println("Sort time(Shaker)="+(b-a));
        a=System.currentTimeMillis();
        selectSort(arr3);
        b= System.currentTimeMillis();
        System.out.println("Sort time(Selection)="+(b-a));

        a=System.currentTimeMillis();
        Arrays.sort(arr4);
        b= System.currentTimeMillis();
        System.out.println("Sort time(Arrays sort method)="+(b-a));
        a=System.currentTimeMillis();
        Arrays.parallelSort(arr5);
        b= System.currentTimeMillis();
        System.out.println("Sort time(Arrays parallel sort method)="+(b-a));

        a=System.currentTimeMillis();
        mergeSort(arr6);
        b= System.currentTimeMillis();
        System.out.println("Sort time(Merge sort method)="+(b-a));

        a=System.currentTimeMillis();
        heapSort(arr7);
        b= System.currentTimeMillis();
        System.out.println("Sort time(Heap sort method)="+(b-a));
    }

    private void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }

    private int getRndElement(int[] arr) {

        return arr[r.nextInt(arr.length-1)];
    }
    private void copy(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
    private int[] createArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1000000);
        }
        return arr;
    }
    private void bubbleSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >i; j--) {
                if (arr[j-1]>arr[j]) {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    private void shakerSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            for (int j = i; j < arr.length-i-1; j++) {
                if (arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for (int j = arr.length-2-i; j >i ; j--) {
                if (arr[j]>arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    private void selectSort(int[] arr){
        int min,imin,temp;
        for (int i = 0; i < arr.length; i++) {
            min=arr[i];
            imin=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<min){
                    min=arr[j];
                    imin=j;
                }
            }
            if (i!=imin){
                temp=arr[i];
                arr[i]=arr[imin];
                arr[imin]=temp;
            }
        }
    }
    private  int heapSize;

    /**
     * Сортировка с помощью кучи.
     * Сначала формируется куча:
     * Теперь максимальный элемент массива находится в корне кучи. Его нужно
     * поменять местами с последним элементом и убрать из кучи (уменьшить
     * размер кучи на 1). Теперь в корне кучи находится элемент, который раньше
     * был последним в массиве. Нужно переупорядочить кучу так, чтобы
     * выполнялось основное условие кучи - a[parent]>=a[child]:
     * @see #heapify(int[], int)
     * После этого в корне окажется максимальный из оставшихся элементов.
     * Повторить до тех пор, пока в куче не останется 1 элемент
     *
     * @param a сортируемый массив
     */
    public  void heapSort(int[] a) {
        buildHeap(a);
        while (heapSize > 1) {
            swap(a, 0, heapSize - 1);
            heapSize--;
            heapify(a, 0);
        }
    }

    /**
     * Построение кучи. Поскольку элементы с номерами начиная с a.length / 2 + 1
     * это листья, то нужно переупорядочить поддеревья с корнями в индексах
     * от 0 до a.length / 2 (метод heapify вызывать в порядке убывания индексов)
     *
     * @param a - массив, из которого формируется куча
     */
    private  void buildHeap(int[] a) {
        heapSize = a.length;
        for (int i = a.length / 2; i >= 0; i--) {
            heapify(a, i);
        }
    }

    /**
     * Переупорядочивает поддерево кучи начиная с узла i так, чтобы выполнялось
     * основное свойство кучи - a[parent] >= a[child].
     *
     * @param a - массив, из которого сформирована куча
     * @param i - корень поддерева, для которого происходит переупорядосивание
     */
    private  void heapify(int[] a, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heapSize && a[i] < a[l]) {
            largest = l;
        }
        if (r < heapSize && a[largest] < a[r]) {
            largest = r;
        }
        if (i != largest) {
            swap(a, i, largest);
            heapify(a, largest);
        }
    }

    /**
     * Возвращает индекс правого потомка текущего узла
     *
     * @param i индекс текущего узла кучи
     * @return индекс правого потомка
     */
    private  int right(int i) {
        return 2 * i + 1;
    }

    /**
     * Возвращает индекс левого потомка текущего узла
     *
     * @param i индекс текущего узла кучи
     * @return индекс левого потомка
     */
    private  int left(int i) {
        return 2 * i + 2;
    }

    /**
     * Меняет местами два элемента в массиве
     *
     * @param a массив
     * @param i индекс первого элемента
     * @param j индекс второго элемента
     */
    private  void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }



    private  int[] mergeSort(int[] arr) {
        if (arr.length < 2) return arr;
        int m = arr.length / 2;
        int[] arr1 = Arrays.copyOfRange(arr, 0, m);
        int[] arr2 = Arrays.copyOfRange(arr, m, arr.length);
        return merge(mergeSort(arr1), mergeSort(arr2));
    }

    //слияние двух массивов в один отсортированный
    private  int[] merge(int[] arr1, int arr2[]) {
        int n = arr1.length + arr2.length;
        int[] arr = new int[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {
                arr[i] = arr2[i2++];
            } else if (i2 == arr2.length) {
                arr[i] = arr1[i1++];
            } else {
                if (arr1[i1] < arr2[i2]) {
                    arr[i] = arr1[i1++];
                } else {
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }


}
