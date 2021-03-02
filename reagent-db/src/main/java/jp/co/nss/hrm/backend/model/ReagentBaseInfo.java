package jp.co.nss.hrm.backend.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ReagentBaseInfo implements Serializable {
    private Long id;

    @ApiModelProperty(value = "试剂耗材编号")
    private String code;

    @ApiModelProperty(value = "试剂名称")
    private String name;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "规格型号")
    private String specification;

    @ApiModelProperty(value = "生产厂家")
    private String manufacturerName;

    @ApiModelProperty(value = "注册证号")
    private String registrationNo;

    @ApiModelProperty(value = "供货商 ID")
    private Long supplierId;

    @ApiModelProperty(value = "供货商名")
    private Long supplierShortName;

    @ApiModelProperty(value = "储存温度: 常温，冷藏，冷冻")
    private Long stockType;

    @ApiModelProperty(value = "过期预警时间阈值")
    private Integer experationLimit;

    @ApiModelProperty(value = "低库存预警阈值")
    private Integer stockLimit;

    @ApiModelProperty(value = "开启有效期限")
    private Integer useDayLimit;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    @ApiModelProperty(value = "软删除标志: 0, 未删除, 1: 已删除")
    private Byte deleteFlag;

    private Date deleteTime;

    private String deleteBy;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getSupplierShortName() {
        return supplierShortName;
    }

    public void setSupplierShortName(Long supplierShortName) {
        this.supplierShortName = supplierShortName;
    }

    public Long getStockType() {
        return stockType;
    }

    public void setStockType(Long stockType) {
        this.stockType = stockType;
    }

    public Integer getExperationLimit() {
        return experationLimit;
    }

    public void setExperationLimit(Integer experationLimit) {
        this.experationLimit = experationLimit;
    }

    public Integer getStockLimit() {
        return stockLimit;
    }

    public void setStockLimit(Integer stockLimit) {
        this.stockLimit = stockLimit;
    }

    public Integer getUseDayLimit() {
        return useDayLimit;
    }

    public void setUseDayLimit(Integer useDayLimit) {
        this.useDayLimit = useDayLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(String deleteBy) {
        this.deleteBy = deleteBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", unit=").append(unit);
        sb.append(", specification=").append(specification);
        sb.append(", manufacturerName=").append(manufacturerName);
        sb.append(", registrationNo=").append(registrationNo);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplierShortName=").append(supplierShortName);
        sb.append(", stockType=").append(stockType);
        sb.append(", experationLimit=").append(experationLimit);
        sb.append(", stockLimit=").append(stockLimit);
        sb.append(", useDayLimit=").append(useDayLimit);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", deleteBy=").append(deleteBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}