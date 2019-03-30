package com.chuange.aishijing.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.chuange.aishijing.pojo.recommendmanage.AndroidVersion;
import com.chuange.aishijing.pojo.recommendmanage.IOSVersion;
import com.chuange.aishijing.service.castManage.VersionManageService;
import com.chuange.aishijing.util.CommonConstant;
import com.chuange.aishijing.util.ResultModel;
import com.chuange.aishijing.util.ResultTools;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;

@Controller
@SpringBootApplication
public class IOSManageController {
	@Autowired
	private VersionManageService versionService;
	
	/**
	 * 新增
	 * @param cast
	 * @return
	 */
	@RequestMapping("/insertIOS")
	@ResponseBody
	public ResultModel insert(@RequestBody IOSVersion ios){
		 ios=versionService.insert(ios);
		 Map<String, Object> map = new HashMap();
         map.put("ios","用户名或密码不能为空");
         return ResultTools.result(1, "", map);
	}
	/**
	 * 新增android
	 * @param cast
	 * @return
	 */
	@RequestMapping("/insertAndroid")
	@ResponseBody
	public ResultModel insertAn(@RequestBody AndroidVersion an){
		an=versionService.insertAndroid(an);
		 Map<String, Object> map = new HashMap();
         map.put("android",an);
         return ResultTools.result(1, "", map);
	}
	/**
	 * 上传安装包
	 * @param file
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping("/uploadPackage")
	@ResponseBody
	public String FileUpload(@RequestBody(required = false) MultipartFile files) {
		// 1 初始化用户身份信息(secretId, secretKey)
        COSCredentials cred = new BasicCOSCredentials(CommonConstant.ACCESSKEY, CommonConstant.SECRETKRY);
        // 2 设置bucket的区域, COS地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
        ClientConfig clientConfig = new ClientConfig(new Region(CommonConstant.BUCKET));
        // 3 生成cos客户端
        COSClient cosclient = new COSClient(cred, clientConfig);
        // bucket的命名规则为{name}-{appid} ，此处填写的存储桶名称必须为此格式
        String bucketName = "android-1257958645";

        // 简单文件上传, 最大支持 5 GB, 适用于小文件上传, 建议 20 M 以下的文件使用该接口
        // 大文件上传请参照 API 文档高级 API 上传
        URL url =null;
        try {
            // 指定要上传到 COS 上的路径（qianzhui：就是你的文件夹名称，自己定义）

            File toFile = null;
            if(files.equals("")||files.getSize()<=0){
                files = null;
            }else {
                InputStream ins = null;
                ins = files.getInputStream();
                toFile = new File(files.getOriginalFilename());
                inputStreamToFile(ins, toFile);
                ins.close();
            }
            String name = toFile.getName();
            String key = name;
            System.out.println("key:"+key);
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key,toFile);
            PutObjectResult putObjectResult = cosclient.putObject(putObjectRequest);
            Date expiration = new Date(new Date().getTime() + 5 * 60 * 10000);
             url = cosclient.generatePresignedUrl(bucketName, key, expiration);
            System.out.println("url:"+url);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭客户端(关闭后台线程)
            cosclient.shutdown();
        }
        return url.toString();
		}
	public static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
