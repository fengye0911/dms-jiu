package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.User;
import cn.itsource.crm.mapper.UserMapper;
import cn.itsource.crm.query.UserQuery;
import cn.itsource.crm.service.IUserService;
import cn.itsource.mapper.BaseMapper;
import cn.itsource.service.impl.BaseServiceImpl;
import cn.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description desc
 * @Author lq
 * @Date new Date()
 * @Version v1.0
 **/

@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    protected BaseMapper<User> getMapper() {
        return userMapper;
    }

    @Override
    public User getByUsername(String username) {
        return userMapper.getByUsername(username);
    }

    @Override
    public PageList<User> page(UserQuery query) {
        long total = userMapper.count(query);

        List<User> rows = userMapper.selectByQuery(query); //封装PageList返回

        return new PageList<>(total,rows);
    }
}
