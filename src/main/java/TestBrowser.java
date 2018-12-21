import org.openqa.selenium.WebDriverException;

import com.machinepublishers.jbrowserdriver.JBrowserDriver;
import com.machinepublishers.jbrowserdriver.Settings;
import com.machinepublishers.jbrowserdriver.Settings.Builder;
import com.machinepublishers.jbrowserdriver.UserAgent;

public class TestBrowser
{
  public static void main(String[] args)
  {
    String[] domains = {
        "971menu.com",
        "anaheimwhitehousewedding.com",
        "wvtailgatecentral.com",
        "8thonglor.com",
        "wmfilms.net",
        "allaboutgreatestates.com",
        "firabackpackers.com",
        "ackerstone.com",
        "cooldad.ca",
        "zutek.com",
        "familyfriends.uk.com"
    };

    for (String domain : domains)
    {
      new TestDomain(domain).start();
    }
  }

  private static class TestDomain extends Thread
  {
    private String domain;

    TestDomain(String domain)
    {
      this.domain = domain;
    }

    @Override
    public void run()
    {
      System.out.println("Testing domain " + domain);
      Builder builder = Settings.builder();

      builder.ssl("trustanything");
      builder.quickRender(true);
      builder.javaOptions("-Xms64m", "-Xmx128m", "-XX:+AggressiveOpts", "-XX:+UseG1GC", "-server", "-Dprism.useFontConfig=false");
      builder.logWarnings(false);
      builder.logWire(false);
      builder.logJavascript(false);
      builder.blockMedia(true);

      builder.userAgent(new UserAgent(null, null, null, null, null, "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0"));

      builder.socketTimeout(25000).connectTimeout(25000).connectionReqTimeout(25000).ajaxResourceTimeout(25000);

      builder.logger(null);

      JBrowserDriver browser = new JBrowserDriver(builder.build());

      try
      {
        String url = "http://" + domain;
        browser.navigate().to(url);
        System.out.println("response for " + url + ": " + browser.getStatusCode());
      }
      catch (WebDriverException ex)
      {
        ex.printStackTrace();
      }
      finally
      {
        browser.quit();
      }
    }
  }
}
