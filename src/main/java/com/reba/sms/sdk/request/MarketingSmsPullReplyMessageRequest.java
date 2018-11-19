package com.reba.sms.sdk.request;

import com.reba.sms.sdk.response.SmsPullMarketingReplyMessageResponse;
import com.reba.sms.sdk.common.RebaRequest;

public class MarketingSmsPullReplyMessageRequest extends RebaRequest<SmsPullMarketingReplyMessageResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/marketing/pullReply";
    }

    @Override
    public Class<SmsPullMarketingReplyMessageResponse> getResponseClass() {
        return SmsPullMarketingReplyMessageResponse.class;
    }

}
