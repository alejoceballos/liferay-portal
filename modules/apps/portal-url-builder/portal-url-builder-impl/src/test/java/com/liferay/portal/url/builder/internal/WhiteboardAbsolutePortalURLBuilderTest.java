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

package com.liferay.portal.url.builder.internal;

import com.liferay.portal.url.builder.WhiteboardAbsolutePortalURLBuilder;

import java.util.Arrays;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.mockito.Mockito;

/**
 * @author Iván Zaera Avellón
 */
@RunWith(Parameterized.class)
public class WhiteboardAbsolutePortalURLBuilderTest
	extends AbsolutePortalURLBuilderTestBase {

	public static String[] results = {
		"/o/path/to/resource", "/o/path/to/resource",
		"/context/o/path/to/resource", "/proxy/context/o/path/to/resource",
		"/proxy/o/path/to/resource"
	};
	public static String[] resultsIgnoringProxy = {
		"/o/path/to/resource", "/o/path/to/resource",
		"/context/o/path/to/resource", "/context/o/path/to/resource",
		"/o/path/to/resource"
	};

	@Parameterized.Parameters(name = "{0}: context={1}, proxy={2}, cdnHost={3}")
	public static Collection<Object[]> data() {
		return Arrays.asList(
			new Object[][] {
				{0, false, false, false}, {1, false, false, true},
				{2, true, false, false}, {3, true, true, false},
				{4, false, true, false}
			});
	}

	@Before
	public void setUp() throws Exception {
		AbsolutePortalURLBuilderImpl absolutePortalURLBuilderImpl =
			new AbsolutePortalURLBuilderImpl(
				mockPortal(context, proxy, cdnHost),
				Mockito.mock(HttpServletRequest.class));

		_whiteboardAbsolutePortalURLBuilder =
			absolutePortalURLBuilderImpl.forWhiteboard("path/to/resource");
	}

	@Test
	public void test() {
		String url = _whiteboardAbsolutePortalURLBuilder.build();

		Assert.assertEquals(results[index], url);
	}

	@Test
	public void testIgnoringProxy() {
		String url = _whiteboardAbsolutePortalURLBuilder.ignorePathProxy(
		).build();

		Assert.assertEquals(resultsIgnoringProxy[index], url);
	}

	@Parameterized.Parameter(3)
	public boolean cdnHost;

	@Parameterized.Parameter(1)
	public boolean context;

	@Parameterized.Parameter
	public int index;

	@Parameterized.Parameter(2)
	public boolean proxy;

	private WhiteboardAbsolutePortalURLBuilder
		_whiteboardAbsolutePortalURLBuilder;

}