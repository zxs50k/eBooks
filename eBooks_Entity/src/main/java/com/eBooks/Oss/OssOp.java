package com.eBooks.Oss;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @program: OpenMain
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-07-29 12:08
 */
@Data
@NoArgsConstructor
public class OssOp {
    private Integer id;
    private String objname;
    private String bname;
    private Integer type;//
    private LocalDateTime ctime;

    public OssOp(String objname, String bname, Integer type) {
        this.objname = objname;
        this.bname = bname;
        this.type = type;
    }
}