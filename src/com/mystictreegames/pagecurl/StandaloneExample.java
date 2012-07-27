package com.mystictreegames.pagecurl;

import com.mystictreegames.pagecurl.R;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * This example demostrates the use of the view as a standalone view that has
 * been created within a layout.
 * 
 * @author Moritz 'Moss' Wundke (b.thax.dcg@gmail.com)
 * 
 */
public class StandaloneExample extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.article_detail);
		((TextView) findViewById(R.id.article_detail_content))
				.setText("I will try to explain what exactly I need to do. I have 3 separate screens say A,B,C. "
						+ "There is another screen called say HomeScreen where all the 3 screens bitmap should be displayed in Gallery view "
						+ "and the user can select in which view does he wants to go. I have been able to get the Bitmaps of all the 3 screens and display it in Gallery view by "
						+ "placing all the code in HomeScreen Activity only. Now, this has complicated the code a lot and I will like to simplify it. So, can I call "
						+ "another Activity from HomeScreen and do not display it and just get the Bitmap of that screen. For example, say I just call HomeScreen and it calls Activity A"
						+ ",B,C and none of the Activities from A,B,C are displayed. It just gives the Bitmap of that screen by getDrawingCache(). And then we can display those bitmaps "
						+ "in Gallery view in HomeScreen. I hope I have explained the problem very clearly. Please let me know if this is actually possible. Regards Sunil I "
						+ "will try to explain what exactly I need to do. I have 3 separate screens say A,B,C. There is another screen called say HomeScreen where all the 3 screens "
						+ "bitmap should be displayed in Gallery view and the user can select in which view does he wants to go. I have been able to "
						+ "get the Bitmaps of all the 3 screens and display it in Gallery view by placing all the code in HomeScreen Activity only"
						+ ". Now, this has complicated the code a lot and I will like to simplify it. So, can I call another Activity from HomeScreen and do not display it and just get the Bitmap "
						+ "of that screen. For example, say I just call HomeScreen and it calls Activity A,B,"
						+ "C and none of the Activities from A,B,C are displayed. It just gives the Bitmap of that screen by getDrawingCache(). And then we "
						+ "can display those bitmaps in Gallery view in HomeScreen. I hope I have explained the problem very clearly. Please let me know if this is actually "
						+ "possible. Regards Sunil I will try to explain what exactly I need to do. I have 3 separate screens say A,B,C. There is "
						+ "another screen called say HomeScreen where all the 3 screens bitmap should be displayed in Gallery view and the user can select in "
						+ "which view does he wants to go. I have been able to get the Bitmaps of all the 3 screens and display it in Gallery view by placing all "
						+ "the code in HomeScreen Activity only. Now, this has complicated the code a lot and I will like to simplify it. So, can I call another "
						+ "Activity from HomeScreen and do not display it and just get the Bitmap of that screen. For example, say I just call HomeScreen and "
						+ "it calls Activity A,B,C and none of the Activities from A,B,C are displayed. It just gives the Bitmap of that screen by getDrawingCache"
						+ "(). And then we can display those bitmaps in Gallery view in HomeScreen. I hope I have explained the problem very clearly. "
						+ "Please let me know if this is actually possible. Regards Sunil");
		((TextView) findViewById(R.id.article_detail_content_1))
				.setText("public static Bitmap loadBitmapFromView(View v) { Bitmap b = Bitmap.createBitmap( v.getLayoutParams().width, v.getLayoutParams()."
						+ "height, Bitmap.Config.ARGB_8888); Canvas c = new Canvas(b); v.layout(0, 0, v.getLayoutParams().width, v.getLayoutParams().height); v"
						+ ".draw(c); return b; }  public static Bitmap loadBitmapFromView(View v) { Bitmap b = Bitmap.createBitmap( v.getLayoutParams().width, v"
						+ ".getLayoutParams().height, Bitmap.Config.ARGB_8888); Canvas c = new Canvas(b); v.layout(0, 0, v.getLayoutParams().width, v.getLayoutParams"
						+ "().height); v.draw(c); return b; } public static Bitmap loadBitmapFromView(View v) { Bitmap b = Bitmap.createBitmap( v.getLayoutParams()."
						+ "width, v.getLayoutParams().height, Bitmap.Config.ARGB_8888); Canvas c = new Canvas(b); v.layout(0, 0, v.getLayoutParams().width, v.getLayout"
						+ "Params().height); v.draw(c); return b; } public static Bitmap loadBitmapFromView(View v) { Bitmap b = Bitmap.createBitmap( v.getLayoutParams().width, "
						+ "v.getLayoutParams().height, Bitmap.Config.ARGB_8888); Canvas c = new Canvas(b); v.layout(0, 0, v.getLayoutParams().width"
						+ ", v.getLayoutParams().height); v.draw(c); return b; }");
		((PageCurlView) findViewById(R.id.dcgpagecurlPageCurlView1))
				.setScrollView(((ScrollView) findViewById(R.id.scrll)));
		((PageCurlView) findViewById(R.id.dcgpagecurlPageCurlView1))
				.setMainView(this);

	}

	boolean h = true;

	public void changeContent() {
		if (h) {
			((TextView) findViewById(R.id.article_detail_content_1))
					.setText(((TextView) findViewById(R.id.article_detail_content))
							.getText());
			((TextView) findViewById(R.id.article_detail_content))
					.setText("public static Bitmap loadBitmapFromView(View v) { Bitmap b = Bitmap.createBitmap( v.getLayoutParams().width, v.getLayoutParams()."
							+ "height, Bitmap.Config.ARGB_8888); Canvas c = new Canvas(b); v.layout(0, 0, v.getLayoutParams().width, v.getLayoutParams().height); v"
							+ ".draw(c); return b; }  public static Bitmap loadBitmapFromView(View v) { Bitmap b = Bitmap.createBitmap( v.getLayoutParams().width, v"
							+ ".getLayoutParams().height, Bitmap.Config.ARGB_8888); Canvas c = new Canvas(b); v.layout(0, 0, v.getLayoutParams().width, v.getLayoutParams"
							+ "().height); v.draw(c); return b; } public static Bitmap loadBitmapFromView(View v) { Bitmap b = Bitmap.createBitmap( v.getLayoutParams()."
							+ "width, v.getLayoutParams().height, Bitmap.Config.ARGB_8888); Canvas c = new Canvas(b); v.layout(0, 0, v.getLayoutParams().width, v.getLayout"
							+ "Params().height); v.draw(c); return b; } public static Bitmap loadBitmapFromView(View v) { Bitmap b = Bitmap.createBitmap( v.getLayoutParams().width, "
							+ "v.getLayoutParams().height, Bitmap.Config.ARGB_8888); Canvas c = new Canvas(b); v.layout(0, 0, v.getLayoutParams().width"
							+ ", v.getLayoutParams().height); v.draw(c); return b; }");

		} else {
			((TextView) findViewById(R.id.article_detail_content_1))
					.setText(((TextView) findViewById(R.id.article_detail_content))
							.getText());
			((TextView) findViewById(R.id.article_detail_content))
					.setText("I will try to explain what exactly I need to do. I have 3 separate screens say A,B,C. "
							+ "There is another screen called say HomeScreen where all the 3 screens bitmap should be displayed in Gallery view "
							+ "and the user can select in which view does he wants to go. I have been able to get the Bitmaps of all the 3 screens and display it in Gallery view by "
							+ "placing all the code in HomeScreen Activity only. Now, this has complicated the code a lot and I will like to simplify it. So, can I call "
							+ "another Activity from HomeScreen and do not display it and just get the Bitmap of that screen. For example, say I just call HomeScreen and it calls Activity A"
							+ ",B,C and none of the Activities from A,B,C are displayed. It just gives the Bitmap of that screen by getDrawingCache(). And then we can display those bitmaps "
							+ "in Gallery view in HomeScreen. I hope I have explained the problem very clearly. Please let me know if this is actually possible. Regards Sunil I "
							+ "will try to explain what exactly I need to do. I have 3 separate screens say A,B,C. There is another screen called say HomeScreen where all the 3 screens "
							+ "bitmap should be displayed in Gallery view and the user can select in which view does he wants to go. I have been able to "
							+ "get the Bitmaps of all the 3 screens and display it in Gallery view by placing all the code in HomeScreen Activity only"
							+ ". Now, this has complicated the code a lot and I will like to simplify it. So, can I call another Activity from HomeScreen and do not display it and just get the Bitmap "
							+ "of that screen. For example, say I just call HomeScreen and it calls Activity A,B,"
							+ "C and none of the Activities from A,B,C are displayed. It just gives the Bitmap of that screen by getDrawingCache(). And then we "
							+ "can display those bitmaps in Gallery view in HomeScreen. I hope I have explained the problem very clearly. Please let me know if this is actually "
							+ "possible. Regards Sunil I will try to explain what exactly I need to do. I have 3 separate screens say A,B,C. There is "
							+ "another screen called say HomeScreen where all the 3 screens bitmap should be displayed in Gallery view and the user can select in "
							+ "which view does he wants to go. I have been able to get the Bitmaps of all the 3 screens and display it in Gallery view by placing all "
							+ "the code in HomeScreen Activity only. Now, this has complicated the code a lot and I will like to simplify it. So, can I call another "
							+ "Activity from HomeScreen and do not display it and just get the Bitmap of that screen. For example, say I just call HomeScreen and "
							+ "it calls Activity A,B,C and none of the Activities from A,B,C are displayed. It just gives the Bitmap of that screen by getDrawingCache"
							+ "(). And then we can display those bitmaps in Gallery view in HomeScreen. I hope I have explained the problem very clearly. "
							+ "Please let me know if this is actually possible. Regards Sunil");
		}
		((ScrollView) findViewById(R.id.scrll)).scrollTo(0, 0);
		h = !h;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		System.gc();
		finish();
	}

	/**
	 * Set the current orientation to landscape. This will prevent the OS from
	 * changing the app's orientation.
	 */
	public void lockOrientationLandscape() {
		// lockOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	}

	/**
	 * Set the current orientation to portrait. This will prevent the OS from
	 * changing the app's orientation.
	 */
	public void lockOrientationPortrait() {
		// lockOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}

	/**
	 * Locks the orientation to a specific type. Possible values are:
	 * <ul>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_BEHIND}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_LANDSCAPE}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_NOSENSOR}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_PORTRAIT}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_SENSOR}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_UNSPECIFIED}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_USER}</li>
	 * </ul>
	 * 
	 * @param orientation
	 */
	public void lockOrientation(int orientation) {
		// setRequestedOrientation(orientation);
	}
}
