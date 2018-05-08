package com.example.demo.config;



import org.apache.shiro.spring.web.ShiroFilterFactoryBean;

import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    /**
     * ShiroFilterFactoryBean 处理拦截资源文件问题。
     * 注意：单独一个ShiroFilterFactoryBean配置是或报错的，以为在
     * 初始化ShiroFilterFactoryBean的时候需要注入：SecurityManager
     *
     * Filter Chain定义说明 1、一个URL可以配置多个Filter，使用逗号分隔 2、当设置多个过滤器时，全部验证通过，才视为通过
     * 3、部分过滤器可指定参数，如perms，roles
     *
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean() {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager());
        shiroFilterFactoryBean.setLoginUrl("/login.html");//不设置默认找web工程根目录下的login.jsp页面
        shiroFilterFactoryBean.setSuccessUrl("/index");//登录成功之后要跳转的连接
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");//未授权跳转页面
    /* //自定义拦截器 , 多个filter的设置 */
//    Map<String, Filter> filters = new LinkedHashMap<>();
//    LogoutFilter logoutFilter = new LogoutFilter();//限制同一帐号同时在线的个数。或单点登录等
//    logoutFilter.setRedirectUrl("/login");
//    filters.put("logout",null);
//    shiroFilterFactoryBean.setFilters(filters);
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        //filterChainDefinitionManager必须是LinkedHashMap因为它必须保证有序

//        filterChainDefinitionMap.put("/asd", "authc");
        filterChainDefinitionMap.put("/login.html","anon");
        filterChainDefinitionMap.put("/index.html","authc");
//        filterChainDefinitionMap.put("/**", "authc");//需要登录访问的资源 , 一般将/**放在最下边

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 设置realm.
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }

    /**
     * 身份认证realm; (这个需要自己写，账号密码校验；权限等)
     *
     * @return
     */
    @Bean
    public ShiroRealm myShiroRealm() {
        ShiroRealm myShiroRealm = new ShiroRealm();
        return myShiroRealm;
    }

}
