package com.zeshan.restwsAsync;

import javax.ws.rs.BadRequestException;
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
				if(checklist==null || checklist.getChecks()==null || checklist.getChecks().size()==0)
				{
					// This exception can be thrown
//					throw new BadRequestException();
					// But to throw exxception asynchronously we need to throw it thru response.resume(Throwable)
					response.resume(new BadRequestException());
				}
					response.resume(true);
			}
		}.start();
		
	}

}