package com.eBooks.vo;

import lombok.Data;

/**
 * @program: OpenMain
 * @description
 * @author:
 * @create: 2020-07-28 16:47
 **/
@Data
public class R<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <E> R<E> ok() {
        R<E> r = new R<>();
        r.setCode(200);

        return r;
    }
    public static <E> R<E> ok(String msg, E obj) {
        R<E> r = new R<>();
        r.setCode(200);
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }
    public static <E> R<E> fail(String msg) {
        R<E> r = new R<>();
        r.setCode(400);
        r.setMsg(msg);
        return r;
    }
}
