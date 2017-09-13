package first_task;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * @version 1.0
 * @autor Putrenkov Pavlo.
 * @since 2017-09-13
 */
@Log4j2
public class Main {

    private static final double timeNum = 600000000.0;

    private static int size = 20_000;

    private static Random r = new Random();

    private static int[] intArray2 = IntStream.generate(r::nextInt).limit(size).toArray();

    private static int[] intArray = new int[]{35, 67, 88, 99, 445, 644, 53, 1, 2, 5, 3, 6, 7};

    public static void main(String[] args) {


        log.info("Random array " + Arrays.stream(intArray).boxed().collect(Collectors.toList()));

        long timeStart = System.nanoTime();

        DescBubbleSort.bubbleSortDescending(intArray);

//        bubbleSortDescending(intArray2);

        long timeEnd = System.nanoTime();

        log.info("Took " + (timeEnd - timeStart) / timeNum + " s");

        log.info("Descending sort array" + " " + Arrays.stream(intArray).boxed().collect(Collectors.toList()));
    }


}
