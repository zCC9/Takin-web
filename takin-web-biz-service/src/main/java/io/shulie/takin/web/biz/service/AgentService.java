package io.shulie.takin.web.biz.service;

import java.io.File;

import io.shulie.takin.web.biz.pojo.request.agent.PushOperateRequest;
import io.shulie.takin.web.biz.pojo.response.agent.AgentApplicationNodeProbeOperateResponse;
import io.shulie.takin.web.biz.pojo.response.agent.AgentApplicationNodeProbeOperateResultResponse;

/**
 * agent 服务层
 *
 * @author liuchuan
 * @date 2021/6/7 9:34 上午
 */
public interface AgentService {

    /**
     * 通过应用名称, agentId 获得节点的探针的操作信息
     *
     * @param applicationName 应用名称
     * @param agentId agentId
     * @return 操作信息
     */
    AgentApplicationNodeProbeOperateResponse getOperateResponse(String applicationName, String agentId);

    /**
     * 通过应用名称, agentId 获得节点的探针的安装, 升级的探针包
     *
     * @param applicationName 应用名称
     * @param agentId         agentId
     * @return 文件
     */
    File getFile(String applicationName, String agentId);

    /**
     * 通过 应用名称, agentId, 上报操作结果
     *
     * @param pushOperateRequest 请求的入参
     * @return 更新结果
     */
    AgentApplicationNodeProbeOperateResultResponse updateOperateResult(PushOperateRequest pushOperateRequest);

}
