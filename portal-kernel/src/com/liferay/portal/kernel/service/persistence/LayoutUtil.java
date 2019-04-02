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

package com.liferay.portal.kernel.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the layout service. This utility wraps <code>com.liferay.portal.service.persistence.impl.LayoutPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LayoutPersistence
 * @generated
 */
@ProviderType
public class LayoutUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Layout layout) {
		getPersistence().clearCache(layout);
	}

	/**
	 * @see BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Layout> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Layout> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Layout> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Layout> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Layout update(Layout layout) {
		return getPersistence().update(layout);
	}

	/**
	 * @see BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Layout update(Layout layout, ServiceContext serviceContext) {
		return getPersistence().update(layout, serviceContext);
	}

	/**
	 * Returns all the layouts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching layouts
	 */
	public static List<Layout> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the layouts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByUuid_First(
			String uuid, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUuid_First(
		String uuid, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByUuid_Last(
			String uuid, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUuid_Last(
		String uuid, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where uuid = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByUuid_PrevAndNext(
			long plid, String uuid, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_PrevAndNext(
			plid, uuid, orderByComparator);
	}

	/**
	 * Removes all the layouts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of layouts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching layouts
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the layouts where uuid = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByUuid_Head(String uuid, boolean head) {
		return getPersistence().findByUuid_Head(uuid, head);
	}

	/**
	 * Returns a range of all the layouts where uuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByUuid_Head(
		String uuid, boolean head, int start, int end) {

		return getPersistence().findByUuid_Head(uuid, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where uuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByUuid_Head(
		String uuid, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByUuid_Head(
			uuid, head, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where uuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByUuid_Head(
		String uuid, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid_Head(
			uuid, head, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where uuid = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByUuid_Head_First(
			String uuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_Head_First(
			uuid, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where uuid = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUuid_Head_First(
		String uuid, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByUuid_Head_First(
			uuid, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where uuid = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByUuid_Head_Last(
			String uuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_Head_Last(
			uuid, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where uuid = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUuid_Head_Last(
		String uuid, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByUuid_Head_Last(
			uuid, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where uuid = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param uuid the uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByUuid_Head_PrevAndNext(
			long plid, String uuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_Head_PrevAndNext(
			plid, uuid, head, orderByComparator);
	}

	/**
	 * Removes all the layouts where uuid = &#63; and head = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param head the head
	 */
	public static void removeByUuid_Head(String uuid, boolean head) {
		getPersistence().removeByUuid_Head(uuid, head);
	}

	/**
	 * Returns the number of layouts where uuid = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByUuid_Head(String uuid, boolean head) {
		return getPersistence().countByUuid_Head(uuid, head);
	}

	/**
	 * Returns all the layouts where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @return the matching layouts
	 */
	public static List<Layout> findByUUID_G_P(
		String uuid, long groupId, boolean privateLayout) {

		return getPersistence().findByUUID_G_P(uuid, groupId, privateLayout);
	}

	/**
	 * Returns a range of all the layouts where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByUUID_G_P(
		String uuid, long groupId, boolean privateLayout, int start, int end) {

		return getPersistence().findByUUID_G_P(
			uuid, groupId, privateLayout, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByUUID_G_P(
		String uuid, long groupId, boolean privateLayout, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByUUID_G_P(
			uuid, groupId, privateLayout, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByUUID_G_P(
		String uuid, long groupId, boolean privateLayout, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUUID_G_P(
			uuid, groupId, privateLayout, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByUUID_G_P_First(
			String uuid, long groupId, boolean privateLayout,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUUID_G_P_First(
			uuid, groupId, privateLayout, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUUID_G_P_First(
		String uuid, long groupId, boolean privateLayout,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByUUID_G_P_First(
			uuid, groupId, privateLayout, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByUUID_G_P_Last(
			String uuid, long groupId, boolean privateLayout,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUUID_G_P_Last(
			uuid, groupId, privateLayout, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUUID_G_P_Last(
		String uuid, long groupId, boolean privateLayout,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByUUID_G_P_Last(
			uuid, groupId, privateLayout, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByUUID_G_P_PrevAndNext(
			long plid, String uuid, long groupId, boolean privateLayout,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUUID_G_P_PrevAndNext(
			plid, uuid, groupId, privateLayout, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByUUID_G_P(
		String uuid, long groupId, boolean privateLayout) {

		return getPersistence().filterFindByUUID_G_P(
			uuid, groupId, privateLayout);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByUUID_G_P(
		String uuid, long groupId, boolean privateLayout, int start, int end) {

		return getPersistence().filterFindByUUID_G_P(
			uuid, groupId, privateLayout, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByUUID_G_P(
		String uuid, long groupId, boolean privateLayout, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByUUID_G_P(
			uuid, groupId, privateLayout, start, end, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByUUID_G_P_PrevAndNext(
			long plid, String uuid, long groupId, boolean privateLayout,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByUUID_G_P_PrevAndNext(
			plid, uuid, groupId, privateLayout, orderByComparator);
	}

	/**
	 * Removes all the layouts where uuid = &#63; and groupId = &#63; and privateLayout = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 */
	public static void removeByUUID_G_P(
		String uuid, long groupId, boolean privateLayout) {

		getPersistence().removeByUUID_G_P(uuid, groupId, privateLayout);
	}

	/**
	 * Returns the number of layouts where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @return the number of matching layouts
	 */
	public static int countByUUID_G_P(
		String uuid, long groupId, boolean privateLayout) {

		return getPersistence().countByUUID_G_P(uuid, groupId, privateLayout);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where uuid = &#63; and groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByUUID_G_P(
		String uuid, long groupId, boolean privateLayout) {

		return getPersistence().filterCountByUUID_G_P(
			uuid, groupId, privateLayout);
	}

	/**
	 * Returns the layout where uuid = &#63; and groupId = &#63; and privateLayout = &#63; and head = &#63; or throws a <code>NoSuchLayoutException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @return the matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByUUID_G_P_Head(
			String uuid, long groupId, boolean privateLayout, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUUID_G_P_Head(
			uuid, groupId, privateLayout, head);
	}

	/**
	 * Returns the layout where uuid = &#63; and groupId = &#63; and privateLayout = &#63; and head = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUUID_G_P_Head(
		String uuid, long groupId, boolean privateLayout, boolean head) {

		return getPersistence().fetchByUUID_G_P_Head(
			uuid, groupId, privateLayout, head);
	}

	/**
	 * Returns the layout where uuid = &#63; and groupId = &#63; and privateLayout = &#63; and head = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUUID_G_P_Head(
		String uuid, long groupId, boolean privateLayout, boolean head,
		boolean retrieveFromCache) {

		return getPersistence().fetchByUUID_G_P_Head(
			uuid, groupId, privateLayout, head, retrieveFromCache);
	}

	/**
	 * Removes the layout where uuid = &#63; and groupId = &#63; and privateLayout = &#63; and head = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @return the layout that was removed
	 */
	public static Layout removeByUUID_G_P_Head(
			String uuid, long groupId, boolean privateLayout, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().removeByUUID_G_P_Head(
			uuid, groupId, privateLayout, head);
	}

	/**
	 * Returns the number of layouts where uuid = &#63; and groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByUUID_G_P_Head(
		String uuid, long groupId, boolean privateLayout, boolean head) {

		return getPersistence().countByUUID_G_P_Head(
			uuid, groupId, privateLayout, head);
	}

	/**
	 * Returns all the layouts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching layouts
	 */
	public static List<Layout> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the layouts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByUuid_C_PrevAndNext(
			long plid, String uuid, long companyId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_C_PrevAndNext(
			plid, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the layouts where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of layouts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching layouts
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the layouts where uuid = &#63; and companyId = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByUuid_C_Head(
		String uuid, long companyId, boolean head) {

		return getPersistence().findByUuid_C_Head(uuid, companyId, head);
	}

	/**
	 * Returns a range of all the layouts where uuid = &#63; and companyId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByUuid_C_Head(
		String uuid, long companyId, boolean head, int start, int end) {

		return getPersistence().findByUuid_C_Head(
			uuid, companyId, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where uuid = &#63; and companyId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByUuid_C_Head(
		String uuid, long companyId, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByUuid_C_Head(
			uuid, companyId, head, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where uuid = &#63; and companyId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByUuid_C_Head(
		String uuid, long companyId, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid_C_Head(
			uuid, companyId, head, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where uuid = &#63; and companyId = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByUuid_C_Head_First(
			String uuid, long companyId, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_C_Head_First(
			uuid, companyId, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where uuid = &#63; and companyId = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUuid_C_Head_First(
		String uuid, long companyId, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByUuid_C_Head_First(
			uuid, companyId, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where uuid = &#63; and companyId = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByUuid_C_Head_Last(
			String uuid, long companyId, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_C_Head_Last(
			uuid, companyId, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where uuid = &#63; and companyId = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByUuid_C_Head_Last(
		String uuid, long companyId, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByUuid_C_Head_Last(
			uuid, companyId, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where uuid = &#63; and companyId = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByUuid_C_Head_PrevAndNext(
			long plid, String uuid, long companyId, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByUuid_C_Head_PrevAndNext(
			plid, uuid, companyId, head, orderByComparator);
	}

	/**
	 * Removes all the layouts where uuid = &#63; and companyId = &#63; and head = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param head the head
	 */
	public static void removeByUuid_C_Head(
		String uuid, long companyId, boolean head) {

		getPersistence().removeByUuid_C_Head(uuid, companyId, head);
	}

	/**
	 * Returns the number of layouts where uuid = &#63; and companyId = &#63; and head = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByUuid_C_Head(
		String uuid, long companyId, boolean head) {

		return getPersistence().countByUuid_C_Head(uuid, companyId, head);
	}

	/**
	 * Returns all the layouts where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching layouts
	 */
	public static List<Layout> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByGroupId_First(
			long groupId, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByGroupId_First(
		long groupId, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByGroupId_Last(
			long groupId, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByGroupId_Last(
		long groupId, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByGroupId_PrevAndNext(
			long plid, long groupId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByGroupId_PrevAndNext(
			plid, groupId, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByGroupId_PrevAndNext(
			long plid, long groupId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			plid, groupId, orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of layouts where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching layouts
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByGroupId_Head(long groupId, boolean head) {
		return getPersistence().findByGroupId_Head(groupId, head);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByGroupId_Head(
		long groupId, boolean head, int start, int end) {

		return getPersistence().findByGroupId_Head(groupId, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByGroupId_Head(
		long groupId, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByGroupId_Head(
			groupId, head, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByGroupId_Head(
		long groupId, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByGroupId_Head(
			groupId, head, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByGroupId_Head_First(
			long groupId, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByGroupId_Head_First(
			groupId, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByGroupId_Head_First(
		long groupId, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByGroupId_Head_First(
			groupId, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByGroupId_Head_Last(
			long groupId, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByGroupId_Head_Last(
			groupId, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByGroupId_Head_Last(
		long groupId, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByGroupId_Head_Last(
			groupId, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByGroupId_Head_PrevAndNext(
			long plid, long groupId, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByGroupId_Head_PrevAndNext(
			plid, groupId, head, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByGroupId_Head(
		long groupId, boolean head) {

		return getPersistence().filterFindByGroupId_Head(groupId, head);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByGroupId_Head(
		long groupId, boolean head, int start, int end) {

		return getPersistence().filterFindByGroupId_Head(
			groupId, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByGroupId_Head(
		long groupId, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByGroupId_Head(
			groupId, head, start, end, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByGroupId_Head_PrevAndNext(
			long plid, long groupId, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByGroupId_Head_PrevAndNext(
			plid, groupId, head, orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and head = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param head the head
	 */
	public static void removeByGroupId_Head(long groupId, boolean head) {
		getPersistence().removeByGroupId_Head(groupId, head);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByGroupId_Head(long groupId, boolean head) {
		return getPersistence().countByGroupId_Head(groupId, head);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param head the head
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByGroupId_Head(long groupId, boolean head) {
		return getPersistence().filterCountByGroupId_Head(groupId, head);
	}

	/**
	 * Returns all the layouts where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching layouts
	 */
	public static List<Layout> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the layouts where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByCompanyId_First(
			long companyId, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByCompanyId_First(
		long companyId, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByCompanyId_Last(
			long companyId, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByCompanyId_Last(
		long companyId, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where companyId = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByCompanyId_PrevAndNext(
			long plid, long companyId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByCompanyId_PrevAndNext(
			plid, companyId, orderByComparator);
	}

	/**
	 * Removes all the layouts where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of layouts where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching layouts
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the layouts where companyId = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByCompanyId_Head(
		long companyId, boolean head) {

		return getPersistence().findByCompanyId_Head(companyId, head);
	}

	/**
	 * Returns a range of all the layouts where companyId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByCompanyId_Head(
		long companyId, boolean head, int start, int end) {

		return getPersistence().findByCompanyId_Head(
			companyId, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where companyId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByCompanyId_Head(
		long companyId, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByCompanyId_Head(
			companyId, head, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where companyId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByCompanyId_Head(
		long companyId, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByCompanyId_Head(
			companyId, head, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where companyId = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByCompanyId_Head_First(
			long companyId, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByCompanyId_Head_First(
			companyId, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where companyId = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByCompanyId_Head_First(
		long companyId, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByCompanyId_Head_First(
			companyId, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where companyId = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByCompanyId_Head_Last(
			long companyId, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByCompanyId_Head_Last(
			companyId, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where companyId = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByCompanyId_Head_Last(
		long companyId, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByCompanyId_Head_Last(
			companyId, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where companyId = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param companyId the company ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByCompanyId_Head_PrevAndNext(
			long plid, long companyId, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByCompanyId_Head_PrevAndNext(
			plid, companyId, head, orderByComparator);
	}

	/**
	 * Removes all the layouts where companyId = &#63; and head = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param head the head
	 */
	public static void removeByCompanyId_Head(long companyId, boolean head) {
		getPersistence().removeByCompanyId_Head(companyId, head);
	}

	/**
	 * Returns the number of layouts where companyId = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByCompanyId_Head(long companyId, boolean head) {
		return getPersistence().countByCompanyId_Head(companyId, head);
	}

	/**
	 * Returns all the layouts where parentPlid = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @return the matching layouts
	 */
	public static List<Layout> findByParentPlid(long parentPlid) {
		return getPersistence().findByParentPlid(parentPlid);
	}

	/**
	 * Returns a range of all the layouts where parentPlid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentPlid the parent plid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByParentPlid(
		long parentPlid, int start, int end) {

		return getPersistence().findByParentPlid(parentPlid, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where parentPlid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentPlid the parent plid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByParentPlid(
		long parentPlid, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByParentPlid(
			parentPlid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where parentPlid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentPlid the parent plid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByParentPlid(
		long parentPlid, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByParentPlid(
			parentPlid, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where parentPlid = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByParentPlid_First(
			long parentPlid, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByParentPlid_First(
			parentPlid, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where parentPlid = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByParentPlid_First(
		long parentPlid, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByParentPlid_First(
			parentPlid, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where parentPlid = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByParentPlid_Last(
			long parentPlid, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByParentPlid_Last(
			parentPlid, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where parentPlid = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByParentPlid_Last(
		long parentPlid, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByParentPlid_Last(
			parentPlid, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where parentPlid = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param parentPlid the parent plid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByParentPlid_PrevAndNext(
			long plid, long parentPlid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByParentPlid_PrevAndNext(
			plid, parentPlid, orderByComparator);
	}

	/**
	 * Removes all the layouts where parentPlid = &#63; from the database.
	 *
	 * @param parentPlid the parent plid
	 */
	public static void removeByParentPlid(long parentPlid) {
		getPersistence().removeByParentPlid(parentPlid);
	}

	/**
	 * Returns the number of layouts where parentPlid = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @return the number of matching layouts
	 */
	public static int countByParentPlid(long parentPlid) {
		return getPersistence().countByParentPlid(parentPlid);
	}

	/**
	 * Returns all the layouts where parentPlid = &#63; and head = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByParentPlid_Head(
		long parentPlid, boolean head) {

		return getPersistence().findByParentPlid_Head(parentPlid, head);
	}

	/**
	 * Returns a range of all the layouts where parentPlid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentPlid the parent plid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByParentPlid_Head(
		long parentPlid, boolean head, int start, int end) {

		return getPersistence().findByParentPlid_Head(
			parentPlid, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where parentPlid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentPlid the parent plid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByParentPlid_Head(
		long parentPlid, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByParentPlid_Head(
			parentPlid, head, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where parentPlid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentPlid the parent plid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByParentPlid_Head(
		long parentPlid, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByParentPlid_Head(
			parentPlid, head, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where parentPlid = &#63; and head = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByParentPlid_Head_First(
			long parentPlid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByParentPlid_Head_First(
			parentPlid, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where parentPlid = &#63; and head = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByParentPlid_Head_First(
		long parentPlid, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByParentPlid_Head_First(
			parentPlid, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where parentPlid = &#63; and head = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByParentPlid_Head_Last(
			long parentPlid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByParentPlid_Head_Last(
			parentPlid, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where parentPlid = &#63; and head = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByParentPlid_Head_Last(
		long parentPlid, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByParentPlid_Head_Last(
			parentPlid, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where parentPlid = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param parentPlid the parent plid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByParentPlid_Head_PrevAndNext(
			long plid, long parentPlid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByParentPlid_Head_PrevAndNext(
			plid, parentPlid, head, orderByComparator);
	}

	/**
	 * Removes all the layouts where parentPlid = &#63; and head = &#63; from the database.
	 *
	 * @param parentPlid the parent plid
	 * @param head the head
	 */
	public static void removeByParentPlid_Head(long parentPlid, boolean head) {
		getPersistence().removeByParentPlid_Head(parentPlid, head);
	}

	/**
	 * Returns the number of layouts where parentPlid = &#63; and head = &#63;.
	 *
	 * @param parentPlid the parent plid
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByParentPlid_Head(long parentPlid, boolean head) {
		return getPersistence().countByParentPlid_Head(parentPlid, head);
	}

	/**
	 * Returns all the layouts where iconImageId = &#63;.
	 *
	 * @param iconImageId the icon image ID
	 * @return the matching layouts
	 */
	public static List<Layout> findByIconImageId(long iconImageId) {
		return getPersistence().findByIconImageId(iconImageId);
	}

	/**
	 * Returns a range of all the layouts where iconImageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param iconImageId the icon image ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByIconImageId(
		long iconImageId, int start, int end) {

		return getPersistence().findByIconImageId(iconImageId, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where iconImageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param iconImageId the icon image ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByIconImageId(
		long iconImageId, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByIconImageId(
			iconImageId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where iconImageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param iconImageId the icon image ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByIconImageId(
		long iconImageId, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByIconImageId(
			iconImageId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where iconImageId = &#63;.
	 *
	 * @param iconImageId the icon image ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByIconImageId_First(
			long iconImageId, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByIconImageId_First(
			iconImageId, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where iconImageId = &#63;.
	 *
	 * @param iconImageId the icon image ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByIconImageId_First(
		long iconImageId, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByIconImageId_First(
			iconImageId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where iconImageId = &#63;.
	 *
	 * @param iconImageId the icon image ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByIconImageId_Last(
			long iconImageId, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByIconImageId_Last(
			iconImageId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where iconImageId = &#63;.
	 *
	 * @param iconImageId the icon image ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByIconImageId_Last(
		long iconImageId, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByIconImageId_Last(
			iconImageId, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where iconImageId = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param iconImageId the icon image ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByIconImageId_PrevAndNext(
			long plid, long iconImageId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByIconImageId_PrevAndNext(
			plid, iconImageId, orderByComparator);
	}

	/**
	 * Removes all the layouts where iconImageId = &#63; from the database.
	 *
	 * @param iconImageId the icon image ID
	 */
	public static void removeByIconImageId(long iconImageId) {
		getPersistence().removeByIconImageId(iconImageId);
	}

	/**
	 * Returns the number of layouts where iconImageId = &#63;.
	 *
	 * @param iconImageId the icon image ID
	 * @return the number of matching layouts
	 */
	public static int countByIconImageId(long iconImageId) {
		return getPersistence().countByIconImageId(iconImageId);
	}

	/**
	 * Returns the layout where iconImageId = &#63; and head = &#63; or throws a <code>NoSuchLayoutException</code> if it could not be found.
	 *
	 * @param iconImageId the icon image ID
	 * @param head the head
	 * @return the matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByIconImageId_Head(long iconImageId, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByIconImageId_Head(iconImageId, head);
	}

	/**
	 * Returns the layout where iconImageId = &#63; and head = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param iconImageId the icon image ID
	 * @param head the head
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByIconImageId_Head(
		long iconImageId, boolean head) {

		return getPersistence().fetchByIconImageId_Head(iconImageId, head);
	}

	/**
	 * Returns the layout where iconImageId = &#63; and head = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param iconImageId the icon image ID
	 * @param head the head
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByIconImageId_Head(
		long iconImageId, boolean head, boolean retrieveFromCache) {

		return getPersistence().fetchByIconImageId_Head(
			iconImageId, head, retrieveFromCache);
	}

	/**
	 * Removes the layout where iconImageId = &#63; and head = &#63; from the database.
	 *
	 * @param iconImageId the icon image ID
	 * @param head the head
	 * @return the layout that was removed
	 */
	public static Layout removeByIconImageId_Head(
			long iconImageId, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().removeByIconImageId_Head(iconImageId, head);
	}

	/**
	 * Returns the number of layouts where iconImageId = &#63; and head = &#63;.
	 *
	 * @param iconImageId the icon image ID
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByIconImageId_Head(long iconImageId, boolean head) {
		return getPersistence().countByIconImageId_Head(iconImageId, head);
	}

	/**
	 * Returns all the layouts where layoutPrototypeUuid = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @return the matching layouts
	 */
	public static List<Layout> findByLayoutPrototypeUuid(
		String layoutPrototypeUuid) {

		return getPersistence().findByLayoutPrototypeUuid(layoutPrototypeUuid);
	}

	/**
	 * Returns a range of all the layouts where layoutPrototypeUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByLayoutPrototypeUuid(
		String layoutPrototypeUuid, int start, int end) {

		return getPersistence().findByLayoutPrototypeUuid(
			layoutPrototypeUuid, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where layoutPrototypeUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByLayoutPrototypeUuid(
		String layoutPrototypeUuid, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByLayoutPrototypeUuid(
			layoutPrototypeUuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where layoutPrototypeUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByLayoutPrototypeUuid(
		String layoutPrototypeUuid, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByLayoutPrototypeUuid(
			layoutPrototypeUuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where layoutPrototypeUuid = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByLayoutPrototypeUuid_First(
			String layoutPrototypeUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByLayoutPrototypeUuid_First(
			layoutPrototypeUuid, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where layoutPrototypeUuid = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByLayoutPrototypeUuid_First(
		String layoutPrototypeUuid,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByLayoutPrototypeUuid_First(
			layoutPrototypeUuid, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where layoutPrototypeUuid = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByLayoutPrototypeUuid_Last(
			String layoutPrototypeUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByLayoutPrototypeUuid_Last(
			layoutPrototypeUuid, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where layoutPrototypeUuid = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByLayoutPrototypeUuid_Last(
		String layoutPrototypeUuid,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByLayoutPrototypeUuid_Last(
			layoutPrototypeUuid, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where layoutPrototypeUuid = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByLayoutPrototypeUuid_PrevAndNext(
			long plid, String layoutPrototypeUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByLayoutPrototypeUuid_PrevAndNext(
			plid, layoutPrototypeUuid, orderByComparator);
	}

	/**
	 * Removes all the layouts where layoutPrototypeUuid = &#63; from the database.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 */
	public static void removeByLayoutPrototypeUuid(String layoutPrototypeUuid) {
		getPersistence().removeByLayoutPrototypeUuid(layoutPrototypeUuid);
	}

	/**
	 * Returns the number of layouts where layoutPrototypeUuid = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @return the number of matching layouts
	 */
	public static int countByLayoutPrototypeUuid(String layoutPrototypeUuid) {
		return getPersistence().countByLayoutPrototypeUuid(layoutPrototypeUuid);
	}

	/**
	 * Returns all the layouts where layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByLayoutPrototypeUuid_Head(
		String layoutPrototypeUuid, boolean head) {

		return getPersistence().findByLayoutPrototypeUuid_Head(
			layoutPrototypeUuid, head);
	}

	/**
	 * Returns a range of all the layouts where layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByLayoutPrototypeUuid_Head(
		String layoutPrototypeUuid, boolean head, int start, int end) {

		return getPersistence().findByLayoutPrototypeUuid_Head(
			layoutPrototypeUuid, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByLayoutPrototypeUuid_Head(
		String layoutPrototypeUuid, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByLayoutPrototypeUuid_Head(
			layoutPrototypeUuid, head, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByLayoutPrototypeUuid_Head(
		String layoutPrototypeUuid, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByLayoutPrototypeUuid_Head(
			layoutPrototypeUuid, head, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByLayoutPrototypeUuid_Head_First(
			String layoutPrototypeUuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByLayoutPrototypeUuid_Head_First(
			layoutPrototypeUuid, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByLayoutPrototypeUuid_Head_First(
		String layoutPrototypeUuid, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByLayoutPrototypeUuid_Head_First(
			layoutPrototypeUuid, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByLayoutPrototypeUuid_Head_Last(
			String layoutPrototypeUuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByLayoutPrototypeUuid_Head_Last(
			layoutPrototypeUuid, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByLayoutPrototypeUuid_Head_Last(
		String layoutPrototypeUuid, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByLayoutPrototypeUuid_Head_Last(
			layoutPrototypeUuid, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByLayoutPrototypeUuid_Head_PrevAndNext(
			long plid, String layoutPrototypeUuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByLayoutPrototypeUuid_Head_PrevAndNext(
			plid, layoutPrototypeUuid, head, orderByComparator);
	}

	/**
	 * Removes all the layouts where layoutPrototypeUuid = &#63; and head = &#63; from the database.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 */
	public static void removeByLayoutPrototypeUuid_Head(
		String layoutPrototypeUuid, boolean head) {

		getPersistence().removeByLayoutPrototypeUuid_Head(
			layoutPrototypeUuid, head);
	}

	/**
	 * Returns the number of layouts where layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByLayoutPrototypeUuid_Head(
		String layoutPrototypeUuid, boolean head) {

		return getPersistence().countByLayoutPrototypeUuid_Head(
			layoutPrototypeUuid, head);
	}

	/**
	 * Returns all the layouts where sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @return the matching layouts
	 */
	public static List<Layout> findBySourcePrototypeLayoutUuid(
		String sourcePrototypeLayoutUuid) {

		return getPersistence().findBySourcePrototypeLayoutUuid(
			sourcePrototypeLayoutUuid);
	}

	/**
	 * Returns a range of all the layouts where sourcePrototypeLayoutUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findBySourcePrototypeLayoutUuid(
		String sourcePrototypeLayoutUuid, int start, int end) {

		return getPersistence().findBySourcePrototypeLayoutUuid(
			sourcePrototypeLayoutUuid, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where sourcePrototypeLayoutUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findBySourcePrototypeLayoutUuid(
		String sourcePrototypeLayoutUuid, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findBySourcePrototypeLayoutUuid(
			sourcePrototypeLayoutUuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where sourcePrototypeLayoutUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findBySourcePrototypeLayoutUuid(
		String sourcePrototypeLayoutUuid, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findBySourcePrototypeLayoutUuid(
			sourcePrototypeLayoutUuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findBySourcePrototypeLayoutUuid_First(
			String sourcePrototypeLayoutUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findBySourcePrototypeLayoutUuid_First(
			sourcePrototypeLayoutUuid, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchBySourcePrototypeLayoutUuid_First(
		String sourcePrototypeLayoutUuid,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchBySourcePrototypeLayoutUuid_First(
			sourcePrototypeLayoutUuid, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findBySourcePrototypeLayoutUuid_Last(
			String sourcePrototypeLayoutUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findBySourcePrototypeLayoutUuid_Last(
			sourcePrototypeLayoutUuid, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchBySourcePrototypeLayoutUuid_Last(
		String sourcePrototypeLayoutUuid,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchBySourcePrototypeLayoutUuid_Last(
			sourcePrototypeLayoutUuid, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findBySourcePrototypeLayoutUuid_PrevAndNext(
			long plid, String sourcePrototypeLayoutUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findBySourcePrototypeLayoutUuid_PrevAndNext(
			plid, sourcePrototypeLayoutUuid, orderByComparator);
	}

	/**
	 * Removes all the layouts where sourcePrototypeLayoutUuid = &#63; from the database.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 */
	public static void removeBySourcePrototypeLayoutUuid(
		String sourcePrototypeLayoutUuid) {

		getPersistence().removeBySourcePrototypeLayoutUuid(
			sourcePrototypeLayoutUuid);
	}

	/**
	 * Returns the number of layouts where sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @return the number of matching layouts
	 */
	public static int countBySourcePrototypeLayoutUuid(
		String sourcePrototypeLayoutUuid) {

		return getPersistence().countBySourcePrototypeLayoutUuid(
			sourcePrototypeLayoutUuid);
	}

	/**
	 * Returns all the layouts where sourcePrototypeLayoutUuid = &#63; and head = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findBySourcePrototypeLayoutUuid_Head(
		String sourcePrototypeLayoutUuid, boolean head) {

		return getPersistence().findBySourcePrototypeLayoutUuid_Head(
			sourcePrototypeLayoutUuid, head);
	}

	/**
	 * Returns a range of all the layouts where sourcePrototypeLayoutUuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findBySourcePrototypeLayoutUuid_Head(
		String sourcePrototypeLayoutUuid, boolean head, int start, int end) {

		return getPersistence().findBySourcePrototypeLayoutUuid_Head(
			sourcePrototypeLayoutUuid, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where sourcePrototypeLayoutUuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findBySourcePrototypeLayoutUuid_Head(
		String sourcePrototypeLayoutUuid, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findBySourcePrototypeLayoutUuid_Head(
			sourcePrototypeLayoutUuid, head, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where sourcePrototypeLayoutUuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findBySourcePrototypeLayoutUuid_Head(
		String sourcePrototypeLayoutUuid, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findBySourcePrototypeLayoutUuid_Head(
			sourcePrototypeLayoutUuid, head, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where sourcePrototypeLayoutUuid = &#63; and head = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findBySourcePrototypeLayoutUuid_Head_First(
			String sourcePrototypeLayoutUuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findBySourcePrototypeLayoutUuid_Head_First(
			sourcePrototypeLayoutUuid, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where sourcePrototypeLayoutUuid = &#63; and head = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchBySourcePrototypeLayoutUuid_Head_First(
		String sourcePrototypeLayoutUuid, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchBySourcePrototypeLayoutUuid_Head_First(
			sourcePrototypeLayoutUuid, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where sourcePrototypeLayoutUuid = &#63; and head = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findBySourcePrototypeLayoutUuid_Head_Last(
			String sourcePrototypeLayoutUuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findBySourcePrototypeLayoutUuid_Head_Last(
			sourcePrototypeLayoutUuid, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where sourcePrototypeLayoutUuid = &#63; and head = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchBySourcePrototypeLayoutUuid_Head_Last(
		String sourcePrototypeLayoutUuid, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchBySourcePrototypeLayoutUuid_Head_Last(
			sourcePrototypeLayoutUuid, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where sourcePrototypeLayoutUuid = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findBySourcePrototypeLayoutUuid_Head_PrevAndNext(
			long plid, String sourcePrototypeLayoutUuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().
			findBySourcePrototypeLayoutUuid_Head_PrevAndNext(
				plid, sourcePrototypeLayoutUuid, head, orderByComparator);
	}

	/**
	 * Removes all the layouts where sourcePrototypeLayoutUuid = &#63; and head = &#63; from the database.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 */
	public static void removeBySourcePrototypeLayoutUuid_Head(
		String sourcePrototypeLayoutUuid, boolean head) {

		getPersistence().removeBySourcePrototypeLayoutUuid_Head(
			sourcePrototypeLayoutUuid, head);
	}

	/**
	 * Returns the number of layouts where sourcePrototypeLayoutUuid = &#63; and head = &#63;.
	 *
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countBySourcePrototypeLayoutUuid_Head(
		String sourcePrototypeLayoutUuid, boolean head) {

		return getPersistence().countBySourcePrototypeLayoutUuid_Head(
			sourcePrototypeLayoutUuid, head);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P(long groupId, boolean privateLayout) {
		return getPersistence().findByG_P(groupId, privateLayout);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P(
		long groupId, boolean privateLayout, int start, int end) {

		return getPersistence().findByG_P(groupId, privateLayout, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P(
		long groupId, boolean privateLayout, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, privateLayout, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P(
		long groupId, boolean privateLayout, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P(
			groupId, privateLayout, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_First(
			long groupId, boolean privateLayout,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_First(
			groupId, privateLayout, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_First(
		long groupId, boolean privateLayout,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, privateLayout, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_Last(
			long groupId, boolean privateLayout,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_Last(
			groupId, privateLayout, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_Last(
		long groupId, boolean privateLayout,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, privateLayout, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_P_PrevAndNext(
			long plid, long groupId, boolean privateLayout,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_PrevAndNext(
			plid, groupId, privateLayout, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P(
		long groupId, boolean privateLayout) {

		return getPersistence().filterFindByG_P(groupId, privateLayout);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P(
		long groupId, boolean privateLayout, int start, int end) {

		return getPersistence().filterFindByG_P(
			groupId, privateLayout, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and privateLayout = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P(
		long groupId, boolean privateLayout, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P(
			groupId, privateLayout, start, end, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_P_PrevAndNext(
			long plid, long groupId, boolean privateLayout,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_P_PrevAndNext(
			plid, groupId, privateLayout, orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and privateLayout = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 */
	public static void removeByG_P(long groupId, boolean privateLayout) {
		getPersistence().removeByG_P(groupId, privateLayout);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @return the number of matching layouts
	 */
	public static int countByG_P(long groupId, boolean privateLayout) {
		return getPersistence().countByG_P(groupId, privateLayout);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P(long groupId, boolean privateLayout) {
		return getPersistence().filterCountByG_P(groupId, privateLayout);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_Head(
		long groupId, boolean privateLayout, boolean head) {

		return getPersistence().findByG_P_Head(groupId, privateLayout, head);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_Head(
		long groupId, boolean privateLayout, boolean head, int start, int end) {

		return getPersistence().findByG_P_Head(
			groupId, privateLayout, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_Head(
		long groupId, boolean privateLayout, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_Head(
			groupId, privateLayout, head, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_Head(
		long groupId, boolean privateLayout, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_Head(
			groupId, privateLayout, head, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_Head_First(
			long groupId, boolean privateLayout, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_Head_First(
			groupId, privateLayout, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_Head_First(
		long groupId, boolean privateLayout, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_Head_First(
			groupId, privateLayout, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_Head_Last(
			long groupId, boolean privateLayout, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_Head_Last(
			groupId, privateLayout, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_Head_Last(
		long groupId, boolean privateLayout, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_Head_Last(
			groupId, privateLayout, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_P_Head_PrevAndNext(
			long plid, long groupId, boolean privateLayout, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_Head_PrevAndNext(
			plid, groupId, privateLayout, head, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_Head(
		long groupId, boolean privateLayout, boolean head) {

		return getPersistence().filterFindByG_P_Head(
			groupId, privateLayout, head);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_Head(
		long groupId, boolean privateLayout, boolean head, int start, int end) {

		return getPersistence().filterFindByG_P_Head(
			groupId, privateLayout, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_Head(
		long groupId, boolean privateLayout, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_Head(
			groupId, privateLayout, head, start, end, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_P_Head_PrevAndNext(
			long plid, long groupId, boolean privateLayout, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_P_Head_PrevAndNext(
			plid, groupId, privateLayout, head, orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and privateLayout = &#63; and head = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 */
	public static void removeByG_P_Head(
		long groupId, boolean privateLayout, boolean head) {

		getPersistence().removeByG_P_Head(groupId, privateLayout, head);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByG_P_Head(
		long groupId, boolean privateLayout, boolean head) {

		return getPersistence().countByG_P_Head(groupId, privateLayout, head);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param head the head
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_Head(
		long groupId, boolean privateLayout, boolean head) {

		return getPersistence().filterCountByG_P_Head(
			groupId, privateLayout, head);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_T(long groupId, String type) {
		return getPersistence().findByG_T(groupId, type);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_T(
		long groupId, String type, int start, int end) {

		return getPersistence().findByG_T(groupId, type, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_T(
		long groupId, String type, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_T(
			groupId, type, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_T(
		long groupId, String type, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_T(
			groupId, type, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_T_First(
			long groupId, String type,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_T_First(
			groupId, type, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_T_First(
		long groupId, String type,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_T_First(
			groupId, type, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_T_Last(
			long groupId, String type,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_T_Last(
			groupId, type, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_T_Last(
		long groupId, String type,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_T_Last(
			groupId, type, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and type = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_T_PrevAndNext(
			long plid, long groupId, String type,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_T_PrevAndNext(
			plid, groupId, type, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_T(long groupId, String type) {
		return getPersistence().filterFindByG_T(groupId, type);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_T(
		long groupId, String type, int start, int end) {

		return getPersistence().filterFindByG_T(groupId, type, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_T(
		long groupId, String type, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_T(
			groupId, type, start, end, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and type = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_T_PrevAndNext(
			long plid, long groupId, String type,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_T_PrevAndNext(
			plid, groupId, type, orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and type = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 */
	public static void removeByG_T(long groupId, String type) {
		getPersistence().removeByG_T(groupId, type);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @return the number of matching layouts
	 */
	public static int countByG_T(long groupId, String type) {
		return getPersistence().countByG_T(groupId, type);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_T(long groupId, String type) {
		return getPersistence().filterCountByG_T(groupId, type);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_T_Head(
		long groupId, String type, boolean head) {

		return getPersistence().findByG_T_Head(groupId, type, head);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_T_Head(
		long groupId, String type, boolean head, int start, int end) {

		return getPersistence().findByG_T_Head(groupId, type, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_T_Head(
		long groupId, String type, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_T_Head(
			groupId, type, head, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_T_Head(
		long groupId, String type, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_T_Head(
			groupId, type, head, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_T_Head_First(
			long groupId, String type, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_T_Head_First(
			groupId, type, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_T_Head_First(
		long groupId, String type, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_T_Head_First(
			groupId, type, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_T_Head_Last(
			long groupId, String type, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_T_Head_Last(
			groupId, type, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_T_Head_Last(
		long groupId, String type, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_T_Head_Last(
			groupId, type, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_T_Head_PrevAndNext(
			long plid, long groupId, String type, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_T_Head_PrevAndNext(
			plid, groupId, type, head, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_T_Head(
		long groupId, String type, boolean head) {

		return getPersistence().filterFindByG_T_Head(groupId, type, head);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_T_Head(
		long groupId, String type, boolean head, int start, int end) {

		return getPersistence().filterFindByG_T_Head(
			groupId, type, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_T_Head(
		long groupId, String type, boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_T_Head(
			groupId, type, head, start, end, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_T_Head_PrevAndNext(
			long plid, long groupId, String type, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_T_Head_PrevAndNext(
			plid, groupId, type, head, orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and type = &#63; and head = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 */
	public static void removeByG_T_Head(
		long groupId, String type, boolean head) {

		getPersistence().removeByG_T_Head(groupId, type, head);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByG_T_Head(long groupId, String type, boolean head) {
		return getPersistence().countByG_T_Head(groupId, type, head);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param head the head
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_T_Head(
		long groupId, String type, boolean head) {

		return getPersistence().filterCountByG_T_Head(groupId, type, head);
	}

	/**
	 * Returns all the layouts where companyId = &#63; and layoutPrototypeUuid = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @return the matching layouts
	 */
	public static List<Layout> findByC_L(
		long companyId, String layoutPrototypeUuid) {

		return getPersistence().findByC_L(companyId, layoutPrototypeUuid);
	}

	/**
	 * Returns a range of all the layouts where companyId = &#63; and layoutPrototypeUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByC_L(
		long companyId, String layoutPrototypeUuid, int start, int end) {

		return getPersistence().findByC_L(
			companyId, layoutPrototypeUuid, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where companyId = &#63; and layoutPrototypeUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByC_L(
		long companyId, String layoutPrototypeUuid, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByC_L(
			companyId, layoutPrototypeUuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where companyId = &#63; and layoutPrototypeUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByC_L(
		long companyId, String layoutPrototypeUuid, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByC_L(
			companyId, layoutPrototypeUuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where companyId = &#63; and layoutPrototypeUuid = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByC_L_First(
			long companyId, String layoutPrototypeUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByC_L_First(
			companyId, layoutPrototypeUuid, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where companyId = &#63; and layoutPrototypeUuid = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByC_L_First(
		long companyId, String layoutPrototypeUuid,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByC_L_First(
			companyId, layoutPrototypeUuid, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where companyId = &#63; and layoutPrototypeUuid = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByC_L_Last(
			long companyId, String layoutPrototypeUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByC_L_Last(
			companyId, layoutPrototypeUuid, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where companyId = &#63; and layoutPrototypeUuid = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByC_L_Last(
		long companyId, String layoutPrototypeUuid,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByC_L_Last(
			companyId, layoutPrototypeUuid, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where companyId = &#63; and layoutPrototypeUuid = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByC_L_PrevAndNext(
			long plid, long companyId, String layoutPrototypeUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByC_L_PrevAndNext(
			plid, companyId, layoutPrototypeUuid, orderByComparator);
	}

	/**
	 * Removes all the layouts where companyId = &#63; and layoutPrototypeUuid = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 */
	public static void removeByC_L(long companyId, String layoutPrototypeUuid) {
		getPersistence().removeByC_L(companyId, layoutPrototypeUuid);
	}

	/**
	 * Returns the number of layouts where companyId = &#63; and layoutPrototypeUuid = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @return the number of matching layouts
	 */
	public static int countByC_L(long companyId, String layoutPrototypeUuid) {
		return getPersistence().countByC_L(companyId, layoutPrototypeUuid);
	}

	/**
	 * Returns all the layouts where companyId = &#63; and layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByC_L_Head(
		long companyId, String layoutPrototypeUuid, boolean head) {

		return getPersistence().findByC_L_Head(
			companyId, layoutPrototypeUuid, head);
	}

	/**
	 * Returns a range of all the layouts where companyId = &#63; and layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByC_L_Head(
		long companyId, String layoutPrototypeUuid, boolean head, int start,
		int end) {

		return getPersistence().findByC_L_Head(
			companyId, layoutPrototypeUuid, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where companyId = &#63; and layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByC_L_Head(
		long companyId, String layoutPrototypeUuid, boolean head, int start,
		int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByC_L_Head(
			companyId, layoutPrototypeUuid, head, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where companyId = &#63; and layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByC_L_Head(
		long companyId, String layoutPrototypeUuid, boolean head, int start,
		int end, OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByC_L_Head(
			companyId, layoutPrototypeUuid, head, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where companyId = &#63; and layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByC_L_Head_First(
			long companyId, String layoutPrototypeUuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByC_L_Head_First(
			companyId, layoutPrototypeUuid, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where companyId = &#63; and layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByC_L_Head_First(
		long companyId, String layoutPrototypeUuid, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByC_L_Head_First(
			companyId, layoutPrototypeUuid, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where companyId = &#63; and layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByC_L_Head_Last(
			long companyId, String layoutPrototypeUuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByC_L_Head_Last(
			companyId, layoutPrototypeUuid, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where companyId = &#63; and layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByC_L_Head_Last(
		long companyId, String layoutPrototypeUuid, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByC_L_Head_Last(
			companyId, layoutPrototypeUuid, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where companyId = &#63; and layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByC_L_Head_PrevAndNext(
			long plid, long companyId, String layoutPrototypeUuid, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByC_L_Head_PrevAndNext(
			plid, companyId, layoutPrototypeUuid, head, orderByComparator);
	}

	/**
	 * Removes all the layouts where companyId = &#63; and layoutPrototypeUuid = &#63; and head = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 */
	public static void removeByC_L_Head(
		long companyId, String layoutPrototypeUuid, boolean head) {

		getPersistence().removeByC_L_Head(companyId, layoutPrototypeUuid, head);
	}

	/**
	 * Returns the number of layouts where companyId = &#63; and layoutPrototypeUuid = &#63; and head = &#63;.
	 *
	 * @param companyId the company ID
	 * @param layoutPrototypeUuid the layout prototype uuid
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByC_L_Head(
		long companyId, String layoutPrototypeUuid, boolean head) {

		return getPersistence().countByC_L_Head(
			companyId, layoutPrototypeUuid, head);
	}

	/**
	 * Returns all the layouts where privateLayout = &#63; and iconImageId = &#63;.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @return the matching layouts
	 */
	public static List<Layout> findByP_I(
		boolean privateLayout, long iconImageId) {

		return getPersistence().findByP_I(privateLayout, iconImageId);
	}

	/**
	 * Returns a range of all the layouts where privateLayout = &#63; and iconImageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByP_I(
		boolean privateLayout, long iconImageId, int start, int end) {

		return getPersistence().findByP_I(
			privateLayout, iconImageId, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where privateLayout = &#63; and iconImageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByP_I(
		boolean privateLayout, long iconImageId, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByP_I(
			privateLayout, iconImageId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where privateLayout = &#63; and iconImageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByP_I(
		boolean privateLayout, long iconImageId, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByP_I(
			privateLayout, iconImageId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where privateLayout = &#63; and iconImageId = &#63;.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByP_I_First(
			boolean privateLayout, long iconImageId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByP_I_First(
			privateLayout, iconImageId, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where privateLayout = &#63; and iconImageId = &#63;.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByP_I_First(
		boolean privateLayout, long iconImageId,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByP_I_First(
			privateLayout, iconImageId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where privateLayout = &#63; and iconImageId = &#63;.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByP_I_Last(
			boolean privateLayout, long iconImageId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByP_I_Last(
			privateLayout, iconImageId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where privateLayout = &#63; and iconImageId = &#63;.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByP_I_Last(
		boolean privateLayout, long iconImageId,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByP_I_Last(
			privateLayout, iconImageId, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where privateLayout = &#63; and iconImageId = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByP_I_PrevAndNext(
			long plid, boolean privateLayout, long iconImageId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByP_I_PrevAndNext(
			plid, privateLayout, iconImageId, orderByComparator);
	}

	/**
	 * Removes all the layouts where privateLayout = &#63; and iconImageId = &#63; from the database.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 */
	public static void removeByP_I(boolean privateLayout, long iconImageId) {
		getPersistence().removeByP_I(privateLayout, iconImageId);
	}

	/**
	 * Returns the number of layouts where privateLayout = &#63; and iconImageId = &#63;.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @return the number of matching layouts
	 */
	public static int countByP_I(boolean privateLayout, long iconImageId) {
		return getPersistence().countByP_I(privateLayout, iconImageId);
	}

	/**
	 * Returns the layout where privateLayout = &#63; and iconImageId = &#63; and head = &#63; or throws a <code>NoSuchLayoutException</code> if it could not be found.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param head the head
	 * @return the matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByP_I_Head(
			boolean privateLayout, long iconImageId, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByP_I_Head(
			privateLayout, iconImageId, head);
	}

	/**
	 * Returns the layout where privateLayout = &#63; and iconImageId = &#63; and head = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param head the head
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByP_I_Head(
		boolean privateLayout, long iconImageId, boolean head) {

		return getPersistence().fetchByP_I_Head(
			privateLayout, iconImageId, head);
	}

	/**
	 * Returns the layout where privateLayout = &#63; and iconImageId = &#63; and head = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param head the head
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByP_I_Head(
		boolean privateLayout, long iconImageId, boolean head,
		boolean retrieveFromCache) {

		return getPersistence().fetchByP_I_Head(
			privateLayout, iconImageId, head, retrieveFromCache);
	}

	/**
	 * Removes the layout where privateLayout = &#63; and iconImageId = &#63; and head = &#63; from the database.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param head the head
	 * @return the layout that was removed
	 */
	public static Layout removeByP_I_Head(
			boolean privateLayout, long iconImageId, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().removeByP_I_Head(
			privateLayout, iconImageId, head);
	}

	/**
	 * Returns the number of layouts where privateLayout = &#63; and iconImageId = &#63; and head = &#63;.
	 *
	 * @param privateLayout the private layout
	 * @param iconImageId the icon image ID
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByP_I_Head(
		boolean privateLayout, long iconImageId, boolean head) {

		return getPersistence().countByP_I_Head(
			privateLayout, iconImageId, head);
	}

	/**
	 * Returns all the layouts where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the matching layouts
	 */
	public static List<Layout> findByC_C(long classNameId, long classPK) {
		return getPersistence().findByC_C(classNameId, classPK);
	}

	/**
	 * Returns a range of all the layouts where classNameId = &#63; and classPK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByC_C(
		long classNameId, long classPK, int start, int end) {

		return getPersistence().findByC_C(classNameId, classPK, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where classNameId = &#63; and classPK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByC_C(
		long classNameId, long classPK, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByC_C(
			classNameId, classPK, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where classNameId = &#63; and classPK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByC_C(
		long classNameId, long classPK, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByC_C(
			classNameId, classPK, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByC_C_First(
			long classNameId, long classPK,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByC_C_First(
			classNameId, classPK, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByC_C_First(
		long classNameId, long classPK,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByC_C_First(
			classNameId, classPK, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByC_C_Last(
			long classNameId, long classPK,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByC_C_Last(
			classNameId, classPK, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByC_C_Last(
		long classNameId, long classPK,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByC_C_Last(
			classNameId, classPK, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByC_C_PrevAndNext(
			long plid, long classNameId, long classPK,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByC_C_PrevAndNext(
			plid, classNameId, classPK, orderByComparator);
	}

	/**
	 * Removes all the layouts where classNameId = &#63; and classPK = &#63; from the database.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 */
	public static void removeByC_C(long classNameId, long classPK) {
		getPersistence().removeByC_C(classNameId, classPK);
	}

	/**
	 * Returns the number of layouts where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the number of matching layouts
	 */
	public static int countByC_C(long classNameId, long classPK) {
		return getPersistence().countByC_C(classNameId, classPK);
	}

	/**
	 * Returns the layout where classNameId = &#63; and classPK = &#63; and head = &#63; or throws a <code>NoSuchLayoutException</code> if it could not be found.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param head the head
	 * @return the matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByC_C_Head(
			long classNameId, long classPK, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByC_C_Head(classNameId, classPK, head);
	}

	/**
	 * Returns the layout where classNameId = &#63; and classPK = &#63; and head = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param head the head
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByC_C_Head(
		long classNameId, long classPK, boolean head) {

		return getPersistence().fetchByC_C_Head(classNameId, classPK, head);
	}

	/**
	 * Returns the layout where classNameId = &#63; and classPK = &#63; and head = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param head the head
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByC_C_Head(
		long classNameId, long classPK, boolean head,
		boolean retrieveFromCache) {

		return getPersistence().fetchByC_C_Head(
			classNameId, classPK, head, retrieveFromCache);
	}

	/**
	 * Removes the layout where classNameId = &#63; and classPK = &#63; and head = &#63; from the database.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param head the head
	 * @return the layout that was removed
	 */
	public static Layout removeByC_C_Head(
			long classNameId, long classPK, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().removeByC_C_Head(classNameId, classPK, head);
	}

	/**
	 * Returns the number of layouts where classNameId = &#63; and classPK = &#63; and head = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByC_C_Head(
		long classNameId, long classPK, boolean head) {

		return getPersistence().countByC_C_Head(classNameId, classPK, head);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_L(
		long groupId, boolean privateLayout, long layoutId) {

		return getPersistence().findByG_P_L(groupId, privateLayout, layoutId);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_L(
		long groupId, boolean privateLayout, long layoutId, int start,
		int end) {

		return getPersistence().findByG_P_L(
			groupId, privateLayout, layoutId, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_L(
		long groupId, boolean privateLayout, long layoutId, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_L(
			groupId, privateLayout, layoutId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_L(
		long groupId, boolean privateLayout, long layoutId, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_L(
			groupId, privateLayout, layoutId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_L_First(
			long groupId, boolean privateLayout, long layoutId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_L_First(
			groupId, privateLayout, layoutId, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_L_First(
		long groupId, boolean privateLayout, long layoutId,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_L_First(
			groupId, privateLayout, layoutId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_L_Last(
			long groupId, boolean privateLayout, long layoutId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_L_Last(
			groupId, privateLayout, layoutId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_L_Last(
		long groupId, boolean privateLayout, long layoutId,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_L_Last(
			groupId, privateLayout, layoutId, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_P_L_PrevAndNext(
			long plid, long groupId, boolean privateLayout, long layoutId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_L_PrevAndNext(
			plid, groupId, privateLayout, layoutId, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_L(
		long groupId, boolean privateLayout, long layoutId) {

		return getPersistence().filterFindByG_P_L(
			groupId, privateLayout, layoutId);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_L(
		long groupId, boolean privateLayout, long layoutId, int start,
		int end) {

		return getPersistence().filterFindByG_P_L(
			groupId, privateLayout, layoutId, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_L(
		long groupId, boolean privateLayout, long layoutId, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_L(
			groupId, privateLayout, layoutId, start, end, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_P_L_PrevAndNext(
			long plid, long groupId, boolean privateLayout, long layoutId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_P_L_PrevAndNext(
			plid, groupId, privateLayout, layoutId, orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and privateLayout = &#63; and layoutId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 */
	public static void removeByG_P_L(
		long groupId, boolean privateLayout, long layoutId) {

		getPersistence().removeByG_P_L(groupId, privateLayout, layoutId);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @return the number of matching layouts
	 */
	public static int countByG_P_L(
		long groupId, boolean privateLayout, long layoutId) {

		return getPersistence().countByG_P_L(groupId, privateLayout, layoutId);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and layoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_L(
		long groupId, boolean privateLayout, long layoutId) {

		return getPersistence().filterCountByG_P_L(
			groupId, privateLayout, layoutId);
	}

	/**
	 * Returns the layout where groupId = &#63; and privateLayout = &#63; and layoutId = &#63; and head = &#63; or throws a <code>NoSuchLayoutException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param head the head
	 * @return the matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_L_Head(
			long groupId, boolean privateLayout, long layoutId, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_L_Head(
			groupId, privateLayout, layoutId, head);
	}

	/**
	 * Returns the layout where groupId = &#63; and privateLayout = &#63; and layoutId = &#63; and head = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param head the head
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_L_Head(
		long groupId, boolean privateLayout, long layoutId, boolean head) {

		return getPersistence().fetchByG_P_L_Head(
			groupId, privateLayout, layoutId, head);
	}

	/**
	 * Returns the layout where groupId = &#63; and privateLayout = &#63; and layoutId = &#63; and head = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param head the head
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_L_Head(
		long groupId, boolean privateLayout, long layoutId, boolean head,
		boolean retrieveFromCache) {

		return getPersistence().fetchByG_P_L_Head(
			groupId, privateLayout, layoutId, head, retrieveFromCache);
	}

	/**
	 * Removes the layout where groupId = &#63; and privateLayout = &#63; and layoutId = &#63; and head = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param head the head
	 * @return the layout that was removed
	 */
	public static Layout removeByG_P_L_Head(
			long groupId, boolean privateLayout, long layoutId, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().removeByG_P_L_Head(
			groupId, privateLayout, layoutId, head);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and layoutId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param layoutId the layout ID
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByG_P_L_Head(
		long groupId, boolean privateLayout, long layoutId, boolean head) {

		return getPersistence().countByG_P_L_Head(
			groupId, privateLayout, layoutId, head);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_P(
		long groupId, boolean privateLayout, long parentLayoutId) {

		return getPersistence().findByG_P_P(
			groupId, privateLayout, parentLayoutId);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_P(
		long groupId, boolean privateLayout, long parentLayoutId, int start,
		int end) {

		return getPersistence().findByG_P_P(
			groupId, privateLayout, parentLayoutId, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P(
		long groupId, boolean privateLayout, long parentLayoutId, int start,
		int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_P(
			groupId, privateLayout, parentLayoutId, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P(
		long groupId, boolean privateLayout, long parentLayoutId, int start,
		int end, OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_P(
			groupId, privateLayout, parentLayoutId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_P_First(
			long groupId, boolean privateLayout, long parentLayoutId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_First(
			groupId, privateLayout, parentLayoutId, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_P_First(
		long groupId, boolean privateLayout, long parentLayoutId,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_P_First(
			groupId, privateLayout, parentLayoutId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_P_Last(
			long groupId, boolean privateLayout, long parentLayoutId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_Last(
			groupId, privateLayout, parentLayoutId, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_P_Last(
		long groupId, boolean privateLayout, long parentLayoutId,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_P_Last(
			groupId, privateLayout, parentLayoutId, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_P_P_PrevAndNext(
			long plid, long groupId, boolean privateLayout, long parentLayoutId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_PrevAndNext(
			plid, groupId, privateLayout, parentLayoutId, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P(
		long groupId, boolean privateLayout, long parentLayoutId) {

		return getPersistence().filterFindByG_P_P(
			groupId, privateLayout, parentLayoutId);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P(
		long groupId, boolean privateLayout, long parentLayoutId, int start,
		int end) {

		return getPersistence().filterFindByG_P_P(
			groupId, privateLayout, parentLayoutId, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P(
		long groupId, boolean privateLayout, long parentLayoutId, int start,
		int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_P(
			groupId, privateLayout, parentLayoutId, start, end,
			orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_P_P_PrevAndNext(
			long plid, long groupId, boolean privateLayout, long parentLayoutId,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_P_P_PrevAndNext(
			plid, groupId, privateLayout, parentLayoutId, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P(
		long groupId, boolean privateLayout, long[] parentLayoutIds) {

		return getPersistence().filterFindByG_P_P(
			groupId, privateLayout, parentLayoutIds);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P(
		long groupId, boolean privateLayout, long[] parentLayoutIds, int start,
		int end) {

		return getPersistence().filterFindByG_P_P(
			groupId, privateLayout, parentLayoutIds, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P(
		long groupId, boolean privateLayout, long[] parentLayoutIds, int start,
		int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_P(
			groupId, privateLayout, parentLayoutIds, start, end,
			orderByComparator);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_P(
		long groupId, boolean privateLayout, long[] parentLayoutIds) {

		return getPersistence().findByG_P_P(
			groupId, privateLayout, parentLayoutIds);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_P(
		long groupId, boolean privateLayout, long[] parentLayoutIds, int start,
		int end) {

		return getPersistence().findByG_P_P(
			groupId, privateLayout, parentLayoutIds, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P(
		long groupId, boolean privateLayout, long[] parentLayoutIds, int start,
		int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_P(
			groupId, privateLayout, parentLayoutIds, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P(
		long groupId, boolean privateLayout, long[] parentLayoutIds, int start,
		int end, OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_P(
			groupId, privateLayout, parentLayoutIds, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 */
	public static void removeByG_P_P(
		long groupId, boolean privateLayout, long parentLayoutId) {

		getPersistence().removeByG_P_P(groupId, privateLayout, parentLayoutId);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @return the number of matching layouts
	 */
	public static int countByG_P_P(
		long groupId, boolean privateLayout, long parentLayoutId) {

		return getPersistence().countByG_P_P(
			groupId, privateLayout, parentLayoutId);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @return the number of matching layouts
	 */
	public static int countByG_P_P(
		long groupId, boolean privateLayout, long[] parentLayoutIds) {

		return getPersistence().countByG_P_P(
			groupId, privateLayout, parentLayoutIds);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_P(
		long groupId, boolean privateLayout, long parentLayoutId) {

		return getPersistence().filterCountByG_P_P(
			groupId, privateLayout, parentLayoutId);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_P(
		long groupId, boolean privateLayout, long[] parentLayoutIds) {

		return getPersistence().filterCountByG_P_P(
			groupId, privateLayout, parentLayoutIds);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_P_Head(
		long groupId, boolean privateLayout, long parentLayoutId,
		boolean head) {

		return getPersistence().findByG_P_P_Head(
			groupId, privateLayout, parentLayoutId, head);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_P_Head(
		long groupId, boolean privateLayout, long parentLayoutId, boolean head,
		int start, int end) {

		return getPersistence().findByG_P_P_Head(
			groupId, privateLayout, parentLayoutId, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P_Head(
		long groupId, boolean privateLayout, long parentLayoutId, boolean head,
		int start, int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_P_Head(
			groupId, privateLayout, parentLayoutId, head, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P_Head(
		long groupId, boolean privateLayout, long parentLayoutId, boolean head,
		int start, int end, OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_P_Head(
			groupId, privateLayout, parentLayoutId, head, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_P_Head_First(
			long groupId, boolean privateLayout, long parentLayoutId,
			boolean head, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_Head_First(
			groupId, privateLayout, parentLayoutId, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_P_Head_First(
		long groupId, boolean privateLayout, long parentLayoutId, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_P_Head_First(
			groupId, privateLayout, parentLayoutId, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_P_Head_Last(
			long groupId, boolean privateLayout, long parentLayoutId,
			boolean head, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_Head_Last(
			groupId, privateLayout, parentLayoutId, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_P_Head_Last(
		long groupId, boolean privateLayout, long parentLayoutId, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_P_Head_Last(
			groupId, privateLayout, parentLayoutId, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_P_P_Head_PrevAndNext(
			long plid, long groupId, boolean privateLayout, long parentLayoutId,
			boolean head, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_Head_PrevAndNext(
			plid, groupId, privateLayout, parentLayoutId, head,
			orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_Head(
		long groupId, boolean privateLayout, long parentLayoutId,
		boolean head) {

		return getPersistence().filterFindByG_P_P_Head(
			groupId, privateLayout, parentLayoutId, head);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_Head(
		long groupId, boolean privateLayout, long parentLayoutId, boolean head,
		int start, int end) {

		return getPersistence().filterFindByG_P_P_Head(
			groupId, privateLayout, parentLayoutId, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_Head(
		long groupId, boolean privateLayout, long parentLayoutId, boolean head,
		int start, int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_P_Head(
			groupId, privateLayout, parentLayoutId, head, start, end,
			orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_P_P_Head_PrevAndNext(
			long plid, long groupId, boolean privateLayout, long parentLayoutId,
			boolean head, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_P_P_Head_PrevAndNext(
			plid, groupId, privateLayout, parentLayoutId, head,
			orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param head the head
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_Head(
		long groupId, boolean privateLayout, long[] parentLayoutIds,
		boolean head) {

		return getPersistence().filterFindByG_P_P_Head(
			groupId, privateLayout, parentLayoutIds, head);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_Head(
		long groupId, boolean privateLayout, long[] parentLayoutIds,
		boolean head, int start, int end) {

		return getPersistence().filterFindByG_P_P_Head(
			groupId, privateLayout, parentLayoutIds, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_Head(
		long groupId, boolean privateLayout, long[] parentLayoutIds,
		boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_P_Head(
			groupId, privateLayout, parentLayoutIds, head, start, end,
			orderByComparator);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_P_Head(
		long groupId, boolean privateLayout, long[] parentLayoutIds,
		boolean head) {

		return getPersistence().findByG_P_P_Head(
			groupId, privateLayout, parentLayoutIds, head);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_P_Head(
		long groupId, boolean privateLayout, long[] parentLayoutIds,
		boolean head, int start, int end) {

		return getPersistence().findByG_P_P_Head(
			groupId, privateLayout, parentLayoutIds, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P_Head(
		long groupId, boolean privateLayout, long[] parentLayoutIds,
		boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_P_Head(
			groupId, privateLayout, parentLayoutIds, head, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P_Head(
		long groupId, boolean privateLayout, long[] parentLayoutIds,
		boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_P_Head(
			groupId, privateLayout, parentLayoutIds, head, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 */
	public static void removeByG_P_P_Head(
		long groupId, boolean privateLayout, long parentLayoutId,
		boolean head) {

		getPersistence().removeByG_P_P_Head(
			groupId, privateLayout, parentLayoutId, head);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByG_P_P_Head(
		long groupId, boolean privateLayout, long parentLayoutId,
		boolean head) {

		return getPersistence().countByG_P_P_Head(
			groupId, privateLayout, parentLayoutId, head);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByG_P_P_Head(
		long groupId, boolean privateLayout, long[] parentLayoutIds,
		boolean head) {

		return getPersistence().countByG_P_P_Head(
			groupId, privateLayout, parentLayoutIds, head);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param head the head
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_P_Head(
		long groupId, boolean privateLayout, long parentLayoutId,
		boolean head) {

		return getPersistence().filterCountByG_P_P_Head(
			groupId, privateLayout, parentLayoutId, head);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = any &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutIds the parent layout IDs
	 * @param head the head
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_P_Head(
		long groupId, boolean privateLayout, long[] parentLayoutIds,
		boolean head) {

		return getPersistence().filterCountByG_P_P_Head(
			groupId, privateLayout, parentLayoutIds, head);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_T(
		long groupId, boolean privateLayout, String type) {

		return getPersistence().findByG_P_T(groupId, privateLayout, type);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_T(
		long groupId, boolean privateLayout, String type, int start, int end) {

		return getPersistence().findByG_P_T(
			groupId, privateLayout, type, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_T(
		long groupId, boolean privateLayout, String type, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_T(
			groupId, privateLayout, type, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_T(
		long groupId, boolean privateLayout, String type, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_T(
			groupId, privateLayout, type, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_T_First(
			long groupId, boolean privateLayout, String type,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_T_First(
			groupId, privateLayout, type, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_T_First(
		long groupId, boolean privateLayout, String type,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_T_First(
			groupId, privateLayout, type, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_T_Last(
			long groupId, boolean privateLayout, String type,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_T_Last(
			groupId, privateLayout, type, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_T_Last(
		long groupId, boolean privateLayout, String type,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_T_Last(
			groupId, privateLayout, type, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_P_T_PrevAndNext(
			long plid, long groupId, boolean privateLayout, String type,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_T_PrevAndNext(
			plid, groupId, privateLayout, type, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_T(
		long groupId, boolean privateLayout, String type) {

		return getPersistence().filterFindByG_P_T(groupId, privateLayout, type);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_T(
		long groupId, boolean privateLayout, String type, int start, int end) {

		return getPersistence().filterFindByG_P_T(
			groupId, privateLayout, type, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_T(
		long groupId, boolean privateLayout, String type, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_T(
			groupId, privateLayout, type, start, end, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_P_T_PrevAndNext(
			long plid, long groupId, boolean privateLayout, String type,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_P_T_PrevAndNext(
			plid, groupId, privateLayout, type, orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and privateLayout = &#63; and type = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 */
	public static void removeByG_P_T(
		long groupId, boolean privateLayout, String type) {

		getPersistence().removeByG_P_T(groupId, privateLayout, type);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @return the number of matching layouts
	 */
	public static int countByG_P_T(
		long groupId, boolean privateLayout, String type) {

		return getPersistence().countByG_P_T(groupId, privateLayout, type);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and type = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_T(
		long groupId, boolean privateLayout, String type) {

		return getPersistence().filterCountByG_P_T(
			groupId, privateLayout, type);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_T_Head(
		long groupId, boolean privateLayout, String type, boolean head) {

		return getPersistence().findByG_P_T_Head(
			groupId, privateLayout, type, head);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_T_Head(
		long groupId, boolean privateLayout, String type, boolean head,
		int start, int end) {

		return getPersistence().findByG_P_T_Head(
			groupId, privateLayout, type, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_T_Head(
		long groupId, boolean privateLayout, String type, boolean head,
		int start, int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_T_Head(
			groupId, privateLayout, type, head, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_T_Head(
		long groupId, boolean privateLayout, String type, boolean head,
		int start, int end, OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_T_Head(
			groupId, privateLayout, type, head, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_T_Head_First(
			long groupId, boolean privateLayout, String type, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_T_Head_First(
			groupId, privateLayout, type, head, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_T_Head_First(
		long groupId, boolean privateLayout, String type, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_T_Head_First(
			groupId, privateLayout, type, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_T_Head_Last(
			long groupId, boolean privateLayout, String type, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_T_Head_Last(
			groupId, privateLayout, type, head, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_T_Head_Last(
		long groupId, boolean privateLayout, String type, boolean head,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_T_Head_Last(
			groupId, privateLayout, type, head, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_P_T_Head_PrevAndNext(
			long plid, long groupId, boolean privateLayout, String type,
			boolean head, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_T_Head_PrevAndNext(
			plid, groupId, privateLayout, type, head, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_T_Head(
		long groupId, boolean privateLayout, String type, boolean head) {

		return getPersistence().filterFindByG_P_T_Head(
			groupId, privateLayout, type, head);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_T_Head(
		long groupId, boolean privateLayout, String type, boolean head,
		int start, int end) {

		return getPersistence().filterFindByG_P_T_Head(
			groupId, privateLayout, type, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_T_Head(
		long groupId, boolean privateLayout, String type, boolean head,
		int start, int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_T_Head(
			groupId, privateLayout, type, head, start, end, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_P_T_Head_PrevAndNext(
			long plid, long groupId, boolean privateLayout, String type,
			boolean head, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_P_T_Head_PrevAndNext(
			plid, groupId, privateLayout, type, head, orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 */
	public static void removeByG_P_T_Head(
		long groupId, boolean privateLayout, String type, boolean head) {

		getPersistence().removeByG_P_T_Head(groupId, privateLayout, type, head);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByG_P_T_Head(
		long groupId, boolean privateLayout, String type, boolean head) {

		return getPersistence().countByG_P_T_Head(
			groupId, privateLayout, type, head);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and type = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param type the type
	 * @param head the head
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_T_Head(
		long groupId, boolean privateLayout, String type, boolean head) {

		return getPersistence().filterCountByG_P_T_Head(
			groupId, privateLayout, type, head);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_F(
		long groupId, boolean privateLayout, String friendlyURL) {

		return getPersistence().findByG_P_F(
			groupId, privateLayout, friendlyURL);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_F(
		long groupId, boolean privateLayout, String friendlyURL, int start,
		int end) {

		return getPersistence().findByG_P_F(
			groupId, privateLayout, friendlyURL, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_F(
		long groupId, boolean privateLayout, String friendlyURL, int start,
		int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_F(
			groupId, privateLayout, friendlyURL, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_F(
		long groupId, boolean privateLayout, String friendlyURL, int start,
		int end, OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_F(
			groupId, privateLayout, friendlyURL, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_F_First(
			long groupId, boolean privateLayout, String friendlyURL,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_F_First(
			groupId, privateLayout, friendlyURL, orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_F_First(
		long groupId, boolean privateLayout, String friendlyURL,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_F_First(
			groupId, privateLayout, friendlyURL, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_F_Last(
			long groupId, boolean privateLayout, String friendlyURL,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_F_Last(
			groupId, privateLayout, friendlyURL, orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_F_Last(
		long groupId, boolean privateLayout, String friendlyURL,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_F_Last(
			groupId, privateLayout, friendlyURL, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_P_F_PrevAndNext(
			long plid, long groupId, boolean privateLayout, String friendlyURL,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_F_PrevAndNext(
			plid, groupId, privateLayout, friendlyURL, orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_F(
		long groupId, boolean privateLayout, String friendlyURL) {

		return getPersistence().filterFindByG_P_F(
			groupId, privateLayout, friendlyURL);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_F(
		long groupId, boolean privateLayout, String friendlyURL, int start,
		int end) {

		return getPersistence().filterFindByG_P_F(
			groupId, privateLayout, friendlyURL, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_F(
		long groupId, boolean privateLayout, String friendlyURL, int start,
		int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_F(
			groupId, privateLayout, friendlyURL, start, end, orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_P_F_PrevAndNext(
			long plid, long groupId, boolean privateLayout, String friendlyURL,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_P_F_PrevAndNext(
			plid, groupId, privateLayout, friendlyURL, orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 */
	public static void removeByG_P_F(
		long groupId, boolean privateLayout, String friendlyURL) {

		getPersistence().removeByG_P_F(groupId, privateLayout, friendlyURL);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @return the number of matching layouts
	 */
	public static int countByG_P_F(
		long groupId, boolean privateLayout, String friendlyURL) {

		return getPersistence().countByG_P_F(
			groupId, privateLayout, friendlyURL);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_F(
		long groupId, boolean privateLayout, String friendlyURL) {

		return getPersistence().filterCountByG_P_F(
			groupId, privateLayout, friendlyURL);
	}

	/**
	 * Returns the layout where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63; and head = &#63; or throws a <code>NoSuchLayoutException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param head the head
	 * @return the matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_F_Head(
			long groupId, boolean privateLayout, String friendlyURL,
			boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_F_Head(
			groupId, privateLayout, friendlyURL, head);
	}

	/**
	 * Returns the layout where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63; and head = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param head the head
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_F_Head(
		long groupId, boolean privateLayout, String friendlyURL, boolean head) {

		return getPersistence().fetchByG_P_F_Head(
			groupId, privateLayout, friendlyURL, head);
	}

	/**
	 * Returns the layout where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63; and head = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param head the head
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_F_Head(
		long groupId, boolean privateLayout, String friendlyURL, boolean head,
		boolean retrieveFromCache) {

		return getPersistence().fetchByG_P_F_Head(
			groupId, privateLayout, friendlyURL, head, retrieveFromCache);
	}

	/**
	 * Removes the layout where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63; and head = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param head the head
	 * @return the layout that was removed
	 */
	public static Layout removeByG_P_F_Head(
			long groupId, boolean privateLayout, String friendlyURL,
			boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().removeByG_P_F_Head(
			groupId, privateLayout, friendlyURL, head);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and friendlyURL = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param friendlyURL the friendly url
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByG_P_F_Head(
		long groupId, boolean privateLayout, String friendlyURL, boolean head) {

		return getPersistence().countByG_P_F_Head(
			groupId, privateLayout, friendlyURL, head);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_SPLU(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid) {

		return getPersistence().findByG_P_SPLU(
			groupId, privateLayout, sourcePrototypeLayoutUuid);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_SPLU(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid,
		int start, int end) {

		return getPersistence().findByG_P_SPLU(
			groupId, privateLayout, sourcePrototypeLayoutUuid, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_SPLU(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid,
		int start, int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_SPLU(
			groupId, privateLayout, sourcePrototypeLayoutUuid, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_SPLU(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid,
		int start, int end, OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_SPLU(
			groupId, privateLayout, sourcePrototypeLayoutUuid, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_SPLU_First(
			long groupId, boolean privateLayout,
			String sourcePrototypeLayoutUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_SPLU_First(
			groupId, privateLayout, sourcePrototypeLayoutUuid,
			orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_SPLU_First(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_SPLU_First(
			groupId, privateLayout, sourcePrototypeLayoutUuid,
			orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_SPLU_Last(
			long groupId, boolean privateLayout,
			String sourcePrototypeLayoutUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_SPLU_Last(
			groupId, privateLayout, sourcePrototypeLayoutUuid,
			orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_SPLU_Last(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_SPLU_Last(
			groupId, privateLayout, sourcePrototypeLayoutUuid,
			orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_P_SPLU_PrevAndNext(
			long plid, long groupId, boolean privateLayout,
			String sourcePrototypeLayoutUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_SPLU_PrevAndNext(
			plid, groupId, privateLayout, sourcePrototypeLayoutUuid,
			orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_SPLU(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid) {

		return getPersistence().filterFindByG_P_SPLU(
			groupId, privateLayout, sourcePrototypeLayoutUuid);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_SPLU(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid,
		int start, int end) {

		return getPersistence().filterFindByG_P_SPLU(
			groupId, privateLayout, sourcePrototypeLayoutUuid, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_SPLU(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid,
		int start, int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_SPLU(
			groupId, privateLayout, sourcePrototypeLayoutUuid, start, end,
			orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_P_SPLU_PrevAndNext(
			long plid, long groupId, boolean privateLayout,
			String sourcePrototypeLayoutUuid,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_P_SPLU_PrevAndNext(
			plid, groupId, privateLayout, sourcePrototypeLayoutUuid,
			orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 */
	public static void removeByG_P_SPLU(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid) {

		getPersistence().removeByG_P_SPLU(
			groupId, privateLayout, sourcePrototypeLayoutUuid);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @return the number of matching layouts
	 */
	public static int countByG_P_SPLU(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid) {

		return getPersistence().countByG_P_SPLU(
			groupId, privateLayout, sourcePrototypeLayoutUuid);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_SPLU(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid) {

		return getPersistence().filterCountByG_P_SPLU(
			groupId, privateLayout, sourcePrototypeLayoutUuid);
	}

	/**
	 * Returns the layout where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63; and head = &#63; or throws a <code>NoSuchLayoutException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @return the matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_SPLU_Head(
			long groupId, boolean privateLayout,
			String sourcePrototypeLayoutUuid, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_SPLU_Head(
			groupId, privateLayout, sourcePrototypeLayoutUuid, head);
	}

	/**
	 * Returns the layout where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63; and head = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_SPLU_Head(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid,
		boolean head) {

		return getPersistence().fetchByG_P_SPLU_Head(
			groupId, privateLayout, sourcePrototypeLayoutUuid, head);
	}

	/**
	 * Returns the layout where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63; and head = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_SPLU_Head(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid,
		boolean head, boolean retrieveFromCache) {

		return getPersistence().fetchByG_P_SPLU_Head(
			groupId, privateLayout, sourcePrototypeLayoutUuid, head,
			retrieveFromCache);
	}

	/**
	 * Removes the layout where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63; and head = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @return the layout that was removed
	 */
	public static Layout removeByG_P_SPLU_Head(
			long groupId, boolean privateLayout,
			String sourcePrototypeLayoutUuid, boolean head)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().removeByG_P_SPLU_Head(
			groupId, privateLayout, sourcePrototypeLayoutUuid, head);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and sourcePrototypeLayoutUuid = &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param sourcePrototypeLayoutUuid the source prototype layout uuid
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByG_P_SPLU_Head(
		long groupId, boolean privateLayout, String sourcePrototypeLayoutUuid,
		boolean head) {

		return getPersistence().countByG_P_SPLU_Head(
			groupId, privateLayout, sourcePrototypeLayoutUuid, head);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_P_LtP(
		long groupId, boolean privateLayout, long parentLayoutId,
		int priority) {

		return getPersistence().findByG_P_P_LtP(
			groupId, privateLayout, parentLayoutId, priority);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_P_LtP(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		int start, int end) {

		return getPersistence().findByG_P_P_LtP(
			groupId, privateLayout, parentLayoutId, priority, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P_LtP(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		int start, int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_P_LtP(
			groupId, privateLayout, parentLayoutId, priority, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P_LtP(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		int start, int end, OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_P_LtP(
			groupId, privateLayout, parentLayoutId, priority, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_P_LtP_First(
			long groupId, boolean privateLayout, long parentLayoutId,
			int priority, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_LtP_First(
			groupId, privateLayout, parentLayoutId, priority,
			orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_P_LtP_First(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_P_LtP_First(
			groupId, privateLayout, parentLayoutId, priority,
			orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_P_LtP_Last(
			long groupId, boolean privateLayout, long parentLayoutId,
			int priority, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_LtP_Last(
			groupId, privateLayout, parentLayoutId, priority,
			orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_P_LtP_Last(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_P_LtP_Last(
			groupId, privateLayout, parentLayoutId, priority,
			orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_P_P_LtP_PrevAndNext(
			long plid, long groupId, boolean privateLayout, long parentLayoutId,
			int priority, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_LtP_PrevAndNext(
			plid, groupId, privateLayout, parentLayoutId, priority,
			orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_LtP(
		long groupId, boolean privateLayout, long parentLayoutId,
		int priority) {

		return getPersistence().filterFindByG_P_P_LtP(
			groupId, privateLayout, parentLayoutId, priority);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_LtP(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		int start, int end) {

		return getPersistence().filterFindByG_P_P_LtP(
			groupId, privateLayout, parentLayoutId, priority, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_LtP(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		int start, int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_P_LtP(
			groupId, privateLayout, parentLayoutId, priority, start, end,
			orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_P_P_LtP_PrevAndNext(
			long plid, long groupId, boolean privateLayout, long parentLayoutId,
			int priority, OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_P_P_LtP_PrevAndNext(
			plid, groupId, privateLayout, parentLayoutId, priority,
			orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 */
	public static void removeByG_P_P_LtP(
		long groupId, boolean privateLayout, long parentLayoutId,
		int priority) {

		getPersistence().removeByG_P_P_LtP(
			groupId, privateLayout, parentLayoutId, priority);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @return the number of matching layouts
	 */
	public static int countByG_P_P_LtP(
		long groupId, boolean privateLayout, long parentLayoutId,
		int priority) {

		return getPersistence().countByG_P_P_LtP(
			groupId, privateLayout, parentLayoutId, priority);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_P_LtP(
		long groupId, boolean privateLayout, long parentLayoutId,
		int priority) {

		return getPersistence().filterCountByG_P_P_LtP(
			groupId, privateLayout, parentLayoutId, priority);
	}

	/**
	 * Returns all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @return the matching layouts
	 */
	public static List<Layout> findByG_P_P_LtP_Head(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head) {

		return getPersistence().findByG_P_P_LtP_Head(
			groupId, privateLayout, parentLayoutId, priority, head);
	}

	/**
	 * Returns a range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts
	 */
	public static List<Layout> findByG_P_P_LtP_Head(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head, int start, int end) {

		return getPersistence().findByG_P_P_LtP_Head(
			groupId, privateLayout, parentLayoutId, priority, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P_LtP_Head(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findByG_P_P_LtP_Head(
			groupId, privateLayout, parentLayoutId, priority, head, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching layouts
	 */
	public static List<Layout> findByG_P_P_LtP_Head(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_P_P_LtP_Head(
			groupId, privateLayout, parentLayoutId, priority, head, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_P_LtP_Head_First(
			long groupId, boolean privateLayout, long parentLayoutId,
			int priority, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_LtP_Head_First(
			groupId, privateLayout, parentLayoutId, priority, head,
			orderByComparator);
	}

	/**
	 * Returns the first layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_P_LtP_Head_First(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_P_LtP_Head_First(
			groupId, privateLayout, parentLayoutId, priority, head,
			orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByG_P_P_LtP_Head_Last(
			long groupId, boolean privateLayout, long parentLayoutId,
			int priority, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_LtP_Head_Last(
			groupId, privateLayout, parentLayoutId, priority, head,
			orderByComparator);
	}

	/**
	 * Returns the last layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByG_P_P_LtP_Head_Last(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().fetchByG_P_P_LtP_Head_Last(
			groupId, privateLayout, parentLayoutId, priority, head,
			orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] findByG_P_P_LtP_Head_PrevAndNext(
			long plid, long groupId, boolean privateLayout, long parentLayoutId,
			int priority, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByG_P_P_LtP_Head_PrevAndNext(
			plid, groupId, privateLayout, parentLayoutId, priority, head,
			orderByComparator);
	}

	/**
	 * Returns all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @return the matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_LtP_Head(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head) {

		return getPersistence().filterFindByG_P_P_LtP_Head(
			groupId, privateLayout, parentLayoutId, priority, head);
	}

	/**
	 * Returns a range of all the layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_LtP_Head(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head, int start, int end) {

		return getPersistence().filterFindByG_P_P_LtP_Head(
			groupId, privateLayout, parentLayoutId, priority, head, start, end);
	}

	/**
	 * Returns an ordered range of all the layouts that the user has permissions to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching layouts that the user has permission to view
	 */
	public static List<Layout> filterFindByG_P_P_LtP_Head(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head, int start, int end,
		OrderByComparator<Layout> orderByComparator) {

		return getPersistence().filterFindByG_P_P_LtP_Head(
			groupId, privateLayout, parentLayoutId, priority, head, start, end,
			orderByComparator);
	}

	/**
	 * Returns the layouts before and after the current layout in the ordered set of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * @param plid the primary key of the current layout
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout[] filterFindByG_P_P_LtP_Head_PrevAndNext(
			long plid, long groupId, boolean privateLayout, long parentLayoutId,
			int priority, boolean head,
			OrderByComparator<Layout> orderByComparator)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().filterFindByG_P_P_LtP_Head_PrevAndNext(
			plid, groupId, privateLayout, parentLayoutId, priority, head,
			orderByComparator);
	}

	/**
	 * Removes all the layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 */
	public static void removeByG_P_P_LtP_Head(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head) {

		getPersistence().removeByG_P_P_LtP_Head(
			groupId, privateLayout, parentLayoutId, priority, head);
	}

	/**
	 * Returns the number of layouts where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @return the number of matching layouts
	 */
	public static int countByG_P_P_LtP_Head(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head) {

		return getPersistence().countByG_P_P_LtP_Head(
			groupId, privateLayout, parentLayoutId, priority, head);
	}

	/**
	 * Returns the number of layouts that the user has permission to view where groupId = &#63; and privateLayout = &#63; and parentLayoutId = &#63; and priority &le; &#63; and head = &#63;.
	 *
	 * @param groupId the group ID
	 * @param privateLayout the private layout
	 * @param parentLayoutId the parent layout ID
	 * @param priority the priority
	 * @param head the head
	 * @return the number of matching layouts that the user has permission to view
	 */
	public static int filterCountByG_P_P_LtP_Head(
		long groupId, boolean privateLayout, long parentLayoutId, int priority,
		boolean head) {

		return getPersistence().filterCountByG_P_P_LtP_Head(
			groupId, privateLayout, parentLayoutId, priority, head);
	}

	/**
	 * Returns the layout where headId = &#63; or throws a <code>NoSuchLayoutException</code> if it could not be found.
	 *
	 * @param headId the head ID
	 * @return the matching layout
	 * @throws NoSuchLayoutException if a matching layout could not be found
	 */
	public static Layout findByHeadId(long headId)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByHeadId(headId);
	}

	/**
	 * Returns the layout where headId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param headId the head ID
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByHeadId(long headId) {
		return getPersistence().fetchByHeadId(headId);
	}

	/**
	 * Returns the layout where headId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param headId the head ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching layout, or <code>null</code> if a matching layout could not be found
	 */
	public static Layout fetchByHeadId(long headId, boolean retrieveFromCache) {
		return getPersistence().fetchByHeadId(headId, retrieveFromCache);
	}

	/**
	 * Removes the layout where headId = &#63; from the database.
	 *
	 * @param headId the head ID
	 * @return the layout that was removed
	 */
	public static Layout removeByHeadId(long headId)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().removeByHeadId(headId);
	}

	/**
	 * Returns the number of layouts where headId = &#63;.
	 *
	 * @param headId the head ID
	 * @return the number of matching layouts
	 */
	public static int countByHeadId(long headId) {
		return getPersistence().countByHeadId(headId);
	}

	/**
	 * Caches the layout in the entity cache if it is enabled.
	 *
	 * @param layout the layout
	 */
	public static void cacheResult(Layout layout) {
		getPersistence().cacheResult(layout);
	}

	/**
	 * Caches the layouts in the entity cache if it is enabled.
	 *
	 * @param layouts the layouts
	 */
	public static void cacheResult(List<Layout> layouts) {
		getPersistence().cacheResult(layouts);
	}

	/**
	 * Creates a new layout with the primary key. Does not add the layout to the database.
	 *
	 * @param plid the primary key for the new layout
	 * @return the new layout
	 */
	public static Layout create(long plid) {
		return getPersistence().create(plid);
	}

	/**
	 * Removes the layout with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param plid the primary key of the layout
	 * @return the layout that was removed
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout remove(long plid)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().remove(plid);
	}

	public static Layout updateImpl(Layout layout) {
		return getPersistence().updateImpl(layout);
	}

	/**
	 * Returns the layout with the primary key or throws a <code>NoSuchLayoutException</code> if it could not be found.
	 *
	 * @param plid the primary key of the layout
	 * @return the layout
	 * @throws NoSuchLayoutException if a layout with the primary key could not be found
	 */
	public static Layout findByPrimaryKey(long plid)
		throws com.liferay.portal.kernel.exception.NoSuchLayoutException {

		return getPersistence().findByPrimaryKey(plid);
	}

	/**
	 * Returns the layout with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param plid the primary key of the layout
	 * @return the layout, or <code>null</code> if a layout with the primary key could not be found
	 */
	public static Layout fetchByPrimaryKey(long plid) {
		return getPersistence().fetchByPrimaryKey(plid);
	}

	/**
	 * Returns all the layouts.
	 *
	 * @return the layouts
	 */
	public static List<Layout> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @return the range of layouts
	 */
	public static List<Layout> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of layouts
	 */
	public static List<Layout> findAll(
		int start, int end, OrderByComparator<Layout> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>LayoutModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of layouts
	 * @param end the upper bound of the range of layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of layouts
	 */
	public static List<Layout> findAll(
		int start, int end, OrderByComparator<Layout> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the layouts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of layouts.
	 *
	 * @return the number of layouts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LayoutPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LayoutPersistence)PortalBeanLocatorUtil.locate(
				LayoutPersistence.class.getName());
		}

		return _persistence;
	}

	private static LayoutPersistence _persistence;

}