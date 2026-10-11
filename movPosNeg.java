import java.util.*;
public class movPosNeg{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int start =0;
        int end =arr.length-1;
        while(start<end)
        {
            if(arr[start]>= 0)
            {
                start++;
            }
            else if(arr[end]< 0)
            {
                end--;
            }
            else
            {
                int temp = arr[start];
                arr[start] =arr[end];
                arr[end] =temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}