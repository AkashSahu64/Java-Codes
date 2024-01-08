public class array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
//        int sum = 0;
////        int n=6;
////        for(int i=0; i<=n; i++ ){
////            System.out.println("The array of index " +i+ " is : "+arr[i]);
//        System.out.println(arr.length);
//        for(int i =0; i< arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("\nUsing for-each loop");
//        for(int element : arr){
//            System.out.println(element);
//            sum = sum + element;
//            System.out.println("Sum of the array is : " +sum);
//        int l = arr.length;
//        int max = 0;
//        for(int i=0; i<=l/2; i++){
//
//                int t = arr[i];
//                arr[i] = arr[l-1-i];
//                arr[l-1-i] = t;
//        }
//        for(int element : arr){
//            System.out.println(element);
//            if(element>max){
//                max = element;
//
//            }
//        }
//        System.out.println("max = " +max);

        boolean isSorted = true;
        for(int i=0; i<= arr.length-1; i++){
            if(arr[i]<arr[i-i]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
}
