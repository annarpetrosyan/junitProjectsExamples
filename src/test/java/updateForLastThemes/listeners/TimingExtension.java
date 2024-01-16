package updateForLastThemes.listeners;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.logging.Logger;

public class TimingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private static final Logger logger = Logger.getLogger(TimingExtension.class.getName());

    @Override
    public void beforeTestExecution(ExtensionContext context) {
        logger.info(() -> "Starting... " + context.getDisplayName());
        context.getStore(ExtensionContext.Namespace.create(getClass(), context.getRequiredTestMethod()))
                .put("start_time", System.currentTimeMillis());
    }

    @Override
    public void afterTestExecution(ExtensionContext context) {
        long startTime = context.getStore(ExtensionContext.Namespace.create(getClass(), context.getRequiredTestMethod()))
                .remove("start_time", long.class);
        long duration = System.currentTimeMillis() - startTime;
        logger.info(() -> "Finished: " + context.getDisplayName() + " - Duration: " + duration + "ms");
    }
}
