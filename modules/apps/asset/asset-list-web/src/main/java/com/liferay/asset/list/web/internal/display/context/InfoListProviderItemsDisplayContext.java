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

package com.liferay.asset.list.web.internal.display.context;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.info.item.InfoItemServiceTracker;
import com.liferay.info.item.provider.InfoItemFieldValuesProvider;
import com.liferay.info.list.provider.DefaultInfoListProviderContext;
import com.liferay.info.list.provider.InfoListProvider;
import com.liferay.petra.reflect.GenericUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Jürgen Kappler
 */
public class InfoListProviderItemsDisplayContext {

	public InfoListProviderItemsDisplayContext(
		InfoItemServiceTracker infoItemServiceTracker,
		RenderRequest renderRequest, RenderResponse renderResponse) {

		_infoItemServiceTracker = infoItemServiceTracker;
		_renderRequest = renderRequest;
		_renderResponse = renderResponse;

		_httpServletRequest = PortalUtil.getHttpServletRequest(renderRequest);

		_themeDisplay = (ThemeDisplay)_httpServletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
	}

	public InfoItemFieldValuesProvider<Object>
		getInfoItemFieldValuesProvider() {

		if (_infoItemFieldValuesProvider != null) {
			return _infoItemFieldValuesProvider;
		}

		InfoListProvider<?> infoListProvider = _getInfoListProvider();

		_infoItemFieldValuesProvider =
			_infoItemServiceTracker.getFirstInfoItemService(
				InfoItemFieldValuesProvider.class,
				GenericUtil.getGenericClassName(infoListProvider));

		return _infoItemFieldValuesProvider;
	}

	public String getInfoListItemsType(Object result) {
		String className = StringPool.BLANK;

		if (result instanceof AssetEntry) {
			AssetEntry assetEntry = (AssetEntry)result;

			className = PortalUtil.getClassName(assetEntry.getClassNameId());
		}
		else {
			InfoListProvider<?> infoListProvider = _getInfoListProvider();

			className = GenericUtil.getGenericClassName(infoListProvider);
		}

		return ResourceActionsUtil.getModelResource(
			_themeDisplay.getLocale(), className);
	}

	public SearchContainer<Object> getSearchContainer() {
		SearchContainer<Object> searchContainer = new SearchContainer<>(
			_renderRequest, _getPortletURL(), null,
			LanguageUtil.get(
				_httpServletRequest,
				"there-are-no-items-in-the-collection-provider"));

		InfoListProvider<?> infoListProvider = _getInfoListProvider();

		DefaultInfoListProviderContext defaultInfoListProviderContext =
			new DefaultInfoListProviderContext(
				_themeDisplay.getScopeGroup(), _themeDisplay.getUser());

		List<Object> infoList = (List<Object>)infoListProvider.getInfoList(
			defaultInfoListProviderContext);

		searchContainer.setResults(
			ListUtil.subList(
				infoList, searchContainer.getStart(),
				searchContainer.getEnd()));
		searchContainer.setTotal(infoList.size());

		return searchContainer;
	}

	private InfoListProvider<?> _getInfoListProvider() {
		if (_infoListProvider != null) {
			return _infoListProvider;
		}

		String infoListProviderKey = _getInfoListProviderKey();

		_infoListProvider = _infoItemServiceTracker.getInfoItemService(
			InfoListProvider.class, infoListProviderKey);

		return _infoListProvider;
	}

	private String _getInfoListProviderKey() {
		if (_infoListProviderKey != null) {
			return _infoListProviderKey;
		}

		_infoListProviderKey = ParamUtil.getString(
			_renderRequest, "infoListProviderKey");

		return _infoListProviderKey;
	}

	private PortletURL _getPortletURL() {
		PortletURL currentURLObj = PortletURLUtil.getCurrent(
			_renderRequest, _renderResponse);

		try {
			return PortletURLUtil.clone(currentURLObj, _renderResponse);
		}
		catch (PortletException portletException) {
			PortletURL portletURL = _renderResponse.createRenderURL();

			portletURL.setParameters(currentURLObj.getParameterMap());

			return portletURL;
		}
	}

	private final HttpServletRequest _httpServletRequest;
	private InfoItemFieldValuesProvider<Object> _infoItemFieldValuesProvider;
	private final InfoItemServiceTracker _infoItemServiceTracker;
	private InfoListProvider<?> _infoListProvider;
	private String _infoListProviderKey;
	private final RenderRequest _renderRequest;
	private final RenderResponse _renderResponse;
	private final ThemeDisplay _themeDisplay;

}