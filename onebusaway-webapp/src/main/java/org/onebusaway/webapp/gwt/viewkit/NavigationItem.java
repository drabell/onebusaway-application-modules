/**
 * Copyright (C) 2011 Brian Ferris <bdferris@onebusaway.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.webapp.gwt.viewkit;

public class NavigationItem {

  private String id;

  private String title;

  private BarButtonItem leftBarButtonItem;

  private BarButtonItem rightBarButtonItem;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BarButtonItem getLeftBarButtonItem() {
    return leftBarButtonItem;
  }

  public void setLeftBarButtonItem(BarButtonItem leftBarButtonItem) {
    this.leftBarButtonItem = leftBarButtonItem;
  }

  public BarButtonItem getRightBarButtonItem() {
    return rightBarButtonItem;
  }

  public void setRightBarButtonItem(BarButtonItem rightBarButtonItem) {
    this.rightBarButtonItem = rightBarButtonItem;
  }
}