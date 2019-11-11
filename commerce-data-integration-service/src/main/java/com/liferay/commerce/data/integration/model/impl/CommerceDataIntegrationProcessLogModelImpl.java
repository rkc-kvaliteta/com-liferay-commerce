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

package com.liferay.commerce.data.integration.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.data.integration.model.CommerceDataIntegrationProcessLog;
import com.liferay.commerce.data.integration.model.CommerceDataIntegrationProcessLogModel;
import com.liferay.commerce.data.integration.model.CommerceDataIntegrationProcessLogSoap;
import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the CommerceDataIntegrationProcessLog service. Represents a row in the &quot;CDataIntegrationProcessLog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>CommerceDataIntegrationProcessLogModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CommerceDataIntegrationProcessLogImpl}.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceDataIntegrationProcessLogImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class CommerceDataIntegrationProcessLogModelImpl
	extends BaseModelImpl<CommerceDataIntegrationProcessLog>
	implements CommerceDataIntegrationProcessLogModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a commerce data integration process log model instance should use the <code>CommerceDataIntegrationProcessLog</code> interface instead.
	 */
	public static final String TABLE_NAME = "CDataIntegrationProcessLog";

	public static final Object[][] TABLE_COLUMNS = {
		{"CDataIntegrationProcessLogId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"CDataIntegrationProcessId", Types.BIGINT}, {"error", Types.CLOB},
		{"output_", Types.CLOB}, {"status", Types.INTEGER},
		{"startDate", Types.TIMESTAMP}, {"endDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("CDataIntegrationProcessLogId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("CDataIntegrationProcessId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("error", Types.CLOB);
		TABLE_COLUMNS_MAP.put("output_", Types.CLOB);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("startDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("endDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table CDataIntegrationProcessLog (CDataIntegrationProcessLogId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,CDataIntegrationProcessId LONG,error TEXT null,output_ TEXT null,status INTEGER,startDate DATE null,endDate DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table CDataIntegrationProcessLog";

	public static final String ORDER_BY_JPQL =
		" ORDER BY commerceDataIntegrationProcessLog.modifiedDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY CDataIntegrationProcessLog.modifiedDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.data.integration.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.liferay.commerce.data.integration.model.CommerceDataIntegrationProcessLog"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.data.integration.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.liferay.commerce.data.integration.model.CommerceDataIntegrationProcessLog"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.data.integration.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.liferay.commerce.data.integration.model.CommerceDataIntegrationProcessLog"),
		true);

	public static final long CDATAINTEGRATIONPROCESSID_COLUMN_BITMASK = 1L;

	public static final long STATUS_COLUMN_BITMASK = 2L;

	public static final long MODIFIEDDATE_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CommerceDataIntegrationProcessLog toModel(
		CommerceDataIntegrationProcessLogSoap soapModel) {

		if (soapModel == null) {
			return null;
		}

		CommerceDataIntegrationProcessLog model =
			new CommerceDataIntegrationProcessLogImpl();

		model.setCommerceDataIntegrationProcessLogId(
			soapModel.getCommerceDataIntegrationProcessLogId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCDataIntegrationProcessId(
			soapModel.getCDataIntegrationProcessId());
		model.setError(soapModel.getError());
		model.setOutput(soapModel.getOutput());
		model.setStatus(soapModel.getStatus());
		model.setStartDate(soapModel.getStartDate());
		model.setEndDate(soapModel.getEndDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CommerceDataIntegrationProcessLog> toModels(
		CommerceDataIntegrationProcessLogSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<CommerceDataIntegrationProcessLog> models =
			new ArrayList<CommerceDataIntegrationProcessLog>(soapModels.length);

		for (CommerceDataIntegrationProcessLogSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.liferay.commerce.data.integration.service.util.ServiceProps.get(
			"lock.expiration.time.com.liferay.commerce.data.integration.model.CommerceDataIntegrationProcessLog"));

	public CommerceDataIntegrationProcessLogModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _commerceDataIntegrationProcessLogId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCommerceDataIntegrationProcessLogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _commerceDataIntegrationProcessLogId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CommerceDataIntegrationProcessLog.class;
	}

	@Override
	public String getModelClassName() {
		return CommerceDataIntegrationProcessLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CommerceDataIntegrationProcessLog, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry
				<String, Function<CommerceDataIntegrationProcessLog, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceDataIntegrationProcessLog, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(CommerceDataIntegrationProcessLog)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CommerceDataIntegrationProcessLog, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CommerceDataIntegrationProcessLog, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CommerceDataIntegrationProcessLog)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CommerceDataIntegrationProcessLog, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CommerceDataIntegrationProcessLog, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function
		<InvocationHandler, CommerceDataIntegrationProcessLog>
			_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			CommerceDataIntegrationProcessLog.class.getClassLoader(),
			CommerceDataIntegrationProcessLog.class, ModelWrapper.class);

		try {
			Constructor<CommerceDataIntegrationProcessLog> constructor =
				(Constructor<CommerceDataIntegrationProcessLog>)
					proxyClass.getConstructor(InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map
		<String, Function<CommerceDataIntegrationProcessLog, Object>>
			_attributeGetterFunctions;
	private static final Map
		<String, BiConsumer<CommerceDataIntegrationProcessLog, Object>>
			_attributeSetterBiConsumers;

	static {
		Map<String, Function<CommerceDataIntegrationProcessLog, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String,
					 Function<CommerceDataIntegrationProcessLog, Object>>();
		Map<String, BiConsumer<CommerceDataIntegrationProcessLog, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String,
					 BiConsumer<CommerceDataIntegrationProcessLog, ?>>();

		attributeGetterFunctions.put(
			"commerceDataIntegrationProcessLogId",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.
						getCommerceDataIntegrationProcessLogId();
				}

			});
		attributeSetterBiConsumers.put(
			"commerceDataIntegrationProcessLogId",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object commerceDataIntegrationProcessLogId) {

					commerceDataIntegrationProcessLog.
						setCommerceDataIntegrationProcessLogId(
							(Long)commerceDataIntegrationProcessLogId);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object companyId) {

					commerceDataIntegrationProcessLog.setCompanyId(
						(Long)companyId);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object userId) {

					commerceDataIntegrationProcessLog.setUserId((Long)userId);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object userName) {

					commerceDataIntegrationProcessLog.setUserName(
						(String)userName);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object createDate) {

					commerceDataIntegrationProcessLog.setCreateDate(
						(Date)createDate);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object modifiedDate) {

					commerceDataIntegrationProcessLog.setModifiedDate(
						(Date)modifiedDate);
				}

			});
		attributeGetterFunctions.put(
			"CDataIntegrationProcessId",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.
						getCDataIntegrationProcessId();
				}

			});
		attributeSetterBiConsumers.put(
			"CDataIntegrationProcessId",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object CDataIntegrationProcessId) {

					commerceDataIntegrationProcessLog.
						setCDataIntegrationProcessId(
							(Long)CDataIntegrationProcessId);
				}

			});
		attributeGetterFunctions.put(
			"error",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.getError();
				}

			});
		attributeSetterBiConsumers.put(
			"error",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object error) {

					commerceDataIntegrationProcessLog.setError((String)error);
				}

			});
		attributeGetterFunctions.put(
			"output",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.getOutput();
				}

			});
		attributeSetterBiConsumers.put(
			"output",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object output) {

					commerceDataIntegrationProcessLog.setOutput((String)output);
				}

			});
		attributeGetterFunctions.put(
			"status",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.getStatus();
				}

			});
		attributeSetterBiConsumers.put(
			"status",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object status) {

					commerceDataIntegrationProcessLog.setStatus(
						(Integer)status);
				}

			});
		attributeGetterFunctions.put(
			"startDate",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.getStartDate();
				}

			});
		attributeSetterBiConsumers.put(
			"startDate",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object startDate) {

					commerceDataIntegrationProcessLog.setStartDate(
						(Date)startDate);
				}

			});
		attributeGetterFunctions.put(
			"endDate",
			new Function<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public Object apply(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog) {

					return commerceDataIntegrationProcessLog.getEndDate();
				}

			});
		attributeSetterBiConsumers.put(
			"endDate",
			new BiConsumer<CommerceDataIntegrationProcessLog, Object>() {

				@Override
				public void accept(
					CommerceDataIntegrationProcessLog
						commerceDataIntegrationProcessLog,
					Object endDate) {

					commerceDataIntegrationProcessLog.setEndDate((Date)endDate);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getCommerceDataIntegrationProcessLogId() {
		return _commerceDataIntegrationProcessLogId;
	}

	@Override
	public void setCommerceDataIntegrationProcessLogId(
		long commerceDataIntegrationProcessLogId) {

		_commerceDataIntegrationProcessLogId =
			commerceDataIntegrationProcessLogId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_columnBitmask = -1L;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getCDataIntegrationProcessId() {
		return _CDataIntegrationProcessId;
	}

	@Override
	public void setCDataIntegrationProcessId(long CDataIntegrationProcessId) {
		_columnBitmask |= CDATAINTEGRATIONPROCESSID_COLUMN_BITMASK;

		if (!_setOriginalCDataIntegrationProcessId) {
			_setOriginalCDataIntegrationProcessId = true;

			_originalCDataIntegrationProcessId = _CDataIntegrationProcessId;
		}

		_CDataIntegrationProcessId = CDataIntegrationProcessId;
	}

	public long getOriginalCDataIntegrationProcessId() {
		return _originalCDataIntegrationProcessId;
	}

	@JSON
	@Override
	public String getError() {
		if (_error == null) {
			return "";
		}
		else {
			return _error;
		}
	}

	@Override
	public void setError(String error) {
		_error = error;
	}

	@JSON
	@Override
	public String getOutput() {
		if (_output == null) {
			return "";
		}
		else {
			return _output;
		}
	}

	@Override
	public void setOutput(String output) {
		_output = output;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@JSON
	@Override
	public Date getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	@JSON
	@Override
	public Date getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), CommerceDataIntegrationProcessLog.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CommerceDataIntegrationProcessLog toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CommerceDataIntegrationProcessLog>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CommerceDataIntegrationProcessLogImpl
			commerceDataIntegrationProcessLogImpl =
				new CommerceDataIntegrationProcessLogImpl();

		commerceDataIntegrationProcessLogImpl.
			setCommerceDataIntegrationProcessLogId(
				getCommerceDataIntegrationProcessLogId());
		commerceDataIntegrationProcessLogImpl.setCompanyId(getCompanyId());
		commerceDataIntegrationProcessLogImpl.setUserId(getUserId());
		commerceDataIntegrationProcessLogImpl.setUserName(getUserName());
		commerceDataIntegrationProcessLogImpl.setCreateDate(getCreateDate());
		commerceDataIntegrationProcessLogImpl.setModifiedDate(
			getModifiedDate());
		commerceDataIntegrationProcessLogImpl.setCDataIntegrationProcessId(
			getCDataIntegrationProcessId());
		commerceDataIntegrationProcessLogImpl.setError(getError());
		commerceDataIntegrationProcessLogImpl.setOutput(getOutput());
		commerceDataIntegrationProcessLogImpl.setStatus(getStatus());
		commerceDataIntegrationProcessLogImpl.setStartDate(getStartDate());
		commerceDataIntegrationProcessLogImpl.setEndDate(getEndDate());

		commerceDataIntegrationProcessLogImpl.resetOriginalValues();

		return commerceDataIntegrationProcessLogImpl;
	}

	@Override
	public int compareTo(
		CommerceDataIntegrationProcessLog commerceDataIntegrationProcessLog) {

		int value = 0;

		value = DateUtil.compareTo(
			getModifiedDate(),
			commerceDataIntegrationProcessLog.getModifiedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CommerceDataIntegrationProcessLog)) {
			return false;
		}

		CommerceDataIntegrationProcessLog commerceDataIntegrationProcessLog =
			(CommerceDataIntegrationProcessLog)obj;

		long primaryKey = commerceDataIntegrationProcessLog.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		CommerceDataIntegrationProcessLogModelImpl
			commerceDataIntegrationProcessLogModelImpl = this;

		commerceDataIntegrationProcessLogModelImpl._setModifiedDate = false;

		commerceDataIntegrationProcessLogModelImpl.
			_originalCDataIntegrationProcessId =
				commerceDataIntegrationProcessLogModelImpl.
					_CDataIntegrationProcessId;

		commerceDataIntegrationProcessLogModelImpl.
			_setOriginalCDataIntegrationProcessId = false;

		commerceDataIntegrationProcessLogModelImpl._originalStatus =
			commerceDataIntegrationProcessLogModelImpl._status;

		commerceDataIntegrationProcessLogModelImpl._setOriginalStatus = false;

		commerceDataIntegrationProcessLogModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CommerceDataIntegrationProcessLog> toCacheModel() {
		CommerceDataIntegrationProcessLogCacheModel
			commerceDataIntegrationProcessLogCacheModel =
				new CommerceDataIntegrationProcessLogCacheModel();

		commerceDataIntegrationProcessLogCacheModel.
			commerceDataIntegrationProcessLogId =
				getCommerceDataIntegrationProcessLogId();

		commerceDataIntegrationProcessLogCacheModel.companyId = getCompanyId();

		commerceDataIntegrationProcessLogCacheModel.userId = getUserId();

		commerceDataIntegrationProcessLogCacheModel.userName = getUserName();

		String userName = commerceDataIntegrationProcessLogCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			commerceDataIntegrationProcessLogCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			commerceDataIntegrationProcessLogCacheModel.createDate =
				createDate.getTime();
		}
		else {
			commerceDataIntegrationProcessLogCacheModel.createDate =
				Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			commerceDataIntegrationProcessLogCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			commerceDataIntegrationProcessLogCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		commerceDataIntegrationProcessLogCacheModel.CDataIntegrationProcessId =
			getCDataIntegrationProcessId();

		commerceDataIntegrationProcessLogCacheModel.error = getError();

		String error = commerceDataIntegrationProcessLogCacheModel.error;

		if ((error != null) && (error.length() == 0)) {
			commerceDataIntegrationProcessLogCacheModel.error = null;
		}

		commerceDataIntegrationProcessLogCacheModel.output = getOutput();

		String output = commerceDataIntegrationProcessLogCacheModel.output;

		if ((output != null) && (output.length() == 0)) {
			commerceDataIntegrationProcessLogCacheModel.output = null;
		}

		commerceDataIntegrationProcessLogCacheModel.status = getStatus();

		Date startDate = getStartDate();

		if (startDate != null) {
			commerceDataIntegrationProcessLogCacheModel.startDate =
				startDate.getTime();
		}
		else {
			commerceDataIntegrationProcessLogCacheModel.startDate =
				Long.MIN_VALUE;
		}

		Date endDate = getEndDate();

		if (endDate != null) {
			commerceDataIntegrationProcessLogCacheModel.endDate =
				endDate.getTime();
		}
		else {
			commerceDataIntegrationProcessLogCacheModel.endDate =
				Long.MIN_VALUE;
		}

		return commerceDataIntegrationProcessLogCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CommerceDataIntegrationProcessLog, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry
				<String, Function<CommerceDataIntegrationProcessLog, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceDataIntegrationProcessLog, Object>
				attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(
				attributeGetterFunction.apply(
					(CommerceDataIntegrationProcessLog)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<CommerceDataIntegrationProcessLog, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry
				<String, Function<CommerceDataIntegrationProcessLog, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceDataIntegrationProcessLog, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(
				attributeGetterFunction.apply(
					(CommerceDataIntegrationProcessLog)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function
			<InvocationHandler, CommerceDataIntegrationProcessLog>
				_escapedModelProxyProviderFunction =
					_getProxyProviderFunction();

	}

	private long _commerceDataIntegrationProcessLogId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _CDataIntegrationProcessId;
	private long _originalCDataIntegrationProcessId;
	private boolean _setOriginalCDataIntegrationProcessId;
	private String _error;
	private String _output;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private Date _startDate;
	private Date _endDate;
	private long _columnBitmask;
	private CommerceDataIntegrationProcessLog _escapedModel;

}