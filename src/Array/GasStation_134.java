package Array;

public class GasStation_134 {
    public static int canCompleteCircuit(int[] gas, int[] cost){
        int sum = 0, total = 0, start = 0;
        for (int i = 0; i < gas.length; i++){
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];

            if (sum < 0){
                sum = 0;
                start += 1;
            }
        }
        if (total >= 0)
            return start;
        else
            return -1;
    }
    public static void main(String[] args){
        int[] gas1 = {1,2,3,4,5};
        int[] cost1 = {3,4,5,1,2};

        int[] gas2 = {2,3,4};
        int[] cost2 = {3,4,3};

        System.out.println(canCompleteCircuit(gas1, cost1));
        System.out.println(canCompleteCircuit(gas2, cost2));

    }
}
