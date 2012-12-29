package com.shine.common.sysmgr.web;

import com.shine.common.sysmgr.entity.SysRole;
import com.shine.framework.biz.BaseService;
import com.shine.framework.entity.BaseEntity;
import com.shine.framework.web.AjaxAction;

public class SysRoleAction extends AjaxAction<BaseService> {

	private static final long serialVersionUID = 8144723623173944937L;

	private SysRole e = new SysRole();
	
	@Override
	public BaseEntity getE() {
		return e;
	}

	@Override
	protected void setE(BaseEntity e) {
		this.e = (SysRole)e;
	}

}
