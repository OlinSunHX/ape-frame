package com.jingdianjichi.config;

import com.jingdianjichi.inteceptor.SqlBeautyInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//注册Bean的注解作用就是往IOC容器中放（注册）东西！ 用于注册Bean的注解： 比如@Component , @Repository , @ Controller , @Service , @Configration
//使用Bean的注解：比如@Autowired , @Resource注解，这些注解就是把屋子里的东西自己拿来用，如果你要拿，前提一定是屋子（IOC）里有的，不然就会报错
@Configuration
public class MybatisConfiguration {
    //@Bean就放在方法上，就是让方法去产生一个Bean，然后交给Spring容器 与其他的注册bean的方法区别在于
    // @Component , @Repository , @ Controller , @Service 这些注册Bean的注解存在局限性，只能局限作用于自己编写的类，如果是一个jar包第三方库要加入IOC容器的话，这些注解就手无缚鸡之力了
    //@Bean就可以导入第三方库
    @Bean//这里的SqlBeautyInterceptor我们就引入的是一个第三方的插件
    @ConditionalOnProperty(name = {"sql.beauty.show"}, havingValue = "true", matchIfMissing = true) //根据一些条件来装载这个东西 可以选择用也可以选择不用
    public SqlBeautyInterceptor sqlBeautyInterceptor(){
        return new SqlBeautyInterceptor();
    }

}
