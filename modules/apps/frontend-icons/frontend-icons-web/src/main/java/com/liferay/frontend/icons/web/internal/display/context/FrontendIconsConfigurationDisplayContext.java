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

package com.liferay.frontend.icons.web.internal.display.context;

import com.liferay.frontend.icons.web.internal.model.FrontendIconsResource;
import com.liferay.frontend.icons.web.internal.model.FrontendIconsResourcePack;
import com.liferay.frontend.icons.web.internal.repository.FrontendIconsResourcePackRepository;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Víctor Galán
 */
public class FrontendIconsConfigurationDisplayContext {

	public FrontendIconsConfigurationDisplayContext(
		FrontendIconsResourcePackRepository frontendIconsResourcePackRepository,
		HttpServletRequest httpServletRequest) {

		_frontendIconsResourcePackRepository =
			frontendIconsResourcePackRepository;

		_themeDisplay = (ThemeDisplay)httpServletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
	}

	public Map<String, Object> getProps() {
		return HashMapBuilder.<String, Object>put(
			"icons",
			() -> {
				JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

				List<FrontendIconsResourcePack> frontendIconsResourcePacks =
					_frontendIconsResourcePackRepository.
						getFrontendIconsResourcePacks(
							_themeDisplay.getCompanyId());

				for (FrontendIconsResourcePack frontendIconsResourcePack :
						frontendIconsResourcePacks) {

					JSONArray iconNamesJSONArray =
						JSONFactoryUtil.createJSONArray();

					List<FrontendIconsResource> frontendIconsResources =
						new ArrayList<>(
							frontendIconsResourcePack.
								getFrontendIconsResources());

					Collections.sort(
						frontendIconsResources,
						Comparator.comparing(FrontendIconsResource::getId));

					for (FrontendIconsResource frontendIconsResource :
							frontendIconsResources) {

						iconNamesJSONArray.put(
							JSONUtil.put(
								"name", frontendIconsResource.getId()));
					}

					jsonObject.put(
						frontendIconsResourcePack.getName(),
						JSONUtil.put("icons", iconNamesJSONArray));
				}

				return jsonObject;
			}
		).build();
	}

	private final FrontendIconsResourcePackRepository
		_frontendIconsResourcePackRepository;
	private final ThemeDisplay _themeDisplay;

}