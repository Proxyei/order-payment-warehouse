package com.xywei.springcloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author future
 * @DateTime 2021/3/11 12:54
 * @Description
 */
public class AllowHeaderFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest req = exchange.getRequest().mutate().header("securitykey", "my-gateway").build();

        return chain.filter(exchange.mutate().request(req.mutate().build()).build());
    }
}
