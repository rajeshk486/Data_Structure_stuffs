package com.test.WebCrawler;

import com.test.logic.WebCrawler;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
/*
 * the below testcase function will test for web crawler which is the only business implementation class
 * positive case:GetlinksSuccess() which tests the live site
 * negative case:GetlinksNegative which tests the negative case giving null/empty value of site*/
   
    public void GetlinksNegative()
    {
    	new WebCrawler().startCrawl("");
        assertEquals( new WebCrawler().startCrawl(""),null );
    }
    
    public void GetlinksSuccess()
    {
    	new WebCrawler().startCrawl("https://wiprodigital.com");
        assertTrue( true );
    }
   
}
