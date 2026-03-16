class Solution {

    public int findDays(int[] weights, int cap) {
        int days = 1;
        int load = 0;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] + load > cap) {
                days += 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int d) {
        int low = 0;
        int high = 0;

        // low = max element, high = sum of all elements
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);   // min capacity = heaviest package
            high += weights[i];                // max capacity = ship everything at once
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = findDays(weights, mid);

            if (numberOfDays <= d) {
                high = mid - 1;   // capacity works, try less
            } else {
                low = mid + 1;    // too many days, increase capacity
            }
        }
        return low;
    }
}