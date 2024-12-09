import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
      
        String str1 = "listen";
        String str2 = "silent";

      
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        } else {
            
            char[] array1 = str1.toCharArray();
            char[] array2 = str2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            boolean result = false;
        for (int i = 0; i < array1.length; i++) {
          for (int j = 0; j < array2.length; j++) {
              if(array1[i] == array2[j]){
                result = true;
              }
          }
    }

    System.out.println(result);

}
      

    
    }
}


          
        
    

    
  

    
}
