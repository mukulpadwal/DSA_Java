package Lecture4_ArrayQuestions;

public class HighestAltitude {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

    static int largestAltitude(int[] gain) {
        int maxi = Integer.MIN_VALUE;

        int startAltitude = 0;

        for(int i=0; i<gain.length; i++){
            int currAltittude = gain[i];
            startAltitude += currAltittude;

            maxi = Math.max(maxi, startAltitude);
        }

        if(maxi < 0){
            return 0;
        }

        return maxi;

    }
}
