public class VerificarString {
  public static void main(String[] args) {
    String searchString = "esta é a string que sera verificada";
    int count = 0;

    for (int i = 0; i < searchString.length(); i++) {
      char character = searchString.charAt(i);

      if (character == 'a' || character == 'A') {
        count++;
      }
    }

    if (count > 0) {
      System.out.println("A letra 'a' foi encontrada " + count + " vezes.");
    } 
    else {
      System.out.println("A letra 'a' não foi encontrada.");
    }
  }
}
