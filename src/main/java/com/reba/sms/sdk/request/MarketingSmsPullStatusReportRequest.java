package com.reba.sms.sdk.request;

import com.reba.sms.sdk.common.RebaRequest;
import com.reba.sms.sdk.response.MarketingSmsPullStatusReportResponse;

public class MarketingSmsPullStatusReportRequest extends RebaRequest<MarketingSmsPullStatusReportResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/marketing/pullStatusReport";
    }

    @Override
    public Class<MarketingSmsPullStatusReportResponse> getResponseClass() {
        return MarketingSmsPullStatusReportResponse.class;
    }

}
