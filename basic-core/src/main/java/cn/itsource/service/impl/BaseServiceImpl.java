package cn.itsource.service.impl;

import cn.itsource.mapper.BaseMapper;
import cn.itsource.service.IBaseService;

import java.io.Serializable;
import java.util.List;

/**
 * @Description BaseServiceImpl
 * @Author liuqi
 * @Date
 * @Version v1.0
 **/
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    //所有的service类重写这个方法，就可以通过mapper获取到值
    protected abstract BaseMapper<T> getMapper();

    public void insert(T t) {
        getMapper().insert(t);

    }

    public void deleteById(Serializable id) {
        getMapper().deleteById(id);

    }

    public void update(T t) {
        getMapper().update(t);

    }

    public T selectById(Serializable id) {
        return getMapper().selectById(id);
    }

    public List<T> selectAll() {
        return getMapper().selectAll();
    }

    @Override
    public void deleteBatch(String ids) {
        getMapper().deleteBatch(ids);
    }
}
