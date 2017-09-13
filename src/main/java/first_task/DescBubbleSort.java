package first_task;

/**
 * @author Pavel Putrenkov
 * @version 1.0
 * @since 2017-09-13
 */
public class DescBubbleSort {


    protected static void bubbleSortDescending(int[] intArray) {

        int last = intArray.length;
        for (boolean ifSorted = (last == 0); !ifSorted; --last) {
            ifSorted = true;
            for (int i = 1; i < last; ++i) {
                if (intArray[i - 1] < intArray[i]) {
                    ifSorted = false;
                    swapArrElement(intArray, i);
                }
            }
        }
    }


    private static void swapArrElement(int[] intArray, int i) {
        int tmp = intArray[i - 1];
        intArray[i - 1] = intArray[i];
        intArray[i] = tmp;
    }


}
