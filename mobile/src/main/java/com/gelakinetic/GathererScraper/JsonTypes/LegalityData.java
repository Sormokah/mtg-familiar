/*
 * Copyright 2017 Adam Feinstein
 *
 * This file is part of MTG Familiar.
 *
 * MTG Familiar is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MTG Familiar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MTG Familiar.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.gelakinetic.GathererScraper.JsonTypes;

import java.util.ArrayList;

public class LegalityData {

    public Format mFormats[];
    public long mTimestamp;

    public class Format {
        public String mName;
        public final ArrayList<String> mSets = new ArrayList<>();
        public final ArrayList<String> mRestrictedlist = new ArrayList<>();
        public final ArrayList<String> mBanlist = new ArrayList<>();
    }
}

