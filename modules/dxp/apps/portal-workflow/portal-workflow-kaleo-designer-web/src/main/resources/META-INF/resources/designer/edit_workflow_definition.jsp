<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */
--%>

<%@ include file="/designer/init.jsp" %>

<%
KaleoDefinitionVersion kaleoDefinitionVersion = (KaleoDefinitionVersion)request.getAttribute(KaleoDesignerWebKeys.KALEO_DRAFT_DEFINITION);

portletDisplay.setShowBackIcon(true);

portletDisplay.setURLBack(
	PortletURLBuilder.create(
		PortalUtil.getControlPanelPortletURL(renderRequest, KaleoDesignerPortletKeys.CONTROL_PANEL_WORKFLOW, PortletRequest.RENDER_PHASE)
	).setMVCPath(
		"/view.jsp"
	).buildString());

String title = (kaleoDefinitionVersion == null) ? LanguageUtil.get(request, "new-workflow") : kaleoDefinitionVersion.getTitle(locale);

renderResponse.setTitle(title);
%>

<react:component
	module="designer/js/definition-builder/DefinitionBuilder"
	props='<%=
		HashMapBuilder.<String, Object>put(
			"title", title
		).put(
			"version", (kaleoDefinitionVersion == null) ? "0" : kaleoDefinitionVersion.getVersion()
		).build()
	%>'
/>