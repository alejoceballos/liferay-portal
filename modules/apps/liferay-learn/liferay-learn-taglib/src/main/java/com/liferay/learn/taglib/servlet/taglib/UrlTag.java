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

package com.liferay.learn.taglib.servlet.taglib;

import com.liferay.learn.taglib.servlet.taglib.base.BaseUrlTag;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.LocaleThreadLocal;

import java.util.Objects;

import javax.servlet.jsp.JspException;

/**
 * @author Jeyvison Nascimento
 * @author Alejo Ceballos
 */
public class UrlTag extends BaseUrlTag {

	@Override
	public int doStartTag() throws JspException {
		int result = super.doStartTag();

		JSONObject jsonObject = JSONUtil.put(
			"CHATWOOD_ID_IN_THE_SERVER",
			JSONUtil.put(
				"messages",
				JSONUtil.put(
					"en_US", "How do I get my ID for Chatwood?"
				).put(
					"pt_BR", "Como consigo o ID do Chatwood?"
				)
			).put(
				"url", "https://www.google.com/search?q=chatwood+id"
			)
		).put(
			"PIVOCHAT_ID_IN_THE_SERVER",
			JSONUtil.put(
				"messages",
				JSONUtil.put(
					"en_US", "How do I get my ID for Jivochat?"
				).put(
					"pt_BR", "Como consigo o ID do Jivochat?"
				)
			).put(
				"url", "https://www.google.com/search?q=jivochat+id"
			)
		);

		JSONObject keyJSONObject = jsonObject.getJSONObject(getKey());

		setNamespacedAttribute(getRequest(), "url", keyJSONObject.get("url"));

		JSONObject messagesJSONObject = (JSONObject)keyJSONObject.get(
			"messages");

		String message = (String)messagesJSONObject.get(
			LanguageUtil.getLanguageId(getRequest()));

		if (Objects.isNull(message)) {
			message = (String)messagesJSONObject.get(
				LanguageUtil.getLanguageId(
					LocaleThreadLocal.getDefaultLocale()));
		}

		setNamespacedAttribute(getRequest(), "message", message);

		return result;
	}

}