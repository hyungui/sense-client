package com.cochlear.ai;

public interface CochlearResultListener {
    void onResult(String result);
    void onError(String error);
    void onComplete();
}