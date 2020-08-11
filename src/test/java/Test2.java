import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.Page;

public class Test2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test1.class);

    @Test
    void test2() {
        LOGGER.info("Start Test2.test2");
        Page page1 = new Page();
        page1.getForm().click();
    }
}
