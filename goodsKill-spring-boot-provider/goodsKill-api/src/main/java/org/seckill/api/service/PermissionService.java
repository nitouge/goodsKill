package org.seckill.api.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.seckill.entity.Permission;

import java.io.Serializable;

/**
 * @author heng
 */
public interface PermissionService {
    IPage<Permission> page(Page<Permission> page);

    boolean save(Permission permission);

    boolean removeById(int permissionId);

    Permission getById(Serializable permissionId);
}
