---
title: Code Review Defect List
---

| Reviewer: \_____Dillon O’Brien____\_ | GH Repo: https://github.com/DillonOBrien/dmobrie3-SER316/tree/Review |                                                                       |              |              |
|--------------------------------------|----------------------------------------------------------------------|-----------------------------------------------------------------------|--------------|--------------|
|                                      |                                                                      |                                                                       |              |              |
|                                      |                                                                      |                                                                       |              |              |
| **ID \#**                            | **Location**                                                         | **Problem Description**                                               | Problem      |              |
|                                      | **File and Line Number**                                             |                                                                       | **Category** | **Severity** |
| 1                                    | Cart.javaLine : 8                                                    | Protected int only accessible within classes in the same package      | FD           | MJ           |
| 2                                    | Cart.javaLine : 8                                                    | Methods that aren’t public should be prefixed by a leading underscore | CG           | MJ           |
| 3                                    | Cart.javaLine: 67                                                    | Missing {} unlike previous if statements                              | CG           | LOW          |
| 4                                    | Cart.javaLine: 50                                                    | Strings are being compared using == and not .equals                   | FD           | MJ           |
| 5                                    | Produce.javaLine: 6                                                  | Class doesn’t implement the 3 for \$5                                 | CS           | MJ           |
| 6                                    | Product.javaLine: 2                                                  | Java class does not have a header                                     | FD           | LOW          |
| 7                                    | Cart.javaLine : 41                                                   | The variable produce_counter should be in camelCase                   | CG           | LOW          |
|                                      |                                                                      |                                                                       |              |              |
|                                      |                                                                      |                                                                       |              |              |
|                                      |                                                                      |                                                                       |              |              |
|                                      |                                                                      |                                                                       |              |              |
|                                      |                                                                      |                                                                       |              |              |
|                                      |                                                                      |                                                                       |              |              |
|                                      |                                                                      |                                                                       |              |              |

>   *Category*: **CS –** Code Smell defect**. CG –** Violation of a coding
>   guideline. Provide the guideline number. **FD** – Functional defect. Code
>   will not produce the expected result. **MD –** Miscellaneous defect, for all
>   other defects.

>   *Severity*: **BR** - Blocker, must be fixed asap. **MJ** – Major, of high
>   importance but not a Blocker **LOW** – Low.
