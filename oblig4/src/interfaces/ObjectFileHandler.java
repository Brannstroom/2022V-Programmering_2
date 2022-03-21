package interfaces;

import java.io.File;
import java.util.List;

public interface ObjectFileHandler<T extends Object> {

    void writeObjectsToFile(List<T> objects, File file);

    List<T> readObjectsFromFile(File file);

}
