package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}
	
	public java.lang.String getUsername() {
		return getStr("username");
	}

	public void setNickname(java.lang.String nickname) {
		set("nickname", nickname);
	}
	
	public java.lang.String getNickname() {
		return getStr("nickname");
	}

	public void setRealname(java.lang.String realname) {
		set("realname", realname);
	}
	
	public java.lang.String getRealname() {
		return getStr("realname");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}
	
	public java.lang.String getPassword() {
		return getStr("password");
	}

	public void setSalt(java.lang.String salt) {
		set("salt", salt);
	}
	
	public java.lang.String getSalt() {
		return getStr("salt");
	}

	public void setWxOpenid(java.lang.String wxOpenid) {
		set("wx_openid", wxOpenid);
	}
	
	public java.lang.String getWxOpenid() {
		return getStr("wx_openid");
	}

	public void setWxUnionid(java.lang.String wxUnionid) {
		set("wx_unionid", wxUnionid);
	}
	
	public java.lang.String getWxUnionid() {
		return getStr("wx_unionid");
	}

	public void setQqOpenid(java.lang.String qqOpenid) {
		set("qq_openid", qqOpenid);
	}
	
	public java.lang.String getQqOpenid() {
		return getStr("qq_openid");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}
	
	public java.lang.String getEmail() {
		return getStr("email");
	}

	public void setEmailStatus(java.lang.String emailStatus) {
		set("email_status", emailStatus);
	}
	
	public java.lang.String getEmailStatus() {
		return getStr("email_status");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}
	
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	public void setMobileStatus(java.lang.String mobileStatus) {
		set("mobile_status", mobileStatus);
	}
	
	public java.lang.String getMobileStatus() {
		return getStr("mobile_status");
	}

	public void setGender(java.lang.String gender) {
		set("gender", gender);
	}
	
	public java.lang.String getGender() {
		return getStr("gender");
	}

	public void setSignature(java.lang.String signature) {
		set("signature", signature);
	}
	
	public java.lang.String getSignature() {
		return getStr("signature");
	}

	public void setBirthday(java.util.Date birthday) {
		set("birthday", birthday);
	}
	
	public java.util.Date getBirthday() {
		return get("birthday");
	}

	public void setCompany(java.lang.String company) {
		set("company", company);
	}
	
	public java.lang.String getCompany() {
		return getStr("company");
	}

	public void setOccupation(java.lang.String occupation) {
		set("occupation", occupation);
	}
	
	public java.lang.String getOccupation() {
		return getStr("occupation");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setZipcode(java.lang.String zipcode) {
		set("zipcode", zipcode);
	}
	
	public java.lang.String getZipcode() {
		return getStr("zipcode");
	}

	public void setSite(java.lang.String site) {
		set("site", site);
	}
	
	public java.lang.String getSite() {
		return getStr("site");
	}

	public void setGraduateschool(java.lang.String graduateschool) {
		set("graduateschool", graduateschool);
	}
	
	public java.lang.String getGraduateschool() {
		return getStr("graduateschool");
	}

	public void setEducation(java.lang.String education) {
		set("education", education);
	}
	
	public java.lang.String getEducation() {
		return getStr("education");
	}

	public void setAvatar(java.lang.String avatar) {
		set("avatar", avatar);
	}
	
	public java.lang.String getAvatar() {
		return getStr("avatar");
	}

	public void setIdcardtype(java.lang.String idcardtype) {
		set("idcardtype", idcardtype);
	}
	
	public java.lang.String getIdcardtype() {
		return getStr("idcardtype");
	}

	public void setIdcard(java.lang.String idcard) {
		set("idcard", idcard);
	}
	
	public java.lang.String getIdcard() {
		return getStr("idcard");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public void setCreateSource(java.lang.String createSource) {
		set("create_source", createSource);
	}
	
	public java.lang.String getCreateSource() {
		return getStr("create_source");
	}

	public void setLogged(java.util.Date logged) {
		set("logged", logged);
	}
	
	public java.util.Date getLogged() {
		return get("logged");
	}

	public void setActivated(java.util.Date activated) {
		set("activated", activated);
	}
	
	public java.util.Date getActivated() {
		return get("activated");
	}

}
