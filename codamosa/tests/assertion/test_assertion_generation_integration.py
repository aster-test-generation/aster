#  This file is part of Pynguin.
#
#  SPDX-FileCopyrightText: 2019–2021 Pynguin Contributors
#
#  SPDX-License-Identifier: LGPL-3.0-or-later
#
import ast
import importlib

import pytest

import pynguin.assertion.assertiongenerator as ag
import pynguin.configuration as config
import pynguin.ga.testcasechromosome as tcc
import pynguin.ga.testsuitechromosome as tsc
import pynguin.testcase.testcase_to_ast as tc_to_ast
from pynguin.analyses.codedeserializer import deserialize_code_to_testcases
from pynguin.instrumentation.machinery import install_import_hook
from pynguin.setup.testclustergenerator import TestClusterGenerator
from pynguin.testcase.execution import ExecutionTracer, TestCaseExecutor


@pytest.mark.parametrize(
    "generator,expected_result",
    [
        (
            ag.AssertionGenerator,
            """str_0 = 'foo bar'
float_0 = 39.82
human_0 = module_0.Human(str_0, float_0)
assert human_0 is not None
assert module_0.static_state == 0
str_1 = human_0.get_name()
assert str_1 == 'foo bar'""",
        ),
        (
            ag.MutationAnalysisAssertionGenerator,
            """str_0 = 'foo bar'
float_0 = 39.82
human_0 = module_0.Human(str_0, float_0)
assert module_0.static_state == 0
str_1 = human_0.get_name()""",
        ),
    ],
)
def test_generate_mutation_assertions(generator, expected_result):
    config.configuration.module_name = "tests.fixtures.examples.assertions"
    module_name = config.configuration.module_name
    tracer = ExecutionTracer()
    with install_import_hook(module_name, tracer):
        # Need to force reload in order to apply instrumentation
        module = importlib.import_module(module_name)
        importlib.reload(module)

        executor = TestCaseExecutor(tracer)
        cluster = TestClusterGenerator(module_name).generate_cluster()
        testcases, _, _ = deserialize_code_to_testcases(
            """def test_case_0():
    str_0 = 'foo bar'
    float_0 = 39.82
    human_0 = module_0.Human(str_0, float_0)
    str_1 = human_0.get_name()
""",
            cluster,
        )

        test_case = testcases[0]

        chromosome = tcc.TestCaseChromosome(test_case)
        suite = tsc.TestSuiteChromosome()
        suite.add_test_case_chromosome(chromosome)

        gen = generator(executor)
        suite.accept(gen)

        visitor = tc_to_ast.TestCaseToAstVisitor()
        test_case.accept(visitor)
        source = ast.unparse(
            ast.fix_missing_locations(
                ast.Module(body=visitor.test_case_asts[0], type_ignores=[])
            )
        )
        assert source == expected_result
