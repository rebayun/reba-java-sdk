package com.reba.sms.sdk.request;

import java.util.List;

import com.reba.sms.sdk.common.RebaRequest;
import com.reba.sms.sdk.response.MarketingSmsBatchSubmitResponse;

public class MarketingSmsSubmitRequest extends RebaRequest<MarketingSmsBatchSubmitResponse> {

    private String message;
    
    private String sendTime;
    
    private List<String> mobiles;
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public List<String> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<String> mobiles) {
        this.mobiles = mobiles;
    }

    @Override
    public String getApiUrlPath() {
        return "/sms/marketing/submit";
    }

    @Override
    public Class<MarketingSmsBatchSubmitResponse> getResponseClass() {
        return MarketingSmsBatchSubmitResponse.class;
    }

}
