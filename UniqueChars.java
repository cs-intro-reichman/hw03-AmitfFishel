/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

  
    public static String uniqueChars(String str) {
        String isSolution = "";
          for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); 

            if (isSolution.indexOf(currentChar) == -1 ||(currentChar == ' ')) {
              isSolution += currentChar;

              
              
              }

          
        
       }

    

               return isSolution;


  }

}

