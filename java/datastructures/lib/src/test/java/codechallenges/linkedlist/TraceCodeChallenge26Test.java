package codechallenges.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TraceCodeChallenge26Test {

  @Test
  @DisplayName("Insertion and Sort Test")
  void insertionAndSortTEST() {
    int[] inputArray = {8, 4, 23, 42, 16, 15};
    int[] expectedSortedArray = {4, 8, 15, 16, 23, 42};

    System.out.println("Input Array: "+ Arrays.toString(inputArray));

    TraceCodeChallenge26.insertionSort(inputArray);

    assertArrayEquals(expectedSortedArray, inputArray);
    System.out.println("Output Array: " + Arrays.toString(expectedSortedArray));

  }
}

