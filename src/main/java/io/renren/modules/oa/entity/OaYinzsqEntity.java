package io.renren.modules.oa.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author tin
 * @email 286185834@qq.com
 * @date 2019-03-11 22:43:03
 */
@TableName("oa_yinzsq")
public class OaYinzsqEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private String id;
	/**
	 * 起草人
	 */
	private String appname;
	/**
	 * 起草时间
	 */
	private String appdate;
	/**
	 * 所在部门
	 */
	private String depart;
	/**
	 * 用印份数
	 */
	private String yynum;
	/**
	 * 用章类型
	 */
	private String type;
	/**
	 * 公司名称
	 */
	private String corpname;
	/**
	 * 文件名或用途
	 */
	private String fileormeno;
	/**
	 * 附件名称
	 */
	private String filename;
	/**
	 * 附件id
	 */
	private String fileid;
	/**
	 * 意见
	 */
	private String advice;
	/**
	 * 抄送人
	 */
	private String mailcopier;
	/**
	 * 创建人
	 */
	private String creator;
	/**
	 * 创建时间
	 */
	private String creatdate;
	/**
	 * 关联事件
	 */
	private String event;
	/**
	 * 关联项目
	 */
	private String project;
	/**
	 * 下一处理环节
	 */
	private String nextop;
	/**
	 * 下一处理人
	 */
	private String nextoper;
	/**
	 * 是否回执
	 */
	private String comeon;
	/**
	 * 推送流程状态
	 */
	private String appresult;

	/**
	 * 设置：id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：起草人
	 */
	public void setAppname(String appname) {
		this.appname = appname;
	}
	/**
	 * 获取：起草人
	 */
	public String getAppname() {
		return appname;
	}
	/**
	 * 设置：起草时间
	 */
	public void setAppdate(String appdate) {
		this.appdate = appdate;
	}
	/**
	 * 获取：起草时间
	 */
	public String getAppdate() {
		return appdate;
	}
	/**
	 * 设置：所在部门
	 */
	public void setDepart(String depart) {
		this.depart = depart;
	}
	/**
	 * 获取：所在部门
	 */
	public String getDepart() {
		return depart;
	}
	/**
	 * 设置：用印份数
	 */
	public void setYynum(String yynum) {
		this.yynum = yynum;
	}
	/**
	 * 获取：用印份数
	 */
	public String getYynum() {
		return yynum;
	}
	/**
	 * 设置：用章类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：用章类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：公司名称
	 */
	public void setCorpname(String corpname) {
		this.corpname = corpname;
	}
	/**
	 * 获取：公司名称
	 */
	public String getCorpname() {
		return corpname;
	}
	/**
	 * 设置：文件名或用途
	 */
	public void setFileormeno(String fileormeno) {
		this.fileormeno = fileormeno;
	}
	/**
	 * 获取：文件名或用途
	 */
	public String getFileormeno() {
		return fileormeno;
	}
	/**
	 * 设置：附件名称
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	/**
	 * 获取：附件名称
	 */
	public String getFilename() {
		return filename;
	}
	/**
	 * 设置：附件id
	 */
	public void setFileid(String fileid) {
		this.fileid = fileid;
	}
	/**
	 * 获取：附件id
	 */
	public String getFileid() {
		return fileid;
	}
	/**
	 * 设置：意见
	 */
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	/**
	 * 获取：意见
	 */
	public String getAdvice() {
		return advice;
	}
	/**
	 * 设置：抄送人
	 */
	public void setMailcopier(String mailcopier) {
		this.mailcopier = mailcopier;
	}
	/**
	 * 获取：抄送人
	 */
	public String getMailcopier() {
		return mailcopier;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatdate(String creatdate) {
		this.creatdate = creatdate;
	}
	/**
	 * 获取：创建时间
	 */
	public String getCreatdate() {
		return creatdate;
	}
	/**
	 * 设置：关联事件
	 */
	public void setEvent(String event) {
		this.event = event;
	}
	/**
	 * 获取：关联事件
	 */
	public String getEvent() {
		return event;
	}
	/**
	 * 设置：关联项目
	 */
	public void setProject(String project) {
		this.project = project;
	}
	/**
	 * 获取：关联项目
	 */
	public String getProject() {
		return project;
	}
	/**
	 * 设置：下一处理环节
	 */
	public void setNextop(String nextop) {
		this.nextop = nextop;
	}
	/**
	 * 获取：下一处理环节
	 */
	public String getNextop() {
		return nextop;
	}
	/**
	 * 设置：下一处理人
	 */
	public void setNextoper(String nextoper) {
		this.nextoper = nextoper;
	}
	/**
	 * 获取：下一处理人
	 */
	public String getNextoper() {
		return nextoper;
	}
	/**
	 * 设置：是否回执
	 */
	public void setComeon(String comeon) {
		this.comeon = comeon;
	}
	/**
	 * 获取：是否回执
	 */
	public String getComeon() {
		return comeon;
	}
	/**
	 * 设置：推送流程状态
	 */
	public void setAppresult(String appresult) {
		this.appresult = appresult;
	}
	/**
	 * 获取：推送流程状态
	 */
	public String getAppresult() {
		return appresult;
	}
}
