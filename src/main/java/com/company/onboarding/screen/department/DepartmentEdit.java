package com.company.onboarding.screen.department;

import io.jmix.ui.screen.*;
import com.company.onboarding.entity.Department;


/**
 * todo Document type ${NAME}
 */

@UiController("Department.edit")
@UiDescriptor("department-edit.xml")
@EditedEntityContainer("departmentDc")
public class DepartmentEdit extends StandardEditor<Department> {
}