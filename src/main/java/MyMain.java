public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double final_sum = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j=0; j<mat[i].length;j++){
                final_sum += mat[i][j];
            }
        }
        return (double) final_sum/(mat[0].length*mat.length);
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        int length = mat[0].length*mat.length;
        if(length%2 != 0){//checks if odd
            int midpoint = length/2; 
            int i = midpoint/mat[0].length;
            int j = midpoint%mat[0].length;
            return mat[i][j];
        }
        else{ // checks if even
            int midpoint_1 = length/2;
            int midpoint_2 = midpoint_1-1;
            int i_1 = midpoint_1/mat[0].length;
            int i_2 = midpoint_2/mat[0].length;
            int j_1 = midpoint_1%mat[0].length;
            int j_2 = midpoint_2%mat[0].length;
            return (mat[i_1][j_1]+mat[i_2][j_2])/2;
        }
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        // How many times result occurs
        // How many times number looking at occurs
        // Hold index - Calculate [i] and [j] pair from index
        // Reset
        return -1.0;
    }


    public static void main(String[] args) {
        double[][] mat_1 = { // odd len
            {1,  2,  4,  5,  6},
            {7,  9,  10, 12, 13},
            {14, 15, 17, 18, 20},
            {22, 23, 27, 30, 32},
            {33, 37, 38, 42, 44}
        };
        double[][] mat_even = { //even
            {1,  2,  4,  5,  6},
            {7,  9,  10, 12, 13},
            {14, 15, 17, 18, 20},
            {22, 23, 27, 30, 32},
        };
        double average = mean(mat_1);
        double median_num = median(mat_1);
        double median_even = median(mat_even);
        System.out.println("Average = " + average);
        System.out.println("Median = " + median_num); 
        System.out.println("Median (even test) = " + median_even); 
    }
}
