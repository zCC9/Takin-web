package io.shulie.takin.web.amdb.api.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import io.shulie.amdb.common.request.link.CalculateParam;
import io.shulie.takin.web.amdb.bean.common.AmdbResult;
import io.shulie.takin.web.amdb.util.HttpClientUtil;
import io.shulie.takin.web.amdb.api.NotifyClient;
import io.shulie.takin.web.common.exception.TakinWebException;
import io.shulie.takin.web.common.exception.TakinWebExceptionEnum;
import io.shulie.takin.web.common.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.takin.properties.AmdbClientProperties;
import org.springframework.stereotype.Component;

/**
 * @author shiyajian
 * create: 2020-12-29
 */
@Component
@Slf4j
public class NotifyClientImpl implements NotifyClient {

    public static final String NOTIFY_START_CALCULATE_PATH = "/amdb/linkConfig/openLinkConfig";

    public static final String NOTIFY_STOP_CALCULATE_PATH = "/amdb/linkConfig/closeLinkConfig";

    @Autowired
    private AmdbClientProperties properties;

    @Override
    public boolean startApplicationEntrancesCalculate(String applicationName, String serviceName,
        String method, String type,String extend) {
        String url = properties.getUrl().getAmdb() + NOTIFY_START_CALCULATE_PATH;
        CalculateParam calculateParam = new CalculateParam();
        calculateParam.setAppName(applicationName);
        calculateParam.setRpcType(type);
        calculateParam.setServiceName(serviceName);
        calculateParam.setMethod(method);
        calculateParam.setExtend(extend);

        String responseEntity = HttpClientUtil.sendPost(url, calculateParam);
        if (StringUtils.isBlank(responseEntity)) {
            log.error("前往amdb开始链路计算返回异常,请求地址：{}，请求参数：{}", url, JsonUtil.bean2Json(calculateParam));
            throw new TakinWebException(TakinWebExceptionEnum.LINK_THIRD_PARTY_ERROR,"前往amdb开始链路计算返回为空!");
        }
        AmdbResult<String> amdbResponse = JSON.parseObject(responseEntity,
                new TypeReference<AmdbResult<String>>() {
                });
        if (amdbResponse == null || !amdbResponse.getSuccess()) {
            log.error("前往amdb开始链路计算返回异常,请求地址：{}，请求参数：{}", url, JsonUtil.bean2Json(calculateParam));
            throw new TakinWebException(TakinWebExceptionEnum.LINK_THIRD_PARTY_ERROR,"前往amdb开始链路计算返回异常!");
        }
        return true;
    }

    @Override
    public boolean stopApplicationEntrancesCalculate(String applicationName, String serviceName, String method,
        String rpcType,String extend) {
        String url = properties.getUrl().getAmdb() + NOTIFY_STOP_CALCULATE_PATH;
        CalculateParam calculateParam = new CalculateParam();
        calculateParam.setAppName(applicationName);
        calculateParam.setRpcType(rpcType);
        calculateParam.setServiceName(serviceName);
        calculateParam.setMethod(method);
        calculateParam.setExtend(extend);

        String responseEntity = HttpClientUtil.sendPost(url, calculateParam);
        if (StringUtils.isBlank(responseEntity)) {
            log.error("前往amdb结束链路计算返回异常,请求地址：{}，请求参数：{}", url, JsonUtil.bean2Json(calculateParam));
            throw new TakinWebException(TakinWebExceptionEnum.LINK_THIRD_PARTY_ERROR,"前往amdb结束链路计算返回为空!");
        }
        AmdbResult<String> amdbResponse = JSON.parseObject(responseEntity,
                new TypeReference<AmdbResult<String>>() {
                });
        if (amdbResponse == null || !amdbResponse.getSuccess()) {
            log.error("前往amdb结束链路计算返回异常,请求地址：{}，请求参数：{}", url, JsonUtil.bean2Json(calculateParam));
            throw new TakinWebException(TakinWebExceptionEnum.LINK_THIRD_PARTY_ERROR,"前往amdb结束链路计算返回异常!");
        }
        return true;
    }
}
