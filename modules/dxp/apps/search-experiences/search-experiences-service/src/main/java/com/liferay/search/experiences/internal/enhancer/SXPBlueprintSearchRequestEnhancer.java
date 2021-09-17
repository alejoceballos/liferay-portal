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

package com.liferay.search.experiences.internal.enhancer;

import com.liferay.portal.search.searcher.SearchRequestBuilder;
import com.liferay.search.experiences.model.SXPBlueprint;
import com.liferay.search.experiences.rest.dto.v1_0.FrameworkConfiguration;
import com.liferay.search.experiences.rest.dto.v1_0.SXPBlueprintConfiguration;

/**
 * @author Petteri Karttunen
 */
public class SXPBlueprintSearchRequestEnhancer {

	public void enhance(
		SearchRequestBuilder searchRequestBuilder, SXPBlueprint sxpBlueprint) {

		SXPBlueprintConfiguration sxpBlueprintConfiguration =
			SXPBlueprintConfiguration.toDTO(
				sxpBlueprint.getConfigurationsJSON());

		processFrameworkConfiguration(
			searchRequestBuilder,
			sxpBlueprintConfiguration.getFrameworkConfiguration());
	}

	protected void processFrameworkConfiguration(
		SearchRequestBuilder searchRequestBuilder,
		FrameworkConfiguration frameworkConfiguration) {

		if (frameworkConfiguration.getApplyIndexerClauses() != null) {
			searchRequestBuilder.withSearchContext(
				searchContext -> searchContext.setAttribute(
					"search.full.query.suppress.indexer.provided.clauses",
					!frameworkConfiguration.getApplyIndexerClauses()));
		}
	}

}