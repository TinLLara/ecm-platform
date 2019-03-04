package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author tin
 * @email 286185834@qq.com
 * @date 2019-03-01 11:49:45
 */
@TableName("sys_dd_value")
public class SysDdValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编码
	 */
	@TableId
	private Integer id;
	/**
	 * 数据字典编码
	 */
	private String ddKey;
	/**
	 * 数据字典域名称
	 */
	private String ddLabel;
	/**
	 * 数据字典域取值
	 */
	private String ddValue;
	/**
	 * 顺序号
	 */
	private Integer seqNo;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 是否可用
	 */
	private Integer isEnable;

	/**
	 * 设置：编码
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：编码
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：数据字典编码
	 */
	public void setDdKey(String ddKey) {
		this.ddKey = ddKey;
	}
	/**
	 * 获取：数据字典编码
	 */
	public String getDdKey() {
		return ddKey;
	}
	/**
	 * 设置：数据字典域名称
	 */
	public void setDdLabel(String ddLabel) {
		this.ddLabel = ddLabel;
	}
	/**
	 * 获取：数据字典域名称
	 */
	public String getDdLabel() {
		return ddLabel;
	}
	/**
	 * 设置：数据字典域取值
	 */
	public void setDdValue(String ddValue) {
		this.ddValue = ddValue;
	}
	/**
	 * 获取：数据字典域取值
	 */
	public String getDdValue() {
		return ddValue;
	}
	/**
	 * 设置：顺序号
	 */
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}
	/**
	 * 获取：顺序号
	 */
	public Integer getSeqNo() {
		return seqNo;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：是否可用
	 */
	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}
	/**
	 * 获取：是否可用
	 */
	public Integer getIsEnable() {
		return isEnable;
	}
}
