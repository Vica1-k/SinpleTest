import org.junit.Assert;
import org.junit.Test;

public class TranslatingExam {
    @Test
    public void testReturt2 () {
        var actualResult =getMarkResult(35);
        Assert.assertEquals("2", actualResult);
    }
    private String getMarkResult(Integer mark)

    {

        if(mark>=0 && mark <=35) return "2";

        if(mark>35 && mark <=56) return "3";

        if(mark>56 && mark<71) return "4";

        if(mark>72 && mark<100) return "5";
        return "no mark result";
    }
}
