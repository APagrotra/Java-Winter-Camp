public class Ass1Q1 {
    public static void main(String[] str){
        String s = "Ashutosh";

        char arr[] = s.toCharArray();

        int j = 0;
        char temp = 0;
        for(int i=0; i<arr.length; i++){
            for(j = 0; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int k=0; k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }
}
