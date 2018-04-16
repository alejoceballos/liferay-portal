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

package com.liferay.commerce.user.segment.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.user.segment.model.CommerceUserSegmentCriterion;
import com.liferay.commerce.user.segment.service.CommerceUserSegmentCriterionLocalServiceUtil;

/**
 * The extended model base implementation for the CommerceUserSegmentCriterion service. Represents a row in the &quot;CommerceUserSegmentCriterion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CommerceUserSegmentCriterionImpl}.
 * </p>
 *
 * @author Marco Leo
 * @see CommerceUserSegmentCriterionImpl
 * @see CommerceUserSegmentCriterion
 * @generated
 */
@ProviderType
public abstract class CommerceUserSegmentCriterionBaseImpl
	extends CommerceUserSegmentCriterionModelImpl
	implements CommerceUserSegmentCriterion {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a commerce user segment criterion model instance should use the {@link CommerceUserSegmentCriterion} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CommerceUserSegmentCriterionLocalServiceUtil.addCommerceUserSegmentCriterion(this);
		}
		else {
			CommerceUserSegmentCriterionLocalServiceUtil.updateCommerceUserSegmentCriterion(this);
		}
	}
}