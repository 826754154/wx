package com.hzit.wxnet.service;

import com.hzit.wxnet.service.vo.QrCode.QrCodeResponse;
import com.hzit.wxnet.service.vo.QrCode.QrCodeVo;

public interface QrcodeService {
    String QR_STR_SCENE="QR_STR_SCENE";
   String QR_LIMIT_SCENE="QR_LIMIT_SCENE";


    /**
     * 利用Redis自动生成场景值来创建永久二维码
     * @return
     */
    QrCodeResponse createLimitQrcode();

    /**
     * 利用Redis自动生成场景值来创建临时二维码
     * @param limitTime
     * @return
     */
    QrCodeResponse createTempQrcode(int limitTime);
}
