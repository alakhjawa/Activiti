/*
 * Copyright 2010-2020 Alfresco Software, Ltd.
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
package org.activiti.standalone.cfg;

import org.activiti.engine.ManagementService;

public class AttachmentQuery extends AttachmentQueryCriteria {

    private static final long serialVersionUID = 1L;

    // Private fields for filtering criteria
    private String attachmentId;
    private String attachmentName;
    private String attachmentType;
    private String userId;
    private String taskId;
    private String processInstanceId;

    public AttachmentQuery(ManagementService managementService) {
        super(managementService);
    }

    // Setter methods for setting filtering criteria
    public AttachmentQueryCriteria attachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    public AttachmentQueryCriteria attachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
        return this;
    }

    public AttachmentQueryCriteria attachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }

    public AttachmentQueryCriteria userId(String userId) {
        this.userId = userId;
        return this;
    }

    public AttachmentQueryCriteria taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public AttachmentQueryCriteria processInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

}
