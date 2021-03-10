# **spring config配置**

一般需要和spring bus结合使用，否则得重启微服务

config读取的只能是properties或者yml文件

# 问题

> 1. 配置文件yml或者properties有中文乱码问题
>
>    完整解决方案：
>
>    > 1. 在config server的yml配置中，设置httpfilter
>    >
>    >    ```yaml
>    >    spring:
>    >      application:
>    >        name: config-center
>    >      http:
>    >        encoding:
>    >          enabled: true
>    >          force: true
>    >          charset: UTF-8
>    >    ```
>    >
>    > 2. 查找此类：OriginTrackedPropertiesLoader，完整复制到本地，包括包名，接着查找把ISO-8859-1改为utf-8
>    >
>    > 
>
> 2. git远程仓库多目录配置
>
>    cloud config默认只在根目录读取文件，如果需要读取子目录，需要设置search-paths，根目录不用设置也能读取在根目录下的配置文件
>
>    ```yaml
>    spring:
>      cloud:
>        config:
>          label: master
>          server:
>            git:
>              # 必须使用SSL访问
>              uri: https://gitee.com/xxxx/springcloud-config.git
>              search-paths: /order-payment-warehouse/dev,/order-payment-warehouse/test
>              timeout: 30
>    ```
>
> 3. config server和client不同的文档有不同的jar包
>
>    > 1. 例如client就有spring-cloud-starter-config或者spring-cloud-config-client，用哪种？
>
> 4. **如何通过微服务名设置配置文件夹**
>
> 5. 如何做到动态切**换数据库？**？只能重启？
>
> 6. 

# 1、git方式配置

这是spring cloud的默认方式



# 2、本地文件方式

# 3、数据库方式

