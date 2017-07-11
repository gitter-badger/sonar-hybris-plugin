/*
 * SonarQube Java Custom Rules Example
 * Copyright (C) 2016-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.divy.sonar.hybris.java;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.sonar.plugins.java.api.JavaCheck;
import org.divy.sonar.hybris.java.samples.checks.AvoidAnnotationRule;
import org.divy.sonar.hybris.java.samples.checks.AvoidBrandInMethodNamesRule;
import org.divy.sonar.hybris.java.samples.checks.AvoidMethodDeclarationRule;
import org.divy.sonar.hybris.java.samples.checks.AvoidSuperClassRule;
import org.divy.sonar.hybris.java.samples.checks.AvoidUnmodifiableListRule;
import org.divy.sonar.hybris.java.samples.checks.MyCustomSubscriptionRule;
import org.divy.sonar.hybris.java.samples.checks.SecurityAnnotationMandatoryRule;
import org.divy.sonar.hybris.java.samples.checks.SpringControllerRequestMappingEntityRule;

public final class RulesList {

  private RulesList() {
  }

  public static List<Class> getChecks() {
    return ImmutableList.<Class>builder().addAll(getJavaChecks()).addAll(getJavaTestChecks()).build();
  }

  public static List<Class<? extends JavaCheck>> getJavaChecks() {
    return ImmutableList.<Class<? extends JavaCheck>>builder()
      .add(SpringControllerRequestMappingEntityRule.class)
      .add(AvoidAnnotationRule.class)
      .add(AvoidBrandInMethodNamesRule.class)
      .add(AvoidMethodDeclarationRule.class)
      .add(AvoidSuperClassRule.class)
      .add(AvoidUnmodifiableListRule.class)
      .add(MyCustomSubscriptionRule.class)
      .add(SecurityAnnotationMandatoryRule.class)
      .build();
  }

  public static List<Class<? extends JavaCheck>> getJavaTestChecks() {
    return ImmutableList.<Class<? extends JavaCheck>>builder()
      .build();
  }
}
