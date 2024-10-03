public class SortInsert {
    public int[] insertSort( int[] arr, boolean cambiar){
        if (cambiar == true){
            int n = arr.length;
            for(int i =1; i < n; i++){
                int key = arr[i];
                int j = i - 1 ;
                while (j >= 0 && arr[j] > key){
                    arr[ j +  1 ] = arr[j];
                    j--;
                } 
                arr [j + 1] = key;
            }
            return arr;
            
        } else {
            return null;
        }
        }
    public void imprimir (int [] arr){
        for (int i : arr){
            System.out.print(" "+ i);
        }
    }
}
