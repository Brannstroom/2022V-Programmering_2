package interfaces;

import java.io.File;
import java.util.List;

public interface ObjectFileHandler<T extends Object> {

    void writeObjectsToFile(File file, T objects);

    T readObjectsFromFile(File file);

}
