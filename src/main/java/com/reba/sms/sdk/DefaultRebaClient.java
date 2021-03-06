package com.reba.sms.sdk;

import com.google.gson.Gson;
import com.reba.sms.sdk.domain.*;
import com.reba.sms.sdk.request.*;
import com.reba.sms.sdk.common.RebaApiException;
import com.reba.sms.sdk.common.RebaException;
import com.reba.sms.sdk.common.RebaRequest;
import com.reba.sms.sdk.common.RebaResponse;
import com.reba.sms.sdk.internal.util.HttpUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

/**
 * Reba 客户端
 *
 * @author twang
 */
public class DefaultRebaClient implements RebaClient {

    private static final Log logger = LogFactory.getLog(DefaultRebaClient.class);

    private static final Gson gson = new Gson();

    private String serverUrl;
    private String apikey;

    public DefaultRebaClient(String serverUrl, String apikey) {
        this.serverUrl = serverUrl;
        this.apikey = apikey;
    }

    public List<SmsBatchSubmitResult> smsBatchSubmit(List<SmsSubmit> submits) {
        SmsBatchSubmitRequest request = new SmsBatchSubmitRequest();
        request.setSubmits(submits);
        return execute(request);
    }

    public List<SmsStatusReport> smsPullStatusReport() {
        SmsPullStatusReportRequest request = new SmsPullStatusReportRequest();
        return execute(request);
    }

    public List<SmsReplyMessage> smsPullReplyMessage() {
        SmsPullReplyMessageRequest request = new SmsPullReplyMessageRequest();
        return execute(request);
    }

    public MarketingSmsBatchResult marketingSmsSubmit(String message, String sendTime, List<String> mobiles) {
        MarketingSmsSubmitRequest request = new MarketingSmsSubmitRequest();
        request.setMessage(message);
        request.setSendTime(sendTime);
        request.setMobiles(mobiles);
        return execute(request);
    }

    public List<MarketingSmsStatusReport> marketingSmsPullStatusReport() {
        MarketingSmsPullStatusReportRequest request = new MarketingSmsPullStatusReportRequest();
        return execute(request);
    }

    public List<SmsReplyMessage> marketingSmsPullReplyMessage() {
        MarketingSmsPullReplyMessageRequest request = new MarketingSmsPullReplyMessageRequest();
        return execute(request);
    }

    public UserInfo userInfo() {
        UserInfoRequest request = new UserInfoRequest();
        return execute(request);
    }

    public String smsTest() {
        SmsTestRequest request = new SmsTestRequest();
        return execute(request);
    }

    protected <R, T extends RebaResponse<R>> R execute(RebaRequest<T> request) throws RebaException {
        T res;
        try {
            request.setApikey(apikey);
            String reqJson = gson.toJson(request);
            String reqUrl = serverUrl + request.getApiUrlPath();
            String resJson = HttpUtils.postJson(reqUrl, reqJson);
            Class<T> resClass = request.getResponseClass();
            res = gson.fromJson(resJson, resClass);
            logger.info(resJson);
            if (res.isSuccess()) {
                return res.getResponse();
            }
        } catch (Exception e) {
            logger.error(e);
            throw new RebaException(e);
        }
        throw new RebaApiException(res.getCode(), res.getMessage());
    }

}
