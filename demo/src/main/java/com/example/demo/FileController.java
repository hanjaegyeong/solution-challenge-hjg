package com.example.demo;

import io.opencensus.resource.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class FileController {

    private final StorageProperties storageProperties;
    private final ResourceLoader resourceLoader;

    @GetMapping("/upload")
    public void fileUpload() throws IOException {
        String projectId = storageProperties.getProjectId();
        String bucketName = storageProperties.getBucketName();

        System.out.println(projectId);
        UploadObject.uploadObject(projectId, bucketName, "aaa.png", "C:\\Users\\user\\Desktop\\solution-challenge-hjg\\demo\\src\\main\\resources\\free-icon-settings-3171061.png");
    }
}
