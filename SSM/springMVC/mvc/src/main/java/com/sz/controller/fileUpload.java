package com.sz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
@RequestMapping("/upload")
public class fileUpload {

    private final String FILE_UPLOAD = "D:" + File.separator + "tempUpload";

    @RequestMapping("/file")
    @ResponseBody
    public String file(
            @RequestParam("username") String username,
            @RequestParam("file") MultipartFile multipartFile
    ) {

        System.out.println("前段传过来的名称：" + username);
        // 1 处理文件上传
        if (!multipartFile.isEmpty()) {

            // 2 如果不为空，再上传
            BufferedOutputStream out = null;
            try {

                // 3 得到字节数据，最终写出去
                byte[] bytes = multipartFile.getBytes();

                // 4 先测试目录是否存在，如果不存在就创建该目录
                File parent = new File(FILE_UPLOAD);
                if (!parent.exists()) {
                    parent.mkdirs();
                    // 5 获取原始文件名
                    String fileName = multipartFile.getOriginalFilename();

                    // 6 解析出文件的前缀 如aaa.txt --> aaa
                    String prefix = fileName.substring(0, fileName.lastIndexOf("."));

                    // 7 解析出文件的后缀 如aaa.txt --> .txt
                    String suffix = fileName.substring(fileName.lastIndexOf("."));

                    // 8 拼接新的文件名
                    String newFileName = prefix + System.currentTimeMillis() + suffix;

                    // 9 构建输出文件目的地
                    File upFile = new File(FILE_UPLOAD + File.separator + newFileName);

                    // 10 构建输出对象
                    out = new BufferedOutputStream(new FileOutputStream(upFile));
                    out.write(bytes);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return "ok";
    }

}
