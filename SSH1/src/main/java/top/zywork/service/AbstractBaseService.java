package top.zywork.service;

import org.dozer.Mapper;

/**
 * 基础Service<br />
 * 创建于2017-09-11
 *
 * @author 王振宇
 * @version 1.0
 */
public abstract class AbstractBaseService {

    private Mapper dozerMapper;

    public Mapper getDozerMapper() {
        return dozerMapper;
    }

    public void setDozerMapper(Mapper dozerMapper) {
        this.dozerMapper = dozerMapper;
    }
}
