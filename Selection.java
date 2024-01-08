public class Selection{
    void selection(int a[]){
        int n = a.length;
        for(int i = 0; i<n-1; i++){
            int small = i;
            for(int j=i+1; j<n; j++)
                if(a[j] < a[small])
                    small = j;
            int t = a[small];
            a[small] = a[i];
            a[i] = t;
        }
    }
    void display(int a[]){
        int n = a.length;
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        Selection sort = new Selection();
        int a[] = {43,21,45,78,22,66,54};
        System.out.print("Before sorting the array : ");
        sort.display(a);
        sort.selection(a);
        System.out.print("\nAfter sorting the array : ");
        sort.display(a);
    }
}