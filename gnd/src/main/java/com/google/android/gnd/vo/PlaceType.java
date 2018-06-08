/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gnd.vo;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;

@AutoValue
public abstract class PlaceType {
  public abstract String getId();

  public abstract String getListHeading();

  public abstract String getItemLabel();

  public abstract String getIconId();

  public abstract String getIconColor();

  public abstract ImmutableList<Form> getFormsList();

  public abstract Timestamps getServerTimestamps();

  public abstract Timestamps getClientTimestamps();

  public static Builder newBuilder() {
    return new AutoValue_PlaceType.Builder()
      .setServerTimestamps(Timestamps.getDefaultInstance())
      .setClientTimestamps(Timestamps.getDefaultInstance());
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setId(String newId);

    public abstract Builder setListHeading(String newListHeading);

    public abstract Builder setItemLabel(String newItemLabel);

    public abstract Builder setIconId(String newIconId);

    public abstract Builder setIconColor(String newIconColor);

    public abstract Builder setFormsList(ImmutableList<Form> newFormsList);

    public abstract Builder setServerTimestamps(Timestamps newServerTimestamps);

    public abstract Builder setClientTimestamps(Timestamps newClientTimestamps);

    public abstract PlaceType build();
  }
}