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

package com.liferay.headless.delivery.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.headless.delivery.client.dto.v1_0.WikiPageAttachment;
import com.liferay.headless.delivery.client.http.HttpInvoker;
import com.liferay.headless.delivery.client.pagination.Page;
import com.liferay.headless.delivery.client.resource.v1_0.WikiPageAttachmentResource;
import com.liferay.headless.delivery.client.serdes.v1_0.WikiPageAttachmentSerDes;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;

import java.io.File;

import java.lang.reflect.InvocationTargetException;

import java.text.DateFormat;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.apache.commons.beanutils.BeanUtilsBean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseWikiPageAttachmentResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_wikiPageAttachmentResource.setContextCompany(testCompany);

		WikiPageAttachmentResource.Builder builder =
			WikiPageAttachmentResource.builder();

		wikiPageAttachmentResource = builder.locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		WikiPageAttachment wikiPageAttachment1 = randomWikiPageAttachment();

		String json = objectMapper.writeValueAsString(wikiPageAttachment1);

		WikiPageAttachment wikiPageAttachment2 = WikiPageAttachmentSerDes.toDTO(
			json);

		Assert.assertTrue(equals(wikiPageAttachment1, wikiPageAttachment2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		WikiPageAttachment wikiPageAttachment = randomWikiPageAttachment();

		String json1 = objectMapper.writeValueAsString(wikiPageAttachment);
		String json2 = WikiPageAttachmentSerDes.toJSON(wikiPageAttachment);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		WikiPageAttachment wikiPageAttachment = randomWikiPageAttachment();

		wikiPageAttachment.setContentUrl(regex);
		wikiPageAttachment.setEncodingFormat(regex);
		wikiPageAttachment.setFileExtension(regex);
		wikiPageAttachment.setTitle(regex);

		String json = WikiPageAttachmentSerDes.toJSON(wikiPageAttachment);

		Assert.assertFalse(json.contains(regex));

		wikiPageAttachment = WikiPageAttachmentSerDes.toDTO(json);

		Assert.assertEquals(regex, wikiPageAttachment.getContentUrl());
		Assert.assertEquals(regex, wikiPageAttachment.getEncodingFormat());
		Assert.assertEquals(regex, wikiPageAttachment.getFileExtension());
		Assert.assertEquals(regex, wikiPageAttachment.getTitle());
	}

	@Test
	public void testDeleteWikiPageAttachment() throws Exception {
		WikiPageAttachment wikiPageAttachment =
			testDeleteWikiPageAttachment_addWikiPageAttachment();

		assertHttpResponseStatusCode(
			204,
			wikiPageAttachmentResource.deleteWikiPageAttachmentHttpResponse(
				wikiPageAttachment.getId()));

		assertHttpResponseStatusCode(
			404,
			wikiPageAttachmentResource.getWikiPageAttachmentHttpResponse(
				wikiPageAttachment.getId()));

		assertHttpResponseStatusCode(
			404,
			wikiPageAttachmentResource.getWikiPageAttachmentHttpResponse(0L));
	}

	protected WikiPageAttachment
			testDeleteWikiPageAttachment_addWikiPageAttachment()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGetWikiPageAttachment() throws Exception {
		WikiPageAttachment postWikiPageAttachment =
			testGetWikiPageAttachment_addWikiPageAttachment();

		WikiPageAttachment getWikiPageAttachment =
			wikiPageAttachmentResource.getWikiPageAttachment(
				postWikiPageAttachment.getId());

		assertEquals(postWikiPageAttachment, getWikiPageAttachment);
		assertValid(getWikiPageAttachment);
	}

	protected WikiPageAttachment
			testGetWikiPageAttachment_addWikiPageAttachment()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGetWikiPageWikiPageAttachmentsPage() throws Exception {
		Page<WikiPageAttachment> page =
			wikiPageAttachmentResource.getWikiPageWikiPageAttachmentsPage(
				testGetWikiPageWikiPageAttachmentsPage_getWikiPageId());

		Assert.assertEquals(0, page.getTotalCount());

		Long wikiPageId =
			testGetWikiPageWikiPageAttachmentsPage_getWikiPageId();
		Long irrelevantWikiPageId =
			testGetWikiPageWikiPageAttachmentsPage_getIrrelevantWikiPageId();

		if ((irrelevantWikiPageId != null)) {
			WikiPageAttachment irrelevantWikiPageAttachment =
				testGetWikiPageWikiPageAttachmentsPage_addWikiPageAttachment(
					irrelevantWikiPageId, randomIrrelevantWikiPageAttachment());

			page =
				wikiPageAttachmentResource.getWikiPageWikiPageAttachmentsPage(
					irrelevantWikiPageId);

			Assert.assertEquals(1, page.getTotalCount());

			assertEquals(
				Arrays.asList(irrelevantWikiPageAttachment),
				(List<WikiPageAttachment>)page.getItems());
			assertValid(page);
		}

		WikiPageAttachment wikiPageAttachment1 =
			testGetWikiPageWikiPageAttachmentsPage_addWikiPageAttachment(
				wikiPageId, randomWikiPageAttachment());

		WikiPageAttachment wikiPageAttachment2 =
			testGetWikiPageWikiPageAttachmentsPage_addWikiPageAttachment(
				wikiPageId, randomWikiPageAttachment());

		page = wikiPageAttachmentResource.getWikiPageWikiPageAttachmentsPage(
			wikiPageId);

		Assert.assertEquals(2, page.getTotalCount());

		assertEqualsIgnoringOrder(
			Arrays.asList(wikiPageAttachment1, wikiPageAttachment2),
			(List<WikiPageAttachment>)page.getItems());
		assertValid(page);

		wikiPageAttachmentResource.deleteWikiPageAttachment(
			wikiPageAttachment1.getId());

		wikiPageAttachmentResource.deleteWikiPageAttachment(
			wikiPageAttachment2.getId());
	}

	protected WikiPageAttachment
			testGetWikiPageWikiPageAttachmentsPage_addWikiPageAttachment(
				Long wikiPageId, WikiPageAttachment wikiPageAttachment)
		throws Exception {

		return wikiPageAttachmentResource.postWikiPageWikiPageAttachment(
			wikiPageId, wikiPageAttachment, getMultipartFiles());
	}

	protected Long testGetWikiPageWikiPageAttachmentsPage_getWikiPageId()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected Long
			testGetWikiPageWikiPageAttachmentsPage_getIrrelevantWikiPageId()
		throws Exception {

		return null;
	}

	@Test
	public void testPostWikiPageWikiPageAttachment() throws Exception {
		WikiPageAttachment randomWikiPageAttachment =
			randomWikiPageAttachment();

		Map<String, File> multipartFiles = getMultipartFiles();

		WikiPageAttachment postWikiPageAttachment =
			testPostWikiPageWikiPageAttachment_addWikiPageAttachment(
				randomWikiPageAttachment, multipartFiles);

		assertEquals(randomWikiPageAttachment, postWikiPageAttachment);
		assertValid(postWikiPageAttachment);

		assertValid(postWikiPageAttachment, multipartFiles);
	}

	protected WikiPageAttachment
			testPostWikiPageWikiPageAttachment_addWikiPageAttachment(
				WikiPageAttachment wikiPageAttachment,
				Map<String, File> multipartFiles)
		throws Exception {

		return wikiPageAttachmentResource.postWikiPageWikiPageAttachment(
			testGetWikiPageWikiPageAttachmentsPage_getWikiPageId(),
			wikiPageAttachment, multipartFiles);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		WikiPageAttachment wikiPageAttachment1,
		WikiPageAttachment wikiPageAttachment2) {

		Assert.assertTrue(
			wikiPageAttachment1 + " does not equal " + wikiPageAttachment2,
			equals(wikiPageAttachment1, wikiPageAttachment2));
	}

	protected void assertEquals(
		List<WikiPageAttachment> wikiPageAttachments1,
		List<WikiPageAttachment> wikiPageAttachments2) {

		Assert.assertEquals(
			wikiPageAttachments1.size(), wikiPageAttachments2.size());

		for (int i = 0; i < wikiPageAttachments1.size(); i++) {
			WikiPageAttachment wikiPageAttachment1 = wikiPageAttachments1.get(
				i);
			WikiPageAttachment wikiPageAttachment2 = wikiPageAttachments2.get(
				i);

			assertEquals(wikiPageAttachment1, wikiPageAttachment2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<WikiPageAttachment> wikiPageAttachments1,
		List<WikiPageAttachment> wikiPageAttachments2) {

		Assert.assertEquals(
			wikiPageAttachments1.size(), wikiPageAttachments2.size());

		for (WikiPageAttachment wikiPageAttachment1 : wikiPageAttachments1) {
			boolean contains = false;

			for (WikiPageAttachment wikiPageAttachment2 :
					wikiPageAttachments2) {

				if (equals(wikiPageAttachment1, wikiPageAttachment2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				wikiPageAttachments2 + " does not contain " +
					wikiPageAttachment1,
				contains);
		}
	}

	protected void assertValid(WikiPageAttachment wikiPageAttachment) {
		boolean valid = true;

		if (wikiPageAttachment.getId() == null) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("contentUrl", additionalAssertFieldName)) {
				if (wikiPageAttachment.getContentUrl() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("encodingFormat", additionalAssertFieldName)) {
				if (wikiPageAttachment.getEncodingFormat() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("fileExtension", additionalAssertFieldName)) {
				if (wikiPageAttachment.getFileExtension() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("sizeInBytes", additionalAssertFieldName)) {
				if (wikiPageAttachment.getSizeInBytes() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("title", additionalAssertFieldName)) {
				if (wikiPageAttachment.getTitle() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(
			WikiPageAttachment wikiPageAttachment,
			Map<String, File> multipartFiles)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertValid(Page<WikiPageAttachment> page) {
		boolean valid = false;

		java.util.Collection<WikiPageAttachment> wikiPageAttachments =
			page.getItems();

		int size = wikiPageAttachments.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(
		WikiPageAttachment wikiPageAttachment1,
		WikiPageAttachment wikiPageAttachment2) {

		if (wikiPageAttachment1 == wikiPageAttachment2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("contentUrl", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						wikiPageAttachment1.getContentUrl(),
						wikiPageAttachment2.getContentUrl())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("encodingFormat", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						wikiPageAttachment1.getEncodingFormat(),
						wikiPageAttachment2.getEncodingFormat())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("fileExtension", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						wikiPageAttachment1.getFileExtension(),
						wikiPageAttachment2.getFileExtension())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						wikiPageAttachment1.getId(),
						wikiPageAttachment2.getId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("sizeInBytes", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						wikiPageAttachment1.getSizeInBytes(),
						wikiPageAttachment2.getSizeInBytes())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("title", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						wikiPageAttachment1.getTitle(),
						wikiPageAttachment2.getTitle())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_wikiPageAttachmentResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_wikiPageAttachmentResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		java.util.Collection<EntityField> entityFields = getEntityFields();

		Stream<EntityField> stream = entityFields.stream();

		return stream.filter(
			entityField ->
				Objects.equals(entityField.getType(), type) &&
				!ArrayUtil.contains(
					getIgnoredEntityFieldNames(), entityField.getName())
		).collect(
			Collectors.toList()
		);
	}

	protected String getFilterString(
		EntityField entityField, String operator,
		WikiPageAttachment wikiPageAttachment) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("contentUrl")) {
			sb.append("'");
			sb.append(String.valueOf(wikiPageAttachment.getContentUrl()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("encodingFormat")) {
			sb.append("'");
			sb.append(String.valueOf(wikiPageAttachment.getEncodingFormat()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("fileExtension")) {
			sb.append("'");
			sb.append(String.valueOf(wikiPageAttachment.getFileExtension()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("id")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("sizeInBytes")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("title")) {
			sb.append("'");
			sb.append(String.valueOf(wikiPageAttachment.getTitle()));
			sb.append("'");

			return sb.toString();
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected Map<String, File> getMultipartFiles() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected WikiPageAttachment randomWikiPageAttachment() throws Exception {
		return new WikiPageAttachment() {
			{
				contentUrl = RandomTestUtil.randomString();
				encodingFormat = RandomTestUtil.randomString();
				fileExtension = RandomTestUtil.randomString();
				id = RandomTestUtil.randomLong();
				sizeInBytes = RandomTestUtil.randomLong();
				title = RandomTestUtil.randomString();
			}
		};
	}

	protected WikiPageAttachment randomIrrelevantWikiPageAttachment()
		throws Exception {

		WikiPageAttachment randomIrrelevantWikiPageAttachment =
			randomWikiPageAttachment();

		return randomIrrelevantWikiPageAttachment;
	}

	protected WikiPageAttachment randomPatchWikiPageAttachment()
		throws Exception {

		return randomWikiPageAttachment();
	}

	protected WikiPageAttachmentResource wikiPageAttachmentResource;
	protected Group irrelevantGroup;
	protected Company testCompany;
	protected Group testGroup;

	private static final Log _log = LogFactoryUtil.getLog(
		BaseWikiPageAttachmentResourceTestCase.class);

	private static BeanUtilsBean _beanUtilsBean = new BeanUtilsBean() {

		@Override
		public void copyProperty(Object bean, String name, Object value)
			throws IllegalAccessException, InvocationTargetException {

			if (value != null) {
				super.copyProperty(bean, name, value);
			}
		}

	};
	private static DateFormat _dateFormat;

	@Inject
	private
		com.liferay.headless.delivery.resource.v1_0.WikiPageAttachmentResource
			_wikiPageAttachmentResource;

}