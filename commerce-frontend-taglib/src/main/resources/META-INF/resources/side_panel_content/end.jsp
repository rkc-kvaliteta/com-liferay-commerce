<%--
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
--%>

<%@ include file="/side_panel_content/init.jsp" %>

<c:if test="<%= Validator.isNotNull(title) %>">
		</div>
	</div>
</c:if>

<aui:script require="commerce-frontend-js/utilities/eventsDefinitions.es as events">
	document.querySelectorAll(".side-panel-closer").forEach(function(trigger) {
		trigger.addEventListener("click", function(e) {
			e.preventDefault();
			window.parent.Liferay.fire(events.CLOSE_SIDE_PANEL);
		})
	})
</aui:script>