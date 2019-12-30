package com.spider.end.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @ClassName Json
 * @Description TODO
 * @Author jiaoqx
 * @Date 2019/12/13 14:50
 * @Version 1.0
 */
public class Json {
    public static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Json 序列化
     * @param obj
     * @return
     */
    public static String stringify(Object obj){
        if(obj == null){
            return null;
        }
        try {
            return obj instanceof String ? (String) obj : objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static  <T> T parse(String json, Class<T> objectType) throws JsonProcessingException {
        return objectMapper.readValue(json, objectType);
    }
}
