package util;

import data.User;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.charset.StandardCharsets;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderFromTxt {
    public static User reads(User user){

        Path path = Paths.get("D:\\GitHub2\\new1.txt");

        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

            lines.stream().forEach(System.out::println);
            user.setName(lines.get(0));
            user.setAge(Integer.parseInt(lines.get(1)));
            user.setPassport(Integer.parseInt(lines.get(2)));




        }

        catch (Exception ex) {
            System.out.println("Error File Reading");
        }
        return user;
    }
}
