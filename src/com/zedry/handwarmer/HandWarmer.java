/*
 * Copyright 2010 Mark Brady
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zedry.handwarmer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/***
 * This activity will bring the user straight to the Android Market page for the
 * given application and remove itself from the current task.
 */
public class HandWarmer extends Activity {

    /** Application Market URL (direct, not via search). **/
    private static final Uri TARGET_URI = Uri.parse(
            "market://details?id=com.zedry.handwarmer");

    /***
     * Takes the user to the Android Market, pointing to the target application
     * URI.
     *
     * @param savedInstanceState Unused Activity state information.
     */
    @Override
    public final void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        /**
         * Add a FLAG_ACTIVITY_NEW_TASK to bring the Market Activity to the top
         * of the Activity Stack.
         */
        startActivity(new Intent(Intent.ACTION_VIEW, TARGET_URI)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
        finish();
    }
}