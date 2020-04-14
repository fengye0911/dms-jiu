package cn.itsource.crm.auth;

import cn.itsource.crm.domain.User;
import cn.itsource.crm.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;


public class CrmReal extends AuthorizingRealm {


    @Autowired
    private IUserService userService;

    /**
     * 授权  权限判断
     * @param principalCollection
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //从 token中获取用户名
        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
        //根据用户名查询数据库中的信息
        String username=token.getUsername();
        User user = userService.getByUsername(username);
        //判断是否为空
        if (user==null){
            throw new UnknownAccountException(username);
        }
        //用户信息封装到 info对象返回
        Object principal=user;
        Object hashedCredentilas=user.getPassword();  //密码加密
        ByteSource credentialsSalt=ByteSource.Util.bytes(username);
        String realName=getName();
        SimpleAuthenticationInfo info=
                new SimpleAuthenticationInfo(principal,hashedCredentilas,credentialsSalt,realName);
        return info;
    }

}
