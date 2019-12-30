package com.spider.end.util.model;

import lombok.Data;

/**
 * @ClassName ResponseObj
 * @Description TODO
 * @Author jiaoqx
 * @Date 2019/12/13 11:22
 * @Version 1.0
 */
@Data
public class ResponseObj<T> {
    public static final String SUCCESS_CODE="0";
    public static final String FAILURE_CODE="1";
    private T data;
    private String code;
    private String message;

    /**
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseObj<T> success(T data){
        ResponseObj returnObj = new ResponseObj();
        returnObj.setCode(SUCCESS_CODE);
        returnObj.setMessage("成功");
        returnObj.setData(data);
        return returnObj;
    }

    public static <T> ResponseObj<T> failure(String message){
        ResponseObj returnObj = new ResponseObj();
        returnObj.setCode(FAILURE_CODE);
        returnObj.setMessage(message);
        return returnObj;
    }
}
