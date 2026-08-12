public class Segragates0sand1s {
    public static void main(String[] args){
        System.out.println("Segragate zeros to the left and ones to the right");
        int[] arr = {0,1,1,1,0,0,0,1,0,1,0};
        int numOfzeros = 0;
      for(int ele: arr){
          if(ele==0) numOfzeros++;
      }
        for(int j=0; j<numOfzeros; j++) arr[j] = 0;
        for(int j=numOfzeros ;j<arr.length; j++) arr[j] = 1;

        for(int ele: arr){
            System.out.print(ele+" ");
        }


    }
}
