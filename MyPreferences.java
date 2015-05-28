package com.dataparser;
 
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
 
/**
 * This class custom shared preference for the application
 * Shared preference store local values.
 */
public class MyPreferences {
	private static MyPreferences preferences = null;
	private SharedPreferences mPreferences;
	private SharedPreferences.Editor editor;
 
	//Sign_in variables here
	private String data_one="one";
	private String data_two="two";
	private String data_three="three";
	private String data_four="four";
 
	private String data_five="five";
	private String data_six="six";
	private String data_seven="seven";
	private String data_eight="eight";
	private String data_nine="nine";
	private String data_ten="ten";
 
	public String getData_one() {
		return  mPreferences.getString(this.data_one, "");
	}
	public void setData_one(String data_one) {
		editor = mPreferences.edit();
		editor.putString(this.data_one, data_one);
		editor.commit();
	}
	public String getData_two() {
		return  mPreferences.getString(this.data_two, "");
	}
	public void setData_two(String data_two) {
		editor = mPreferences.edit();
		editor.putString(this.data_two, data_two);
		editor.commit();
	}
	public String getData_three() {
		return  mPreferences.getString(this.data_three, "");
	}
	public void setData_three(String data_three) {
		editor = mPreferences.edit();
		editor.putString(this.data_three, data_three);
		editor.commit();
	}
	public String getData_four() {
		return  mPreferences.getString(this.data_four, "");
	}
	public void setData_four(String data_four) {
		editor = mPreferences.edit();
		editor.putString(this.data_four, data_four);
		editor.commit();
	}
	public String getData_five() {
		return  mPreferences.getString(this.data_five, "");
	}
	public void setData_five(String data_five) {
		editor = mPreferences.edit();
		editor.putString(this.data_five, data_five);
		editor.commit();
	}
	public String getData_six() {
		return  mPreferences.getString(this.data_six, "");
	}
	public void setData_six(String data_six) {
		editor = mPreferences.edit();
		editor.putString(this.data_six, data_six);
		editor.commit();
	}
	public String getData_seven() {
		return  mPreferences.getString(this.data_seven, "");
	}
	public void setData_seven(String data_seven) {
		editor = mPreferences.edit();
		editor.putString(this.data_seven, data_seven);
		editor.commit();
	}
	public String getData_eight() {
		return  mPreferences.getString(this.data_eight, "");
	}
	public void setData_eight(String data_eight) {
		editor = mPreferences.edit();
		editor.putString(this.data_eight, data_eight);
		editor.commit();
	}
	public String getData_nine() {
		return  mPreferences.getString(this.data_nine, "");
	}
	public void setData_nine(String data_nine) {
		editor = mPreferences.edit();
		editor.putString(this.data_nine, data_nine);
		editor.commit();
	}
	public String getData_ten() {
		return  mPreferences.getString(this.data_ten, "");
	}
	public void setData_ten(String data_ten) {
		editor = mPreferences.edit();
		editor.putString(this.data_ten, data_ten);
		editor.commit();
	}
 
	/**
	 * This returns the active instance of the Preferences 
	 * @param context
	 * @return
	 */
	public static MyPreferences getActiveInstance(Context context){
		if (preferences == null) {
			preferences = new MyPreferences(context);
		}
		return preferences;
	}
 
	private MyPreferences(Context context) {
		mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
	}
 
 
 
}
