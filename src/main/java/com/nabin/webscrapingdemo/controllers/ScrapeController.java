package com.nabin.webscrapingdemo.controllers;

import com.nabin.webscrapingdemo.services.ScrappingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-30
 */
@RestController
@RequiredArgsConstructor
public class ScrapeController {

    private final ScrappingService scrappingService;

    @GetMapping
    public String scrape() throws IOException {
        return scrappingService.scrape();
    }
}
