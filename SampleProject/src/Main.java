public class Main
{
    public static void main(String[] args)
    {

        /*
        int[] numbers = new int[10];
        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 20;
        numbers[7] = -8;
        numbers[8] = 173;
        numbers[9] = 65;
         */

        int[] numbers = {9, -12, -5, 37, 12, 2, 67, -53, 632, 89};

        System.out.println("Before bubble sort:");
        printArrayElements(numbers);

        bubbleSort(numbers);
        System.out.println("\n\nAfter bubble sort:");
        printArrayElements(numbers);

        //reset array
        numbers = new int[]{9, -12, -5, 37, 12, 2, 67, -53, 632, 89};

        System.out.println("\n\nBefore selection sort:");
        printArrayElements(numbers);

        selectionSortSmallestToEnd(numbers);
        System.out.println("\n\nAfter selection sort:");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            for (int i = 0; i < lastUnsortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSortSmallestToEnd(int[] arr)
    {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            int smallest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++)
            {
                if (arr[i] < arr[smallest])
                {
                    smallest = i;
                }
            }

            if (smallest != lastUnsortedIndex)
            {
                int temp = arr[smallest];
                arr[smallest] = arr[lastUnsortedIndex];
                arr[lastUnsortedIndex] = temp;
            }
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}