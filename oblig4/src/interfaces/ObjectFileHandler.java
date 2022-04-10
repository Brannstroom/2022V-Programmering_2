package interfaces;

import java.io.File;

public interface ObjectFileHandler<T extends Object> {

    void writeObjectsToFile(File file, T objects);

    T readObjectsFromFile(File file);

}
