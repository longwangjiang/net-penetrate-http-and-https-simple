package com.kele.penetrate.protocol;

import lombok.Data;

import java.util.Map;


@Data
@SuppressWarnings("unused")
public class GetRequest extends BaseRequest
{
    private String requestUrl;
    private Map<String,String> headers;
}