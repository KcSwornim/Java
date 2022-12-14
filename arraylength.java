public class arraysum{
    public static void main(String[] args) {
        int [] a = {2 , -9, 0 ,8 ,23, 12, 39, 4, 5};
        int sum = 0;
        Double average;
        for(int a: a){
            sum+=a;
        }
        int arraylength = a.length;
        average = ((double)sum / (double)arraylength);
        System.out.println("Sum - "+sum);
        System.out.println("Average - " +average);
    }
}