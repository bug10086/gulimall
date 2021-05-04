package com.xl.gulimall.thirdparty.upload.service;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.xl.common.exception.RRException;
import com.xl.gulimall.thirdparty.upload.config.UploadProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
@EnableConfigurationProperties(UploadProperties.class)
public class UploadService {

    @Autowired
    private FastFileStorageClient storageClient;

    @Autowired
    private UploadProperties props;

//    private static final List<String> ALLOW_TYPES = Arrays.asList("image/png","image/jpeg","image/jpg","image/bmp");

    public String uploadImage(MultipartFile file) {
        String url = null;
        try {
            //校验文件类型
            String contentType = file.getContentType();
            if(!props.getAllowTypes().contains(contentType)){
                throw new RRException("UPLOAD_FILE_TYPE_NOT_MATCH");
            }
            //校验文件内容
            BufferedImage bufferedImage = ImageIO.read(file.getInputStream());
            if(bufferedImage == null){
                throw new RRException("UPLOAD_FILE_TYPE_NOT_MATCH");
            }
            //准备目标路径
//            File dest = new File("D:\\迅雷下载\\自学自作项目\\乐优商城\\upload\\" + file.getOriginalFilename());
            //保存文件到本地
//            file.transferTo(dest);

            //上传到FastDFS
            String extension = StringUtils.substringAfterLast(file.getOriginalFilename(),".");
            StorePath storePath = storageClient.uploadFile(file.getInputStream(), file.getSize(), extension, null);
//            System.out.println("http://image.taotao/"+storePath.getFullPath());
            url = props.getBaseURL()+storePath.getFullPath();
        } catch (IOException e) {
            log.error("【文件上传】 上传文件失败！",e);
            throw new RRException("UPLOAD_FILE_FAIL");
        }
        return url;
    }
}
