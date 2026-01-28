package loganalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogAnalyzer {

    public static void main(String[] args) {

        // Check if file name is provided
        if (args.length == 0) {
            System.out.println("Please provide the log file name.");
            System.out.println("Usage: java LogAnalyzer server.log");
            return;
        }

        String fileName = args[0];
        int errorCount = 0;
        List<String> errorMessages = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("[ERROR]")) {
                    errorCount++;

                    // Extract error message after [ERROR]
                    String errorMessage = line.replace("[ERROR]", "").trim();
                    errorMessages.add(errorMessage);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Print report
        System.out.println("----- Log Analysis Report -----");
        System.out.println("Total ERROR count: " + errorCount);
        System.out.println();
        System.out.println("Error Messages:");

        for (String msg : errorMessages) {
            System.out.println("- " + msg);
        }
    }
}
