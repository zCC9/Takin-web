package io.shulie.takin.web.data.result.blacklist;

import java.util.Date;

import lombok.Data;

/**
 * @author 无涯
 * @date 2021/4/6 2:25 下午
 */
@Data
public class BlacklistResult {
    /**
     * 主键id
     */
    private Long blistId;

    /**
     * 黑名单类型
     */
    private Integer type ;

    /**
     * redisKey
     */
    private String redisKey ;

    /**
     * appName
     */
    private String appName ;

    /**
     * 应用id
     */
    private Long applicationId ;

    /**
     * 插入时间
     */
    private Date gmtCreate;

    /**
     * 变更时间
     */
    private Date gmtModified;

    /**
     * 是否可用(0表示未启动,1表示启动,2表示启用未校验)
     */
    private Integer useYn;

    /**
     * 租户id
     */
    private Long customerId;

    /**
     * 用户id
     */
    private Long userId;
}
