import org.junit.Assert;
import org.junit.Test;

public class MyIMTtest {
    @Test
    public void testNormalWeight()
    {
        var actualResult = getIMTResult(180f, 75f);
        Assert.assertEquals("нормальной массе тела", actualResult);

    }
    @Test
    public void testZeroHeight ()
    {
        var actualResult = getIMTResult(0f,45f);
        Assert.assertEquals("некорректный рост", actualResult);
    }
    @Test
    public void testZeroWeight ()
    {
        var actualResult = getIMTResult(100f,0f);
        Assert.assertEquals("некорректный вес",actualResult);
    }
    @Test
    public void testWeightDeficit ()
    {
        var actualResult = getIMTResult(180f,52f);
        Assert.assertEquals("выраженный дефицит тела", actualResult);
    }

    @Test
    public void testInsufficientWeight ()
    {
        var actualResult = getIMTResult(180f,55f);
        Assert.assertEquals("недостаточная масса тела", actualResult);
    }

    @Test
    public void testExcessWeight ()
    {
        var actualResult = getIMTResult(180f,125f);
        Assert.assertEquals("избыточная масса тела", actualResult);
    }



    private String getIMTResult(Float heightCm, Float weightKg)

    {

        var userIndex = Math.round(weightKg / Math.pow((heightCm / 100), 2));

        String userResult = null;

        if (userIndex <= 16) {

            userResult = "выраженному дефициту массы тела";

        } else if (userIndex > 16 && userIndex < 19)  {

            userResult = "недостаточной массе тела";

        } else if (userIndex > 19 && userIndex < 25) {

            userResult = "нормальной массе тела";

        } else if (userIndex > 25) {

            userResult = "избыточной массе тела";

        }

        if (heightCm.equals(0.0f)) userResult+="указан некорректный рост";

        return userResult;

    }
}
