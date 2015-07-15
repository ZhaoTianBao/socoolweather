package com.example.socoolweather.util;

public interface HttpCallbackListener {

	void onFinish(String response);
	
	void onError(Exception e);
}
