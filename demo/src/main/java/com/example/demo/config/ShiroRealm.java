package com.example.demo.config;


import com.example.demo.pojo.AppUser;
import com.example.demo.pojo.AppUserExample;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


import java.util.List;

/**
 * @ 类说明:shiro 认证 + 授权 重写
 */
public class ShiroRealm extends AuthorizingRealm {

    public ShiroRealm() {
        super();
    }

    public static final String PWDKEY = "mingran";

    /**
     * 认证信息，主要针对用户登录，
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
            throws AuthenticationException {
//        //登录时先清除缓存
//        clearCached();
//        SimpleAuthenticationInfo authenticationInfo = null;
//        UserAuthcToken utoken = (UserAuthcToken)authcToken;
//        //后台手机账号登录
//        if(UserAuthcToken.LoginWay.APP_ACCOUNT.equals(utoken.getLoginWay())){
//            AppUserExample sysUserExample = new AppUserExample();
//            sysUserExample.createCriteria().andPhoneEqualTo(utoken.getPrincipal().toString()).andTypeEqualTo((byte)2);
//            List<AppUser> sysUsers = appSysUserMapper.selectByExample(sysUserExample);
//            if(sysUsers == null || sysUsers.size() == 0){
//                throw new UnknownAccountException("该手机号不存在，请重新填写或先注册！");
//            }
//            AppUser sysUser = sysUsers.get(0);
//            authenticationInfo = new SimpleAuthenticationInfo(sysUser,sysUser.getPwd(),getName());
//            return authenticationInfo;
//
//        }else if(UserAuthcToken.LoginWay.APP_TOKEN.equals(utoken.getLoginWay())){
//            AppUserExample sysUserExample = new AppUserExample();
//            sysUserExample.createCriteria().andTokenEqualTo(utoken.getPrincipal().toString());
//            List<AppUser> sysUsers = appSysUserMapper.selectByExample(sysUserExample);
//            if(sysUsers == null || sysUsers.size() == 0){
//                throw new UnknownAccountException("登录失败!");
//            }
//            AppUser sysUser = sysUsers.get(0);
//            authenticationInfo = new SimpleAuthenticationInfo(sysUser,sysUser.getToken(),getName());
//            return authenticationInfo;
//        }else if(UserAuthcToken.LoginWay.APPC_OPENID.equals(utoken.getLoginWay())){
////            AppUserWxExample userWxExample = new AppUserWxExample();
////            userWxExample.createCriteria().andOpenIdEqualTo(utoken.getPrincipal().toString());
////            List<AppUserWx> userWxes = appUserWxMapper.selectByExample(userWxExample);
//            UserBo userBo = userInfoMapper.selectUserByOpenId(utoken.getPrincipal().toString());
//            if(userBo == null){
//                throw new UnknownAccountException("登录失败!");
//            }
////            AppUserWx userWx = userWxes.get(0);
//            authenticationInfo = new SimpleAuthenticationInfo(userBo,userBo.getOpenId(),getName());
//            return authenticationInfo;
//        }else if(UserAuthcToken.LoginWay.PHONE_LOGIN.equals(utoken.getLoginWay())){
//            //微信端手机号登录
////            AppUserExample userExample = new AppUserExample();
////            userExample.createCriteria().andPhoneEqualTo(utoken.getPrincipal().toString());
////            List<AppUser> users = appSysUserMapper.selectByExample(userExample);
//            UserBo userBo = userInfoMapper.selectUserByPhone(utoken.getPrincipal().toString());
//            if(userBo == null){
//                throw new UnknownAccountException("登录失败!");
//            }
////            AppUser user = users.get(0);
//            authenticationInfo = new SimpleAuthenticationInfo(userBo,userBo.getPhone(),getName());
//            return authenticationInfo;
//        }
        return null;
    }

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

       return null;
    }

    //清除缓存
    public void clearCached() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        //仅支持UserAuthcToken类型的Token
        return token instanceof UserAuthcToken;
    }

}
