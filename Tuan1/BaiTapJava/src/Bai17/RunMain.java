package Bai17;

public class RunMain {
    public static String capitalizeWord(String str){
        String[] words =str.split("\\s");
        StringBuilder capitalizeWord= new StringBuilder();
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord.append(first.toUpperCase()).append(afterfirst).append(" ");
        }
        return capitalizeWord.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWord("my name is khan"));
        System.out.println(capitalizeWord("I am sonoo jaiswal"));
    }
}
