package com.dataparser;
 
import java.util.ArrayList;
 
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
 
public class MainActivity extends Activity implements OnClickListener {
	private TextView tv_one,tv_two,tv_three,tv_four,tv_five,tv_six,tv_seven,tv_eight,tv_nine,tv_ten;
	private Button btn_get_server_data;
	private Button btn_delete_one,btn_delete_two,btn_delete_three,btn_delete_four,btn_delete_five,btn_delete_six,btn_delete_seven,btn_delete_eight,btn_delete_nine,btn_delete_ten;
	private Button btn_one_in,btn_two_in,btn_three_in,btn_four_in,btn_five_in,btn_six_in,btn_seven_in,btn_eight_in,btn_nine_in,btn_ten_in;
	ArrayList<NetworkProviderBean> _list_universal=new ArrayList<NetworkProviderBean>();
	ArrayList<String> _list_temp_universal=new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		infalteXmlData();
	}
 
	private void infalteXmlData() {
		btn_get_server_data=(Button)findViewById(R.id.btn_get_server_data);
		btn_delete_one=(Button)findViewById(R.id.btn_delete_one);
		btn_delete_two=(Button)findViewById(R.id.btn_delete_two);
		btn_delete_three=(Button)findViewById(R.id.btn_delete_three);
		btn_delete_four=(Button)findViewById(R.id.btn_delete_four);
		btn_delete_five=(Button)findViewById(R.id.btn_delete_five);
		btn_delete_six=(Button)findViewById(R.id.btn_delete_six);
		btn_delete_seven=(Button)findViewById(R.id.btn_delete_seven);
		btn_delete_eight=(Button)findViewById(R.id.btn_delete_eight);
		btn_delete_nine=(Button)findViewById(R.id.btn_delete_nine);
		btn_delete_ten=(Button)findViewById(R.id.btn_delete_ten);
		
		btn_one_in=(Button)findViewById(R.id.btn_one_in);
		btn_two_in=(Button)findViewById(R.id.btn_two_in);
		btn_three_in=(Button)findViewById(R.id.btn_three_in);
		btn_four_in=(Button)findViewById(R.id.btn_four_in);
		
		btn_five_in=(Button)findViewById(R.id.btn_five_in);
		btn_six_in=(Button)findViewById(R.id.btn_six_in);
		btn_seven_in=(Button)findViewById(R.id.btn_seven_in);
		btn_eight_in=(Button)findViewById(R.id.btn_eight_in);
		
		btn_nine_in=(Button)findViewById(R.id.btn_nine_in);
		btn_ten_in=(Button)findViewById(R.id.btn_ten_in);
		
 
		tv_one=(TextView)findViewById(R.id.tv_one);
		tv_two=(TextView)findViewById(R.id.tv_two);
		tv_three=(TextView)findViewById(R.id.tv_three);
		tv_four=(TextView)findViewById(R.id.tv_four);
 
		tv_five=(TextView)findViewById(R.id.tv_five);
		tv_six=(TextView)findViewById(R.id.tv_six);
		tv_seven=(TextView)findViewById(R.id.tv_seven);
		tv_eight=(TextView)findViewById(R.id.tv_eight);
 
		tv_nine=(TextView)findViewById(R.id.tv_nine);
		tv_ten=(TextView)findViewById(R.id.tv_ten);
 
		btn_get_server_data.setOnClickListener(this); 
 
		btn_delete_one.setOnClickListener(this);
		btn_delete_two.setOnClickListener(this);
		btn_delete_three.setOnClickListener(this);
		btn_delete_four.setOnClickListener(this);
		btn_delete_five.setOnClickListener(this);
		btn_delete_six.setOnClickListener(this);
		btn_delete_seven.setOnClickListener(this);
		btn_delete_eight.setOnClickListener(this);
		btn_delete_nine.setOnClickListener(this);
		btn_delete_ten.setOnClickListener(this);
		
		btn_one_in.setOnClickListener(this);
		btn_two_in.setOnClickListener(this);
		btn_three_in.setOnClickListener(this);
		btn_four_in.setOnClickListener(this);
		
		btn_five_in.setOnClickListener(this);
		btn_six_in.setOnClickListener(this);
		btn_seven_in.setOnClickListener(this);
		btn_eight_in.setOnClickListener(this);
		
		btn_nine_in.setOnClickListener(this);
		btn_ten_in.setOnClickListener(this);
		if (!MyPreferences.getActiveInstance(MainActivity.this).getData_one().equals("")) {
			setDataToTextView();
		}
		
 
	}
 
	@Override
	public void onClick(View v) {
		if (v.equals(btn_get_server_data)) {
			new TestNetworkProviderServiceExceuterClient().exceuteGetNetworkServiceServer();
 
		}else if (v.equals(btn_delete_one)) {
			MyPreferences.getActiveInstance(MainActivity.this).setData_one("");
			tv_one.setText("");
		}else if (v.equals(btn_delete_two)) {
			MyPreferences.getActiveInstance(MainActivity.this).setData_two("");
			tv_two.setText("");
 
		}else if (v.equals(btn_delete_three)) {
			MyPreferences.getActiveInstance(MainActivity.this).setData_three("");
			tv_three.setText("");
 
		}else if (v.equals(btn_delete_four)) {
			MyPreferences.getActiveInstance(MainActivity.this).setData_four("");
			tv_four.setText("");
 
		}else if (v.equals(btn_delete_five)) {
			MyPreferences.getActiveInstance(MainActivity.this).setData_five("");
			tv_five.setText("");
 
		}else if (v.equals(btn_delete_six)) {
			MyPreferences.getActiveInstance(MainActivity.this).setData_six("");
			tv_six.setText("");
 
		}else if (v.equals(btn_delete_seven)) {
			MyPreferences.getActiveInstance(MainActivity.this).setData_seven("");
			tv_seven.setText("");
 
		}else if (v.equals(btn_delete_eight)) {
			MyPreferences.getActiveInstance(MainActivity.this).setData_eight("");
			tv_eight.setText("");
 
		}else if (v.equals(btn_delete_nine)) {
			MyPreferences.getActiveInstance(MainActivity.this).setData_nine("");
			tv_nine.setText("");
 
		}else if (v.equals(btn_delete_ten)) {
			MyPreferences.getActiveInstance(MainActivity.this).setData_ten("");
			tv_ten.setText("");
 
		}else if (v.equals(btn_one_in)) {
			CustomDialogShow(1);
		}else if (v.equals(btn_two_in)) {
			CustomDialogShow(2);
		}else if (v.equals(btn_three_in)) {
			CustomDialogShow(3);
		}else if (v.equals(btn_four_in)) {
			CustomDialogShow(4);
		}else if (v.equals(btn_five_in)) {
			CustomDialogShow(5);
		}else if (v.equals(btn_six_in)) {
			CustomDialogShow(6);
		}else if (v.equals(btn_seven_in)) {
			CustomDialogShow(7);
		}else if (v.equals(btn_eight_in)) {
			CustomDialogShow(8);
		}else if (v.equals(btn_nine_in)) {
			CustomDialogShow(9);
		}else if (v.equals(btn_ten_in)) {
			CustomDialogShow(10);
		}
	}
	
 
	//network provider service......
 
	private void CustomDialogShow( final int type) {
		AlertDialog.Builder message=new AlertDialog.Builder(MainActivity.this);
		message.setTitle("Insert Text");
		LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.custom_dialog, null);
		message.setView(view);
		message.setCancelable(false);
		final AlertDialog dialog = message.create();
		dialog.show();
		Button btn_ok =(Button)view.findViewById(R.id.btn_ok);
		Button btn_exit =(Button)view.findViewById(R.id.btn_exit);
		final EditText et_message=(EditText)view.findViewById(R.id.et_message);
 
		btn_ok.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View v) {
				dialog.cancel();
				if (type==1) {
					MyPreferences.getActiveInstance(getApplicationContext()).setData_one(et_message.getText().toString());
				tv_one.setText(et_message.getText().toString());
				}else if (type==2) {
					MyPreferences.getActiveInstance(getApplicationContext()).setData_two(et_message.getText().toString());
					tv_two.setText(et_message.getText().toString());
				}else if (type==3) {
					MyPreferences.getActiveInstance(getApplicationContext()).setData_three(et_message.getText().toString());
					tv_three.setText(et_message.getText().toString());
				}else if (type==4) {
					MyPreferences.getActiveInstance(getApplicationContext()).setData_four(et_message.getText().toString());
					tv_four.setText(et_message.getText().toString());
				}else if (type==5) {
					MyPreferences.getActiveInstance(getApplicationContext()).setData_five(et_message.getText().toString());
					tv_five.setText(et_message.getText().toString());
				}else if (type==6) {
					MyPreferences.getActiveInstance(getApplicationContext()).setData_six(et_message.getText().toString());
					tv_six.setText(et_message.getText().toString());
				}else if (type==7) {
					MyPreferences.getActiveInstance(getApplicationContext()).setData_seven(et_message.getText().toString());
					tv_seven.setText(et_message.getText().toString());
				}else if (type==8) {
					MyPreferences.getActiveInstance(getApplicationContext()).setData_eight(et_message.getText().toString());
					tv_eight.setText(et_message.getText().toString());
				}else if (type==9) {
					MyPreferences.getActiveInstance(getApplicationContext()).setData_nine(et_message.getText().toString());
					tv_nine.setText(et_message.getText().toString());
				}else if (type==10) {
					MyPreferences.getActiveInstance(getApplicationContext()).setData_ten(et_message.getText().toString());
					tv_ten.setText(et_message.getText().toString());
				}
				
				
			}
		});
		btn_exit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialog.cancel();
				
			}
		});
		
	}
 
 
	public	class TestNetworkProviderServiceExceuterClient extends ServiceProviderServiceExecuter{
		ArrayList<String> _list_temp = new ArrayList<String>();
		private void executePostCommentServiceService(){
			super.exceuteGetNetworkServiceServer();
		}
 
		@Override
		public void getNetworkProvidertSucessfullyExceuted(boolean isExceutedSucessfully,ArrayList<NetworkProviderBean> _list) {
 
			_list_universal=_list;
			if (isExceutedSucessfully) {
				for (int i = 0; i < _list.size(); i++) 
				{
					NetworkProviderBean obj;
					obj=_list.get(i);
					_list_temp.add(obj.getNetworksTitle());
 
				}
				_list_temp_universal=_list_temp;
				MyPreferences.getActiveInstance(MainActivity.this).setData_one(_list_temp_universal.get(0));
				MyPreferences.getActiveInstance(MainActivity.this).setData_two(_list_temp_universal.get(1));
				MyPreferences.getActiveInstance(MainActivity.this).setData_three(_list_temp_universal.get(2));
				MyPreferences.getActiveInstance(MainActivity.this).setData_four(_list_temp_universal.get(3));
				MyPreferences.getActiveInstance(MainActivity.this).setData_five(_list_temp_universal.get(4));
				MyPreferences.getActiveInstance(MainActivity.this).setData_six(_list_temp_universal.get(5));
				MyPreferences.getActiveInstance(MainActivity.this).setData_seven(_list_temp_universal.get(6));
				MyPreferences.getActiveInstance(MainActivity.this).setData_eight(_list_temp_universal.get(7));
				MyPreferences.getActiveInstance(MainActivity.this).setData_nine(_list_temp_universal.get(8));
				MyPreferences.getActiveInstance(MainActivity.this).setData_ten(_list_temp_universal.get(9));
				setDataToTextView();
				//					ArrayAdapter<String> ad = new ArrayAdapter<String>(RegisterActivity.this,android.R.layout.simple_spinner_item,_list_temp );
				//					ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				//					networkProvider.setAdapter(ad);
			}
		}
 
	}
	/*
	 * This method use for set data in text view
	 */
	private void setDataToTextView() {
		tv_one.setText(MyPreferences.getActiveInstance(MainActivity.this).getData_one());
		tv_two.setText(MyPreferences.getActiveInstance(MainActivity.this).getData_two());
		tv_three.setText(MyPreferences.getActiveInstance(MainActivity.this).getData_three());
		tv_four.setText(MyPreferences.getActiveInstance(MainActivity.this).getData_four());
		tv_five.setText(MyPreferences.getActiveInstance(MainActivity.this).getData_five());
		tv_six.setText(MyPreferences.getActiveInstance(MainActivity.this).getData_six());
		tv_seven.setText(MyPreferences.getActiveInstance(MainActivity.this).getData_seven());
		tv_eight.setText(MyPreferences.getActiveInstance(MainActivity.this).getData_eight());
		tv_nine.setText(MyPreferences.getActiveInstance(MainActivity.this).getData_nine());
		tv_ten.setText(MyPreferences.getActiveInstance(MainActivity.this).getData_ten());
	}
}
 
