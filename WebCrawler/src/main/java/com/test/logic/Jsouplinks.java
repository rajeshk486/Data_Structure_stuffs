/*package com.test.logic;

import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;  
public class Jsouplinks {  
     public static void main( String[] args ) throws IOException{  
            Document doc = Jsoup.connect("http://www.javatpoint.com").get();  
            Elements links = doc.select("a[href]");  
            for (Element link : links) {  
                System.out.println("\nlink : " + link.attr("href"));  
                System.out.println("text : " + link.text());  
            }  
}  
}  */