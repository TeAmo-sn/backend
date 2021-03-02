package jp.co.nss.hrm.backend.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ReagentInDetail implements Serializable {
    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "入库单ID")
    private Long inBillId;

    @ApiModelProperty(value = "试剂ID")
    private Long reagentId;

    @ApiModelProperty(value = "试剂名称")
    private String reagentName;

    @ApiModelProperty(value = "单位")
    private String reagentUnit;

    @ApiModelProperty(value = "规格型号")
    private String reagentSpecification;

    @ApiModelProperty(value = "价格")
    private Long price;

    @ApiModelProperty(value = "数量")
    private Long quantity;

    @ApiModelProperty(value = "金额")
    private Long total;

    @ApiModelProperty(value = "批号")
    private String batchNo;

    @ApiModelProperty(value = "保质期")
    private Date expireDate;

    @ApiModelProperty(value = "备注")
    private String remark;

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

    public Long getInBillId() {
        return inBillId;
    }

    public void setInBillId(Long inBillId) {
        this.inBillId = inBillId;
    }

    public Long getReagentId() {
        return reagentId;
    }

    public void setReagentId(Long reagentId) {
        this.reagentId = reagentId;
    }

    public String getReagentName() {
        return reagentName;
    }

    public void setReagentName(String reagentName) {
        this.reagentName = reagentName;
    }

    public String getReagentUnit() {
        return reagentUnit;
    }

    public void setReagentUnit(String reagentUnit) {
        this.reagentUnit = reagentUnit;
    }

    public String getReagentSpecification() {
        return reagentSpecification;
    }

    public void setReagentSpecification(String reagentSpecification) {
        this.reagentSpecification = reagentSpecification;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        sb.append(", inBillId=").append(inBillId);
        sb.append(", reagentId=").append(reagentId);
        sb.append(", reagentName=").append(reagentName);
        sb.append(", reagentUnit=").append(reagentUnit);
        sb.append(", reagentSpecification=").append(reagentSpecification);
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append(", total=").append(total);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", expireDate=").append(expireDate);
        sb.append(", remark=").append(remark);
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