package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theDuckDuckGoHomePage() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(DuckDuckGoHomePage.class));
    }
    public static Performable theDemoAppliTools() {
        return Task.where("{0} opens the Application Tools",
//                Open.browserOn().the(AppliTools.class));
                Open.url("https://demo.applitools.com"));
    }
}
