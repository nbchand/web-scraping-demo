package com.nabin.webscrapingdemo.services.impl;

import com.nabin.webscrapingdemo.services.ScrappingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-30
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ScrapeServiceImpl implements ScrappingService {
    @Override
    public String scrape() throws IOException {
        String url = "https://medium.com/swlh/understanding-graphql-error-handling-mechanisms-in-spring-boot-604301c9bedb";
        Document document = Jsoup.connect(url).get();
        Element element = document.getElementById("0112");
        if (element == null) {
            log.error("No HTML element found");
            return null;
        }
        return element.ownText();
    }
}
