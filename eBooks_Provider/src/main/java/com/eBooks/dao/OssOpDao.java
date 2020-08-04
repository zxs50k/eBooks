package com.eBooks.dao;


import com.eBooks.Oss.OssOp;

import java.util.List;

/**
 * @program: OpenMain
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-07-29 12:09
 */
public interface OssOpDao {
    int save(OssOp ossOp);
    List<OssOp> selectAll();
}
