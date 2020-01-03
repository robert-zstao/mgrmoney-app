package com.uek.mgrmoney.entity;

import com.uek.mgrmoney.enumeration.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 理财产品实体类
 * @author 赵胜涛
 * @since jdk8
 *
 * java
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    //产品编号
    private String id;
    //产品名称
    private String name;
    //状态
    private String status;
    //起投金额
    /**
     *
     *  java语言为了解决这个问题，封装了一个工具类，用于准确计算两个数之间的运算
     */
    private BigDecimal startAmount;
    //投资步长
    private BigDecimal stepAmount;
    //锁定期
    private Integer lockupPeriod;
    //收益率，因为要要与其他数相乘，所有使用BigDecimal
    private BigDecimal earningRate;
    //备注
    private String remark;
    //产品创建时间
    private Date createAt;
    //产品更新时间
    private Date updateAt;
    //产品创建者
    private String createUser;
    //产品更新者
    private String updateUser;

    /**
     * 为了产品状态的安全考虑，我们使用ProductStatus枚举类型
     * 所以我们重写它的设置方法
     * @param ps
     */
    public void setStatus(ProductStatus ps){
        this.status=ps.name();
    }

}
