public class App {
    public static void main(String[] args) throws Exception {
        SortInsert orden = new SortInsert();
        int [] arr = {10,2,5,22,0};
        int [] ord = orden.insertSort(arr, true);
        orden.imprimir(ord);
    }
}
