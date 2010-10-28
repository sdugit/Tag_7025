/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.apps.tag.record;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * TODO: come up with a better name.
 */
public abstract class ParsedNdefRecord {

    /**
     * Returns a view to display this record.
     */
    public abstract View getView(Activity activity, LayoutInflater inflater, ViewGroup parent,
            int offset);

    // TODO: make abstract.
    /**
     * Returns a {@link RecordEditInfo} for editing this record.
     */
    public RecordEditInfo getEditInfo(Activity activity) {
        return null;
    }
}
