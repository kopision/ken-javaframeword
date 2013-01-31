package com.shine.common.sysmgr.entity;

import com.shine.framework.dao.util.QuerySQL;
import com.shine.framework.entity.BaseEntity;

/**
 * 自由权限URL,跳过权限控制的
 * @author JiangKunpeng 2013.01.29
 * @version 2013.01.30
 *
 */
public class SysFreeUrl implements BaseEntity {

	private static final long serialVersionUID = 6686363495603195021L;
	
	private Integer urlId;
	private String remark;
	private String uurl;
	private Integer loginNeed;

	@Override
	public QuerySQL getExistSQL() {
		return null;
	}

	@Override
	public boolean isVirtualDelete() {
		return false;
	}
	
	public String getLoginNeedText(){
		return loginNeed!=null&&loginNeed==1?"是":"否";
	}
	
	public Integer getUrlId() {
		return urlId;
	}

	public void setUrlId(Integer urlId) {
		this.urlId = urlId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUurl() {
		return uurl;
	}

	public void setUurl(String uurl) {
		this.uurl = uurl;
	}

	public Integer getLoginNeed() {
		return loginNeed;
	}

	public void setLoginNeed(Integer loginNeed) {
		this.loginNeed = loginNeed;
	}

}