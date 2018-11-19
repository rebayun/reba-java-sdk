package com.reba.sms.sdk.request;

import com.reba.sms.sdk.response.SmsPullReplyMessageResponse;
import com.reba.sms.sdk.common.RebaRequest;

public class SmsPullReplyMessageRequest extends RebaRequest<SmsPullReplyMessageResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/pullReply";
    }

    @Override
    public Class<SmsPullReplyMessageResponse> getResponseClass() {
        return SmsPullReplyMessageResponse.class;
    }
}
