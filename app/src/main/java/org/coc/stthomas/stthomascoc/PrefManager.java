package org.coc.stthomas.stthomascoc;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by ${Abanoub} on 11/9/2016.
 */

public class PrefManager {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context _context;

    //Shared Pref Mode
    int PRIVATE_MODE = 0;

    //Shared Preferences file name
    private static final String PREF_NAME = "welcome";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager (Context context){
        this._context = context;
        preferences = _context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor = preferences.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFIRSTTIMELAUNCH(){
        return preferences.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

}
