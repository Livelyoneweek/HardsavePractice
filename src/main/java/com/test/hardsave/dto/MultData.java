package com.test.hardsave.dto;

import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

@Getter
public class MultData {

    MultipartFile file;
    String path;
}
