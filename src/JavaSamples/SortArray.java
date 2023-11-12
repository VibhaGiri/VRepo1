package JavaSamples;

public class SortArray
{
    public static void main(String[] args)
    {
        //int a=10;
        int[] array={20,60,14,2,35,12,99};
        sortarray(array);
    }

    static void sortarray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int m = array[i];
                    array[i] = array[j];
                    array[j] = m;
                }

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
