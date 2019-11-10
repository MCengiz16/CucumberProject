package Base;

import SeleniumUtil.SeleniumUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Base {
  public static SeleniumUtil seleniumUtil = new SeleniumUtil();


    public static String url="https://rahulshettyacademy.com/seleniumPractise/#/";





    public static String timeStamp = new SimpleDateFormat ("yyyy_MM_dd__hh_mm_ss").format(new Date ());

    public static Properties prop;

    public Properties prop() throws IOException {

         prop=new Properties ();
        InputStream is = new FileInputStream ("C:\\Workplace\\Intellij Projects\\CucumberProject\\src\\test\\java\\Base\\globel.properties");
        prop.load (is);

        return prop;
    }








}
