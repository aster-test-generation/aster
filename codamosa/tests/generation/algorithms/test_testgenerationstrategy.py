#  This file is part of Pynguin.
#
#  SPDX-FileCopyrightText: 2019–2020 Pynguin Contributors
#
#  SPDX-License-Identifier: LGPL-3.0-or-later
#
from unittest.mock import MagicMock

from pynguin.ga import chromosome as chrom
from pynguin.generation.algorithms.testgenerationstrategy import TestGenerationStrategy
from pynguin.generation.stoppingconditions.stoppingcondition import (
    MaxStatementExecutionsStoppingCondition,
)


class DummyTestStrategy(TestGenerationStrategy):
    def generate_tests(self) -> chrom.Chromosome:
        pass  # pragma: no cover


def test_progress():
    strategy = DummyTestStrategy()
    stopping = MaxStatementExecutionsStoppingCondition(100)
    stopping.set_limit(10)
    stopping.after_statement_execution(None, None)
    strategy.stopping_conditions = [stopping]
    assert strategy.progress() == 0.1


def test_add_search_observer():
    strategy = DummyTestStrategy()
    obs = MagicMock()
    strategy.add_search_observer(obs)
    assert strategy._search_observers == [obs]
