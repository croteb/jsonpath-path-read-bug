package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.List;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        try {

                JsonPath path2 = JsonPath.compile( "$.userName" );
                ReadContext ctx = JsonPath.parse("{\"userName\":\"tstark\"}");
                path2.read(ctx);
                assertTrue(true);
                System.out.println("SUCCESS");
        } catch(Exception e){
                e.printStackTrace();
                assertTrue(false);
        }
        assertTrue( true );
    }
}
