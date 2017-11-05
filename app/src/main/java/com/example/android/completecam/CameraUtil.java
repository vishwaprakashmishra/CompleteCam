package com.example.android.completecam;

import android.hardware.Camera;
import android.media.MediaRecorder;
import android.util.Log;

/**
 * This class contains all the utility function for handling common tasks for all the class
 * Created by vishwaprakashdec1995@gmail.com on 11/5/2017.
 */

public class CameraUtil {
    // storing final class name for logging the debug info's.
    public static final String LOG_TAG = CameraUtil.class.getSimpleName();
    public static boolean mOpened = false;
    public static Camera mCamera;
    private MediaRecorder mPreview;

    public boolean safeCameraOpen(int id){
         mOpened = false ;
         boolean qOpened = false;
         try{
             releaseCameraAndPreview();
             mCamera = Camera.open(id);
             qOpened = (mCamera  != null);
         } catch (Exception e ) {
             Log.e(LOG_TAG , "failed to open Camera");
         }
         mOpened = qOpened;
         return qOpened;
    }

    /**
     * releases the preview of camera
     */
    private void releaseCameraAndPreview() {
        mPreview.setCamera(null);
        if( mCamera != null) {
            mCamera.release();
            mCamera = null;
        }
    }
}
