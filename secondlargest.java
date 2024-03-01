import java.util.*;
public class secondlargest {
public static void main(String[] args) {
    

    int[] array = {2,4,6,8};

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < array.length; i++) {
        if (array[i] > largest) {
            secondLargest = largest;
            largest = array[i];
        } else if (array[i] > secondLargest && array[i] != largest) {
            secondLargest = array[i];
        }
    }

    if (secondLargest == Integer.MIN_VALUE) {
        System.out.println("There is no second largest element.");
    } else {
        System.out.println("The second largest element is: " + secondLargest);
    }
}}

