public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 7, 0};
        int first = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = first;
        int sum = arr[0] + arr[(arr.length/2)];
        System.out.println(sum);
    }
}
