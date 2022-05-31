# Dubbo Sample by hupean

dubbo框架服务
【服务提供者】：
0.引入zookeeper和dubbo相关依赖，可查看pom文件
1.定义接口：com.hupean.service.UserService
2.实现接口：com.hupean.impl.UserService
3.定义服务提供者dubbo配置，dubbo-service模块resource目录下，provider.xml。
     主要功能是将要对外提供的接口和对应的接口实现注册到注册中心中，以便服务消费者调用。
4.启动类引入provider.xml配置，启动服务将接口注入注册中心

参考：
dubbo官网：https://dubbo.apache.org/zh/
dubbo.xml配置可参考：https://blog.csdn.net/niugang0920/article/details/81975421