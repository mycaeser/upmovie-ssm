package com.caeser.upmovie.enums;

public enum MovieStateEnum {
	NOTEXIT(400, "Movie ID 不存在"), NOTNUMERIC(401, "Movie ID 不是正整数"), OUTRANGE(402, "Movie ID 超过范围"), SUC(
			200, "结果正确");
	private int state;

	private String stateInfo;
	
	private MovieStateEnum(int state, String stateInfo){
		this.state = state;
		this.stateInfo = stateInfo;
	}
	
	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}
	
	public static MovieStateEnum stateOf(int index) {
		for (MovieStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
