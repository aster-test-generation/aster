import sys
from enum import Enum

"""
Common Constants
"""

TEST_PREFIX = 'ASTER_'
TEST_SUFFIX = "_Test"
PASSING_TEST_SUFFIX = "_Test_Passing"
FAILING_TEST_SUFFIX = "_Test_Failing"
COVERAGE_TEST_INFIX = "_Coverage_"


# evaluation-related constants and enums
EVOSUITE_TEST_SUFFIX = '_ES'
EVALUATE_OUTPUT_DIR = "output_evaluate"
NATURALNESS_FILE_SUFFIX = "_naturalness"


class GeneratedType(str, Enum):
    aster = "aster"
    evosuite = "evosuite"
    developers = "developers"
    aster_vs_dev = "aster_vs_dev"
    all = "all"
