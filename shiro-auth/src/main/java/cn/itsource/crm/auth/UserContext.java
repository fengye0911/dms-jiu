package cn.itsource.crm.auth;

import cn.itsource.crm.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;


public enum UserContext {
    INSTANCE;
    public User getUser(){
        Session session=SecurityUtils.getSubject().getSession();
        return (User) session.getAttribute("loginUser");
    }
    public void setUser(User user){
        Session session=SecurityUtils.getSubject().getSession();
        session.setAttribute("loginUser", user);
    }
}
