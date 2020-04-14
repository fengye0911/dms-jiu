package cn.itsource.crm.query;

import cn.itsource.query.BaseQuery;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description desc
 * @Author lq
 * @Date new Date()
 * @Version v1.0
 **/

@Getter
@Setter
public class UserQuery extends BaseQuery {
    private Long education_id;
    private int state;
}
