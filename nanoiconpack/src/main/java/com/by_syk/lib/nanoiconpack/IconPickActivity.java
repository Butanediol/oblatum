/*
 * Copyright 2017 By_syk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.by_syk.lib.nanoiconpack;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.by_syk.lib.nanoiconpack.fragment.IconsFragment;
import com.by_syk.lib.nanoiconpack.util.AllIconsGetter;

/**
 * Created by By_syk on 2017-01-30.
 */

public class IconPickActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_pick);

        init();
    }

    private void init() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        IconsFragment fragment = IconsFragment.newInstance(0, new AllIconsGetter(),
                getResources().getInteger(R.integer.picker_grid_item_mode));
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_content, fragment)
                .commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
