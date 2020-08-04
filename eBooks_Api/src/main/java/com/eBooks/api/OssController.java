package com.eBooks.api;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.eBooks.service.OssService;
import com.eBooks.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @program: OpenMain
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-07-29 12:17
 */
@RestController
@RequestMapping("/api/oss/")
public class OssController {
    @Autowired
    private OssService service;

    @PostMapping(value = "upload.do")
    //选择保护的方法，并指定降级的方法
    @SentinelResource(value = "upload.do",fallback = "fallback")
    public R upload(@RequestPart MultipartFile file){
        int i=1/0;
        return service.upload(file);
    }
    //降级方法=保护的方法出现了异常，就会执行降级方法
    public R fallback(@RequestPart MultipartFile file){
        return R.fail("服务降级");
    }

}
