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

package com.liferay.source.formatter.check;

import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.io.unsync.UnsyncBufferedReader;
import com.liferay.portal.kernel.io.unsync.UnsyncStringReader;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;

/**
 * @author Alan Huang
 */
public class HTMLEmptyLinesCheck extends BaseEmptyLinesCheck {

	@Override
	protected String doProcess(
			String fileName, String absolutePath, String content)
		throws IOException {

		content = fixEmptyLinesInMultiLineTags(content);

		content = fixEmptyLinesInNestedTags(content);

		content = fixEmptyLinesBetweenTags(content);

		content = fixMissingEmptyLineAfterDoctype(content);

		content = _fixMissingEmptyLineAroundSingleComment(content);

		return content;
	}

	private String _fixMissingEmptyLineAroundSingleComment(String content)
		throws IOException {

		StringBundler sb = new StringBundler();

		try (UnsyncBufferedReader unsyncBufferedReader =
				new UnsyncBufferedReader(new UnsyncStringReader(content))) {

			String line = null;
			String preLine = StringPool.BLANK;

			while ((line = unsyncBufferedReader.readLine()) != null) {
				String trimmedLine = StringUtil.trimLeading(line);

				if ((trimmedLine.startsWith("<!--") &&
					 trimmedLine.endsWith("-->") &&
					 Validator.isNotNull(preLine)) ||
					(preLine.startsWith("<!--") && preLine.endsWith("-->") &&
					 Validator.isNotNull(line))) {

					sb.append("\n");
				}

				preLine = trimmedLine;
				sb.append(line);
				sb.append("\n");
			}
		}

		if (!content.endsWith("\n") && (sb.index() > 0)) {
			sb.setIndex(sb.index() - 1);
		}

		return sb.toString();
	}

}