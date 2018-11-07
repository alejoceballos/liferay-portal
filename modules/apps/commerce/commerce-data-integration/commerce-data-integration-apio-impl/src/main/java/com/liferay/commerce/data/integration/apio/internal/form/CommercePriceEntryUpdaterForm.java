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

package com.liferay.commerce.data.integration.apio.internal.form;

import com.liferay.apio.architect.form.Form;

/**
 * Instances of this class represent the values extracted from a price entry
 * updater form.
 *
 * @author Zoltán Takács
 * @review
 */
public class CommercePriceEntryUpdaterForm {

	/**
	 * Builds a {@code Form} that generates {@code
	 * CommercePriceEntryUpdaterForm} depending on the HTTP body.
	 *
	 * @param  formBuilder the {@code Form} builder
	 * @return a product updater form
	 * @review
	 */
	public static Form<CommercePriceEntryUpdaterForm> buildForm(
		Form.Builder<CommercePriceEntryUpdaterForm> formBuilder) {

		return formBuilder.title(
			__ -> "The price entry updater form"
		).description(
			__ -> "This form can be used to update a price entry"
		).constructor(
			CommercePriceEntryUpdaterForm::new
		).addRequiredDouble(
			"price", CommercePriceEntryUpdaterForm::_setPrice
		).addRequiredDouble(
			"promoPrice", CommercePriceEntryUpdaterForm::_setPromoPrice
		).build();
	}

	public Double getPrice() {
		return _price;
	}

	public Double getPromoPrice() {
		return _promoPrice;
	}

	private void _setPrice(Double price) {
		_price = price;
	}

	private void _setPromoPrice(Double promoPrice) {
		_promoPrice = promoPrice;
	}

	private Double _price;
	private Double _promoPrice;

}