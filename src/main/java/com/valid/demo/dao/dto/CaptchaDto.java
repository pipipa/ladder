package com.valid.demo.dao.dto;

import lombok.Data;

@Data
public class CaptchaDto {
    private String uuid;
    private String kaptcha;

    public CaptchaDto(String uuid, String kaptcha) {
        this.uuid = uuid;
        this.kaptcha = kaptcha;
    }
}
