import com.epam.reportportal.annotations.Step;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.Page;

public class Test1 extends BaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test1.class);

    @BeforeAll
    void before() {
        LOGGER.info("TEST1 BeforeAll");
    }

    @Test
    void test1() {
        step1();
        step2();
    }

    @Test
    void test2() {
        LOGGER.info("Start Test1.test2");
        Page page1 = new Page();
        page1.getForm().click();
    }

    @Step
    void step1() {
        LOGGER.info("step1");
    }

    @Step
    void step2() {
        LOGGER.info("step2");
    }
}
