package Lecture11_LinkedList;

public class SortingLL {

    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }

    }

    static void search(String str){
        float length = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                length++;
            }

            if(ch >= '0' && ch <='9'){
                temp += ch;
            }
        }

        System.out.println(length);

        int sum = 0;

        for (int i = 0; i < temp.length(); i++) {
            sum += temp.charAt(i) - '0';
        }

        System.out.println((Math.round(sum / length)));

    }


    public static void main(String[] args) {
        search("H3ello9-9");
        search("Hello6 9World 2 NIce8e d7ay");
        search("H3ello9-9");
    }

}
