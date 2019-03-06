package io.renren.modules.oa.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 请休假信息表
 * 
 * @author tin
 * @email 286185834@qq.com
 * @date 2019-03-06 22:54:53
 */
@TableName("oa_holidayapply")
public class OaHolidayapplyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 申请ID
	 */
	@TableId
	private String happlyid;
	/**
	 * 申请人
	 */
	private String applyperson;
	/**
	 * 申请时间
	 */
	private Date applytime;
	/**
	 * 所属部门
	 */
	private String belongdept;
	/**
	 * 员工编号
	 */
	private String staffnum;
	/**
	 * 联系电话
	 */
	private String staffphone;
	/**
	 * 邮箱地址
	 */
	private String stafftel;
	/**
	 * 休假类型
	 */
	private String holidaytpye;
	/**
	 * 起始时间
	 */
	private Date starttime;
	/**
	 * 结束时间
	 */
	private Date endtime;
	/**
	 * 
	 */
	private String starthour;
	/**
	 * 
	 */
	private String endhour;
	/**
	 * 天数
	 */
	private String days;
	/**
	 * 请休假原因
	 */
	private String reason;
	/**
	 * 附件
	 */
	private String holidayfile;
	/**
	 * 下一处理环节
	 */
	private String nextnode;
	/**
	 * 下一处理人
	 */
	private String nextnoder;
	/**
	 * 
	 */
	private String sendto;
	/**
	 * 年假总天数
	 */
	private String yholiday;
	/**
	 * 
	 */
	private String yused;
	/**
	 * 
	 */
	private String iholiday;
	/**
	 * 
	 */
	private String iused;
	/**
	 * 已休其他假
	 */
	private String oused;

	/**
	 * 设置：申请ID
	 */
	public void setHapplyid(String happlyid) {
		this.happlyid = happlyid;
	}
	/**
	 * 获取：申请ID
	 */
	public String getHapplyid() {
		return happlyid;
	}
	/**
	 * 设置：申请人
	 */
	public void setApplyperson(String applyperson) {
		this.applyperson = applyperson;
	}
	/**
	 * 获取：申请人
	 */
	public String getApplyperson() {
		return applyperson;
	}
	/**
	 * 设置：申请时间
	 */
	public void setApplytime(Date applytime) {
		this.applytime = applytime;
	}
	/**
	 * 获取：申请时间
	 */
	public Date getApplytime() {
		return applytime;
	}
	/**
	 * 设置：所属部门
	 */
	public void setBelongdept(String belongdept) {
		this.belongdept = belongdept;
	}
	/**
	 * 获取：所属部门
	 */
	public String getBelongdept() {
		return belongdept;
	}
	/**
	 * 设置：员工编号
	 */
	public void setStaffnum(String staffnum) {
		this.staffnum = staffnum;
	}
	/**
	 * 获取：员工编号
	 */
	public String getStaffnum() {
		return staffnum;
	}
	/**
	 * 设置：联系电话
	 */
	public void setStaffphone(String staffphone) {
		this.staffphone = staffphone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getStaffphone() {
		return staffphone;
	}
	/**
	 * 设置：邮箱地址
	 */
	public void setStafftel(String stafftel) {
		this.stafftel = stafftel;
	}
	/**
	 * 获取：邮箱地址
	 */
	public String getStafftel() {
		return stafftel;
	}
	/**
	 * 设置：休假类型
	 */
	public void setHolidaytpye(String holidaytpye) {
		this.holidaytpye = holidaytpye;
	}
	/**
	 * 获取：休假类型
	 */
	public String getHolidaytpye() {
		return holidaytpye;
	}
	/**
	 * 设置：起始时间
	 */
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	/**
	 * 获取：起始时间
	 */
	public Date getStarttime() {
		return starttime;
	}
	/**
	 * 设置：结束时间
	 */
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getEndtime() {
		return endtime;
	}
	/**
	 * 设置：
	 */
	public void setStarthour(String starthour) {
		this.starthour = starthour;
	}
	/**
	 * 获取：
	 */
	public String getStarthour() {
		return starthour;
	}
	/**
	 * 设置：
	 */
	public void setEndhour(String endhour) {
		this.endhour = endhour;
	}
	/**
	 * 获取：
	 */
	public String getEndhour() {
		return endhour;
	}
	/**
	 * 设置：天数
	 */
	public void setDays(String days) {
		this.days = days;
	}
	/**
	 * 获取：天数
	 */
	public String getDays() {
		return days;
	}
	/**
	 * 设置：请休假原因
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * 获取：请休假原因
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * 设置：附件
	 */
	public void setHolidayfile(String holidayfile) {
		this.holidayfile = holidayfile;
	}
	/**
	 * 获取：附件
	 */
	public String getHolidayfile() {
		return holidayfile;
	}
	/**
	 * 设置：下一处理环节
	 */
	public void setNextnode(String nextnode) {
		this.nextnode = nextnode;
	}
	/**
	 * 获取：下一处理环节
	 */
	public String getNextnode() {
		return nextnode;
	}
	/**
	 * 设置：下一处理人
	 */
	public void setNextnoder(String nextnoder) {
		this.nextnoder = nextnoder;
	}
	/**
	 * 获取：下一处理人
	 */
	public String getNextnoder() {
		return nextnoder;
	}
	/**
	 * 设置：
	 */
	public void setSendto(String sendto) {
		this.sendto = sendto;
	}
	/**
	 * 获取：
	 */
	public String getSendto() {
		return sendto;
	}
	/**
	 * 设置：年假总天数
	 */
	public void setYholiday(String yholiday) {
		this.yholiday = yholiday;
	}
	/**
	 * 获取：年假总天数
	 */
	public String getYholiday() {
		return yholiday;
	}
	/**
	 * 设置：
	 */
	public void setYused(String yused) {
		this.yused = yused;
	}
	/**
	 * 获取：
	 */
	public String getYused() {
		return yused;
	}
	/**
	 * 设置：
	 */
	public void setIholiday(String iholiday) {
		this.iholiday = iholiday;
	}
	/**
	 * 获取：
	 */
	public String getIholiday() {
		return iholiday;
	}
	/**
	 * 设置：
	 */
	public void setIused(String iused) {
		this.iused = iused;
	}
	/**
	 * 获取：
	 */
	public String getIused() {
		return iused;
	}
	/**
	 * 设置：已休其他假
	 */
	public void setOused(String oused) {
		this.oused = oused;
	}
	/**
	 * 获取：已休其他假
	 */
	public String getOused() {
		return oused;
	}
}
