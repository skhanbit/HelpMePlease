package com.hm.beans.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, isGetterVisibility = Visibility.NONE,  getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public interface BaseResponseBean {
	//Every Response data should implement this interface to maintain common structure of response
}
