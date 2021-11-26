import java.util.*;
public class hackerRank4{

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n1 = scanner.nextInt();
    //int n2 =  scanner.nextInt();

    int [] arr1 = new int[n1];
    int[] arr2 = new int[5];
    //int[] arr2 = new int[n2];

    for(int i = 0; i<arr1.length; i++ )
    {
        arr1[i] = scanner.nextInt();
        
    }

    int type1 =0 ;
    int type2 =0 ;
    int type3 =0 ;
    int type4 =0 ;
    int type5 =0 ;

     for (int i = 0; i < arr1.length; i++) {
      int num = arr1[i];

      if(num == 1)
      {
        type1++;
      }

      else if(num == 2)
      {
        type2++;
      }
      else if (num == 3) {
        type3++;
      }
      else if (num == 4) {
        type4++;
      }
      else if (num == 5) {
        type5++;
      }
    }

  arr2 [0] = type1;
  arr2[1] = type2;
  arr2 [2] = type3;
  arr2[3] = type4;
  arr2[4] = type5;





  int max = Arrays.stream(arr2).max().getAsInt();
  //System.out.println("Largest in given array is " + max);


  for(int i  = 0 ; i< arr2.length; i++)
  {
    if(max == arr2[i])
    {
      System.out.println(i+1);
      break;
    }
  }
    
    }
}
