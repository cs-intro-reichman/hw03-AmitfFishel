/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        String isSolution = " ";
        System.out.println(lowerCase(str));
    }

    public static String lowerCase(String str) {
          String isSolution = " ";
               for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                  if (currentChar >= 'A' && currentChar <= 'Z') {
                      currentChar =  (char) (currentChar + 32);  
                 }  
                
                 isSolution += currentChar; 

             }
                  
             return isSolution;
            
        }
    }

