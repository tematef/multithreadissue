import com.epam.reportportal.junit5.ReportPortalExtension;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({ReportPortalExtension.class})
@DisplayNameGeneration(DisplayNameGenerator.Standard.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
}
