import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DictionaryTest {
    Distionary dict=new Distionary("Example");

    public DictionaryTest() {

    }

    @BeforeClass
    void setUpClass()
    {
      //dict = new Distionary("Example");

    }

    @AfterClass
    void tearDownClass()
    {
        //this.dict=null;
        //Anuller les instances
    }

    @Test
    public void testDictionaryName() {
        Assert.assertEquals(dict.getName(), "Example");
    }
    @Test
    public void testDictionaryIsEmpty() {
        Assert.assertFalse(dict.isEmpty());
    }
   /* @Test
    public void testOnTranslation(){
        //dict.addTranslation("contre", "against");
        //Assert.assertEquals(dict.getTranslation("contre"), "against");


    }*/


}
