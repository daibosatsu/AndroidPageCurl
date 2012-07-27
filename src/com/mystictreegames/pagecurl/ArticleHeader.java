package com.mystictreegames.pagecurl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class ArticleHeader extends LinearLayout {

	public ArticleHeader(Context context) {
		super(context);
		init(context);
	}

	public ArticleHeader(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);
		init(context);
	}

	private void init(final Context context) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.article_header, this);
	}
}
