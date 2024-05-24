public class MaxSum{
    public static void main(String[] args){
        int n = 4;
        int arr[] = {1, 2, 6, 5};
        // int arr[] = {2, 3, 5};
        // int maxSum = 11;
        int maxSum = 60;
        int currentSum = 0;
        for(int i=0; i<n; i++){
            currentSum = currentSum + (((i+1)*n) + arr[i]);
            if(maxSum == currentSum || ((i+1==n) && currentSum <=maxSum)){
                System.out.println(i+1);
            }
        }
    }
}