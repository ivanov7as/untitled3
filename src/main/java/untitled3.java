public class untitled3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 0, 0, 1};
        System.out.println("\ninvertArray: ");
        invertArray(arr1);
        System.out.println("\nfillArray: ");
        fillArray(100);
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\nchangeArray: ");
        changeArray(arr3);
        System.out.println("\nfillDiagonal;: ");
        fillDiagonal();
        System.out.println("\nlenInitiativeValue: ");
        lenInitiativeValue(5, 10);
        int[] arr6 = {1, 10, 5, 7, 12, 2, 6, 3, 11, 8};
        System.out.println("\nmaxMin: ");
        maxMin(arr6);
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void lenInitiativeValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }

    
}
