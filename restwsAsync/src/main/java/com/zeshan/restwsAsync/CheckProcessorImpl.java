package com.zeshan.restwsAsync;

import javax.ws.rs.container.AsyncResponse;

import org.springframework.stereotype.Service;

import com.zeshan.restwsAsync.model.CheckList;
@Service
public class CheckProcessorImpl implements CheckProcessor {

	@Override
	public void processCheck(AsyncResponse response ,CheckList checklist) {
		//Async methon is boolean async 
		new Thread() {
			public void run() {
				response.resume(true);
			}
		}.start();
		
	}

}
