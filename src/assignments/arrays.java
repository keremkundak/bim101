package assignments;

import java.util.*;

public class arrays {
    public static String[] sortByHeight (String[] names, int[] heights) {
        int i;

        for (i=0; i<heights.length; i++) {
            int currentMin = heights[i];
            int currentMinIndex = i;
            String tempName = "";
            
            for (int j = i + 1; j < heights.length; j++) {
                if (currentMin > heights[j]) {
                    currentMin = heights[j];
                    currentMinIndex = j;
                    tempName = names[currentMinIndex];
                }
            }

            if (currentMinIndex != i) {
                heights[currentMinIndex] = heights[i];
                heights[i] = currentMin;

                names[currentMinIndex] = names[i];
                names[i] = tempName;
            }
        }
        // names and heights arrays are sorted in the increasing order
        // reversing the order
        
        Collections.reverse(Arrays.asList(names));
        Collections.reverse(Arrays.asList(heights));

        return names;
    }
    
    public static void main(String[] args) {
        String names[][] = new String[][] {{"Bilal", "Bahar", "Enhar"},{"Gizem", "Ozan", "Ege", "Meral"}, {"Haitam", "Losine"}};
        int i, heights[][] = new int[][] {{185, 169, 170}, {173, 171, 178, 166}, {181, 171}};
        
        String sorted[][] = {sortByHeight(names[0], heights[0]), sortByHeight(names[1], heights[1]), sortByHeight(names[2], heights[2])};

        for (i = 0; i < sorted[i].length; i++){
            System.out.println(Arrays.toString(sorted[i]));
        }
        System.out.println(Arrays.toString(sorted[i]));
    }
}