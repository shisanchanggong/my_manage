package com.vigekoo.manage.core.validator.group;

import javax.validation.GroupSequence;

/**
 * @author ljx
 * @Description:  (定义校验顺序，如果AddGroup组失败，则UpdateGroup组不会再校验)
 * @date 2017-6-23 15:07
 */
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}
