package IncludeExclude;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Categories.class)
//@Categories.IncludeCategory(IncludeExclude.SlowTests.class)
//@Suite.SuiteClasses( { IncludeExclude.A.class, IncludeExclude.B.class }) // Note that Categories is a kind of Suite
//public class IncludeExclude.SlowTestSuite {
//}


@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTests.class)
@Categories.ExcludeCategory(FastTests.class)
@Suite.SuiteClasses( { A.class, B.class })
public class SlowTestSuite {
    // Will run IncludeExclude.A.b, but not IncludeExclude.A.a or IncludeExclude.B.c
}