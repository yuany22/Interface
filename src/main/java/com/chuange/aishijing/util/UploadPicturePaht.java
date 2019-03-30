package com.chuange.aishijing.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Administrator on 2018-11-23.
 */

@Configuration
public class UploadPicturePaht implements WebMvcConfigurer {
	/**
     * 上传图片路径
     */
    public static final String UPLOAD_PATH="alidata/www/ishijing/images/pic/";
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/**").addResourceLocations("file:/alidata/www/ishijing/images/pic/");
    }


}
