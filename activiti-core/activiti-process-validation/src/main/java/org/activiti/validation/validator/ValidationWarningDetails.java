package org.activiti.validation.validator;

import org.activiti.bpmn.model.BaseElement;
import org.activiti.bpmn.model.Process;
import org.activiti.validation.ValidationError;

import java.util.List;

public record ValidationWarningDetails(List<ValidationError> validationErrors, String problem, Process process,
                                       BaseElement baseElement, String description) {
}
