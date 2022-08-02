import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args){
        int[] numb= {1,4,5,15,2,6,8,12,3,9};
        System.out.println("Exercise1");
        maxmin(numb);

        System.out.println("Exercise2");
        minimums(numb);

        System.out.println("Exercise3");
        formula(1,5);
        formula(3,8);
    }
    public static void maxmin(int[] array ){
        int max,min;
        max=min=array[0];

        for (int i=0; i<array.length; i++){
            if (array[i]>max){
                max=array[i];
            }
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("The diference between the largest and the smalles is: "+(max-min));
    }

    public static void minimums(int[] array) {
        int min1,min2;
        min1=Integer.MAX_VALUE;
        min2=Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++){
            if(array[i]<min1){
                min1=array[i];
            }
            else if(min2 > min1 && min2 > array[i]){
                min2=array[i];
            }
        }
        System.out.println("The two smaller numbers are "+min1+","+min2);
    }
    public static void formula(int x,int y) {

        System.out.println(Math.pow(x,2)+Math.pow((4*y/5-x),2));

    }
}
