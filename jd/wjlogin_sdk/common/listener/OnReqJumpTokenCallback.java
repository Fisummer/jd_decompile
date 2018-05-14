package jd.wjlogin_sdk.common.listener;

import jd.wjlogin_sdk.model.FailResult;

/* compiled from: TbsSdkJava */
public interface OnReqJumpTokenCallback {
    void onError(String str);

    void onFail(FailResult failResult);

    void onSuccess(String str, String str2);
}
