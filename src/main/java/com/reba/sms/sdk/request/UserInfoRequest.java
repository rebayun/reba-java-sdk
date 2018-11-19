package com.reba.sms.sdk.request;

import com.reba.sms.sdk.common.RebaRequest;
import com.reba.sms.sdk.response.UserInfoResponse;

public class UserInfoRequest extends RebaRequest<UserInfoResponse> {

    @Override
    public String getApiUrlPath() {
        return "/user/info";
    }

    @Override
    public Class<UserInfoResponse> getResponseClass() {
        return UserInfoResponse.class;
    }
}
