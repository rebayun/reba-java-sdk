package com.reba.sms.sdk.request;

import com.reba.sms.sdk.common.RebaRequest;
import com.reba.sms.sdk.response.SmsTestResponse;

public class SmsTestRequest extends RebaRequest<SmsTestResponse> {
    public String getApiUrlPath() {
        return "/sms/test";
    }

    public Class<SmsTestResponse> getResponseClass() {
        return SmsTestResponse.class;
    }
}
