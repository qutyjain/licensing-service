package com.books.registrations.utils;

public class UserContext {
	public static final String CORRELATION_ID = "tmx-correlation-id";
	public static final String AUTH_TOKEN = "tmx-auth-token";
	public static final String USER_ID = "tmx-user-id";
	public static final String ORG_ID = "tmx-org-id";

	private String correlationId;
	private String authToken;
	private String userId;
	private String orgId;

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
		// RequestContext ctx = RequestContext.getCurrentContext();
		// if (ctx.getRequest()!= null &&
		// ctx.getRequest().getHeader(CORRELATION_ID) != null)
		// this.correlationId = ctx.getRequest().getHeader(CORRELATION_ID);
		// else
		// this.correlationId = ctx.getZuulRequestHeaders()
		// .get(CORRELATION_ID);
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

}
