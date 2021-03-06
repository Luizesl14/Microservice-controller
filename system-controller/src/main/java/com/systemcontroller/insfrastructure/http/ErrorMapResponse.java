package com.systemcontroller.insfrastructure.http;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Builder
@Getter
public class ErrorMapResponse {

    private int httpStatus;
    private Map<String, String> errosResp;
    private long timStamp;
}
