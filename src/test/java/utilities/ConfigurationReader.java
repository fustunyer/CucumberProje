package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader { //bu classi projemizin her yerinden nesne uretmden miras almadan kullanabilecek sekilde tasarlayalim
    //bunu icin static yapiyoruz.
    static Properties properties;
    static {
        try {
            //C:\Users\Fatih USTUNYER\IdeaProjects\TestNgProject
            String path="configuration.properties";
            FileInputStream file = new FileInputStream(path);
            properties=new Properties();
            properties.load(file);
        } catch (Exception e) {

        }
    }
    public static String getProperty(String key){
        // properties.getProperty("username");-->manager2
        return  properties.getProperty(key);

    }


}
