package net.ismartkorea.restful.model;

public class UserInfoVo {

	private int no;
	private String id;
	private String pwd;
	private String name;
	private String sex;
	private String bloodType;
	private String birthday;
	private String address1;
	private String address2;
	private String postNo;
	private String eduLevel;
	private String officeName;
	private String officeAddress1;
	private String officeAddress2;
	private String officePostNo;
	private String officeLevel;
	private String hobby;
	private String marryYn;
	private String photoUrl;
	private String etc;
	private String regId;
	private String regiDt;
	private String updateId;
	private String updateDt;
	//
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getEduLevel() {
		return eduLevel;
	}
	public void setEduLevel(String eduLevel) {
		this.eduLevel = eduLevel;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getOfficeAddress1() {
		return officeAddress1;
	}
	public void setOfficeAddress1(String officeAddress1) {
		this.officeAddress1 = officeAddress1;
	}
	public String getOfficeAddress2() {
		return officeAddress2;
	}
	public void setOfficeAddress2(String officeAddress2) {
		this.officeAddress2 = officeAddress2;
	}
	public String getOfficePostNo() {
		return officePostNo;
	}
	public void setOfficePostNo(String officePostNo) {
		this.officePostNo = officePostNo;
	}
	public String getOfficeLevel() {
		return officeLevel;
	}
	public void setOfficeLevel(String officeLevel) {
		this.officeLevel = officeLevel;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getMarryYn() {
		return marryYn;
	}
	public void setMarryYn(String marryYn) {
		this.marryYn = marryYn;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getRegiDt() {
		return regiDt;
	}
	public void setRegiDt(String regiDt) {
		this.regiDt = regiDt;
	}
	public String getUpdateId() {
		return updateId;
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	public String getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(String updateDt) {
		this.updateDt = updateDt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((address1 == null) ? 0 : address1.hashCode());
		result = prime * result
				+ ((address2 == null) ? 0 : address2.hashCode());
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result
				+ ((bloodType == null) ? 0 : bloodType.hashCode());
		result = prime * result
				+ ((eduLevel == null) ? 0 : eduLevel.hashCode());
		result = prime * result + ((etc == null) ? 0 : etc.hashCode());
		result = prime * result + ((hobby == null) ? 0 : hobby.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((marryYn == null) ? 0 : marryYn.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		result = prime * result
				+ ((officeAddress1 == null) ? 0 : officeAddress1.hashCode());
		result = prime * result
				+ ((officeAddress2 == null) ? 0 : officeAddress2.hashCode());
		result = prime * result
				+ ((officeLevel == null) ? 0 : officeLevel.hashCode());
		result = prime * result
				+ ((officeName == null) ? 0 : officeName.hashCode());
		result = prime * result
				+ ((officePostNo == null) ? 0 : officePostNo.hashCode());
		result = prime * result
				+ ((photoUrl == null) ? 0 : photoUrl.hashCode());
		result = prime * result + ((postNo == null) ? 0 : postNo.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((regId == null) ? 0 : regId.hashCode());
		result = prime * result + ((regiDt == null) ? 0 : regiDt.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result
				+ ((updateDt == null) ? 0 : updateDt.hashCode());
		result = prime * result
				+ ((updateId == null) ? 0 : updateId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfoVo other = (UserInfoVo) obj;
		if (address1 == null) {
			if (other.address1 != null)
				return false;
		} else if (!address1.equals(other.address1))
			return false;
		if (address2 == null) {
			if (other.address2 != null)
				return false;
		} else if (!address2.equals(other.address2))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (bloodType == null) {
			if (other.bloodType != null)
				return false;
		} else if (!bloodType.equals(other.bloodType))
			return false;
		if (eduLevel == null) {
			if (other.eduLevel != null)
				return false;
		} else if (!eduLevel.equals(other.eduLevel))
			return false;
		if (etc == null) {
			if (other.etc != null)
				return false;
		} else if (!etc.equals(other.etc))
			return false;
		if (hobby == null) {
			if (other.hobby != null)
				return false;
		} else if (!hobby.equals(other.hobby))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (marryYn == null) {
			if (other.marryYn != null)
				return false;
		} else if (!marryYn.equals(other.marryYn))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		if (officeAddress1 == null) {
			if (other.officeAddress1 != null)
				return false;
		} else if (!officeAddress1.equals(other.officeAddress1))
			return false;
		if (officeAddress2 == null) {
			if (other.officeAddress2 != null)
				return false;
		} else if (!officeAddress2.equals(other.officeAddress2))
			return false;
		if (officeLevel == null) {
			if (other.officeLevel != null)
				return false;
		} else if (!officeLevel.equals(other.officeLevel))
			return false;
		if (officeName == null) {
			if (other.officeName != null)
				return false;
		} else if (!officeName.equals(other.officeName))
			return false;
		if (officePostNo == null) {
			if (other.officePostNo != null)
				return false;
		} else if (!officePostNo.equals(other.officePostNo))
			return false;
		if (photoUrl == null) {
			if (other.photoUrl != null)
				return false;
		} else if (!photoUrl.equals(other.photoUrl))
			return false;
		if (postNo == null) {
			if (other.postNo != null)
				return false;
		} else if (!postNo.equals(other.postNo))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (regId == null) {
			if (other.regId != null)
				return false;
		} else if (!regId.equals(other.regId))
			return false;
		if (regiDt == null) {
			if (other.regiDt != null)
				return false;
		} else if (!regiDt.equals(other.regiDt))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (updateDt == null) {
			if (other.updateDt != null)
				return false;
		} else if (!updateDt.equals(other.updateDt))
			return false;
		if (updateId == null) {
			if (other.updateId != null)
				return false;
		} else if (!updateId.equals(other.updateId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserInfoVo [no=" + no + ", id=" + id + ", pwd=" + pwd
				+ ", name=" + name + ", sex=" + sex + ", bloodType="
				+ bloodType + ", birthday=" + birthday + ", address1="
				+ address1 + ", address2=" + address2 + ", postNo=" + postNo
				+ ", eduLevel=" + eduLevel + ", officeName=" + officeName
				+ ", officeAddress1=" + officeAddress1 + ", officeAddress2="
				+ officeAddress2 + ", officePostNo=" + officePostNo
				+ ", officeLevel=" + officeLevel + ", hobby=" + hobby
				+ ", marryYn=" + marryYn + ", photoUrl=" + photoUrl + ", etc="
				+ etc + ", regId=" + regId + ", regiDt=" + regiDt
				+ ", updateId=" + updateId + ", updateDt=" + updateDt + "]";
	}


	
}
