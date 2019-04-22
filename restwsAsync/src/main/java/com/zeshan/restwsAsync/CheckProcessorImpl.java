package com.zeshan.restwsAsync;

import javax.ws.rs.container.AsyncResponse;

import com.zeshan.restwsAsync.model.CheckList;

public class CheckProcessorImpl implements CheckProcessor {

	@Override
	public void processCheck(AsyncResponse response ,CheckList checklist) {
		//Async methon is boolean async 
		response.resume(true);
	}

}
