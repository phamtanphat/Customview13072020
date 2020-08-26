package com.example.customview13072020;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class TextViewCircle extends LinearLayout {
    // Khai bao view
    TextView mTvTitle;
    ImageView mImgIcon;
    // Khai bao kieu du lieu cho thuoc tinh
    String mTextTitle;
    Integer mDrawableIcon;
    public TextViewCircle(Context context) {
        super(context);
    }

    public TextViewCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public TextViewCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    private void init(Context context , AttributeSet attributeSet){
        if (context != null && attributeSet != null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = layoutInflater.inflate(R.layout.layout_title_circle_color,this,true);
            TypedArray typedArray = context.obtainStyledAttributes(attributeSet,R.styleable.TextViewCircle);
            mTextTitle = typedArray.getString(R.styleable.TextViewCircle_textTitle);
            mDrawableIcon = typedArray.getResourceId(R.styleable.TextViewCircle_icon,R.mipmap.ic_launcher);
        }
    }
}
