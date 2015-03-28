/*
 * Copyright (C) 2015 Roberto Estivill
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

package yts.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class UpcomingMovie {

    @SerializedName("imdb_code")
    public String imdbCode;

    @SerializedName("title")
    public String title;

    @SerializedName("year")
    public Integer year;

    @SerializedName("medium_cover_image")
    public String mediumCoverUrl;

    @SerializedName("date_added")
    public Date dateAdded;

    @SerializedName("date_added_unix")
    public Long dateAddedUnix;
}