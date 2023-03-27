# 工程简介

该系统是一个分布式认证鉴权的简单实现，采用eureka、openfeign、spring security oauth2.0，JWT，gateway等技术实现。


# 延伸阅读
distributed-security-auu是授权服务

distributed-security-order是资源服务

istributed-security-gateway是网关

stributed-security-discovery是服务注册中心

这几个微服务都注册到注册中心中，如果要访问该系统的资源，就需要先通过授权服务获取到令牌，然后拿到令牌去请求资源。
这里获取到令牌的方式采用授权码方式。

