package com.test.hardsave.service;

import com.test.hardsave.domain.HardSave;
import com.test.hardsave.repository.HardSaveRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.*;
import java.util.UUID;

@Service
public class HardSaveService {

    private final HardSaveRepository hardSaveRepository;

    @Autowired
    public HardSaveService (HardSaveRepository hardSaveRepository) {
        this.hardSaveRepository =hardSaveRepository;
    }


    public String uploadFile(MultipartFile file) throws IOException {

        String projectPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\images";

        UUID uuid = UUID.randomUUID();

        String filename = uuid + "_" + file.getOriginalFilename();

        File saveFile = new File(projectPath,filename);

        file.transferTo(saveFile);

        String fileUrlAddress ="http://175.118.48.164:7050"+"/images/" +filename;

        System.out.println("fileUrlAddress : " + fileUrlAddress);

        HardSave hardSave = new HardSave(fileUrlAddress);
        hardSaveRepository.save(hardSave);


        return fileUrlAddress;

        // C:\Users\User\Desktop\sparta\test\src\main\resources\static\files
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//        // 사진이 저장된 폴더 경로 변수 선언
//        String imageRoot = fileUrlAddress2;
//
//        System.out.println("[경로] : " + imageRoot);
//        System.out.println("=======================================");
//        System.out.println("\n");
//
//
//        // Resource를 사용해서 로컬 서버에 저장된 이미지 경로 및 파일 명을 지정
//        Resource resource = new FileSystemResource(imageRoot);
//        String check33 = String.valueOf(resource.getURL());
//
//        System.out.println("=======================================");
//
//
//        // 로컬 서버에 저장된 이미지가 있는 경우 로직 처리
//        HttpHeaders header = new HttpHeaders();
//        Path filePath = null;
//        try {
//            filePath = Paths.get(imageRoot);
//
//            System.out.println("filePath : "+filePath);
//            // 인풋으로 들어온 파일명 .png / .jpg 에 맞게 헤더 타입 설정
//            header.add("Content-Type", Files.probeContentType(filePath));
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
