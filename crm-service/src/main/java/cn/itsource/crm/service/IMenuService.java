package cn.itsource.crm.service;

import cn.itsource.crm.domain.Menu;
import cn.itsource.service.IBaseService;

import java.util.List;

public interface IMenuService extends IBaseService<Menu> {
    //根据当前登陆用户拿到他对应的菜单
    List<Menu> findByLoginUser();

    List<Menu> getMenuByUserId(Long id);
}
