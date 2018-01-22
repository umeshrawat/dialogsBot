package com.marketbot.resources;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ChatResource {

    // Find your Account Sid and Token at twilio.com/user/account
    private static final String ACCOUNT_SID = "ACecbfc56f01c08832f38de7574aa8ba22";
    private static final String AUTH_TOKEN = "afe5221550317abf9aaa1a60e0ab668f";
    Map<String, Integer> customerComms = new HashMap<String, Integer>();
    final String message1 = "Welcome to Narula Insurance. We partner with more than twenty insurance companies and will find the best quote for you based on your personal driving history. We will beat the current premium you pay. Just reply to us using the  following information : \n" +
            "1)\tYour Full Name\n" +
            "2)\tYour Address\n" +
            "3)\tNumber of vehicles you have\n" +
            "4)\tNames of other drivers on the policy\n" +
            "5)\tYour Current Insurance Provider\n" +
            "6)\tHow long have you been with current insurance provider?\n" +
            "7)\tYour Current Premium\n" +
            "Thank you so much for giving us an opportunity to serve you. You will not be disappointed.\n";
    final String message2 = "Thank you for getting back to us. We will be in touch very soon.";

    public static String getFromNumberFromBody(HttpServletRequest request) throws IOException {

        String fromNumber = null;
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            InputStream inputStream = request.getInputStream();
            if (inputStream != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append("");
            }
        } catch (IOException ex) {
            throw ex;
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    throw ex;
                }
            }
        }

        fromNumber = extractFromNumber(stringBuilder);
        return fromNumber;

    }

    private static String extractFromNumber(StringBuilder stringBuilder) {
        int start = stringBuilder.indexOf("From=");

        if (start == -1) {
            return null;
        }
        stringBuilder.delete(0, start + 8);

        int end = stringBuilder.indexOf("ApiVersion");

        stringBuilder.delete(end - 1, stringBuilder.length());
        return stringBuilder.toString();
    }
}
