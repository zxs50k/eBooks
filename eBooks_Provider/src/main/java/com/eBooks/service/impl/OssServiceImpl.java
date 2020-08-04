package com.eBooks.service.impl;

import com.eBooks.Oss.OssOp;
import com.eBooks.constant.SystemConstant;
import com.eBooks.dao.OssOpDao;
import com.eBooks.oss.OssCore;
import com.eBooks.service.OssService;
import com.eBooks.util.CensorUtil;
import com.eBooks.util.FileUtil;
import com.eBooks.util.StringUtil;
import com.eBooks.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


/**
 * @program: voter
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-07-17 12:12
 */
@Service
public class OssServiceImpl implements OssService {
    @Autowired
    private OssOpDao opDao;
    @Override
    public R upload(MultipartFile file) {
        if(!file.isEmpty()){
            try {
                //获取上传的内容
                byte[] data=file.getBytes();
                //进行图片内容审核
                if(CensorUtil.checkImg(data)){
                    //上传的逻辑
                    //重命名、限制长度
                    String fn= FileUtil.rename(file.getOriginalFilename());
                    String url= OssCore.sendResouce(SystemConstant.OSS_BUCKET,fn,
                                file.getBytes());
                    if(StringUtil.checkStr(url)){
                        //记录数据库
                        opDao.save(new OssOp(fn,SystemConstant.OSS_BUCKET,SystemConstant.OSSTYPE_IMG));
                        return R.ok("OK",url);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return R.fail("oss上传失败，请检查上传的内容");
    }


}
