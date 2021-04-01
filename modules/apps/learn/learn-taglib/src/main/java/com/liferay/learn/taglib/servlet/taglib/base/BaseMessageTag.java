/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.learn.taglib.servlet.taglib.base;

import com.liferay.learn.taglib.internal.servlet.ServletContextUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

/**
 * @author Jeyvison Nascimento
 * @author Alejo Ceballos
 * @generated
 */
public abstract class BaseMessageTag extends com.liferay.taglib.util.IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public java.lang.String getBundle() {
		return _bundle;
	}

	public java.lang.String getKey() {
		return _key;
	}

	public void setBundle(java.lang.String bundle) {
		_bundle = bundle;
	}

	public void setKey(java.lang.String key) {
		_key = key;
	}

	@Override
	public void setPageContext(PageContext pageContext) {
		super.setPageContext(pageContext);

		setServletContext(ServletContextUtil.getServletContext());
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_bundle = null;
		_key = null;
	}

	@Override
	protected String getEndPage() {
		return _END_PAGE;
	}

	@Override
	protected String getStartPage() {
		return _START_PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		setNamespacedAttribute(request, "bundle", _bundle);
		setNamespacedAttribute(request, "key", _key);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "liferay-learn:message:";

	private static final String _END_PAGE =
		"/message/end.jsp";

	private static final String _START_PAGE =
		"/message/start.jsp";

	private java.lang.String _bundle = null;
	private java.lang.String _key = null;

}