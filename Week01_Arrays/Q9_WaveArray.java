package Week01_Arrays;
import java.io.*;

class Q9_WaveArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());// taking size of array
            int arr[] = new int[n]; // declaring array of size n
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
            }

            SolutionWaveArray obj = new SolutionWaveArray();

            obj.convertToWave(arr, n);

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++)
                sb.append(arr[i] + " ");

            System.out.println(sb); // print array
        }
    }
}


//TC: O(n) ; SC: O(1)
class SolutionWaveArray {
    // arr: input array
    // n: size of the array
    // Function to sort the array into a wave-like array.
    public void convertToWave(int arr[], int n) {

        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

    }

}
