package com.dtdream.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by ML on 2017/5/25.
 */
public class JsoupClient {

    public Document getHTML(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        return document;
    }

}
