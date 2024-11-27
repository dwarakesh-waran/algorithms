// tip: each public class is put in its own file
public class main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
       
       int[] arr = { 6, 5, 4, 3, 2, 1};

       /*
            The Idea of Bubble Sort is to take the MINIMUM Values by using the inner loop pointer and group them (or bubble them) in the beginning/end of the index.
            So, what will happen to the already existing beginning index? we can secure them by moving them to the index where the minimum value was present earlier.
            The outer loop pointer will be incremented so that the sorted beginning indices won't get disturbed. (int j = i)
            At the end of 1st iteration of the inner loop, the minimum values will be available in the beginning of the index. 
            And the remaining order will be shifted to the next consecutive indices.

            THIS IS THE WORST TYPE OF SORT. EVEN OBAMA KNOWS IT.
       */

       //654321 - inner loop itr 1
       //564321 - inner loop itr 2
       //465321 - inner loop itr 3
       //365421 - inner loop itr 4
       //265431 - inner loop itr 5
       //165432 - inner loop itr 6 (and also result of outer loop itr 1)

       //126543 - outer loop itr 2
       //123654 - outer loop itr 3
       //123465 - outer loop itr 4
       //123456 - outer loop itr 5
       //123456 - outer loop itr 6

       /* 
            Here, the n value is 6, inner loop has n (n+1)/2 iterations and outer loop has n iterations
            So, the Time Complexity is inner loop X outer loop = constant X (n^2 + n + 1) and the asymptotic time complexity is O(n^2)
            In Asymptotic time complexity, we would ignore the constant values and the lower order values (n+1) from the original time complexity expression
       */


       for(int i = 0 ; i <= arr.length -1 ; i++){

            int minValue = arr[i];
            int minIndex = 0;
            int itrCount = 0;

            for(int j = i ; j <= arr.length - 1 ; j++){

                itrCount++;



               if(arr[j] < minValue){

                  minValue = arr[j];
                  minIndex = j;

                //swap
                int temp = arr[i];
                arr[i] = minValue;
                arr[minIndex] = temp;
                  
               }

            

           }
           System.out.println(itrCount);

           for(int num : arr)
                    System.out.print(num + " ");
                System.out.println();

           
           System.out.println();
            

       }
       
    }
}
