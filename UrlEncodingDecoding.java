import java.util.Base64;

public class UrlEncodingDecoding {
    public static void main(String[] args) {

        // Getting encoder
        Base64.Encoder encoder = Base64.getUrlEncoder();
        // Encoding URL
        String encodedUrl = encoder.encodeToString("https://www.google.com".getBytes());
        System.out.println("Encoded URL: " + encodedUrl);

        // Getting decoder
        Base64.Decoder decoder = Base64.getUrlDecoder();

        // Decoding URL
        String decodedUrl = new String(decoder.decode(encodedUrl));
        System.out.println("Decoded URL: " + decodedUrl);
    }
}
