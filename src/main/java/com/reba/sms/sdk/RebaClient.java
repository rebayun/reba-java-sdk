package com.reba.sms.sdk;

import com.reba.sms.sdk.domain.*;

import java.util.List;

/**
 * Reba 客户端
 *
 * @author twang
 */
public interface RebaClient {

    List<SmsBatchSubmitResult> smsBatchSubmit(List<SmsSubmit> submits);

    List<SmsStatusReport> smsPullStatusReport();

    List<SmsReplyMessage> smsPullReplyMessage();

    MarketingSmsBatchResult marketingSmsSubmit(String message, String sendTime, List<String> mobiles);

    List<MarketingSmsStatusReport> marketingSmsPullStatusReport();

    List<SmsReplyMessage> marketingSmsPullReplyMessage();

    UserInfo userInfo();

    String smsTest();

}
