package DSA.LinearSearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Dacchu";
        char target = 'h';
//        System.out.println(searchString(name,target));
        System.out.println(Arrays.toString(name.toCharArray())); //this will create a string array
        System.out.println(searchString2(name,target));
    }

    static boolean searchString(String str,char target){
        if(str.length()==0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }

    static boolean searchString2(String str,char target){
        if(str.length()==0){
            return false;
        }

        for(char ch:str.toCharArray()){  //char ch checks each elements so v shld convert the string into an array by using str.toCharArray()
            if(ch==target){
                return true;
            }
        }

        return false;
    }

}
