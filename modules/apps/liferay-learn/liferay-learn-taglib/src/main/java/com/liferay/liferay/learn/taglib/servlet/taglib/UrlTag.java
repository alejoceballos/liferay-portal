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

package com.liferay.liferay.learn.taglib.servlet.taglib;

import com.liferay.liferay.learn.taglib.servlet.taglib.base.BaseUrlTag;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import javax.servlet.jsp.JspException;

/**
 * @author Jeyvison Nascimento
 * @author Alejo Ceballos
 */
public class UrlTag extends BaseUrlTag {
	@Override
	public int doStartTag() throws JspException {
//		WebCacheItem webCacheItem = new GetUrlWebCacheItem(
//			"https://learn.liferay.com/dynamic/" + getKey() + ".json",
//			4 * 60 * 60 * 1000);
//
//		String json = (String) WebCachePoolUtil.get(getKey(), webCacheItem);

		String json = "{ \"url\":\"http://www.google.com\", \"messages\":{ \"en_US\":\"This is an English message\", \"pt_BR\":\"Esta é uma mensagem em português\" } }";

		try {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject(json);

			JSONObject jsonObjectMessages = (JSONObject) jsonObject.get("messages");
			String message = (String) jsonObjectMessages.get(LanguageUtil.getLanguageId(getRequest()));

			setNamespacedAttribute(getRequest(), "url", jsonObject.get("url"));
			setNamespacedAttribute(getRequest(), "message", message);
		}
		catch (JSONException e) {
			_log.error(e, e);
		}

		return super.doStartTag();
	}

	private static final Log _log = LogFactoryUtil.getLog(UrlTag.class);
}