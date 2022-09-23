import java.util.Scanner;

public class z1 {
    public static void main(String[] args){
        int[] arr1 = input();
        if(arr1 == null) return;
        int[] arr2 = input();
        if(arr2 == null) return;

        printresult(arr1, arr2);
    }

    private static void printresult(int[] arr1, int[] arr2) {
        boolean statement = false;
        System.out.println("Результат: ");
        for(int i = 0; i<5; i++){
            for(int g = 0; g<5; g++){
                if(arr1[i]==arr2[g]){
                    if(!statement) System.out.println("В обоих наборах есть числа: ");
                    statement = true;
                    System.out.println(arr1[i]);
                }
            }
        }
    }

    private static int[] input() {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 5 чисел через пробел: ");
        for(int i = 0; i<5; i++){
            if(!sc.hasNextInt()){
                System.out.println("Ошибка ввода данных.");
                return null;
            }
            arr[i]=sc.nextInt();

        }
        return arr;
    }
}
