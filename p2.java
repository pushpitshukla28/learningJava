public class p2 {
    public static void main(String[] args){
        // int arr[];
        // arr = new int[5];
        // int arr[] = new int[5];
        int arr[] = {1,2,3,4,5};
        System.out.println("Initial array is:");

        for(int i= 0; i<5 ; i++){
            System.out.println(arr[i]);
        }
        System.out.println("After reversal it is");

        for(int i=4; i>=0 ; i--){
            System.out.println(arr[i] );
        }

    }
}
