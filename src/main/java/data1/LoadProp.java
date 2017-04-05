package data1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Dev on 18/03/2017.
 */
public class LoadProp {

        static Properties prop;
        static String fileName = "TestDataConfig.properties";
        static String fileLocation = "C:\\Users\\Dev\\IdeaProjects\\Yopa\\src\\test\\resources\\properties\\TestDataConfig.properties";
        static FileInputStream input;
        public String getProperty(String key)
        {

            prop = new Properties();
            try {
                input = new FileInputStream(fileLocation);
                prop.load(input);
                input.close();
            } catch (IOException e){
                e.printStackTrace();
            }return prop.getProperty(key);
        }
    }
