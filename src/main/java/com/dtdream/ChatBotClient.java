package com.dtdream;

import com.dtdream.message.Message;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by ML on 2017/5/25.
 */
public class ChatBotClient {

    Gson gson = new Gson();
    HttpClient httpclient = HttpClients.createDefault();

    public SendResult send(String webhook, Message message) throws IOException {
        HttpPost httppost = new HttpPost(webhook);
        httppost.addHeader("Content-Type", "application/json; charset=utf-8");
        StringEntity se = new StringEntity(message.toJsonString(), "utf-8");
        httppost.setEntity(se);
        SendResult sendResult = null;
        HttpResponse response = httpclient.execute(httppost);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String result = EntityUtils.toString(response.getEntity());
            sendResult = gson.fromJson(result, SendResult.class);
            sendResult.setIsSuccess(sendResult.getErrorCode().equals(0));
        }
        return sendResult;
    }
}
