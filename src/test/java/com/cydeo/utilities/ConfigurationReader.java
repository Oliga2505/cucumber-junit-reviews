package com.cydeo.utilities;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

    public class ConfigurationReader {


        //Create the Properties object
        //make it "private" so we are limited access to the object

        private static Properties properties = new Properties();
        static {

            try {
                //Open file using FileInputStream

                FileInputStream file = new FileInputStream("configuration.properties");
                properties.load(file);

                file.close();

            } catch (IOException e) {


                System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!");
                e.printStackTrace();

            }

        }

//create a utility method to use the object to read

        public static String getProperty(String keyword){

            return properties.getProperty(keyword);

        }



    }


