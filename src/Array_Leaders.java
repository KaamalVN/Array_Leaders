import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Leaders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int iterator = 0; iterator < size; iterator++) {
            array[iterator] = scanner.nextInt();
        }
        System.out.println(array_leader(array, size));
    }

    static ArrayList<Integer> array_leader(int[] array, int size) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[j]>array[i]){
                    break;
                }
                if(array[j]==array[size-1]){
                    result.add(array[i]);

                }
            }
        }
        result.add(array[size-1]);
        return result;
    }
}
