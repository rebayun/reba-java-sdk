package com.reba.sms.sdk.request;

import com.reba.sms.sdk.domain.SmsSubmit;
import com.reba.sms.sdk.common.RebaRequest;
import com.reba.sms.sdk.response.SmsBatchSubmitResponse;

import java.util.List;

public class SmsBatchSubmitRequest extends RebaRequest<SmsBatchSubmitResponse> {

    private List<SmsSubmit> submits;

    public List<SmsSubmit> getSubmits() {
        return submits;
    }

    public void setSubmits(List<SmsSubmit> submits) {
        this.submits = submits;
    }

    @Override
    public String getApiUrlPath() {
        return "/sms/batchSubmit";
    }

    @Override
    public Class<SmsBatchSubmitResponse> getResponseClass() {
        return SmsBatchSubmitResponse.class;
    }
}
