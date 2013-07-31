package com.example.net.coscolla.camerabooth;

import android.app.Activity;
import android.opengl.GLSurfaceView;

public class MyGLSurfaceView extends GLSurfaceView {

	   MyGL20Renderer renderer;
	    public MyGLSurfaceView(Activity context)
	    {
	        super(context);

	        setEGLContextClientVersion(2);

	        renderer = new MyGL20Renderer((MainActivity)context);
	        setRenderer(renderer);
	        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);

	    }
	    public MyGL20Renderer getRenderer()
	    {
	        return renderer;
	    }
}
