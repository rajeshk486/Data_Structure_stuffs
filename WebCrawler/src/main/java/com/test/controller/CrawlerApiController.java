package com.test.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.logic.SiteNameDto;
import com.test.logic.WebCrawler;

@RestController
@RequestMapping("/crawler")

public class CrawlerApiController {

	@Autowired
	WebCrawler basicWebCrawler;

	@GetMapping(value = "/getlinks")
	public HashMap<String, String> Crawler(@RequestBody SiteNameDto site) {
		HashMap<String, String> links = new HashMap<String, String>();
		if(site.getSiteName().isEmpty() && !(site.getSiteName().contains("http://") || site.getSiteName().contains("https://")))
			{
			links.put("Message:","Not Valid URL!");
				return links;
			}
		Date date = new Date();
		long time = date.getTime();
		Timestamp ts = new Timestamp(time);
		System.out.println("Current Time Stamp before hit: " + ts);
		links = basicWebCrawler.startCrawl(site.getSiteName());//"https://tamil.oneindia.com");//https://wiprodigital.com");

		time = date.getTime();
		Timestamp ts1 = new Timestamp(time);
		System.out.println(ts + "  Current Time Stamp after hit: " + ts1);

		return links;

	}

}
