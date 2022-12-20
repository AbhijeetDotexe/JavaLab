public class Jagged {
    public static void main(String[] args) {
        int r = 7;

        int arr[][] = new int[r][];


        for (int i = 0; i < arr.length; i++)
            arr[i] = new int[i + 1];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = j + 1;

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length*2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < (arr.length-i)*2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}
