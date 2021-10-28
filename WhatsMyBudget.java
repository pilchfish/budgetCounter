import java.util.Arrays;

public class WhatsMyBudget {

    public static void main(String[] args){

        int[] array = {2,3,10,1,1,2,1};

        int budget = 7;
        int sum = 0;
        int firstIndex = 0;
        int lastIndex = 0;

        for (int x = 0 ; x < array.length ; x++) {

            sum = array[x];
            for (int y = x+1 ; y < array.length ; y++) {
                sum = sum + array[y];
                if (sum <= budget) {
                    lastIndex = y;
                }
                else {
                    firstIndex = x+1;
                    sum = 0;
                }
            }
        }

        int [] budgetArray = Arrays.copyOfRange(array, firstIndex, lastIndex + 1);
        System.out.println("longest budget length = " + budgetArray.length);

        System.out.println("budget items = " + budgetArray.length);
        int counter = 0;
        for (int i : budgetArray){
                System.out.print(i + " at index ["+counter+"],");
                counter++;
        }
    }
}