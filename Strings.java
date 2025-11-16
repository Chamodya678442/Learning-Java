public class Strings {
    public static void main(String[] args) {
        
    String txt1 = "Hello";
    String txt2 = "World";
    String txt3 = "Java Programming";
    System.out.println(txt1 + " " + txt2); // Concatenation
    System.out.println("Length of txt3: " + txt3.length()); // Length
    System.out.println("Uppercase txt1: " + txt1.toUpperCase()); // Uppercase
    System.out.println("Lowercase txt2: " + txt2.toLowerCase()); // Lowercase
    System.out.println("Character at index 1 of txt3: " + txt3.charAt(1)); // Character at index
    System.out.println("Index of 'Programming' in txt3: " + txt3.indexOf("Programming")); // Index of substring
    System.out.println(txt1.equals(txt2)); // Equality check
    String txt4 = "   Trim me   ";
    System.out.println("Trimmed txt4: '" + txt4.trim() + "'");  // Trimming whitespace
    

    }
    
}
