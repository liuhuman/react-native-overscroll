package com.tato.lib.overscroll;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ScrollView;

import com.facebook.react.uimanager.SizeMonitoringFrameLayout;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

/**
 * Created by eagleliu on 2017/12/13.
 */
public class ReactOverScroll extends SizeMonitoringFrameLayout {
    private boolean mBounce = false;

    public ReactOverScroll(Context context) {
        super(context);
    }

    public ReactOverScroll(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ReactOverScroll(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void addView(View child, int index) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ReactOverScroll can host only one direct child");
        }
        super.addView(child, index);

        if (mBounce) {
            setUpOverScroll(child);
        }
    }

    private void setUpOverScroll (View child) {
        if (child != null) {
            if (child instanceof ScrollView) {
                OverScrollDecoratorHelper.setUpOverScroll((ScrollView)child);
            } else if (child instanceof HorizontalScrollView) {
                OverScrollDecoratorHelper.setUpOverScroll((HorizontalScrollView)child);
            } else if (child instanceof ListView) {
                OverScrollDecoratorHelper.setUpOverScroll((ListView)child);
            } else if (child instanceof ViewPager) {
                OverScrollDecoratorHelper.setUpOverScroll((ViewPager)child);
            } else {
                OverScrollDecoratorHelper.setUpStaticOverScroll(child, OverScrollDecoratorHelper.ORIENTATION_VERTICAL);
            }
        }
    }

    public void setBounce (boolean bounce) {
        mBounce = bounce;
        if (bounce) {
            setUpOverScroll(getChildAt(0));
        }
    }
}
