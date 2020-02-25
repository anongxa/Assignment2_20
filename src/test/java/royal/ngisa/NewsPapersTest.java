package royal.ngisa;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class NewsPapersTest
{


    NewsPapers Capetimes;
    NewsPapers Vukani;

    @Before
    public void setUp() throws Exception {
        Capetimes = new NewsPapers.Builder()
                .pageNum(88)
                .title("classified")
                .build();
        Vukani = new NewsPapers.Builder()
                .pageNum(88)
                .title("classified")
                .build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void objectEqualityTest()
    {
        Assert.assertEquals(Capetimes,Vukani);
    }

    @Test
    public void objectIdentityTest()
    {
        Assert.assertNotSame(Capetimes,Vukani);
    }

    @Test(timeout = 10)
    public void timeoutTest()
    {
        while(true);
    }

    @Ignore
    @Test
    public void disAblingTest()
    {
        Assert.assertEquals(Capetimes,Vukani);
    }

    @Test(expected = AssertionError.class)
    public void failingTest(){
        Assert.assertEquals(Capetimes,Vukani);
    }
}
