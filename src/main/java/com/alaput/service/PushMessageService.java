package com.alaput.service;

import com.alaput.dto.OrderDTO;

/**
 * 推送消息
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     *
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
