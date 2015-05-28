package com.dataparser;
 
import java.util.ArrayList;
 
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
 
public class JsonResponseParser {
 
	public static ArrayList<NetworkProviderBean> parseNetworkProviderResponse(String response)  throws JSONException{
 
		JSONObject main_obj = new JSONObject(response);
		int success = main_obj.getInt("success");
		JSONArray Network_array=main_obj.getJSONArray("response");
		ArrayList<NetworkProviderBean> list_network=new ArrayList<NetworkProviderBean>();
		if(success==1)
		{
			if (success==1 && Network_array.length()>0 ){
				for (int i = 0; i < Network_array.length(); i++)
				{
					NetworkProviderBean bean = new NetworkProviderBean();
					JSONObject object = Network_array.getJSONObject(i);
					bean.setNetworksId(object.getString("networksId"));
					bean.setNetworksTitle(object.getString("networksTitle"));
					bean.setNetworksCode(object.getString("networksCode"));
					list_network.add(bean);
				} 
			}
			return list_network;
		}
		else
		{
			return null;
		}
	}
 
 
 
	
}
 
