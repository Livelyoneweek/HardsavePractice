package com.test.hardsave.controller;


import com.test.hardsave.service.HardSaveService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;

@RestController
public class HardSaveController {

    String filename;
    private final HardSaveService hardSaveService;


    @Autowired
    public HardSaveController (HardSaveService hardSaveService) {
        this.hardSaveService = hardSaveService;
    }

//    @GetMapping("/upload/check")
//    public String checkFile (Model model) {
//        System.out.println("test11");
//
//        model.addAttribute("filepath",urlAdress);
//        return "imageview";
//    }



    //@RequestParam("file")
    @PostMapping("/upload/spring")
    public String saveFile(MultipartFile file) throws IOException {

        filename = hardSaveService.uploadFile(file);

        return filename;

    }


}
