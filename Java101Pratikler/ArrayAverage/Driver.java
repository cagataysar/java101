public class Driver {

    public static void main(String[] args) {

        int[] list = {1,42,32,5,68,9,65,3,12,27};
        double average = 0.0;
        double sum = 0.0;

        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        average = sum / list.length;
        System.out.println("Average of list array: " + average);
        //System.out.println(sum);

    }
}
