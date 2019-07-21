package com.codetip.booksystem.config;

import com.codetip.booksystem.domain.User;
import com.codetip.booksystem.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * 自定义Realm
 *
 */
public class MyReal extends AuthorizingRealm{

    @Autowired
    private UserService userService;

    /**
     * 授权--验证url
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String name=(String) SecurityUtils.getSubject().getPrincipal();
        User user=userService.findByName(name);
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        Set<String> roles=new HashSet<String>();
        roles.add("管理员");
		/*List<Role> roleList=roleRepository.findByUserId(user.getId());
		Set<String> roles=new HashSet<String>();
		for(Role role:roleList){
			roles.add(role.getName());
			List<Menu> menuList=menuRepository.findByRoleId(role.getId());
			for(Menu menu:menuList){
				info.addStringPermission(menu.getName()); //添加权限
			}
		}
		*/
        info.addStringPermission("添加用户权限");//添加权限
        info.setRoles(roles);
        return info;
    }

    /**
     * 权限认证--登录
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String name=(String)token.getPrincipal();//用户名  UsernamePasswordTokenr的第一个参数  name
        User user=userService.findByName(name);
        if(user!=null){//这里的一步主要是来判断密码是否正确
            //👇对于我的理解第一个值应该放用户对象进去，这样我们在进行上面的授权操作的时候可以更好的获取对象，来添加用户权限
            //AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(user.getName(),user.getPwd(),"xxx");
            // 👆这是另外一种方法，不过我喜欢直接返回一个new对象，减少代码哈哈
            return new SimpleAuthenticationInfo(user.getName(),user.getPwd(),"xxx");
        }else{
            return null;
        }
    }



}
