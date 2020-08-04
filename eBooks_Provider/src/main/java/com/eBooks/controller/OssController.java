package com.eBooks.controller;

import com.eBooks.service.OssService;
import com.eBooks.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


/**
 * @program: voter
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-07-17 12:11
 */
@RestController
public class OssController {
    @Autowired
    private OssService service;
    @PostMapping("ebooks/oss/upload.do")
    public R upload(MultipartFile file){
        return service.upload(file);
    }
}
