import java.util.*;

/**
 * Rabin-Karp Algorithm Variants
 * 
 * This file demonstrates three approaches to substring matching:
 * 1. Brute-force string comparison
 * 2. Rabin-Karp using a single rolling hash
 * 3. Rabin-Karp using double rolling hash (to reduce hash collisions)
 */

public class RabinKarp {

    // ========================================================================
    // 1. Brute-Force Substring Matching
    // ========================================================================

    /**
     * Simple approach: Slide the pattern and compare substrings directly.
     * Time Complexity: O(n * m)
     * Space Complexity: O(n) due to substring creation
     */
    public static void bruteForce(String txt, String pat) {
        System.out.println("Brute-Force Rabin-Karp:");
        ArrayList<Integer> res = new ArrayList<>();
        int m = txt.length();
        int n = pat.length();
        
        for (int i = 0; i <= m - n; i++) {
            String subs = txt.substring(i, i + n);
            if (subs.equals(pat)) {
                res.add(i + 1); // Using 1-based index for consistency
            }
        }

        System.out.println("Match at indices: " + res + "\n");
    }

    // ========================================================================
    // 2. Rabin-Karp Using Single Hash Function
    // ========================================================================

    static final long mod1 = 1000000007;
    static final int base1 = 26;

    /**
     * Compute rolling hash value of a string segment using base and mod.
     */
    public static long hashValueSingle(String str, int start, int m) {
        long ans = 0, factor = 1;
        for (int i = start + m - 1; i >= start; i--) {
            ans = (ans + ((str.charAt(i) - 'a') * factor) % mod1) % mod1;
            factor = (factor * base1) % mod1;
        }
        return ans;
    }

    /**
     * Rabin-Karp with single hash: reduces redundant comparisons.
     * Note: May have false positives due to hash collisions.
     * Time Complexity: O(n + m)
     * Space Complexity: O(1)
     */
    public static void singleHash(String text, String pattern) {
        System.out.println("Single Hash Rabin-Karp:");
        int m = pattern.length();
        int n = text.length();

        long pHash = hashValueSingle(pattern, 0, m); // Precompute hash of pattern

        // Precompute base^(m-1) % mod for removing the leftmost char
        long highestPow = 1;
        for (int i = 1; i <= m - 1; i++) highestPow = (highestPow * base1) % mod1;

        long tHash = 0;

        for (int i = 0; i <= n - m; i++) {
            if (i == 0) {
                tHash = hashValueSingle(text, 0, m); // Initial hash of text substring
            } else {
                // Rolling hash: remove old char, shift, and add new char
                tHash = (tHash - ((text.charAt(i - 1) - 'a') * highestPow) % mod1 + mod1) % mod1;
                tHash = (tHash * base1) % mod1;
                tHash = (tHash + (text.charAt(i + m - 1) - 'a')) % mod1;
            }

            // Verify actual match in case of hash collision
            if (tHash == pHash) {
                if (text.substring(i, i + m).equals(pattern)) {
                    System.out.println("Pattern found at index: " + i);
                }
            }
        }
        System.out.println();
    }

    // ========================================================================
    // 3. Rabin-Karp Using Double Hashing (Two Moduli)
    // ========================================================================

    static final long mod2 = 1000000033;
    static final long base2 = 27;

    /**
     * Generalized hash function for any base and mod.
     */
    public static long hashValue(String string, int start, int m, long mod, long base) {
        long ans = 0, factor = 1;
        for (int i = start + m - 1; i >= start; i--) {
            ans = (ans + ((string.charAt(i) - 'a') * factor) % mod) % mod;
            factor = (factor * base) % mod;
        }
        return ans;
    }

    /**
     * Precompute base^(m-1) % mod for use in rolling hash updates.
     */
    public static long highestPow(int m, long base, long mod) {
        long highestPow = 1;
        for (int i = 1; i <= m - 1; i++) highestPow = (highestPow * base) % mod;
        return highestPow;
    }

    /**
     * Rabin-Karp with two independent hash functions.
     * Eliminates collision probability significantly.
     * Time Complexity: O(n + m)
     * Space Complexity: O(1)
     */
    public static void doubleHash(String text, String pattern) {
        System.out.println("Double Hash Rabin-Karp:");
        int m = pattern.length();
        int n = text.length();

        // Compute hashes of the pattern
        long phash1 = hashValue(pattern, 0, m, mod1, base1);
        long phash2 = hashValue(pattern, 0, m, mod2, base2);

        // Precompute highest powers for rolling hash
        long highestPow1 = highestPow(m, base1, mod1);
        long highestPow2 = highestPow(m, base2, mod2);

        long thash1 = 0, thash2 = 0;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i <= n - m; i++) {
            if (i == 0) {
                thash1 = hashValue(text, i, m, mod1, base1);
                thash2 = hashValue(text, i, m, mod2, base2);
            } else {
                // Rolling hash update
                thash1 = (thash1 - ((text.charAt(i - 1) - 'a') * highestPow1) % mod1 + mod1) % mod1;
                thash2 = (thash2 - ((text.charAt(i - 1) - 'a') * highestPow2) % mod2 + mod2) % mod2;
                thash1 = (thash1 * base1) % mod1;
                thash2 = (thash2 * base2) % mod2;
                thash1 = (thash1 + (text.charAt(i + m - 1) - 'a')) % mod1;
                thash2 = (thash2 + (text.charAt(i + m - 1) - 'a')) % mod2;
            }

            // Compare both hashes for match
            if (thash1 == phash1 && thash2 == phash2) {
                res.add(i); // 0-based index
            }
        }

        System.out.println("Match at indices: " + res + "\n");
    }

    // ========================================================================
    // MAIN FUNCTION TO RUN ALL VARIANTS
    // ========================================================================
    public static void main(String[] args) {
        String text = "birthdayboybirthdayboy";
        String pattern = "birth";

        bruteForce(text, pattern);     // Method 1
        singleHash(text, pattern);     // Method 2
        doubleHash(text, pattern);     // Method 3
    }
}
