package com.eBooks.sms;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

/**
 * @program: OpenMain
 * @description:为用户发送验证码
 * @author:
 * @create: 2020-07-28 20:51
 **/

public class AliySmsUtil {
    private static String key="LTAIhTvqTSmlmjeQ";
    private static String keysecret="X7X9w0Ck5GEIWgP9tl0Q6sgmFjQuMv";

    /**
     * 发送验证码
     * @param phone 手机号
     * @param code 验证码*/
    public static boolean sendSmsCode(String phone,int code){
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou",
                key, keysecret);
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "来自邢朋辉的短信");
        request.putQueryParameter("TemplateCode", "SMS_115250125");
        request.putQueryParameter("TemplateParam", "{\"code\":"+code+"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            //log.info(response.getData());
            return true;
        } catch (ClientException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 密码找回验证码
     * @param phone 手机号
     * @param code 验证码*/
    public static boolean sendSmsFindCode(String phone,int code){
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou",
                "<accessKeyId>", "<accessSecret>");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "来自邢朋辉的短信");
        request.putQueryParameter("TemplateCode", "SMS_177258097");
        request.putQueryParameter("TemplateParam", "{\"code\":"+code+"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            //log.info(response.getData());
            return true;
        } catch (ClientException e) {
            e.printStackTrace();
            return false;
        }
    }

}
