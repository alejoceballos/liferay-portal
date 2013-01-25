/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portalweb.portlet.webcontentlist.portlet;

import com.liferay.portalweb.portal.BaseTestSuite;
import com.liferay.portalweb.portlet.webcontentlist.portlet.addportletwcl.AddPortletWCLTests;
import com.liferay.portalweb.portlet.webcontentlist.portlet.addportletwclduplicate.AddPortletWCLDuplicateTests;
import com.liferay.portalweb.portlet.webcontentlist.portlet.configureportletdisplayguestwcl.ConfigurePortletDisplayGuestWCLTests;
import com.liferay.portalweb.portlet.webcontentlist.portlet.configureportletfiltersitescopeglobalwcl.ConfigurePortletFilterSiteScopeGlobalWCLTests;
import com.liferay.portalweb.portlet.webcontentlist.portlet.configureportletfiltersitescopeliferaywcl.ConfigurePortletFilterSiteScopeLiferayWCLTests;
import com.liferay.portalweb.portlet.webcontentlist.portlet.configureportletfiltersitescopemysitewcl.ConfigurePortletFilterSiteScopeMySiteWCLTests;
import com.liferay.portalweb.portlet.webcontentlist.portlet.configureportletfilterstructurewcl.ConfigurePortletFilterStructureWCLTests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class PortletTestPlan extends BaseTestSuite {

	public static Test suite() {
		TestSuite testSuite = new TestSuite();

		testSuite.addTest(AddPortletWCLTests.suite());
		testSuite.addTest(AddPortletWCLDuplicateTests.suite());
		testSuite.addTest(ConfigurePortletDisplayGuestWCLTests.suite());
		testSuite.addTest(ConfigurePortletFilterSiteScopeGlobalWCLTests.suite());
		testSuite.addTest(ConfigurePortletFilterSiteScopeLiferayWCLTests.suite());
		testSuite.addTest(ConfigurePortletFilterSiteScopeMySiteWCLTests.suite());
		testSuite.addTest(ConfigurePortletFilterStructureWCLTests.suite());

		return testSuite;
	}

}