package com.marketbot.api;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import static javax.ws.rs.core.HttpHeaders.USER_AGENT;

public class SlackUtil {

    static CloseableHttpClient httpClient = HttpClientBuilder.create().build();

    public static void postToSlack(String str) throws IOException {

        String url = "https://hooks.slack.com/services/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";

        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);
        str = "{"+"\"speech\""+ ":" + "\"Thank you Mr. for getting back to us. We will be in touch very soon.\""+"}";
        StringEntity entity = new StringEntity(str);
        post.setEntity(entity);
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-type", "application/json");

        HttpResponse response = client.execute(post);
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
    }
}
