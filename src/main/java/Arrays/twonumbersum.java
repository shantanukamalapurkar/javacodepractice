package Arrays;

public class twonumbersum {

    public int [] findsumelement(){
        int arr[] = {1,4,5,6,3,10};
        int sum = 11;
        int [] returnarr = new int[2];
        outerloop:
        for(int i =0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    returnarr[0]=i;
                    returnarr[1]=j;
                    break outerloop;
                }
            }
        }
        return returnarr;
    }

    public static void main(String args[]){

twonumbersum sum1 = new twonumbersum();
int [] arr1 = sum1.findsumelement();
for(int i=0;i<arr1.length;i++){
    System.out.println(arr1[i]);
}




    }

}
