package util;

import data.User;

import java.io.FileWriter;

public class WriterToTxt {
    public static void writes(User user){
        try(FileWriter writer = new FileWriter("notes3.txt", false)) {

            writer.write(user.getName());


            writer.flush();
        }
        catch (Exception ex) {
            System.out.println("Error File Writing");
        }
    }
}
