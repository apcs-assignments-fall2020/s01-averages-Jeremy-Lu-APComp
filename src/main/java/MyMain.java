public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        for(int i = 0; i<mat.length; i++){
            for(int j=0; j<mat[0].length;j++){
                int final_sum = mat[i][j] + matt[i+1][j+1];
            }
        }
        return final_sum/mat.length;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        // YOUR CODE HERE
        return -1.0;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        // YOUR CODE HERE
        return -1.0;
    }


    public static void main(String[] args) {
        int[][] mat_1 = {{1, 5, 3}, {1, 2, 4}};
        int average = mean(mat_1);
        System.out.println("Average = " + average); //not sure why this isn't working.
    }
}
