//Currently, the mode method does not completely work - I tried iterating through the array and keeping
//track of each numnber frequency as individual variables but I didn't consider that any number
//can be put in the 2D Array.

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
    int mode_val = 0;
    int zero = 0;
    int one = 0;
    int two = 0;
    int three = 0; //this doesn't work the way I thought it would work
    for(int i = 0; i <mat.length;i++){
        for(int j = 0; j <mat[0].length; j++){
            int temp_val = mat[i][j]; //iterates through the array (lossy conversion)
            if (temp_val == 0){
                zero++;
            }
            else if (temp_val == 1){
                one++;
            }
            else if (temp_val == 2){
                two++;
            }
            else if (temp_val == 3){
                three++;
            }
            else{
                return null;
            }
        }
    }
    return mode_val;
    } //not entirely sure how to finish this (will ask in class)

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
        double mode = mode(mat_1);
        System.out.println("Average = " + average);
        System.out.println("Median = " + median_num); 
        System.out.println("Median (even test) = " + median_even); 
        System.out.println("Mode = " + mode); //This currently doesn't operate
    }
}
