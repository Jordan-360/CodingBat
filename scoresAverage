AP-1 : scoresAverage

Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method
int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use ints so the expected results are exact.


scoresAverage([2, 2, 4, 4]) → 4
scoresAverage([4, 4, 4, 2, 2, 2]) → 4
scoresAverage([3, 4, 5, 1, 2, 3]) → 4

public int scoresAverage(int[] scores) {
   int firstAverage = average(scores, 0, scores.length / 2);
        int secondAverage = average(scores, (scores.length / 2) + 1, scores.length);
        return Math.max(firstAverage, secondAverage);
}
 public  int average(int[] scores, int start, int end) {
       int average = 0;
        int sum = 0;
        int counter = 0;
        if(scores.length < 3) {
            int max =  0;
            for(int i = 0; i < scores.length; i++) {
                if (scores[i] > max) {
                    max = scores[i];
                }
            }
            average = max;
            return average;
        }
        for(int i = start; i < end; i++) {
            sum += scores[i];
            counter++;
        }
        average = sum / counter;
        return average;

    }
