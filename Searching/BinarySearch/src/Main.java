import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {0,10,20,30,40,50,60,70,80,90,100};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search = > ");
        int item = input.nextInt();

        Searching searching = new Searching();
        int index = searching.binarySearch(arr,item,0,arr.length-1);

        if (index == -1){
            System.out.println("Item not found");
        }else{
            System.out.println("Item found in index ==> " + index);
        }

        System.out.print("This is the path = > ");
        searching.getPath(arr,item,0,arr.length-1);
    }
}