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

package com.liferay.commerce.product.model.impl;

import com.liferay.commerce.product.model.CPInstance;
import com.liferay.commerce.product.service.CPInstanceLocalServiceUtil;

/**
 * The extended model base implementation for the CPInstance service. Represents a row in the &quot;CPInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CPInstanceImpl}.
 * </p>
 *
 * @author Marco Leo
 * @see CPInstanceImpl
 * @see CPInstance
 * @generated
 */
public abstract class CPInstanceBaseImpl
	extends CPInstanceModelImpl implements CPInstance {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cp instance model instance should use the <code>CPInstance</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CPInstanceLocalServiceUtil.addCPInstance(this);
		}
		else {
			CPInstanceLocalServiceUtil.updateCPInstance(this);
		}
	}

}