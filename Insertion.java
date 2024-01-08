public class Insertion {
    void insertionSort(int a[]){
        int n = a.length;
        for(int i=0; i<n; i++){
            int t = a[i];
            int j = i-1;
            while(j>=0 && t<=a[j]){
                a[j+i] = a[j];
                j = j-1;
            }
            a[j+1] = t;
        }
    }
    void display(int a[]){
        int n = a.length;
        for(int i=0; i<n; i++){
            System.out.println(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        Insertion akash = new Insertion();
        int a[] = {54,65,12,14,25,34,42};
        System.out.println("Before");
        akash.display(a);
        akash.insertionSort(a);
        System.out.println("After");
        akash.display(a);

    }
}
