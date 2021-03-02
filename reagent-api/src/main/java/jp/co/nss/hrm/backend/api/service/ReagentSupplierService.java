package jp.co.nss.hrm.backend.api.service;

import jp.co.nss.hrm.backend.model.ReagentSupplier;

import java.util.List;

public interface ReagentSupplierService {
    ReagentSupplier getItem(Long id);


    /**
     * 获取所有供应商列表
     */

    List<ReagentSupplier> list();

    /**
     * 添加供应商
     */
    int create(ReagentSupplier supplier);

    /**
     * 修改供应商信息
     */
    int update(Long id, ReagentSupplier supplier);

    /**
     * 删除供应商
     */
    int delete(Long id);

    /**
     * 分页获取供应商列表
     */
    List<ReagentSupplier> list(String keyword, Integer pageSize, Integer pageNum);
}

