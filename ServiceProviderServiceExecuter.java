package com.dataparser;
 
import java.util.ArrayList;
 
import org.apache.http.Header;
import org.json.JSONObject;
 
import android.util.Log;
 
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
 
public abstract class ServiceProviderServiceExecuter {
 
	//		String URL;
	ArrayList<databaseBean> _list_network=new ArrayList<databaseBean>();
 
	public abstract void getNetworkProvidertSucessfullyExceuted(boolean isExceutedSucessfully,ArrayList<databaseBean> _list);
	protected void exceuteGetNetworkServiceServer(){
		RequestParams params = new RequestParams();
		AsyncHttpClient client  = new AsyncHttpClient();
		client.setTimeout(300000);
		
//		params.add(AppConstants.KEY_COMMENT_WALLPAPERS_SHAREID, shareId);
		client.get("http://codifier.co/demo/mobifi/api/operator/format/json", params, new JsonHttpResponseHandler(){
			@Override
			public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
				Log.e("username","inside executeLoginServiceServer" + response);
				if (response!=null) 
				{
					try {
						_list_network=JsonResponseParser.parseNetworkProviderResponse(response.toString());
						if(_list_network.size()>0)
						{
							ServiceProviderServiceExecuter.this.getNetworkProvidertSucessfullyExceuted(true,_list_network);
						}
						else
						{
							ServiceProviderServiceExecuter.this.getNetworkProvidertSucessfullyExceuted(false,null);
						}
					} catch (Exception e) {
						ServiceProviderServiceExecuter.this.getNetworkProvidertSucessfullyExceuted(false,null);
					}
				}
			}
 
			@Override
			public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
				super.onFailure(statusCode, headers, responseString, throwable);
				Log.e("", "Fetch category Failure  : "+responseString.toString());
				ServiceProviderServiceExecuter.this.getNetworkProvidertSucessfullyExceuted(false,null);
			}
		});
	}
}
 
 
 
