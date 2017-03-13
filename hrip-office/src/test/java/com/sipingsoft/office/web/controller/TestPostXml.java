package com.sipingsoft.office.web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;

// 发送xml字符串
public class TestPostXml {

    @Test
    public void testPost() {
        String urlStr = "http://localhost:8080/office/jsonPrase";
        try {
            URL url = new URL(urlStr);
            URLConnection con = url.openConnection();
            con.setDoOutput(true);
            con.setRequestProperty("Pragma:", "no-cache");
            con.setRequestProperty("Cache-Control", "no-cache");
            con.setRequestProperty("Content-Type", "application/xml");

            OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
            String xmlInfo = getXmlInfo();
            System.out.println("urlStr=" + urlStr);
            System.out.println("xmlInfo=" + xmlInfo);
            out.write(new String(xmlInfo.getBytes("UTF-8")));
            out.flush();
            out.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = "";
            for (line = br.readLine(); line != null; line = br.readLine()) {
                System.out.println(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getXmlInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("<xmlBean>");
        sb.append("    <name>testXml</name>");
        sb.append("    <value>test</value>");
        sb.append("<xmlBean>");
        return sb.toString();
    }
}
