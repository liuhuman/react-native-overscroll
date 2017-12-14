package com.tato.lib.overscroll;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

/**
 * Created by eagleliu on 2017/12/13.
 */
public class ReactOverScrollManager extends ViewGroupManager<ReactOverScroll> {
    private static final String REACT_CLASS = "OverScroll";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected ReactOverScroll createViewInstance(ThemedReactContext reactContext) {
        return new ReactOverScroll(reactContext);
    }
}
