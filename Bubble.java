public class Bubble{
    public static void main(String[] args){
        int[] arr={1,6,4,24,3,7,8,95,9};
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void bubbleSort(int arr[]){
        int turns;
        for(turns=0;turns<arr.length-1;turns++){
            for(int i=0;i<arr.length-1-turns;i++){
                int curr=arr[i];
                int next=arr[i+1];
                if(curr>next){
                    swap(i,arr);
                }
            }
        }
    }
    static void swap(int i,int arr[]){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
}
    
