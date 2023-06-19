public class Searching {

    int binarySearch(int[] arr, int item, int start, int end){

        int mid = (start + end) / 2;

        if (start > end){
            return -1;
        }
        if (arr[mid] == item){
            return mid;
        }
        if (arr[mid] > item){
            end = mid - 1;
            return binarySearch(arr,item,start,end);
        }
        if (arr[mid] < item){
            start = mid + 1;
            return binarySearch(arr,item,start,end);
        }
        return -1;
    }

    void getPath(int[] arr, int item, int start, int end){

        int mid = (start + end) / 2;

        if (start > end){
            System.out.println("Not Found");
        }
        if (arr[mid] == item){
            System.out.print(arr[mid]);
        }
        if (arr[mid] > item){
            end = mid - 1;
            System.out.print(arr[mid] + " -> ");
            getPath(arr,item,start,end);
        }
        if (arr[mid] < item){
            start = mid + 1;
            System.out.print(arr[mid] + " -> ");
            getPath(arr,item,start,end);
        }
    }
}