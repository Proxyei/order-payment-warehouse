# 功能
1. 是一个spring cloud的小demo，由订单模块、支付模块、仓库模块组成
2. 通过订单模块调用支付模块，如果支付OK，表示下单OK，接着下单模块调用仓库模块进行出库操作，商品数量减少

# 架构
1. 注册中心，使用Eureka，数量3
2. 网关，使用spring cloud gateway，数量3，做到负载均衡、高可用集群
3. 服务发现，使用openFeign
4. 服务降级、熔断、限流，使用hystrix
6. 订单模块、支付模块、仓库模块，数量都为3
架构图： 
![](spring-cloud-order-payment-warehouse.png)