public class Searching<T> {
    int linearSearch(T[] arr, T item){

        int index = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == item){
                index = i;
            }
        }
        return index;
    }
}