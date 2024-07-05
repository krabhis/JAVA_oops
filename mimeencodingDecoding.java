import java.util.Base64;

public class mimeencodingDecoding {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getMimeEncoder();
        String message = "Hello, you have cleared the Java certification. Congrats, try to get \n other certifications\r";

        // Encoding the message
        String encodedStr = encoder.encodeToString(message.getBytes());
        System.out.println("Encoded MIME message: " + encodedStr);

        // Decoding the message
        Base64.Decoder decoder = Base64.getMimeDecoder();
        String decodedStr = new String(decoder.decode(encodedStr));
        System.out.println("Decoded message: " + decodedStr);
    }
}
