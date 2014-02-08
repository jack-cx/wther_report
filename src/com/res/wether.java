package com.res;

public class wether {
	
	private String quName;
	private String pyName;
	private String cityname;
	private String state1;
	private String state2;
	private String statedetailed;
	private String tem1;
	private String tem2;
	private String windState;
	public wether() {
		// TODO Auto-generated constructor stub
	}
	public wether(String quName, String pyName, String cityname, String state1,
			String state2, String statedetailed, String tem1, String tem2,
			String windState) {
		super();
		this.quName = quName;
		this.pyName = pyName;
		this.cityname = cityname;
		this.state1 = state1;
		this.state2 = state2;
		this.statedetailed = statedetailed;
		this.tem1 = tem1;
		this.tem2 = tem2;
		this.windState = windState;
	}
	public String getQuName() {
		return quName;
	}
	public void setQuName(String quName) {
		this.quName = quName;
	}
	public String getPyName() {
		return pyName;
	}
	public void setPyName(String pyName) {
		this.pyName = pyName;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getState1() {
		return state1;
	}
	public void setState1(String state1) {
		this.state1 = state1;
	}
	public String getState2() {
		return state2;
	}
	public void setState2(String state2) {
		this.state2 = state2;
	}
	public String getStatedetailed() {
		return statedetailed;
	}
	public void setStatedetailed(String statedetailed) {
		this.statedetailed = statedetailed;
	}
	public String getTem1() {
		return tem1;
	}
	public void setTem1(String tem1) {
		this.tem1 = tem1;
	}
	public String getTem2() {
		return tem2;
	}
	public void setTem2(String tem2) {
		this.tem2 = tem2;
	}
	public String getWindState() {
		return windState;
	}
	public void setWindState(String windState) {
		this.windState = windState;
	}
	@Override
	public String toString() {
		return "wether [quName=" + quName + ", pyName=" + pyName
				+ ", cityname=" + cityname + ", state1=" + state1 + ", state2="
				+ state2 + ", statedetailed=" + statedetailed + ", tem1="
				+ tem1 + ", tem2=" + tem2 + ", windState=" + windState + "]";
	}

	
	}
