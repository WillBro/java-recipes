package am.willi.common.file;

import lombok.extern.java.Log;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@RunWith(JUnit4.class)
@Log
public class FileUtilsTest {

    @Test
    public void iterateDirectoryAndLogFilePaths() {
        String searchFilePath = "/home/will/Desktop";
        File[] files = FileUtils.getFile(searchFilePath).listFiles();

        Arrays.stream(requireNonNull(files)).forEach(file -> {
            log.info(Objects.toString(file));
        });
    }
}
