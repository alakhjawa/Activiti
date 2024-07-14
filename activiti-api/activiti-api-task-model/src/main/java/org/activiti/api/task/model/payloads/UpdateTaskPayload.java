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
package org.activiti.api.task.model.payloads;

import java.util.Date;
import java.util.UUID;

import org.activiti.api.model.shared.Payload;

public class UpdateTaskPayload implements Payload {

    private String id;
    private String taskId;
    private String name;
    private String description;
    private Date dueDate;
    private Integer priority;
    private String assignee;
    private String parentTaskId;
    private String formKey;

    private UpdateTaskPayload(Builder builder) {
        this.id = builder.id;
        this.taskId = builder.taskId;
        this.name = builder.name;
        this.description = builder.description;
        this.dueDate = builder.dueDate;
        this.priority = builder.priority;
        this.assignee = builder.assignee;
        this.parentTaskId = builder.parentTaskId;
        this.formKey = builder.formKey;
    }

    public static class Builder {
        private String id = UUID.randomUUID().toString();
        private String taskId;
        private String name;
        private String description;
        private Date dueDate;
        private Integer priority;
        private String assignee;
        private String parentTaskId;
        private String formKey;

        public Builder(String taskId) {
            this.taskId = taskId;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder dueDate(Date dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder assignee(String assignee) {
            this.assignee = assignee;
            return this;
        }

        public Builder parentTaskId(String parentTaskId) {
            this.parentTaskId = parentTaskId;
            return this;
        }

        public Builder formKey(String formKey) {
            this.formKey = formKey;
            return this;
        }

        public UpdateTaskPayload build() {
            return new UpdateTaskPayload(this);
        }
    }

    @Override
    public String getId() {
        return id;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getParentTaskId() {
        return parentTaskId;
    }

    public String getFormKey() {
        return formKey;
    }
}
