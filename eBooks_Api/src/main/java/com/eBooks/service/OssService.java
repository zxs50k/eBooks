package com.eBooks.service;

import com.eBooks.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @program: OpenMain
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-07-29 12:13
 */
@FeignClient("ebooksprovider")
public interface OssService {
    @PostMapping(value = "ebooks/oss/upload.do",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    R upload(MultipartFile file);
}
