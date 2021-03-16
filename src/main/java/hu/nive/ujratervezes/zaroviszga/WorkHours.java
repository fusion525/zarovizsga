package hu.nive.ujratervezes.zaroviszga;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WorkHours {

    List<String> lines = new ArrayList<>();

    public void readLines(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine())  != null) {
            lines.add(line);
        }
    }

    public String minWork(String File)
    {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(File))) {
            new WorkHours().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        List<Integer> workHours = new ArrayList<>();

        for (String line : lines)
        {
            String parts[] = line.split(",");

            workHours.add(Integer.parseInt(parts[1]));
        }

        int mini = 0;

        for (int i = 0; i<workHours.size(); i++)
        {
            if (workHours.get(i) < workHours.get(mini)){
                mini = i;
            }
        }

        return lines.get(mini);

    }

}