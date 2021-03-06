package org.divy.sonar.hybris.java.checks;

import org.sonar.java.checks.verifier.JavaCheckVerifier; // Compliant
import de.hybris.platform.servicelayer.product.ProductDao; // Noncompliant {{Refactor Controller to use facade instead of dao directly}}
public class DaoUsageTestSampleController {

    ProductDao classMemberDao; // Noncompliant {{Refactor Controller to use facade instead of dao directly}}

    void nonCompliantMethod() {
        ProductDao localDao; // Noncompliant {{Refactor Controller to use facade instead of dao directly}}
    }

    void compliantMethod() {
    }
}
