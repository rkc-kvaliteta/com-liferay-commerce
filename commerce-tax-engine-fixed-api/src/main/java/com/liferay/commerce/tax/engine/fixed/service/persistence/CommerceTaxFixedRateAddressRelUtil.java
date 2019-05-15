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

package com.liferay.commerce.tax.engine.fixed.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.tax.engine.fixed.model.CommerceTaxFixedRateAddressRel;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the commerce tax fixed rate address rel service. This utility wraps <code>com.liferay.commerce.tax.engine.fixed.service.persistence.impl.CommerceTaxFixedRateAddressRelPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceTaxFixedRateAddressRelPersistence
 * @generated
 */
@ProviderType
public class CommerceTaxFixedRateAddressRelUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		CommerceTaxFixedRateAddressRel commerceTaxFixedRateAddressRel) {

		getPersistence().clearCache(commerceTaxFixedRateAddressRel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CommerceTaxFixedRateAddressRel>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CommerceTaxFixedRateAddressRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CommerceTaxFixedRateAddressRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CommerceTaxFixedRateAddressRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CommerceTaxFixedRateAddressRel> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CommerceTaxFixedRateAddressRel update(
		CommerceTaxFixedRateAddressRel commerceTaxFixedRateAddressRel) {

		return getPersistence().update(commerceTaxFixedRateAddressRel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CommerceTaxFixedRateAddressRel update(
		CommerceTaxFixedRateAddressRel commerceTaxFixedRateAddressRel,
		ServiceContext serviceContext) {

		return getPersistence().update(
			commerceTaxFixedRateAddressRel, serviceContext);
	}

	/**
	 * Returns all the commerce tax fixed rate address rels where commerceTaxMethodId = &#63;.
	 *
	 * @param commerceTaxMethodId the commerce tax method ID
	 * @return the matching commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel>
		findByCommerceTaxMethodId(long commerceTaxMethodId) {

		return getPersistence().findByCommerceTaxMethodId(commerceTaxMethodId);
	}

	/**
	 * Returns a range of all the commerce tax fixed rate address rels where commerceTaxMethodId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CommerceTaxFixedRateAddressRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param commerceTaxMethodId the commerce tax method ID
	 * @param start the lower bound of the range of commerce tax fixed rate address rels
	 * @param end the upper bound of the range of commerce tax fixed rate address rels (not inclusive)
	 * @return the range of matching commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel>
		findByCommerceTaxMethodId(
			long commerceTaxMethodId, int start, int end) {

		return getPersistence().findByCommerceTaxMethodId(
			commerceTaxMethodId, start, end);
	}

	/**
	 * Returns an ordered range of all the commerce tax fixed rate address rels where commerceTaxMethodId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CommerceTaxFixedRateAddressRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param commerceTaxMethodId the commerce tax method ID
	 * @param start the lower bound of the range of commerce tax fixed rate address rels
	 * @param end the upper bound of the range of commerce tax fixed rate address rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel>
		findByCommerceTaxMethodId(
			long commerceTaxMethodId, int start, int end,
			OrderByComparator<CommerceTaxFixedRateAddressRel>
				orderByComparator) {

		return getPersistence().findByCommerceTaxMethodId(
			commerceTaxMethodId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the commerce tax fixed rate address rels where commerceTaxMethodId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CommerceTaxFixedRateAddressRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param commerceTaxMethodId the commerce tax method ID
	 * @param start the lower bound of the range of commerce tax fixed rate address rels
	 * @param end the upper bound of the range of commerce tax fixed rate address rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel>
		findByCommerceTaxMethodId(
			long commerceTaxMethodId, int start, int end,
			OrderByComparator<CommerceTaxFixedRateAddressRel> orderByComparator,
			boolean retrieveFromCache) {

		return getPersistence().findByCommerceTaxMethodId(
			commerceTaxMethodId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first commerce tax fixed rate address rel in the ordered set where commerceTaxMethodId = &#63;.
	 *
	 * @param commerceTaxMethodId the commerce tax method ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commerce tax fixed rate address rel
	 * @throws NoSuchTaxFixedRateAddressRelException if a matching commerce tax fixed rate address rel could not be found
	 */
	public static CommerceTaxFixedRateAddressRel
			findByCommerceTaxMethodId_First(
				long commerceTaxMethodId,
				OrderByComparator<CommerceTaxFixedRateAddressRel>
					orderByComparator)
		throws com.liferay.commerce.tax.engine.fixed.exception.
			NoSuchTaxFixedRateAddressRelException {

		return getPersistence().findByCommerceTaxMethodId_First(
			commerceTaxMethodId, orderByComparator);
	}

	/**
	 * Returns the first commerce tax fixed rate address rel in the ordered set where commerceTaxMethodId = &#63;.
	 *
	 * @param commerceTaxMethodId the commerce tax method ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commerce tax fixed rate address rel, or <code>null</code> if a matching commerce tax fixed rate address rel could not be found
	 */
	public static CommerceTaxFixedRateAddressRel
		fetchByCommerceTaxMethodId_First(
			long commerceTaxMethodId,
			OrderByComparator<CommerceTaxFixedRateAddressRel>
				orderByComparator) {

		return getPersistence().fetchByCommerceTaxMethodId_First(
			commerceTaxMethodId, orderByComparator);
	}

	/**
	 * Returns the last commerce tax fixed rate address rel in the ordered set where commerceTaxMethodId = &#63;.
	 *
	 * @param commerceTaxMethodId the commerce tax method ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commerce tax fixed rate address rel
	 * @throws NoSuchTaxFixedRateAddressRelException if a matching commerce tax fixed rate address rel could not be found
	 */
	public static CommerceTaxFixedRateAddressRel findByCommerceTaxMethodId_Last(
			long commerceTaxMethodId,
			OrderByComparator<CommerceTaxFixedRateAddressRel> orderByComparator)
		throws com.liferay.commerce.tax.engine.fixed.exception.
			NoSuchTaxFixedRateAddressRelException {

		return getPersistence().findByCommerceTaxMethodId_Last(
			commerceTaxMethodId, orderByComparator);
	}

	/**
	 * Returns the last commerce tax fixed rate address rel in the ordered set where commerceTaxMethodId = &#63;.
	 *
	 * @param commerceTaxMethodId the commerce tax method ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commerce tax fixed rate address rel, or <code>null</code> if a matching commerce tax fixed rate address rel could not be found
	 */
	public static CommerceTaxFixedRateAddressRel
		fetchByCommerceTaxMethodId_Last(
			long commerceTaxMethodId,
			OrderByComparator<CommerceTaxFixedRateAddressRel>
				orderByComparator) {

		return getPersistence().fetchByCommerceTaxMethodId_Last(
			commerceTaxMethodId, orderByComparator);
	}

	/**
	 * Returns the commerce tax fixed rate address rels before and after the current commerce tax fixed rate address rel in the ordered set where commerceTaxMethodId = &#63;.
	 *
	 * @param commerceTaxFixedRateAddressRelId the primary key of the current commerce tax fixed rate address rel
	 * @param commerceTaxMethodId the commerce tax method ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next commerce tax fixed rate address rel
	 * @throws NoSuchTaxFixedRateAddressRelException if a commerce tax fixed rate address rel with the primary key could not be found
	 */
	public static CommerceTaxFixedRateAddressRel[]
			findByCommerceTaxMethodId_PrevAndNext(
				long commerceTaxFixedRateAddressRelId, long commerceTaxMethodId,
				OrderByComparator<CommerceTaxFixedRateAddressRel>
					orderByComparator)
		throws com.liferay.commerce.tax.engine.fixed.exception.
			NoSuchTaxFixedRateAddressRelException {

		return getPersistence().findByCommerceTaxMethodId_PrevAndNext(
			commerceTaxFixedRateAddressRelId, commerceTaxMethodId,
			orderByComparator);
	}

	/**
	 * Removes all the commerce tax fixed rate address rels where commerceTaxMethodId = &#63; from the database.
	 *
	 * @param commerceTaxMethodId the commerce tax method ID
	 */
	public static void removeByCommerceTaxMethodId(long commerceTaxMethodId) {
		getPersistence().removeByCommerceTaxMethodId(commerceTaxMethodId);
	}

	/**
	 * Returns the number of commerce tax fixed rate address rels where commerceTaxMethodId = &#63;.
	 *
	 * @param commerceTaxMethodId the commerce tax method ID
	 * @return the number of matching commerce tax fixed rate address rels
	 */
	public static int countByCommerceTaxMethodId(long commerceTaxMethodId) {
		return getPersistence().countByCommerceTaxMethodId(commerceTaxMethodId);
	}

	/**
	 * Returns all the commerce tax fixed rate address rels where CPTaxCategoryId = &#63;.
	 *
	 * @param CPTaxCategoryId the cp tax category ID
	 * @return the matching commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel> findByCPTaxCategoryId(
		long CPTaxCategoryId) {

		return getPersistence().findByCPTaxCategoryId(CPTaxCategoryId);
	}

	/**
	 * Returns a range of all the commerce tax fixed rate address rels where CPTaxCategoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CommerceTaxFixedRateAddressRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param CPTaxCategoryId the cp tax category ID
	 * @param start the lower bound of the range of commerce tax fixed rate address rels
	 * @param end the upper bound of the range of commerce tax fixed rate address rels (not inclusive)
	 * @return the range of matching commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel> findByCPTaxCategoryId(
		long CPTaxCategoryId, int start, int end) {

		return getPersistence().findByCPTaxCategoryId(
			CPTaxCategoryId, start, end);
	}

	/**
	 * Returns an ordered range of all the commerce tax fixed rate address rels where CPTaxCategoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CommerceTaxFixedRateAddressRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param CPTaxCategoryId the cp tax category ID
	 * @param start the lower bound of the range of commerce tax fixed rate address rels
	 * @param end the upper bound of the range of commerce tax fixed rate address rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel> findByCPTaxCategoryId(
		long CPTaxCategoryId, int start, int end,
		OrderByComparator<CommerceTaxFixedRateAddressRel> orderByComparator) {

		return getPersistence().findByCPTaxCategoryId(
			CPTaxCategoryId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the commerce tax fixed rate address rels where CPTaxCategoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CommerceTaxFixedRateAddressRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param CPTaxCategoryId the cp tax category ID
	 * @param start the lower bound of the range of commerce tax fixed rate address rels
	 * @param end the upper bound of the range of commerce tax fixed rate address rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel> findByCPTaxCategoryId(
		long CPTaxCategoryId, int start, int end,
		OrderByComparator<CommerceTaxFixedRateAddressRel> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByCPTaxCategoryId(
			CPTaxCategoryId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first commerce tax fixed rate address rel in the ordered set where CPTaxCategoryId = &#63;.
	 *
	 * @param CPTaxCategoryId the cp tax category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commerce tax fixed rate address rel
	 * @throws NoSuchTaxFixedRateAddressRelException if a matching commerce tax fixed rate address rel could not be found
	 */
	public static CommerceTaxFixedRateAddressRel findByCPTaxCategoryId_First(
			long CPTaxCategoryId,
			OrderByComparator<CommerceTaxFixedRateAddressRel> orderByComparator)
		throws com.liferay.commerce.tax.engine.fixed.exception.
			NoSuchTaxFixedRateAddressRelException {

		return getPersistence().findByCPTaxCategoryId_First(
			CPTaxCategoryId, orderByComparator);
	}

	/**
	 * Returns the first commerce tax fixed rate address rel in the ordered set where CPTaxCategoryId = &#63;.
	 *
	 * @param CPTaxCategoryId the cp tax category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commerce tax fixed rate address rel, or <code>null</code> if a matching commerce tax fixed rate address rel could not be found
	 */
	public static CommerceTaxFixedRateAddressRel fetchByCPTaxCategoryId_First(
		long CPTaxCategoryId,
		OrderByComparator<CommerceTaxFixedRateAddressRel> orderByComparator) {

		return getPersistence().fetchByCPTaxCategoryId_First(
			CPTaxCategoryId, orderByComparator);
	}

	/**
	 * Returns the last commerce tax fixed rate address rel in the ordered set where CPTaxCategoryId = &#63;.
	 *
	 * @param CPTaxCategoryId the cp tax category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commerce tax fixed rate address rel
	 * @throws NoSuchTaxFixedRateAddressRelException if a matching commerce tax fixed rate address rel could not be found
	 */
	public static CommerceTaxFixedRateAddressRel findByCPTaxCategoryId_Last(
			long CPTaxCategoryId,
			OrderByComparator<CommerceTaxFixedRateAddressRel> orderByComparator)
		throws com.liferay.commerce.tax.engine.fixed.exception.
			NoSuchTaxFixedRateAddressRelException {

		return getPersistence().findByCPTaxCategoryId_Last(
			CPTaxCategoryId, orderByComparator);
	}

	/**
	 * Returns the last commerce tax fixed rate address rel in the ordered set where CPTaxCategoryId = &#63;.
	 *
	 * @param CPTaxCategoryId the cp tax category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commerce tax fixed rate address rel, or <code>null</code> if a matching commerce tax fixed rate address rel could not be found
	 */
	public static CommerceTaxFixedRateAddressRel fetchByCPTaxCategoryId_Last(
		long CPTaxCategoryId,
		OrderByComparator<CommerceTaxFixedRateAddressRel> orderByComparator) {

		return getPersistence().fetchByCPTaxCategoryId_Last(
			CPTaxCategoryId, orderByComparator);
	}

	/**
	 * Returns the commerce tax fixed rate address rels before and after the current commerce tax fixed rate address rel in the ordered set where CPTaxCategoryId = &#63;.
	 *
	 * @param commerceTaxFixedRateAddressRelId the primary key of the current commerce tax fixed rate address rel
	 * @param CPTaxCategoryId the cp tax category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next commerce tax fixed rate address rel
	 * @throws NoSuchTaxFixedRateAddressRelException if a commerce tax fixed rate address rel with the primary key could not be found
	 */
	public static CommerceTaxFixedRateAddressRel[]
			findByCPTaxCategoryId_PrevAndNext(
				long commerceTaxFixedRateAddressRelId, long CPTaxCategoryId,
				OrderByComparator<CommerceTaxFixedRateAddressRel>
					orderByComparator)
		throws com.liferay.commerce.tax.engine.fixed.exception.
			NoSuchTaxFixedRateAddressRelException {

		return getPersistence().findByCPTaxCategoryId_PrevAndNext(
			commerceTaxFixedRateAddressRelId, CPTaxCategoryId,
			orderByComparator);
	}

	/**
	 * Removes all the commerce tax fixed rate address rels where CPTaxCategoryId = &#63; from the database.
	 *
	 * @param CPTaxCategoryId the cp tax category ID
	 */
	public static void removeByCPTaxCategoryId(long CPTaxCategoryId) {
		getPersistence().removeByCPTaxCategoryId(CPTaxCategoryId);
	}

	/**
	 * Returns the number of commerce tax fixed rate address rels where CPTaxCategoryId = &#63;.
	 *
	 * @param CPTaxCategoryId the cp tax category ID
	 * @return the number of matching commerce tax fixed rate address rels
	 */
	public static int countByCPTaxCategoryId(long CPTaxCategoryId) {
		return getPersistence().countByCPTaxCategoryId(CPTaxCategoryId);
	}

	/**
	 * Caches the commerce tax fixed rate address rel in the entity cache if it is enabled.
	 *
	 * @param commerceTaxFixedRateAddressRel the commerce tax fixed rate address rel
	 */
	public static void cacheResult(
		CommerceTaxFixedRateAddressRel commerceTaxFixedRateAddressRel) {

		getPersistence().cacheResult(commerceTaxFixedRateAddressRel);
	}

	/**
	 * Caches the commerce tax fixed rate address rels in the entity cache if it is enabled.
	 *
	 * @param commerceTaxFixedRateAddressRels the commerce tax fixed rate address rels
	 */
	public static void cacheResult(
		List<CommerceTaxFixedRateAddressRel> commerceTaxFixedRateAddressRels) {

		getPersistence().cacheResult(commerceTaxFixedRateAddressRels);
	}

	/**
	 * Creates a new commerce tax fixed rate address rel with the primary key. Does not add the commerce tax fixed rate address rel to the database.
	 *
	 * @param commerceTaxFixedRateAddressRelId the primary key for the new commerce tax fixed rate address rel
	 * @return the new commerce tax fixed rate address rel
	 */
	public static CommerceTaxFixedRateAddressRel create(
		long commerceTaxFixedRateAddressRelId) {

		return getPersistence().create(commerceTaxFixedRateAddressRelId);
	}

	/**
	 * Removes the commerce tax fixed rate address rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param commerceTaxFixedRateAddressRelId the primary key of the commerce tax fixed rate address rel
	 * @return the commerce tax fixed rate address rel that was removed
	 * @throws NoSuchTaxFixedRateAddressRelException if a commerce tax fixed rate address rel with the primary key could not be found
	 */
	public static CommerceTaxFixedRateAddressRel remove(
			long commerceTaxFixedRateAddressRelId)
		throws com.liferay.commerce.tax.engine.fixed.exception.
			NoSuchTaxFixedRateAddressRelException {

		return getPersistence().remove(commerceTaxFixedRateAddressRelId);
	}

	public static CommerceTaxFixedRateAddressRel updateImpl(
		CommerceTaxFixedRateAddressRel commerceTaxFixedRateAddressRel) {

		return getPersistence().updateImpl(commerceTaxFixedRateAddressRel);
	}

	/**
	 * Returns the commerce tax fixed rate address rel with the primary key or throws a <code>NoSuchTaxFixedRateAddressRelException</code> if it could not be found.
	 *
	 * @param commerceTaxFixedRateAddressRelId the primary key of the commerce tax fixed rate address rel
	 * @return the commerce tax fixed rate address rel
	 * @throws NoSuchTaxFixedRateAddressRelException if a commerce tax fixed rate address rel with the primary key could not be found
	 */
	public static CommerceTaxFixedRateAddressRel findByPrimaryKey(
			long commerceTaxFixedRateAddressRelId)
		throws com.liferay.commerce.tax.engine.fixed.exception.
			NoSuchTaxFixedRateAddressRelException {

		return getPersistence().findByPrimaryKey(
			commerceTaxFixedRateAddressRelId);
	}

	/**
	 * Returns the commerce tax fixed rate address rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param commerceTaxFixedRateAddressRelId the primary key of the commerce tax fixed rate address rel
	 * @return the commerce tax fixed rate address rel, or <code>null</code> if a commerce tax fixed rate address rel with the primary key could not be found
	 */
	public static CommerceTaxFixedRateAddressRel fetchByPrimaryKey(
		long commerceTaxFixedRateAddressRelId) {

		return getPersistence().fetchByPrimaryKey(
			commerceTaxFixedRateAddressRelId);
	}

	/**
	 * Returns all the commerce tax fixed rate address rels.
	 *
	 * @return the commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the commerce tax fixed rate address rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CommerceTaxFixedRateAddressRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of commerce tax fixed rate address rels
	 * @param end the upper bound of the range of commerce tax fixed rate address rels (not inclusive)
	 * @return the range of commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the commerce tax fixed rate address rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CommerceTaxFixedRateAddressRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of commerce tax fixed rate address rels
	 * @param end the upper bound of the range of commerce tax fixed rate address rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel> findAll(
		int start, int end,
		OrderByComparator<CommerceTaxFixedRateAddressRel> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the commerce tax fixed rate address rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CommerceTaxFixedRateAddressRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of commerce tax fixed rate address rels
	 * @param end the upper bound of the range of commerce tax fixed rate address rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of commerce tax fixed rate address rels
	 */
	public static List<CommerceTaxFixedRateAddressRel> findAll(
		int start, int end,
		OrderByComparator<CommerceTaxFixedRateAddressRel> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the commerce tax fixed rate address rels from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of commerce tax fixed rate address rels.
	 *
	 * @return the number of commerce tax fixed rate address rels
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CommerceTaxFixedRateAddressRelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<CommerceTaxFixedRateAddressRelPersistence,
		 CommerceTaxFixedRateAddressRelPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			CommerceTaxFixedRateAddressRelPersistence.class);

		ServiceTracker
			<CommerceTaxFixedRateAddressRelPersistence,
			 CommerceTaxFixedRateAddressRelPersistence> serviceTracker =
				new ServiceTracker
					<CommerceTaxFixedRateAddressRelPersistence,
					 CommerceTaxFixedRateAddressRelPersistence>(
						 bundle.getBundleContext(),
						 CommerceTaxFixedRateAddressRelPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}