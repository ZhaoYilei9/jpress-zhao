package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUtm<M extends BaseUtm<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	public void setAnonymous(java.lang.String anonymous) {
		set("anonymous", anonymous);
	}
	
	public java.lang.String getAnonymous() {
		return getStr("anonymous");
	}

	public void setActionKey(java.lang.String actionKey) {
		set("action_key", actionKey);
	}
	
	public java.lang.String getActionKey() {
		return getStr("action_key");
	}

	public void setActionQuery(java.lang.String actionQuery) {
		set("action_query", actionQuery);
	}
	
	public java.lang.String getActionQuery() {
		return getStr("action_query");
	}

	public void setActionName(java.lang.String actionName) {
		set("action_name", actionName);
	}
	
	public java.lang.String getActionName() {
		return getStr("action_name");
	}

	public void setSource(java.lang.String source) {
		set("source", source);
	}
	
	public java.lang.String getSource() {
		return getStr("source");
	}

	public void setMedium(java.lang.String medium) {
		set("medium", medium);
	}
	
	public java.lang.String getMedium() {
		return getStr("medium");
	}

	public void setCampaign(java.lang.String campaign) {
		set("campaign", campaign);
	}
	
	public java.lang.String getCampaign() {
		return getStr("campaign");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public void setTerm(java.lang.String term) {
		set("term", term);
	}
	
	public java.lang.String getTerm() {
		return getStr("term");
	}

	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}
	
	public java.lang.String getIp() {
		return getStr("ip");
	}

	public void setAgent(java.lang.String agent) {
		set("agent", agent);
	}
	
	public java.lang.String getAgent() {
		return getStr("agent");
	}

	public void setReferer(java.lang.String referer) {
		set("referer", referer);
	}
	
	public java.lang.String getReferer() {
		return getStr("referer");
	}

	public void setDeviceId(java.lang.String deviceId) {
		set("device_id", deviceId);
	}
	
	public java.lang.String getDeviceId() {
		return getStr("device_id");
	}

	public void setPlatform(java.lang.String platform) {
		set("platform", platform);
	}
	
	public java.lang.String getPlatform() {
		return getStr("platform");
	}

	public void setSystem(java.lang.String system) {
		set("system", system);
	}
	
	public java.lang.String getSystem() {
		return getStr("system");
	}

	public void setBrand(java.lang.String brand) {
		set("brand", brand);
	}
	
	public java.lang.String getBrand() {
		return getStr("brand");
	}

	public void setModel(java.lang.String model) {
		set("model", model);
	}
	
	public java.lang.String getModel() {
		return getStr("model");
	}

	public void setNetwork(java.lang.String network) {
		set("network", network);
	}
	
	public java.lang.String getNetwork() {
		return getStr("network");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

}
