package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FileService {

    @Autowired
    private StorageProperties storageProperties;

    public void fileUpload() throws IOException {
        String projectId = storageProperties.getProjectId();
        String bucketName = storageProperties.getBucketName();

        System.out.println(projectId);
        UploadObject.uploadObject(projectId, bucketName, "aa.png", "C:\\Users\\user\\Desktop\\demo\\src\\main\\resources\\free-icon-settings-3171061.png");
    }
}
