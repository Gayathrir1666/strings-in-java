public class Prac{
   public static void main(String[] args) {
     String s1 = "Amrita";
     String s2 = "University";
     //Concatination of two strings.
     String s3 = s1.concat(s2);
     System.out.println(s3);
     //To find the length of a string.
      System.out.println("Length of String: " + s3.length());
     //To find the required character in a string by giving the index number.
      System.out.println("Character at position 5: " + s3.charAt(5));
     //Index of a given character
      System.out.println("Index of character 'i': " + s3.indexOf('S'));
     //Comparison of two strings using compareto method
       System.out.println("Compare To some other string: " + s3.compareTo("Amrita"));
        System.out.println("Compare To some  string: " + s3.compareTo("AmritaUniversity"));
        //If we want to compare the srings without case-sensitive then we use Ignorecase
        System.out.println("Compare To 'Amritauniversity' - Case Ignored: " + s3.compareToIgnoreCase("Amritauniversity"));
        //By using contain method we check whether the given set of string is there in the main string or not.
        System.out.println("Contains sequence 'sity': " + s3.contains("sity"));
        System.out.println("Contains sequence 'tyAm': " + s3.contains("tyAm"));
        //By using ends method we conclude whether the main string is ending with the given suffix or not.
        System.out.println("EndsWith character 'r': " + s3.endsWith("r"));
        System.out.println("EndsWith character 'y': " + s3.endsWith("y"));
        //By using replace method we replace the required letters with the other letters.
        System.out.println("Replace 'University' with 'School of Engineering': " + s3.replace("University", "School of Engineering"));
        //We convert the whole string to uppeercase and lower case by using tolowercase and touppercse methods.
        System.out.println("Convert to LowerCase: " + s3.toLowerCase());
          //Convert to UpperCase
          System.out.println("Convert to UpperCase: " + s3.toUpperCase());

  }
}
