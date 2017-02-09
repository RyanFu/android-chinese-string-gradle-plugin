/*
 * Copyright 2017 Hippo Seven
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

package com.hippo.androidchinesestring;

/*
 * Created by Hippo on 2/9/2017.
 */

import java.io.IOException;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class AndroidChineseStringTask extends DefaultTask {

  @TaskAction
  public void convert() throws IOException {
    AndroidChineseStringExtension extension =
        getProject().getExtensions().findByType(AndroidChineseStringExtension.class);
    if (extension == null) {
      extension = new AndroidChineseStringExtension();
    }

    new AndroidChineseStringConverter(getProject(), extension).convert();
  }
}
