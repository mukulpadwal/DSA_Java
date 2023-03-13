package Lecture9_OOPs;

public class StudentRank {
    String[] students;
    int[] ranks;

    StudentRank (String[] students, int[] ranks){
        this.students = students;
        this.ranks = ranks;
    }
    public String highestRank(){
        int maxRank = Integer.MIN_VALUE;
        int index = 0;

        for(int i=0; i<ranks.length; i++){
            if(ranks[i] > maxRank){
                maxRank = ranks[i];
                index = i;
            }
        }

        return students[index];
    }

    public String lowestRank(){
        int mixRank = Integer.MAX_VALUE;
        int index = 0;

        for(int i=0; i<ranks.length; i++){
            if(ranks[i] < mixRank){
                mixRank = ranks[i];
                index = i;
            }
        }

        return students[index];
    }
}

class Main {

    public static void arrangeCoins(int[] coins){
        for(int coin: coins){
            int step = 0;
            int minus = 1;

            while (coin >= minus){
                step++;
                coin = coin - minus;
                minus = minus + 1;
            }

            System.out.println(step);
        }
    }


    public static void main(String[] args) {
//        String[] students = {"Taylor", "Wesley", "Jordan"};
//        int[] ranks = {1, 5, 3};
//
//        StudentRank studentRank = new StudentRank(students, ranks);
//
//        System.out.println(studentRank.highestRank());
//        System.out.println(studentRank.lowestRank());
//
//        int x = 2437;
//        int y = 875;
//
//        while( x != y ){
//            if(x>y){
//                x = x-y;
//            } else {
//                y = y-x;
//            }
//        }
//
//        System.out.println(x);
//
//        System.out.println(3&5);
//        System.out.println(3|5);
//
//
//        int xi = 0;
//        for(int i=0; i<10000000; i++){
//            xi += i;
//        }
//
//        System.out.println(xi);

//        try {
//            Float f1 = new Float("3.0");
//            int x = f1.intValue();
//            byte b = f1.byteValue();;
//            double d = f1.doubleValue();
//            System.out.println(x+b+d);
//        } catch (NumberFormatException e){
//            System.out.println("bad number");
//        }

        arrangeCoins(new int[]{2, 5, 8, 3});
    }
}