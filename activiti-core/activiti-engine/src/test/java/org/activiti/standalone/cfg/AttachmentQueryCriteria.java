package org.activiti.standalone.cfg;

import org.activiti.engine.ManagementService;
import org.activiti.engine.impl.AbstractQuery;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.task.Attachment;

import java.util.List;

public class AttachmentQueryCriteria extends AbstractQuery<AttachmentQueryCriteria, Attachment> {
    public AttachmentQueryCriteria(ManagementService managementService) {
        super(managementService);
    }

    // Methods for setting order criteria
    public AttachmentQueryCriteria orderByAttachmentId() {
        return orderBy(AttachmentQueryProperty.ATTACHMENT_ID);
    }

    public AttachmentQueryCriteria orderByAttachmentName() {
        return orderBy(AttachmentQueryProperty.NAME);
    }

    public AttachmentQueryCriteria orderByAttachmentCreateTime() {
        return orderBy(AttachmentQueryProperty.CREATE_TIME);
    }

    @Override
    public long executeCount(CommandContext commandContext) {
        return (Long) commandContext.getDbSqlSession().selectOne("selectAttachmentCountByQueryCriteria", this);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Attachment> executeList(CommandContext commandContext, Page page) {
        return commandContext.getDbSqlSession().selectList("selectAttachmentByQueryCriteria", this);
    }
}
