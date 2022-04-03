package com.kele.penetrate.protocol;

import lombok.Data;

import java.io.Serializable;

@Data
public class HandshakeResult implements Serializable
{
    private boolean isSuccess;
    private String accessAddress;
}