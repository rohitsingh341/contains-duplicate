import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateElement {
    public static void main(String[] args) {
        int [] nums = {1,2,5,3,2,4,6}; //Contains
       // int [] nums = {1,2,5,3,4,6}; // does not contain

        if(containsDuplicate(nums))
            System.out.println("Contains duplicates");
        else
            System.out.println("Does not contain duplicates");
    }

    // Solution 1 - Brute force - iterate items and check  them with other elements - Time -> O(n*2), Space -> O(1)

    // Solution 2 - Sort the array first and then iterate and compare - Time -> O(nLogn), Space -> O(1)

    // Solution 3 - Use HashSet, Add item in the set and then add() operation will return false if the element is already there.
    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int n: nums) {
            if (!numSet.add(n)) {
                return true;
            }
        }
        return false;
    }
}
