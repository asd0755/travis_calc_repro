package kr.ac.gnu.anse.calc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CalcTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalcTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalcTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testadd()
    {
        Calc c = new Calc();
        assertEquals(30, c.add(10, 20));
//        assertTrue( true );
    }
}
