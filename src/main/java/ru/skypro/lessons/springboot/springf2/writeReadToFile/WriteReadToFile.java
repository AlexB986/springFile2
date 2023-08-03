package ru.skypro.lessons.springboot.springf2.writeReadToFile;


import jakarta.annotation.Resource;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.lessons.springboot.springf2.pojo.Report;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Optional;

public class WriteReadToFile {


    /**
     * копирует фаил.
     */
    public static void writeToFile(MultipartFile file) {
        OutputStream outputStream;
        String filePath = "test.json";
        try {
            outputStream = new FileOutputStream(filePath);
            outputStream.write(file.getBytes());
            outputStream.flush();
        } catch (IOException ioException) {
            ioException.printStackTrace();

        }

    }

    public static Resource dowloadFile(Optional<Report> reportsfindById) {
        String fileName = "responseTest.Json";
        Resource resource = (Resource) new ByteArrayResource(reportsfindById.get().getData().getBytes());
        return resource;
    }


}

