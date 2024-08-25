public class remove_element {
    public static void main(String[] args) {
        int target=3;
        int arr[]={2,3,6,5,5};
        int n = arr.length;
        removeElement(arr, n, target);

        for(int i = 0; i < n-1; i++){
            System.out.print(arr[i] + " ");
        }
  
    }
    static public int removeElement(int arr[], int n, int target){
        int i;    
        for(i=0;i<n;i++){
            if(arr[i]==target)
            {
                break;
            }
        }
            if(i==n){
                return n;
            }
            for (int j=i;j<n-1;j++){
                arr[j]=arr[j+1];
            }
 return n-1;
        
       

    }
}
