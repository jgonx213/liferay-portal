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

package com.liferay.user.associated.data.web.internal.display;

/**
 * @author Drew Brokke
 */
public class UADApplicationSummaryDisplay {

	public int getCount() {
		return _count;
	}

	public String getName() {
		return _name;
	}

	public String getViewURL() {
		return _viewURL;
	}

	public void setCount(int count) {
		_count = count;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setViewURL(String viewURL) {
		_viewURL = viewURL;
	}

	private int _count;
	private String _name;
	private String _viewURL;

}