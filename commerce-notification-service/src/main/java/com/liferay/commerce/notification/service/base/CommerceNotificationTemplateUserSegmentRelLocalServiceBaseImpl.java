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

package com.liferay.commerce.notification.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.notification.model.CommerceNotificationTemplateUserSegmentRel;
import com.liferay.commerce.notification.service.CommerceNotificationTemplateUserSegmentRelLocalService;
import com.liferay.commerce.notification.service.persistence.CommerceNotificationAttachmentPersistence;
import com.liferay.commerce.notification.service.persistence.CommerceNotificationQueueEntryPersistence;
import com.liferay.commerce.notification.service.persistence.CommerceNotificationTemplatePersistence;
import com.liferay.commerce.notification.service.persistence.CommerceNotificationTemplateUserSegmentRelPersistence;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the commerce notification template user segment rel local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.commerce.notification.service.impl.CommerceNotificationTemplateUserSegmentRelLocalServiceImpl}.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see com.liferay.commerce.notification.service.impl.CommerceNotificationTemplateUserSegmentRelLocalServiceImpl
 * @generated
 */
@ProviderType
public abstract class
	CommerceNotificationTemplateUserSegmentRelLocalServiceBaseImpl
		extends BaseLocalServiceImpl
		implements CommerceNotificationTemplateUserSegmentRelLocalService,
				   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CommerceNotificationTemplateUserSegmentRelLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.commerce.notification.service.CommerceNotificationTemplateUserSegmentRelLocalServiceUtil</code>.
	 */

	/**
	 * Adds the commerce notification template user segment rel to the database. Also notifies the appropriate model listeners.
	 *
	 * @param commerceNotificationTemplateUserSegmentRel the commerce notification template user segment rel
	 * @return the commerce notification template user segment rel that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CommerceNotificationTemplateUserSegmentRel
		addCommerceNotificationTemplateUserSegmentRel(
			CommerceNotificationTemplateUserSegmentRel
				commerceNotificationTemplateUserSegmentRel) {

		commerceNotificationTemplateUserSegmentRel.setNew(true);

		return commerceNotificationTemplateUserSegmentRelPersistence.update(
			commerceNotificationTemplateUserSegmentRel);
	}

	/**
	 * Creates a new commerce notification template user segment rel with the primary key. Does not add the commerce notification template user segment rel to the database.
	 *
	 * @param commerceNotificationTemplateUserSegmentRelId the primary key for the new commerce notification template user segment rel
	 * @return the new commerce notification template user segment rel
	 */
	@Override
	@Transactional(enabled = false)
	public CommerceNotificationTemplateUserSegmentRel
		createCommerceNotificationTemplateUserSegmentRel(
			long commerceNotificationTemplateUserSegmentRelId) {

		return commerceNotificationTemplateUserSegmentRelPersistence.create(
			commerceNotificationTemplateUserSegmentRelId);
	}

	/**
	 * Deletes the commerce notification template user segment rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param commerceNotificationTemplateUserSegmentRelId the primary key of the commerce notification template user segment rel
	 * @return the commerce notification template user segment rel that was removed
	 * @throws PortalException if a commerce notification template user segment rel with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CommerceNotificationTemplateUserSegmentRel
			deleteCommerceNotificationTemplateUserSegmentRel(
				long commerceNotificationTemplateUserSegmentRelId)
		throws PortalException {

		return commerceNotificationTemplateUserSegmentRelPersistence.remove(
			commerceNotificationTemplateUserSegmentRelId);
	}

	/**
	 * Deletes the commerce notification template user segment rel from the database. Also notifies the appropriate model listeners.
	 *
	 * @param commerceNotificationTemplateUserSegmentRel the commerce notification template user segment rel
	 * @return the commerce notification template user segment rel that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CommerceNotificationTemplateUserSegmentRel
		deleteCommerceNotificationTemplateUserSegmentRel(
			CommerceNotificationTemplateUserSegmentRel
				commerceNotificationTemplateUserSegmentRel) {

		return commerceNotificationTemplateUserSegmentRelPersistence.remove(
			commerceNotificationTemplateUserSegmentRel);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			CommerceNotificationTemplateUserSegmentRel.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return commerceNotificationTemplateUserSegmentRelPersistence.
			findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.commerce.notification.model.impl.CommerceNotificationTemplateUserSegmentRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return commerceNotificationTemplateUserSegmentRelPersistence.
			findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.commerce.notification.model.impl.CommerceNotificationTemplateUserSegmentRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return commerceNotificationTemplateUserSegmentRelPersistence.
			findWithDynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return commerceNotificationTemplateUserSegmentRelPersistence.
			countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return commerceNotificationTemplateUserSegmentRelPersistence.
			countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public CommerceNotificationTemplateUserSegmentRel
		fetchCommerceNotificationTemplateUserSegmentRel(
			long commerceNotificationTemplateUserSegmentRelId) {

		return commerceNotificationTemplateUserSegmentRelPersistence.
			fetchByPrimaryKey(commerceNotificationTemplateUserSegmentRelId);
	}

	/**
	 * Returns the commerce notification template user segment rel with the primary key.
	 *
	 * @param commerceNotificationTemplateUserSegmentRelId the primary key of the commerce notification template user segment rel
	 * @return the commerce notification template user segment rel
	 * @throws PortalException if a commerce notification template user segment rel with the primary key could not be found
	 */
	@Override
	public CommerceNotificationTemplateUserSegmentRel
			getCommerceNotificationTemplateUserSegmentRel(
				long commerceNotificationTemplateUserSegmentRelId)
		throws PortalException {

		return commerceNotificationTemplateUserSegmentRelPersistence.
			findByPrimaryKey(commerceNotificationTemplateUserSegmentRelId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			commerceNotificationTemplateUserSegmentRelLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			CommerceNotificationTemplateUserSegmentRel.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"commerceNotificationTemplateUserSegmentRelId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			commerceNotificationTemplateUserSegmentRelLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			CommerceNotificationTemplateUserSegmentRel.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"commerceNotificationTemplateUserSegmentRelId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			commerceNotificationTemplateUserSegmentRelLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			CommerceNotificationTemplateUserSegmentRel.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"commerceNotificationTemplateUserSegmentRelId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return commerceNotificationTemplateUserSegmentRelLocalService.
			deleteCommerceNotificationTemplateUserSegmentRel(
				(CommerceNotificationTemplateUserSegmentRel)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return commerceNotificationTemplateUserSegmentRelPersistence.
			findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the commerce notification template user segment rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.commerce.notification.model.impl.CommerceNotificationTemplateUserSegmentRelModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of commerce notification template user segment rels
	 * @param end the upper bound of the range of commerce notification template user segment rels (not inclusive)
	 * @return the range of commerce notification template user segment rels
	 */
	@Override
	public List<CommerceNotificationTemplateUserSegmentRel>
		getCommerceNotificationTemplateUserSegmentRels(int start, int end) {

		return commerceNotificationTemplateUserSegmentRelPersistence.findAll(
			start, end);
	}

	/**
	 * Returns the number of commerce notification template user segment rels.
	 *
	 * @return the number of commerce notification template user segment rels
	 */
	@Override
	public int getCommerceNotificationTemplateUserSegmentRelsCount() {
		return commerceNotificationTemplateUserSegmentRelPersistence.countAll();
	}

	/**
	 * Updates the commerce notification template user segment rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param commerceNotificationTemplateUserSegmentRel the commerce notification template user segment rel
	 * @return the commerce notification template user segment rel that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CommerceNotificationTemplateUserSegmentRel
		updateCommerceNotificationTemplateUserSegmentRel(
			CommerceNotificationTemplateUserSegmentRel
				commerceNotificationTemplateUserSegmentRel) {

		return commerceNotificationTemplateUserSegmentRelPersistence.update(
			commerceNotificationTemplateUserSegmentRel);
	}

	/**
	 * Returns the commerce notification attachment local service.
	 *
	 * @return the commerce notification attachment local service
	 */
	public com.liferay.commerce.notification.service.
		CommerceNotificationAttachmentLocalService
			getCommerceNotificationAttachmentLocalService() {

		return commerceNotificationAttachmentLocalService;
	}

	/**
	 * Sets the commerce notification attachment local service.
	 *
	 * @param commerceNotificationAttachmentLocalService the commerce notification attachment local service
	 */
	public void setCommerceNotificationAttachmentLocalService(
		com.liferay.commerce.notification.service.
			CommerceNotificationAttachmentLocalService
				commerceNotificationAttachmentLocalService) {

		this.commerceNotificationAttachmentLocalService =
			commerceNotificationAttachmentLocalService;
	}

	/**
	 * Returns the commerce notification attachment persistence.
	 *
	 * @return the commerce notification attachment persistence
	 */
	public CommerceNotificationAttachmentPersistence
		getCommerceNotificationAttachmentPersistence() {

		return commerceNotificationAttachmentPersistence;
	}

	/**
	 * Sets the commerce notification attachment persistence.
	 *
	 * @param commerceNotificationAttachmentPersistence the commerce notification attachment persistence
	 */
	public void setCommerceNotificationAttachmentPersistence(
		CommerceNotificationAttachmentPersistence
			commerceNotificationAttachmentPersistence) {

		this.commerceNotificationAttachmentPersistence =
			commerceNotificationAttachmentPersistence;
	}

	/**
	 * Returns the commerce notification queue entry local service.
	 *
	 * @return the commerce notification queue entry local service
	 */
	public com.liferay.commerce.notification.service.
		CommerceNotificationQueueEntryLocalService
			getCommerceNotificationQueueEntryLocalService() {

		return commerceNotificationQueueEntryLocalService;
	}

	/**
	 * Sets the commerce notification queue entry local service.
	 *
	 * @param commerceNotificationQueueEntryLocalService the commerce notification queue entry local service
	 */
	public void setCommerceNotificationQueueEntryLocalService(
		com.liferay.commerce.notification.service.
			CommerceNotificationQueueEntryLocalService
				commerceNotificationQueueEntryLocalService) {

		this.commerceNotificationQueueEntryLocalService =
			commerceNotificationQueueEntryLocalService;
	}

	/**
	 * Returns the commerce notification queue entry persistence.
	 *
	 * @return the commerce notification queue entry persistence
	 */
	public CommerceNotificationQueueEntryPersistence
		getCommerceNotificationQueueEntryPersistence() {

		return commerceNotificationQueueEntryPersistence;
	}

	/**
	 * Sets the commerce notification queue entry persistence.
	 *
	 * @param commerceNotificationQueueEntryPersistence the commerce notification queue entry persistence
	 */
	public void setCommerceNotificationQueueEntryPersistence(
		CommerceNotificationQueueEntryPersistence
			commerceNotificationQueueEntryPersistence) {

		this.commerceNotificationQueueEntryPersistence =
			commerceNotificationQueueEntryPersistence;
	}

	/**
	 * Returns the commerce notification template local service.
	 *
	 * @return the commerce notification template local service
	 */
	public com.liferay.commerce.notification.service.
		CommerceNotificationTemplateLocalService
			getCommerceNotificationTemplateLocalService() {

		return commerceNotificationTemplateLocalService;
	}

	/**
	 * Sets the commerce notification template local service.
	 *
	 * @param commerceNotificationTemplateLocalService the commerce notification template local service
	 */
	public void setCommerceNotificationTemplateLocalService(
		com.liferay.commerce.notification.service.
			CommerceNotificationTemplateLocalService
				commerceNotificationTemplateLocalService) {

		this.commerceNotificationTemplateLocalService =
			commerceNotificationTemplateLocalService;
	}

	/**
	 * Returns the commerce notification template persistence.
	 *
	 * @return the commerce notification template persistence
	 */
	public CommerceNotificationTemplatePersistence
		getCommerceNotificationTemplatePersistence() {

		return commerceNotificationTemplatePersistence;
	}

	/**
	 * Sets the commerce notification template persistence.
	 *
	 * @param commerceNotificationTemplatePersistence the commerce notification template persistence
	 */
	public void setCommerceNotificationTemplatePersistence(
		CommerceNotificationTemplatePersistence
			commerceNotificationTemplatePersistence) {

		this.commerceNotificationTemplatePersistence =
			commerceNotificationTemplatePersistence;
	}

	/**
	 * Returns the commerce notification template user segment rel local service.
	 *
	 * @return the commerce notification template user segment rel local service
	 */
	public CommerceNotificationTemplateUserSegmentRelLocalService
		getCommerceNotificationTemplateUserSegmentRelLocalService() {

		return commerceNotificationTemplateUserSegmentRelLocalService;
	}

	/**
	 * Sets the commerce notification template user segment rel local service.
	 *
	 * @param commerceNotificationTemplateUserSegmentRelLocalService the commerce notification template user segment rel local service
	 */
	public void setCommerceNotificationTemplateUserSegmentRelLocalService(
		CommerceNotificationTemplateUserSegmentRelLocalService
			commerceNotificationTemplateUserSegmentRelLocalService) {

		this.commerceNotificationTemplateUserSegmentRelLocalService =
			commerceNotificationTemplateUserSegmentRelLocalService;
	}

	/**
	 * Returns the commerce notification template user segment rel persistence.
	 *
	 * @return the commerce notification template user segment rel persistence
	 */
	public CommerceNotificationTemplateUserSegmentRelPersistence
		getCommerceNotificationTemplateUserSegmentRelPersistence() {

		return commerceNotificationTemplateUserSegmentRelPersistence;
	}

	/**
	 * Sets the commerce notification template user segment rel persistence.
	 *
	 * @param commerceNotificationTemplateUserSegmentRelPersistence the commerce notification template user segment rel persistence
	 */
	public void setCommerceNotificationTemplateUserSegmentRelPersistence(
		CommerceNotificationTemplateUserSegmentRelPersistence
			commerceNotificationTemplateUserSegmentRelPersistence) {

		this.commerceNotificationTemplateUserSegmentRelPersistence =
			commerceNotificationTemplateUserSegmentRelPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService
		getCounterLocalService() {

		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService
			counterLocalService) {

		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService
		getClassNameLocalService() {

		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService
			classNameLocalService) {

		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {

		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService
		getResourceLocalService() {

		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService
			resourceLocalService) {

		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService
		getUserLocalService() {

		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {

		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register(
			"com.liferay.commerce.notification.model.CommerceNotificationTemplateUserSegmentRel",
			commerceNotificationTemplateUserSegmentRelLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.liferay.commerce.notification.model.CommerceNotificationTemplateUserSegmentRel");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CommerceNotificationTemplateUserSegmentRelLocalService.class.
			getName();
	}

	protected Class<?> getModelClass() {
		return CommerceNotificationTemplateUserSegmentRel.class;
	}

	protected String getModelClassName() {
		return CommerceNotificationTemplateUserSegmentRel.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				commerceNotificationTemplateUserSegmentRelPersistence.
					getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(
		type = com.liferay.commerce.notification.service.CommerceNotificationAttachmentLocalService.class
	)
	protected com.liferay.commerce.notification.service.
		CommerceNotificationAttachmentLocalService
			commerceNotificationAttachmentLocalService;

	@BeanReference(type = CommerceNotificationAttachmentPersistence.class)
	protected CommerceNotificationAttachmentPersistence
		commerceNotificationAttachmentPersistence;

	@BeanReference(
		type = com.liferay.commerce.notification.service.CommerceNotificationQueueEntryLocalService.class
	)
	protected com.liferay.commerce.notification.service.
		CommerceNotificationQueueEntryLocalService
			commerceNotificationQueueEntryLocalService;

	@BeanReference(type = CommerceNotificationQueueEntryPersistence.class)
	protected CommerceNotificationQueueEntryPersistence
		commerceNotificationQueueEntryPersistence;

	@BeanReference(
		type = com.liferay.commerce.notification.service.CommerceNotificationTemplateLocalService.class
	)
	protected com.liferay.commerce.notification.service.
		CommerceNotificationTemplateLocalService
			commerceNotificationTemplateLocalService;

	@BeanReference(type = CommerceNotificationTemplatePersistence.class)
	protected CommerceNotificationTemplatePersistence
		commerceNotificationTemplatePersistence;

	@BeanReference(
		type = CommerceNotificationTemplateUserSegmentRelLocalService.class
	)
	protected CommerceNotificationTemplateUserSegmentRelLocalService
		commerceNotificationTemplateUserSegmentRelLocalService;

	@BeanReference(
		type = CommerceNotificationTemplateUserSegmentRelPersistence.class
	)
	protected CommerceNotificationTemplateUserSegmentRelPersistence
		commerceNotificationTemplateUserSegmentRelPersistence;

	@ServiceReference(
		type = com.liferay.counter.kernel.service.CounterLocalService.class
	)
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameLocalService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ResourceLocalService.class
	)
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserLocalService.class
	)
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry
		persistedModelLocalServiceRegistry;

}