import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class Mastermind extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("resources/mastermindfx.fxml"));
        primaryStage.setTitle("Mastermind");
        primaryStage.setScene((new Scene(root,550,550)));
        primaryStage.show();
            }

    public static ArrayList<Integer> breaker = new ArrayList();

    public static int rowCounter = 0;

    public static ArrayList<Integer> theCode;
    static {
        try {
            theCode = codeMaker();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int pegrow;
    static {
        try {
            pegrow = getIntProperties("codePegRows");
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println(Mastermind.theCode);
        breaker.add(0);
        breaker.add(0);
        breaker.add(0);
        breaker.add(0);

        launch(args);
    }

    public static boolean codeCheck()
    {

        if (breaker.get(0) == theCode.get(0) && breaker.get(1) == theCode.get(1) && breaker.get(2) == theCode.get(2)
                && breaker.get(3) == theCode.get(3))
        {
            return true;
        }
        else
            return false;
    }

    public static int[] codeCheckRightWrong(){
        int correctLocationColor = 0;
        int correctColor = 0;
        int[] codeCheck = new int[2];

        if(breaker.get(0) == theCode.get(0))
            correctLocationColor++;
        if(breaker.get(1) == theCode.get(1))
            correctLocationColor++;
        if(breaker.get(2) == theCode.get(2))
            correctLocationColor++;
        if(breaker.get(3) == theCode.get(3))
            correctLocationColor++;

        if(breaker.contains(theCode.get(0)) && breaker.get(0) != theCode.get(0))
            correctColor++;
        if(breaker.contains(theCode.get(1))&& breaker.get(1) != theCode.get(1))
            correctColor++;
        if(breaker.contains(theCode.get(2))&& breaker.get(2) != theCode.get(2))
            correctColor++;
        if(breaker.contains(theCode.get(3))&& breaker.get(3) != theCode.get(3))
            correctColor++;


        codeCheck[0] = correctLocationColor;
        codeCheck[1] = correctColor;
        return codeCheck;
    }

    public static ArrayList<Integer> codeMaker() throws IOException{
        ArrayList<Integer> test = new ArrayList<>();
        if (getStringProperties("dupsAllowedInCode").equals("false")){
            while(test.size() < 4){
                int random = (int)(Math.random()*5) + 1;
                if(!test.contains(random))
                {
                    test.add(random);
                }
            }
        }
        else{
            while (test.size() < 4) {
                int random = (int) (Math.random() * 5) + 1;
                test.add(random);
            }
        }

        return test;
    }


    public static int getIntProperties(String config) throws IOException {
        Properties properties = readMastermProperties("C:\\Users\\monterrozae\\IdeaProjects\\mastermind-monterrozaeATWIT\\src\\mmind.properties");
        return Integer.parseInt(properties.getProperty(config));
    }

    public static String getStringProperties(String config) throws IOException {
        Properties properties = readMastermProperties("C:\\Users\\monterrozae\\IdeaProjects\\mastermind-monterrozaeATWIT\\src\\mmind.properties");
        return (properties.getProperty(config));
    }

    public static Properties readMastermProperties(String fileName) throws IOException {
        FileInputStream files = null;
        Properties prop = null;
        try {
            files = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(files);
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            files.close();
        }
        return prop;
    }

}
