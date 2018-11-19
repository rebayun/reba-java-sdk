package com.reba.sms.sdk;

import com.reba.sms.sdk.common.RebaApiException;
import com.reba.sms.sdk.domain.SmsSubmit;
import org.junit.Test;

import java.util.Arrays;

public class RebaClientTest {

    private static final String serverUrl = "https://sms.rebayun.com/api";
    private static final String apikey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";// 修改为您的apikey
    private static final RebaClient client = new DefaultRebaClient(serverUrl, apikey);

    @Test
    public void testSmsBatchSubmit() {
        try {
            client.smsBatchSubmit(Arrays.asList(
                    new SmsSubmit("187xxxxxxxx", "【热巴云通讯】您的验证码是：1234"),//修改为你要发送的手机号和短信内容
                    new SmsSubmit("186xxxxxxxx", "【热巴云通讯】您的验证码是：5678")//修改为你要发送的手机号和短信内容
            ));
        } catch (RebaApiException e) {
            System.out.println("RebaApiException, code: " + e.getCode() + ", message: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSmsPullStatusReport() {
        try {
            client.smsPullStatusReport();
        } catch (RebaApiException e) {
            System.out.println("RebaApiException, code: " + e.getCode() + ", message: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSmsPullReplyMessage() {
        try {
            client.smsPullReplyMessage();
        } catch (RebaApiException e) {
            System.out.println("RebaApiException, code: " + e.getCode() + ", message: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
