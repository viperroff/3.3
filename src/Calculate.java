public class Calculate implements Calc{
    public double[] nums;

    public void sum(double... nums) {
        this.nums = nums;
        double numsSum = 0;
        for(double num : nums){
            numsSum+= num;
        }
        System.out.println(numsSum);
    }
}
