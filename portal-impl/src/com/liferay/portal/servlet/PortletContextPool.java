/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.servlet;

import com.liferay.util.CollectionFactory;

import java.util.Map;

/**
 * <a href="PortletContextPool.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class PortletContextPool {

	public static PortletContextWrapper get(String portletId) {
		return _instance._get(portletId);
	}

	public static void put(String portletId, PortletContextWrapper pcw) {
		_instance._put(portletId, pcw);
	}

	public static PortletContextWrapper remove(String portletId) {
		return _instance._remove(portletId);
	}

	private PortletContextPool() {
		_portletContextPool = CollectionFactory.getSyncHashMap();
	}

	private PortletContextWrapper _get(String portletId) {
		return (PortletContextWrapper)_portletContextPool.get(portletId);
	}

	private void _put(String portletId, PortletContextWrapper pcw) {
		_portletContextPool.put(portletId, pcw);
	}

	private PortletContextWrapper _remove(String portletId) {
		return (PortletContextWrapper)_portletContextPool.remove(portletId);
	}

	private static PortletContextPool _instance = new PortletContextPool();

	private Map _portletContextPool;

}