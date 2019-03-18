package com.xwf.controller;

import com.xwf.service.IIndexService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RestController
@RequestMapping("/home")
public class IndexController {

    @Resource
    IIndexService isc;

    @RequestMapping("/index")
    public String index() {
        String name = isc.index().getName();
        String sss = "";
        try {
            sss = new String(name.getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return sss;
    }

    public static void main (String args[]){
        String aa = "hLwaPWZRs8Gmlh4yad6T/TOUXAOCLwtaekKkPKJ5bA1RSj9DsYysfCNaB95w8wPFaxdpyI+LjfRtyfw84E+GZXNLK7wPiOJId7VAhlDqb14zgGEl74AFqkLJHA76tzUq5WNCxrE7P/55tm9W4iy0+qEX5VNraakzZ2iGNvbHO2v8f7zT865l+1SKBYucwHT7hkDUjnZqae9Tv7oLaqK6xw==";
        String cc = URLEncoder.encode(aa);
        String bb = URLDecoder.decode(cc);
System.out.println(cc);
        System.out.println(aa.equals(bb));
    }
}
