package data_structures.string;

import java.util.Arrays;

public class StringsAreIsomorphic {
    public static void main(String[] args) {
        boolean res = areIsomorphic("aab", "xxy");
        System.out.println(res);
        res = areIsomorphic("aab", "xyz");
        System.out.println(res);
        res = areIsomorphic("aabc", "xyz");
        System.out.println(res);
    }

    static boolean areIsomorphic(String stringA, String stringB) {
        int s1Length = stringA.length();
        int s2Length = stringB.length();

        //if lengths are not same then they are not isomorphic
        if (s1Length != s2Length)
            return false;

        // To mark visited characters in stringB
        boolean is_visited[] = new boolean[256];
        Arrays.fill(is_visited, Boolean.FALSE);

        // To store mapping of every character from stringA to
        // that of stringB. Initialize all entries of dsa.map as -1.
        int map[] = new int[256];
        Arrays.fill(map, -1);

        for (int i = 0; i < s2Length; i++) {
            // If current character of stringA is seen first
            // time in it.
            if (map[stringA.charAt(i)] == -1) {
                // If current character of stringB is already
                // seen, one to one mapping not possible
                if (is_visited[stringB.charAt(i)] == true)
                    return false;
                // Mark current character of stringB as visited
                is_visited[stringB.charAt(i)] = true;
                // Store mapping of current characters
                map[stringA.charAt(i)] = stringB.charAt(i);
            }
            //if this is not the first appearence of char in stringA
            //then check its previous appearence is mapped to the
            //respective character
            else if (map[stringA.charAt(i)] != stringB.charAt(i))
                return false;
        }
        return true;
    }
}
