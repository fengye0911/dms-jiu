package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.Menu;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu>{

        List<Menu> findByUser(Long id);

    List<Menu> getMenuByUserId(Long id);
}

