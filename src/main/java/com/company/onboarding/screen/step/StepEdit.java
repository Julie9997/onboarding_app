package com.company.onboarding.screen.step;

import io.jmix.ui.screen.*;
import com.company.onboarding.entity.Step;


/**
 * todo Document type ${NAME}
 */

@UiController("Step.edit")
@UiDescriptor("step-edit.xml")
@EditedEntityContainer("stepDc")
public class StepEdit extends StandardEditor<Step> {
}