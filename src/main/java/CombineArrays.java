
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        // initialize an array of Integer with fixed size of arr1.length + arr2.length
        int[] combinedArray = new int[arr1.length + arr2.length];

        // iterate via arr1 ...
        int i = 0;
        while(i < arr1.length){
            // append each element to empty 'combinedArray'
            combinedArray[i] = arr1[i];
            // increment by 1 to continue loop
            ++i;
        }
        // loop via arr2 ...
        int j = 0;
        while(j < arr2.length){
            // append each element of arr2 to combinedArray
            combinedArray[i] = arr2[j];
            // still incrementing iterator i so other index in combinedArray would NOT to overriden & continue appending arr2 values to end of arr1
            ++i;
            // increment j to continue this nearest loop
            ++j;
        }

        return combinedArray;
    }
}
