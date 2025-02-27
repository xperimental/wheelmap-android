/*
Copyright (C) 2011 Michal Harakal and Michael Kroez

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS-IS" BASIS
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
        
*/

package org.wheelmap.android.net;

import org.wheelmap.android.service.SyncServiceException;

import wheelmap.org.request.RequestProcessor;
import android.content.ContentResolver;
import android.os.Bundle;

public abstract class AbstractExecutor implements IExecutor {
	protected static final String TAG = "executor";
	
	private final ContentResolver mResolver;
	private final Bundle mBundle;
	// Testserver
	// protected static final String SERVER = "staging.wheelmap.org";
	// Production Server
	protected static final String SERVER = "wheelmap.org";
	
	protected static final String API_KEY = "jWeAsb34CJq4yVAryjtc";
	protected static RequestProcessor mRequestProcessor = new RequestProcessor();
	
	public AbstractExecutor( ContentResolver resolver, Bundle bundle ) {
		mResolver = resolver;
		mBundle = bundle;
	}
	
	public String getApiKey() {
		return "jWeAsb34CJq4yVAryjtc";
	}
	
	protected ContentResolver getResolver() {
		return mResolver;
	}
	
	protected Bundle getBundle() {
		return mBundle;
	}
	
	public abstract void prepareContent();
	public abstract void execute() throws SyncServiceException;
	public abstract void prepareDatabase() throws SyncServiceException;

}

