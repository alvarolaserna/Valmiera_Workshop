package stepDefinitions;

import io.netty.handler.logging.LogLevel;
import org.junit.Before;
import sun.security.krb5.Config;
import testUI.Configuration;

import static testUI.UIOpen.open;

public class Hooks {
    @Before
    public void setUp() {
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        Configuration.testUILogLevel = LogLevel.DEBUG;
        Configuration.androidAppPath = "src/test/resources/groceries-app.apk";
        open();
    }
}
