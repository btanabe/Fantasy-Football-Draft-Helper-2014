package com.tanabe.ffbdh.datasource;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by Brian on 6/28/14.
 */
public class WebScraper {
    protected static Document getDocument(String url) throws IOException {
        return Jsoup.connect(url).get();
    }
}
