import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilityTest {

    private int[] arrayOne;
    private int[] arrayTwo;
    private int[] arrayThree;

    private String[] arrayFour;

    @BeforeEach
    void setUp() {
        arrayOne = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayTwo = new int[]{12, 13, 3, 21, 18, 35, 20, 8, 15, 16};
        arrayThree = new int[]{12,14,9};
        arrayFour = new String[]{"What", "IS", " the", "secret", "sauCE", "?"};
    }

    @AfterEach
    void tearDown() {
        arrayOne = null;
        arrayTwo = null;
        arrayThree = null;
        arrayFour = null;
    }

    @org.junit.jupiter.api.Test
    void print() {
        System.out.print("Array One: ");
        ArrayUtility.print(arrayOne);
        System.out.print("Array Two: ");
        ArrayUtility.print(arrayTwo);
        System.out.print("Array Three: ");
        ArrayUtility.print(arrayThree);
    }

    @org.junit.jupiter.api.Test
    void sum() {
        int sumOne = ArrayUtility.sum(arrayOne);
        int sumTwo = ArrayUtility.sum(arrayTwo);
        int sumThree = ArrayUtility.sum(arrayThree);
        assertEquals(55, sumOne);
        assertEquals(161, sumTwo);
        assertEquals(35, sumThree);
    }

    @org.junit.jupiter.api.Test
    void average() {
        double averageOne = ArrayUtility.average(arrayOne);
        double averageTwo = ArrayUtility.average(arrayTwo);
        double averageThree = ArrayUtility.average(arrayThree);

        assertEquals(5.5, averageOne);
        assertEquals(16.1, averageTwo);
        assertEquals(11.66, averageThree);

        System.out.println(averageOne);
        System.out.println(averageTwo);
        System.out.println(averageThree);

    }

    @org.junit.jupiter.api.Test
    void minimum() {

        int minOne = ArrayUtility.minimum(arrayOne);
        int minTwo = ArrayUtility.minimum(arrayTwo);
        int minThree = ArrayUtility.minimum(arrayThree);

        assertEquals(1, minOne);
        assertEquals(3, minTwo);
        assertEquals(9, minThree);

        System.out.println(minOne);
        System.out.println(minTwo);
        System.out.println(minThree);

    }

    @org.junit.jupiter.api.Test
    void maximum() {

        int maxOne = ArrayUtility.maximum(arrayOne);
        int maxTwo = ArrayUtility.maximum(arrayTwo);
        int maxThree = ArrayUtility.maximum(arrayThree);

        assertEquals(10, maxOne);
        assertEquals(35, maxTwo);
        assertEquals(14, maxThree);

        System.out.println(maxOne);
        System.out.println(maxTwo);
        System.out.println(maxThree);
    }

    @org.junit.jupiter.api.Test
    void evenCount() {

        int evenCountOne = ArrayUtility.evenCount(arrayOne);
        int evenCountTwo = ArrayUtility.evenCount(arrayTwo);
        int evenCountThree = ArrayUtility.evenCount(arrayThree);

        assertEquals(5, evenCountOne);
        assertEquals(5, evenCountTwo);
        assertEquals(2, evenCountThree);

        System.out.println(evenCountOne);
        System.out.println(evenCountTwo);
        System.out.println(evenCountThree);
    }

    @org.junit.jupiter.api.Test
    void reverseOne() {

        int[] reversedOne = ArrayUtility.reverseOne(arrayOne);
        int[] reversedTwo = ArrayUtility.reverseOne(arrayTwo);
        int[] reversedThree = ArrayUtility.reverseOne(arrayThree);

        System.out.print("Array One: ");
        ArrayUtility.print(arrayOne);
        System.out.print("Array One Reversed: ");
        ArrayUtility.print(reversedOne);
        System.out.println();
        System.out.print("Array Two: ");
        ArrayUtility.print(arrayTwo);
        System.out.print("Array Two Reversed: ");
        ArrayUtility.print(reversedTwo);
        System.out.println();
        System.out.print("Array Three: ");
        ArrayUtility.print(arrayThree);
        System.out.print("Array Three Reversed: ");
        ArrayUtility.print(reversedThree);

        assertEquals(10, reversedOne[0]);
        assertEquals(9, reversedOne[1]);
        assertEquals(8, reversedOne[2]);
        assertEquals(7, reversedOne[3]);
        assertEquals(6, reversedOne[4]);
        assertEquals(5, reversedOne[5]);
        assertEquals(4, reversedOne[6]);
        assertEquals(3, reversedOne[7]);
        assertEquals(2, reversedOne[8]);
        assertEquals(1, reversedOne[9]);

        assertEquals(16, reversedTwo[0]);
        assertEquals(15, reversedTwo[1]);
        assertEquals(8, reversedTwo[2]);



    }

    @org.junit.jupiter.api.Test
    void reverseTwo() {

        System.out.print("Array One: ");
        ArrayUtility.print(arrayOne);
        System.out.print("Array One Reversed: ");
        ArrayUtility.reverseTwo(arrayOne);
        ArrayUtility.print(arrayOne);

        System.out.println();

        System.out.print("Array Two: ");
        ArrayUtility.print(arrayTwo);
        System.out.print("Array Two Reversed: ");
        ArrayUtility.reverseTwo(arrayTwo);
        ArrayUtility.print(arrayTwo);

        System.out.println();

        System.out.print("Array Three: ");
        ArrayUtility.print(arrayThree);
        System.out.print("Array Three Reversed: ");
        ArrayUtility.reverseTwo(arrayThree);
        ArrayUtility.print(arrayThree);

        assertEquals(10, arrayOne[0]);
        assertEquals(9, arrayOne[1]);
        assertEquals(8, arrayOne[2]);
        assertEquals(7, arrayOne[3]);
        assertEquals(6, arrayOne[4]);
        assertEquals(5, arrayOne[5]);
        assertEquals(4, arrayOne[6]);
        assertEquals(3, arrayOne[7]);
        assertEquals(2, arrayOne[8]);
        assertEquals(1, arrayOne[9]);

        assertEquals(16, arrayTwo[0]);
        assertEquals(15, arrayTwo[1]);
        assertEquals(8, arrayTwo[2]);

    }

    @org.junit.jupiter.api.Test
    void linearSearchInt() {

        assertFalse(ArrayUtility.linearSearchInt(arrayOne,14));
        assertFalse(ArrayUtility.linearSearchInt(arrayOne, 11));
        assertTrue(ArrayUtility.linearSearchInt(arrayOne, 10));
        assertTrue(ArrayUtility.linearSearchInt(arrayOne, 1));
        assertTrue(ArrayUtility.linearSearchInt(arrayOne, 6));

        assertFalse(ArrayUtility.linearSearchInt(arrayTwo, 11));
        assertFalse(ArrayUtility.linearSearchInt(arrayTwo, 17));
        assertTrue(ArrayUtility.linearSearchInt(arrayTwo, 20));
        assertTrue(ArrayUtility.linearSearchInt(arrayTwo, 12));
        assertTrue(ArrayUtility.linearSearchInt(arrayTwo, 16));

        assertFalse(ArrayUtility.linearSearchInt(arrayThree, 20));
        assertFalse(ArrayUtility.linearSearchInt(arrayThree, 11));
        assertFalse(ArrayUtility.linearSearchInt(arrayThree, 10));
        assertTrue(ArrayUtility.linearSearchInt(arrayThree, 12));
        assertTrue(ArrayUtility.linearSearchInt(arrayThree, 9));
        assertTrue(ArrayUtility.linearSearchInt(arrayThree, 14));

    }

    @org.junit.jupiter.api.Test
    void linearSearchString() {

        assertTrue(ArrayUtility.linearSearchString(arrayFour, "secret"));
        assertTrue(ArrayUtility.linearSearchString(arrayFour, "What"));
        assertFalse(ArrayUtility.linearSearchString(arrayFour, "what"));
        assertFalse(ArrayUtility.linearSearchString(arrayFour,"the"));
        assertTrue(ArrayUtility.linearSearchString(arrayFour," the"));
        assertFalse(ArrayUtility.linearSearchString(arrayFour,"sauce"));
        assertTrue(ArrayUtility.linearSearchString(arrayFour,"sauCE"));
        assertTrue(ArrayUtility.linearSearchString(arrayFour,"?"));

    }

    @org.junit.jupiter.api.Test
    void multiplyByTwo() {
        ArrayUtility.multiplyByTwo(arrayOne);
        ArrayUtility.multiplyByTwo(arrayTwo);
        ArrayUtility.multiplyByTwo(arrayThree);

        assertEquals(2, arrayOne[0]);
        assertEquals(4, arrayOne[1]);
        assertEquals(6, arrayOne[2]);
        assertEquals(8, arrayOne[3]);
        assertEquals(10, arrayOne[4]);
        assertEquals(12, arrayOne[5]);
        assertEquals(14, arrayOne[6]);
        assertEquals(16, arrayOne[7]);
        assertEquals(18, arrayOne[8]);
        assertEquals(20, arrayOne[9]);

        assertEquals(24, arrayTwo[0]);
        assertEquals(26, arrayTwo[1]);
        assertEquals(6, arrayTwo[2]);

    }

    @org.junit.jupiter.api.Test
    void multiplyByN() {

        ArrayUtility.multiplyByN(arrayOne, -1);
        ArrayUtility.multiplyByN(arrayTwo, 3);
        ArrayUtility.multiplyByN(arrayThree, 10);

        assertEquals(-1, arrayOne[0]);
        assertEquals(-2, arrayOne[1]);
        assertEquals(-3, arrayOne[2]);
        assertEquals(-4, arrayOne[3]);
        assertEquals(-5, arrayOne[4]);
        assertEquals(-6, arrayOne[5]);
        assertEquals(-7, arrayOne[6]);
        assertEquals(-8, arrayOne[7]);
        assertEquals(-9, arrayOne[8]);
        assertEquals(-10, arrayOne[9]);

        assertEquals(36, arrayTwo[0]);
        assertEquals(39, arrayTwo[1]);
        assertEquals(9, arrayTwo[2]);

        assertEquals(120, arrayThree[0]);
        assertEquals(140, arrayThree[1]);
        assertEquals(90, arrayThree[2]);
    }

    @org.junit.jupiter.api.Test
    void ToString() {

        String arrayOneString = ArrayUtility.toString(arrayOne);
        String arrayTwoString = ArrayUtility.toString(arrayTwo);
        String arrayThreeString = ArrayUtility.toString(arrayThree);

        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10", arrayOneString);
        assertEquals("12, 13, 3, 21, 18, 35, 20, 8, 15, 16", arrayTwoString);
        assertEquals("12, 14, 9", arrayThreeString);
    }

    @org.junit.jupiter.api.Test
    void twoSum() {

        assertTrue(ArrayUtility.twoSum(arrayOne, 5));
        assertTrue(ArrayUtility.twoSum(arrayOne, 10));
        assertTrue(ArrayUtility.twoSum(arrayOne, 11));

        assertFalse(ArrayUtility.twoSum(arrayOne, 0));
        assertFalse(ArrayUtility.twoSum(arrayOne, 2));
        assertFalse(ArrayUtility.twoSum(arrayOne, -11));
        assertFalse(ArrayUtility.twoSum(arrayOne, 20));

        assertFalse(ArrayUtility.twoSum(arrayTwo, 0));
        assertFalse(ArrayUtility.twoSum(arrayTwo, 49));
        assertFalse(ArrayUtility.twoSum(arrayTwo, 70));
        assertTrue(ArrayUtility.twoSum(arrayTwo, 56));
        assertTrue(ArrayUtility.twoSum(arrayTwo, 36));
    }

    @org.junit.jupiter.api.Test
    void shiftRight() {

        ArrayUtility.shiftRight(arrayOne);
        assertTrue(arrayOne[0] == 10);
        assertTrue(arrayOne[1] == 1);
        assertTrue(arrayOne[arrayOne.length-1] == 9);

        ArrayUtility.shiftRight(arrayOne);
        assertTrue(arrayOne[0] == 9);
        assertTrue(arrayOne[1] == 10);
        assertTrue(arrayOne[arrayOne.length-1] == 8);

        ArrayUtility.shiftRight(arrayOne);
        assertTrue(arrayOne[0] == 8);
        assertTrue(arrayOne[1] == 9);
        assertTrue(arrayOne[arrayOne.length-1] == 7);

        ArrayUtility.shiftRight(arrayOne);
        assertTrue(arrayOne[0] == 7);
        assertTrue(arrayOne[1] == 8);
        assertTrue(arrayOne[arrayOne.length-1] == 6);

        ArrayUtility.shiftRight(arrayOne);
        assertTrue(arrayOne[0] == 6);
        assertTrue(arrayOne[1] == 7);
        assertTrue(arrayOne[arrayOne.length-1] == 5);

        ArrayUtility.shiftRight(arrayOne);
        assertTrue(arrayOne[0] == 5);
        assertTrue(arrayOne[1] == 6);
        assertTrue(arrayOne[arrayOne.length-1] == 4);

        ArrayUtility.shiftRight(arrayOne);
        assertTrue(arrayOne[0] == 4);
        assertTrue(arrayOne[1] == 5);
        assertTrue(arrayOne[arrayOne.length-1] == 3);

        ArrayUtility.shiftRight(arrayOne);
        assertTrue(arrayOne[0] == 3);
        assertTrue(arrayOne[1] == 4);
        assertTrue(arrayOne[arrayOne.length-1] == 2);

        ArrayUtility.shiftRight(arrayOne);
        assertTrue(arrayOne[0] == 2);
        assertTrue(arrayOne[1] == 3);
        assertTrue(arrayOne[arrayOne.length-1] == 1);

        ArrayUtility.shiftRight(arrayOne);
        assertTrue(arrayOne[0] == 1);
        assertTrue(arrayOne[1] == 2);
        assertTrue(arrayOne[arrayOne.length-1] == 10);

        ArrayUtility.shiftRight(arrayOne);
        assertTrue(arrayOne[0] == 10);
        assertTrue(arrayOne[1] == 1);
        assertTrue(arrayOne[arrayOne.length-1] == 9);

    }

    @org.junit.jupiter.api.Test
    void shiftLeft() {

        ArrayUtility.shiftLeft(arrayOne);
        assertTrue(arrayOne[0] == 2);
        assertTrue(arrayOne[1] == 3);
        assertTrue(arrayOne[arrayOne.length-1] == 1);

        ArrayUtility.shiftLeft(arrayOne);
        assertTrue(arrayOne[0] == 3);
        assertTrue(arrayOne[1] == 4);
        assertTrue(arrayOne[arrayOne.length-1] == 2);

        ArrayUtility.shiftLeft(arrayOne);
        assertTrue(arrayOne[0] == 4);
        assertTrue(arrayOne[1] == 5);
        assertTrue(arrayOne[arrayOne.length-1] == 3);

        ArrayUtility.shiftLeft(arrayOne);
        assertTrue(arrayOne[0] == 5);
        assertTrue(arrayOne[1] == 6);
        assertTrue(arrayOne[arrayOne.length-1] == 4);

        ArrayUtility.shiftLeft(arrayOne);
        assertTrue(arrayOne[0] == 6);
        assertTrue(arrayOne[1] == 7);
        assertTrue(arrayOne[arrayOne.length-1] == 5);

        ArrayUtility.shiftLeft(arrayOne);
        assertTrue(arrayOne[0] == 7);
        assertTrue(arrayOne[1] == 8);
        assertTrue(arrayOne[arrayOne.length-1] == 6);

        ArrayUtility.shiftLeft(arrayOne);
        assertTrue(arrayOne[0] == 8);
        assertTrue(arrayOne[1] == 9);
        assertTrue(arrayOne[arrayOne.length-1] == 7);

        ArrayUtility.shiftLeft(arrayOne);
        assertTrue(arrayOne[0] == 9);
        assertTrue(arrayOne[1] == 10);
        assertTrue(arrayOne[arrayOne.length-1] == 8);

        ArrayUtility.shiftLeft(arrayOne);
        assertTrue(arrayOne[0] == 10);
        assertTrue(arrayOne[1] == 1);
        assertTrue(arrayOne[arrayOne.length-1] == 9);

        ArrayUtility.shiftLeft(arrayOne);
        assertTrue(arrayOne[0] == 1);
        assertTrue(arrayOne[1] == 2);
        assertTrue(arrayOne[arrayOne.length-1] == 10);

        ArrayUtility.shiftLeft(arrayOne);
        assertTrue(arrayOne[0] == 2);
        assertTrue(arrayOne[1] == 3);
        assertTrue(arrayOne[arrayOne.length-1] == 1);

    }

    @org.junit.jupiter.api.Test
    void shiftRightNTimes() {

        ArrayUtility.shiftRightNTimes(arrayOne,2);
        assertTrue(arrayOne[0] == 9);
        assertTrue(arrayOne[1] == 10);
        assertTrue(arrayOne[arrayOne.length-1] == 8);

        ArrayUtility.shiftRightNTimes(arrayOne,3);
        assertTrue(arrayOne[0] == 6);
        assertTrue(arrayOne[1] == 7);
        assertTrue(arrayOne[arrayOne.length-1] == 5);

    }

    @org.junit.jupiter.api.Test
    void shiftLeftNTimes() {

        ArrayUtility.shiftLeftNTimes(arrayOne,1);
        assertTrue(arrayOne[0] == 2);
        assertTrue(arrayOne[1] == 3);
        assertTrue(arrayOne[arrayOne.length-1] == 1);

        ArrayUtility.shiftLeftNTimes(arrayOne,3);
        assertTrue(arrayOne[0] == 5);
        assertTrue(arrayOne[1] == 6);
        assertTrue(arrayOne[arrayOne.length-1] == 4);

    }
}