package com.example.demo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class StorageProperties {

    @Value("${google.storage.projectId}")
    private String projectId;

    @Value("${google.storage.bucketName}")
    private String bucketName;
}
