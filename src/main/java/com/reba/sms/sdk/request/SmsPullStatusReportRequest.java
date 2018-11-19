package com.reba.sms.sdk.request;

import com.reba.sms.sdk.common.RebaRequest;
import com.reba.sms.sdk.response.SmsPullStatusReportResponse;

public class SmsPullStatusReportRequest extends RebaRequest<SmsPullStatusReportResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/pullStatusReport";
    }

    @Override
    public Class<SmsPullStatusReportResponse> getResponseClass() {
        return SmsPullStatusReportResponse.class;
    }
}
