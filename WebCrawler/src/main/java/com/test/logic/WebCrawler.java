package com.test.logic;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class WebCrawler {
	private HashSet<String> links;
	private HashMap<String, String> output;
	private String StartURL;
	private String containsString;

	public WebCrawler() {
		links = new HashSet<String>();
		output = new HashMap<String, String>();
	}

	public HashMap<String, String> startCrawl(String Url) {
		this.setStartURL(Url);
		if (Url.isEmpty()|| Url.equals("") || !(!StartURL.contains("https://") || !StartURL.contains("http://")))
			return null;

		if (StartURL.contains("https://"))
			containsString = StartURL.substring(8, StartURL.length());
		else if (StartURL.contains("http://"))
			containsString = StartURL.substring(7, StartURL.length());
		return getPageLinks(this.StartURL, "");
	}

	public HashMap<String, String> getPageLinks(String URL, String baseURL) {
		if (!links.contains(URL) && (URL.contains(containsString)) && URL.startsWith(StartURL)) {
			try {
				if (links.add(URL))
					output.put(baseURL, URL);
				System.out.println(URL);

				Document document = Jsoup.connect(URL).get();
				Elements linksOnPage = document.select("a[href]");
				for (Element page : linksOnPage) {
					System.out.println("\nlink : " + page.attr("href"));
					System.out.println("text : " + page.text());
					getPageLinks(page.attr("abs:href"), URL);
				}
			} catch (IOException e) {
				System.err.println("For '" + URL + "': " + e.getMessage());
			}
		}
		System.out.println(output);

		return output;
	}

	// getters and setters
	public HashSet<String> getLinks() {
		return links;
	}

	public void setLinks(HashSet<String> links) {
		this.links = links;
	}

	public HashMap<String, String> getOutput() {
		return output;
	}

	public void setOutput(HashMap<String, String> output) {
		this.output = output;
	}

	public String getStartURL() {
		return StartURL;
	}

	public void setStartURL(String startURL) {
		StartURL = startURL;
	}
	// getters and setters

/*	public static void main(String args[]) {
		WebCrawler b = new WebCrawler();
		b.startCrawl("http://www.javatpoint.com");
	}
*/
}
