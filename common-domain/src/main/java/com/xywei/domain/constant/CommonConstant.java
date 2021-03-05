package com.xywei.domain.constant;

/**
 * @Author future
 * @DateTime 2021/3/5 13:43
 * @Description
 */
public class CommonConstant {

    //////////////////////////////////////订单状态//////////////////////////////////////
    /**
     * @Description 1000 取消
     * @Author future
     * @DateTime 2021/3/5 14:05
     **/
    public final static int ORDER_STATUS_CANCEL = 1000;
    /**
     * @Description 待支付
     * @Author future
     * @DateTime 2021/3/5 14:05
     **/
    public final static int ORDER_STATUS_PAYING = 1001;
    /**
     * @Description 支付完成
     * @Author future
     * @DateTime 2021/3/5 14:05
     **/
    public final static int ORDER_STATUS_PAY_OK = 1002;
    /**
     * @Description 下单完成，出库中
     * @Author future
     * @DateTime 2021/3/5 14:06
     **/
    public final static int ORDER_STATUS_OUTBOUND = 1003;
    /**
     * @Description 配送中
     * @Author future
     * @DateTime 2021/3/5 14:06
     **/
    public final static int ORDER_STATUS_DELIVERY = 1004;
    /**
     * @Description 订单完成
     * @Author future
     * @DateTime 2021/3/5 14:06
     **/
    public final static int ORDER_STATUS_FINSHED = 1005;

    //////////////////////////////////////订单状态 end //////////////////////////////////////

}
