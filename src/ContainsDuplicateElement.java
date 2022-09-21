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
