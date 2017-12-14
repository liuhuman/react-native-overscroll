package com.tato.lib.overscroll;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.SizeMonitoringFrameLayout;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

/**
 * Created by eagleliu on 2017/12/13.
 */
public class ReactOverScroll extends SizeMonitoringFrameLayout {
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

        if (child instanceof ScrollView) {
            OverScrollDecoratorHelper.setUpOverScroll((ScrollView)child);
        }

        super.addView(child, index);
    }
}
