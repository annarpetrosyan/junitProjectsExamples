package updateForLastThemes.listeners;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class FailureLoggingExtension implements TestExecutionExceptionHandler {

    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        System.out.println("Failed: " + context.getDisplayName());
        System.out.println("Exception message: " + throwable.getMessage());
        throw throwable;
    }
}

