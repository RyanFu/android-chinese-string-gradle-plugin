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

package com.hippo.androidchinesestring

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.assertTrue

/*
 * Created by Hippo on 2/9/2017.
 */

class AndroidChineseStringTaskTest {

    @Test
    void testAddTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        def task = project.task('convertBetweenChinese', type: AndroidChineseStringTask)
        assertTrue(task instanceof AndroidChineseStringTask)
    }
}
