package com.dtdream;

import com.dtdream.jsoup.JsoupClient;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by ML on 2017/5/25.
 */
public class Entrance {
    public static void main(String[] args) {
        JsoupClient jsoupClient = new JsoupClient();
        Document doc;
        try {
            //Document document = jsoupClient.getHTML(URLS.NetEaseMusic);
            doc = jsoupClient.getHTML("http://music.163.com/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
