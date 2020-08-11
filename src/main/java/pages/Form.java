package pages;

import com.epam.reportportal.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Form {
    private static final Logger LOGGER = LoggerFactory.getLogger(Form.class);

    @Step("click in FORM")
    public void click() {
        LOGGER.info("click");
    }
}
