package com.example.realflocoding

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Kakao SDK 초기화 (발급받은 네이티브 앱 키 사용)
        KakaoSdk.init(this, "kakao87c80817df3bc6306b389e4c0dd64862")
    }
}

