
 FOR ENCODING

 import java.util.Base64;

public class encodingDecoding {
    public static void main(String[] args) {
        String samplePassword = "mysamplePassword";

        // Encode into Base64 format
        String basicBase64format = Base64.getEncoder().encodeToString(samplePassword.getBytes());

        // Print encoded string
        System.out.println("Encoded string: " + basicBase64format);
    }
}

 

 import java.util.Base64;

 public class encodingDecoding {
     public static void main(String[] args) {
         String encodedstring = "bXlzYW1wbGVQYXNzd29yZA==";
 
         // Decode the encoded string
         byte[] actualPassword = Base64.getDecoder().decode(encodedstring);
 
         // Convert the byte array to a String
         String finalDecodedPwd = new String(actualPassword);
 
         // Print the decoded string
         System.out.println("Decoded String: " + finalDecodedPwd);
     }
 }
 