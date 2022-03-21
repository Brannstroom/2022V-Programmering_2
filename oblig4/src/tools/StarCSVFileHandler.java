package tools;

import interfaces.ObjectFileHandler;
import models.CelestialBody;
import models.Star;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StarCSVFileHandler implements ObjectFileHandler<Star> {

    @Override
    public void writeObjectsToFile(List<Star> objects, File file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter((new FileWriter(file)))) {
            for(Star star : objects) {
                bufferedWriter.write(star.serialize());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Star> readObjectsFromFile(File file) {

        ArrayList<Star> stars = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                Star star = Star.deserialize(line);
                stars.add(star);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stars;
    }
}
