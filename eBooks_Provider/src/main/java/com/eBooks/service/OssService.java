package com.eBooks.service;

import com.eBooks.vo.R;
import org.springframework.web.multipart.MultipartFile;


/**
 * @program: OpenMain
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-07-29 12:00
 */
public interface OssService {
    R upload(MultipartFile file);
}
