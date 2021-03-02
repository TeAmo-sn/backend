package jp.co.nss.hrm.backend.api.dao;

import jp.co.nss.hrm.backend.model.ReagentSupplier;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReagentSupplierDao {

    /**
     * 根据科室名称获取列表
     */
    List<ReagentSupplier> getAllBySupplierName(@Param("supplierName") String supplierName);
}
