class Solution {
    public int singleNumber(int[] arr) {
        int ones = 0;
        int twos = 0;
        for (int value : arr) {
            ones = (ones ^ value) & ~twos;
            twos = (twos ^ value) & ~ones;
        }
        return ones;
    }
}