package com.yc.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.common.collect.Maps;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.yc.demo.commom.utils.PdfUtils.pdfout;

@SpringBootTest
class DemoApplicationTests {
    private static final String S3_URL = "url";
    private static final String S3_BUCKET_NAME = "bucketName";
    private static final String S3_S3SAVEFILE_NAME = "s3SaveFileName";
    private static final String S3_NAME = "name";

    @Test
    void contextLoad1s() {
        String s="38450800," +
                "38444763," +
                "38408592," +
                "38285163," +
                "38284440," +
                "38280920," +
                "38280065," +
                "38279908," +
                "38279307," +
                "38279192," +
                "38278029," +
                "38277982," +
                "38277882," +
                "38277774," +
                "38277744," +
                "38277723," +
                "38268633," +
                "38268397," +
                "38267251," +
                "38266804," +
                "38266505," +
                "38266114," +
                "38265816," +
                "38265357," +
                "38265212," +
                "38264941," +
                "38264773," +
                "38264757," +
                "38264569," +
                "38263009," +
                "38262924," +
                "38262095," +
                "38261218," +
                "38260951," +
                "38260673," +
                "38260626," +
                "38260308," +
                "38259710," +
                "38259693," +
                "38259561," +
                "38259378," +
                "38259293," +
                "38258749," +
                "38257852," +
                "38256491," +
                "38255579," +
                "38255568," +
                "38254929," +
                "38254818," +
                "38253990," +
                "38253789," +
                "38253511," +
                "38253493," +
                "38253385," +
                "38252967," +
                "38252870," +
                "38252708," +
                "38252427," +
                "38252074," +
                "38251690," +
                "38251214," +
                "38251034," +
                "38251002," +
                "38248612," +
                "38248591," +
                "38248385," +
                "38248285";
        String[] objects = s.split(",");
        for (String object : objects) {
            UpdateTicketSelective date=new UpdateTicketSelective(Long.valueOf(object),6);
            Pojo pojo=new Pojo("singleAppealTicket",Long.valueOf(object),date,"{\"state\":\"6\"}");
            HttpClientUtil.doPostJson("http://crm.ke.com/web/fe/v1/qc/ticketDMLServiceImpl/repairData"
                    ,pojo,null);
            System.out.println(111);
        }

    }


    @Test
    void contextLoads() {
        Map map=new HashMap();
        String s = JSON.toJSONString(map);
        String str1="http://file.ljcdn.com/psd-sinan-file/loadVoice_b843e5de64e8f491f4aed9db7d73af7a_transfer.wav";
        String str2="[\"http://file.ljcdn.com/psd-sinan-file/loadVoice_b843e5de64e8f491f4aed9db7d73af7a_transfer.wav\",\"http://file.ljcdn.com/psd-sinan-file/loadVoice_b843e5de64e8f491f4aed9db7d73af7a_transfer.wav\"]";
        String str3="[{\"url\":\"http://file.ljcdn.com/psd-sinan-file/loadVoice_b843e5de64e8f491f4aed9db7d73af7a_transfer.wav\"}]";
        String str4="[{\"url\":\"http://file.ljcdn.com/psd-sinan-file/loadVoice_b843e5de64e8f491f4aed9db7d73af7a_transfer.wav\"},{\"url\":\"http://file.ljcdn.com/psd-sinan-file/loadVoice_b843e5de64e8f491f4aed9db7d73af7a_transfer.wav\"}]";

        List<String> keys=new ArrayList<>();
        keys.add(str1); keys.add(str2); keys.add(str3); keys.add(str4);
        Map map1 = getMap(null, keys, null);
        System.out.println(11111);
    }
    @Test
    void contextLoads6() {
        Map<String,String> map = new HashMap();
        map.put("orderNo","UQWDHAOHQWODHQOOIWQHJD");
        map.put("chengpin","8971ISAHDIQHIQHI");
        map.put("xuhao","京IUASGDIAUSDHGAIGHID");
        map.put("createTime","2020-02-02 08:08:08");


        Map<String,Object> o=new LinkedHashMap<>();

        for (int i = 1; i < 72; i++) {
            o.put(String.valueOf(i),"");
        }
        System.out.println(JSON.toJSONString(o));
        System.out.println(1);
        //pdfout(o);
    }


    @Test
    void contextLoads3() throws Exception {

        List<String> str=new ArrayList<>();
        str.add("2");
        str.add("1");
        List<String> str2=new ArrayList<>();
        str2.add("1");
        str2.add("2");
        System.out.println(str.containsAll(str2));
    }
    private Map getMap(String project, List<String> keys, Map<String, Object> params){
        if (CollectionUtils.isEmpty(keys)) {
            return Maps.newHashMapWithExpectedSize(0);
        }
        Map<String, Object> mappingMap = Maps.newHashMapWithExpectedSize(keys.size());
        try {
            for (String key : keys) {
               if(StringUtil.isValidJsonArray(key)){
                   List<Map<String,Object>> list=new ArrayList<>();
                   JSONArray arrayFiles = JSON.parseArray(key);
                   for (Object arrayFile : arrayFiles) {
                        if(arrayFile instanceof String){
                            list.add(doUrl((String) arrayFile));
                        }else if(arrayFile instanceof Map){
                            JSONObject fJson = JSON.parseObject(StringUtil.removeNull(arrayFile));
                            list.add(doUrl(fJson.getString(S3_URL)));
                       }
                   }
                   mappingMap.put(key,list);
               }else {
                   mappingMap.put(key,doUrl(key));
                }
            }
        }catch (Exception e){
            return Maps.newHashMapWithExpectedSize(0);
        }
        return mappingMap;
    }

    private Map<String, Object> doUrl(String url){
        Map<String, Object> mappingMap = Maps.newHashMapWithExpectedSize(3);
        if(url.startsWith("http:")) {
            url= url.replaceFirst("http://", "");
        } else if(url.startsWith("https:")) {
            url= url.replaceFirst("https://", "");
        }
        String[] split = url.split("\\/");
        StringBuilder s3SaveFileName=new StringBuilder();

        StringBuilder bucketName=new StringBuilder();

        for (int i = 1; i < split.length-1; i++) {
            bucketName.append(split[i]).append("/").toString();
        }
        mappingMap.put(S3_BUCKET_NAME,bucketName.toString().substring(0,bucketName.toString().length()-1));
        mappingMap.put(S3_S3SAVEFILE_NAME,split[split.length-1]);
        mappingMap.put(S3_NAME,split[split.length-1]);

        return mappingMap;
    }



}
