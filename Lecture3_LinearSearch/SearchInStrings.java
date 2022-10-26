package Lecture3_LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "mukul padwal";
        char target = 'u';

        System.out.println(searchInString1(name, target));
    }

    static int searchInString(String name, char target){
        if(name.length() == 0){
            return -1;
        }

        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return i;
            }
        }

        return -1;
    }

    static boolean searchInString1(String name, char target){
        if(name.length() == 0){
            return false;
        }

        for(char ch: name.toCharArray()){
            if(target == ch){
                return true;
            }
        }


        return false;
    }
}
