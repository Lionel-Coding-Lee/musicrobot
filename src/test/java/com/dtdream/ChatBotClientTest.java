package com.dtdream;

import com.dtdream.message.MarkdownMessage;
import org.junit.Test;

/**
 * Created by ML on 2017/5/25.
 */
public class ChatBotClientTest {
    ChatBotClient client = new ChatBotClient();
    @Test
    public void send() throws Exception {
        String webhook = "https://oapi.dingtalk.com/robot/send?access_token=381b592ccb1919ff77f00263377ac6a20281c2967bc94c262dcf5b2e38cecf35";
        MarkdownMessage message = new MarkdownMessage();
        message.setTitle("wadaxiwa");
        client.send(webhook, message);
    }

}