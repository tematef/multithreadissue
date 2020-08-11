package pages;

import com.epam.reportportal.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Page {
    private static final Logger LOGGER = LoggerFactory.getLogger(Page.class);

    private Form form = new Form();

    @Step("Get FORM")
    public Form getForm() {
        LOGGER.info("Get FORM");
        return form;
    }
}
