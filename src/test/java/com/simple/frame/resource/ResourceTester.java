package com.simple.frame.resource;

import com.simple.frame.resource.spi.Resource;
import com.simple.frame.resource.support.classpath.ClassPathResource;
import com.simple.frame.resource.support.url.UrlResource;

import java.net.MalformedURLException;

/**
 * Created by lvxiang@ganji.com 2018/12/6 11:19
 *
 * @author <a href="mailto:lvxiang@ganji.com">simple</a>
 */
public class ResourceTester {
    public static void main(String[] args) throws MalformedURLException {
        Resource classPathResource = new ClassPathResource("test.xml");
        System.out.println(classPathResource.exists());
        Resource urlResource = new UrlResource("http://igit.58corp.com/?utf8=%E2%9C%93&name=adinterface&sort=latest_activity_desc");
        System.out.println(urlResource.exists());
         urlResource = new UrlResource("https://www.baidu.com/");
        System.out.println(urlResource.exists());
    }

}
