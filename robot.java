package general;

public class robot {

    // Function to find sum of pairwise distances after d seconds
    public static int sumDistance(int[] nums, String s, int d) {
        int n = nums.length;
        long mod = 1000000007L;

        // Step 1️⃣: Store initial positions and directions
        int[] pos = new int[n];
        char[] dir = s.toCharArray();

        for (int i = 0; i < n; i++) {
            pos[i] = nums[i];
        }

        // Step 2️⃣: Simulate movement for d seconds
        for (int t = 0; t < d; t++) {
            // Move each robot by 1 unit based on direction
            for (int i = 0; i < n; i++) {
                if (dir[i] == 'L') pos[i]--;
                else pos[i]++;
            }

            // Step 3️⃣: Handle collisions
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (pos[i] == pos[j]) {
                        // Reverse both directions
                        dir[i] = (dir[i] == 'L') ? 'R' : 'L';
                        dir[j] = (dir[j] == 'L') ? 'R' : 'L';
                    }
                }
            }
        }

        // Step 4️⃣: Calculate sum of pairwise distances
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += Math.abs(pos[i] - pos[j]);
                sum %= mod; // To avoid overflow
            }
        }

        // Step 5️⃣: Return final result
        return (int) (sum % mod);
    }

    // Example test
    public static void main(String[] args) {
        int[] nums = {-2, 0, 2};
        String s = "RLL";
        int d = 3;

        System.out.println(sumDistance(nums, s, d)); // Expected Output: 8
    }
}
