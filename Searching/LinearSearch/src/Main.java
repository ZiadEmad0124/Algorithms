import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = {0,10,20,30,40,50,60,70,80,90,100};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search = > ");
        int item = input.nextInt();

        Searching<Integer> searching = new Searching<>();
        int index = searching.linearSearch(arr,item);

        if (index == -1){
            System.out.println("Item not found");
        }else{
            System.out.println("Item found in index ==> " + index);
        }

        System.out.println("----------------------------");

        Character[] arr2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the char to search = > ");
        char character = input2.next().charAt(0);

        Searching<Character> searching2 = new Searching<>();
        int index2 = searching2.linearSearch(arr2,character);

        if (index2 == -1){
            System.out.println("Char not found");
        }else{
            System.out.println("Char found in index ==> " + index2);
        }
    }
}