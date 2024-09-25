package BasicCodes;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = findMajorityElement(nums);

        if (majorityElement != -1) {
            System.out.println("The majority element is " + majorityElement);
        } else {
            System.out.println("There is no majority element.");
        }
    }

    public static int findMajorityElement(int[] nums) {
        // Step 1: Find the candidate
        int candidate = findCandidate(nums);

        // Step 2: Verify the candidate
        if (isMajority(nums, candidate)) {
            return candidate;
        }
        return -1; // No majority element
    }

    private static int findCandidate(int[] nums) {
        int candidate = -1;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    private static boolean isMajority(int[] nums, int candidate) {
        int count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        return count > nums.length / 2;
    }
}

