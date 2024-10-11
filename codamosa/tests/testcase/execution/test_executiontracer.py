#  This file is part of Pynguin.
#
#  SPDX-FileCopyrightText: 2019–2022 Pynguin Contributors
#
#  SPDX-License-Identifier: LGPL-3.0-or-later
#
import threading
from math import inf
from unittest.mock import MagicMock

import pytest
from bytecode import Compare

from pynguin.testcase.execution import CodeObjectMetaData, ExecutionTracer, _le, _lt


def test_functions_exists():
    tracer = ExecutionTracer()
    assert tracer.register_code_object(MagicMock(CodeObjectMetaData)) == 0
    assert tracer.register_code_object(MagicMock(CodeObjectMetaData)) == 1
    assert 0 in tracer.get_known_data().existing_code_objects


def test_entered_function():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_code_object(MagicMock(CodeObjectMetaData))
    tracer.executed_code_object(0)
    assert 0 in tracer.get_trace().executed_code_objects


def test_predicate_exists():
    tracer = ExecutionTracer()
    assert tracer.register_predicate(MagicMock(code_object_id=0)) == 0
    assert tracer.register_predicate(MagicMock(code_object_id=0)) == 1
    assert 0 in tracer.get_known_data().existing_predicates


def test_line_registration():
    tracer = ExecutionTracer()
    assert tracer.register_line(0, "foo", 42) == 0
    assert tracer.register_line(0, "foo", 43) == 1
    assert tracer.register_line(0, "bar", 42) == 2
    assert tracer.register_line(1, "foo", 42) == 0
    assert {0, 1, 2} == tracer.get_known_data().existing_lines.keys()


def test_line_visit():
    tracer = ExecutionTracer()
    tracer.track_line_visit(42)
    tracer.track_line_visit(43)
    tracer.track_line_visit(42)
    assert tracer._trace.covered_line_ids == {42, 43}


def test_update_metrics_covered():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    tracer.executed_compare_predicate(1, 0, 0, Compare.EQ)
    tracer.executed_compare_predicate(1, 0, 0, Compare.EQ)
    assert (0, 2) in tracer.get_trace().executed_predicates.items()


@pytest.mark.parametrize("true_dist,false_dist", [(-1, 0), (0, -1), (0, 0), (1, 1)])
def test_update_metrics_assertions(true_dist, false_dist):
    tracer = ExecutionTracer()
    tracer.register_predicate(MagicMock(code_object_id=0))
    with pytest.raises(AssertionError):
        tracer._update_metrics(false_dist, true_dist, 0)


def test_update_metrics_true_dist_min():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    tracer.executed_compare_predicate(5, 0, 0, Compare.EQ)
    assert (0, 5) in tracer.get_trace().true_distances.items()
    tracer.executed_compare_predicate(4, 0, 0, Compare.EQ)
    assert (0, 4) in tracer.get_trace().true_distances.items()


def test_update_metrics_false_dist_min():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    tracer.executed_compare_predicate(3, 1, 0, Compare.NE)
    assert (0, 2) in tracer.get_trace().false_distances.items()
    tracer.executed_compare_predicate(2, 1, 0, Compare.NE)
    assert (0, 1) in tracer.get_trace().false_distances.items()


def test_passed_cmp_predicate():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    tracer.executed_compare_predicate(1, 0, 0, Compare.EQ)
    assert (0, 1) in tracer.get_trace().executed_predicates.items()


def test_passed_exception_match():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    tracer.executed_exception_match(ValueError(), ValueError, 0)
    assert (0, 1) in tracer.get_trace().executed_predicates.items()
    assert (0, 0.0) in tracer.get_trace().true_distances.items()
    assert (0, 1.0) in tracer.get_trace().false_distances.items()


def test_passed_exception_match_not():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    tracer.executed_exception_match(NameError(), ValueError, 0)
    assert (0, 1) in tracer.get_trace().executed_predicates.items()
    assert (0, 1.0) in tracer.get_trace().true_distances.items()
    assert (0, 0.0) in tracer.get_trace().false_distances.items()


@pytest.mark.parametrize(
    "cmp,val1,val2,true_dist,false_dist",
    [
        pytest.param(Compare.EQ, 5, 0, 5, 0),
        pytest.param(Compare.EQ, 0, 0, 0, 1),
        pytest.param(Compare.EQ, "string", 0, inf, 0),
        pytest.param(Compare.EQ, "abc", "cde", 3, 0),
        pytest.param(Compare.EQ, bytes(range(3)), bytes(range(4, 6)), 3, 0),
        pytest.param(Compare.EQ, bytes(range(3)), bytes(range(3)), 0, 1),
        pytest.param(
            Compare.EQ, bytearray(bytes(range(3))), bytearray(bytes(range(4, 6))), 3, 0
        ),
        pytest.param(
            Compare.EQ, bytearray(bytes(range(3))), bytearray(bytes(range(3))), 0, 1
        ),
        pytest.param(Compare.NE, 5, 0, 0, 5),
        pytest.param(Compare.NE, 0, 0, 1, 0),
        pytest.param(Compare.NE, "string", 0, 0, inf),
        pytest.param(Compare.NE, "abc", "cde", 0, 3),
        pytest.param(Compare.LT, 5, 0, 6, 0),
        pytest.param(Compare.LT, 0, 5, 0, 6),
        pytest.param(Compare.LE, 5, 0, 6, 0),
        pytest.param(Compare.LE, 0, 5, 0, 6),
        pytest.param(Compare.GT, 5, 0, 0, 6),
        pytest.param(Compare.GT, 0, 5, 6, 0),
        pytest.param(Compare.GE, 5, 0, 0, 6),
        pytest.param(Compare.GE, 0, 5, 6, 0),
        pytest.param(Compare.IN, 0, [0], 0, 1),
        pytest.param(Compare.IN, 0, [1], 1, 0),
        pytest.param(Compare.IN, 0, [], inf, 0),
        pytest.param(Compare.IN, 0, (5,), 5, 0),
        pytest.param(Compare.IN, 5, (28, 42, -12), 17, 0),
        pytest.param(Compare.IN, "a", ("bba", "nope", "aa"), 1, 0),
        pytest.param(Compare.IN, object(), (object(), object()), inf, 0),
        pytest.param(Compare.NOT_IN, 0, [0], 1, 0),
        pytest.param(Compare.NOT_IN, 0, [1], 0, 1),
        pytest.param(Compare.IS, 0, 0, 0, 1),
        pytest.param(Compare.IS, 0, 1, 1, 0),
        pytest.param(Compare.IS_NOT, 0, 0, 1, 0),
        pytest.param(Compare.IS_NOT, 0, 1, 0, 1),
    ],
)
def test_cmp(cmp, val1, val2, true_dist, false_dist):
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    tracer.executed_compare_predicate(val1, val2, 0, cmp)
    assert (0, true_dist) in tracer.get_trace().true_distances.items()
    assert (0, false_dist) in tracer.get_trace().false_distances.items()


def test_unknown_comp():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    with pytest.raises(Exception):
        tracer.executed_compare_predicate(1, 1, 0, Compare.EXC_MATCH)


def test_passed_bool_predicate():
    tracer = ExecutionTracer()
    tracer.register_predicate(MagicMock(code_object_id=0))
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.executed_bool_predicate(True, 0)
    assert (0, 1) in tracer.get_trace().executed_predicates.items()


def test_bool_distance_true():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    tracer.executed_bool_predicate(True, 0)
    assert (0, 0.0) in tracer.get_trace().true_distances.items()
    assert (0, 1.0) in tracer.get_trace().false_distances.items()


def test_bool_distance_false():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    tracer.executed_bool_predicate(False, 0)
    assert (0, 1.0) in tracer.get_trace().true_distances.items()
    assert (0, 0.0) in tracer.get_trace().false_distances.items()


def test_clear():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_code_object(MagicMock(CodeObjectMetaData))
    tracer.executed_code_object(0)
    trace = tracer.get_trace()
    tracer.clear_trace()
    assert tracer.get_trace() != trace


def test_enable_disable_cmp():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    assert len(tracer.get_trace().executed_predicates) == 0

    tracer.disable()
    tracer.executed_compare_predicate(0, 0, 0, Compare.EQ)
    assert len(tracer.get_trace().executed_predicates) == 0

    tracer.enable()
    tracer.executed_compare_predicate(0, 0, 0, Compare.EQ)
    assert len(tracer.get_trace().executed_predicates) == 1


def test_enable_disable_bool():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_predicate(MagicMock(code_object_id=0))
    assert len(tracer.get_trace().executed_predicates) == 0

    tracer.disable()
    tracer.executed_bool_predicate(True, 0)
    assert len(tracer.get_trace().executed_predicates) == 0

    tracer.enable()
    tracer.executed_bool_predicate(True, 0)
    assert len(tracer.get_trace().executed_predicates) == 1


@pytest.mark.parametrize("val1,val2,result", [(1, 1, 0), (2, 1, 2), ("c", "b", inf)])
def test_le(val1, val2, result):
    assert _le(val1, val2) == result


@pytest.mark.parametrize("val1,val2,result", [(0, 1, 0), (1, 1, 1), ("b", "b", inf)])
def test_lt(val1, val2, result):
    assert _lt(val1, val2) == result


def test_default_branchless_code_object():
    tracer = ExecutionTracer()
    tracer.register_code_object(MagicMock())
    assert tracer.get_known_data().branch_less_code_objects == {0}


def test_no_branchless_code_object():
    tracer = ExecutionTracer()
    tracer.register_code_object(MagicMock())
    tracer.register_predicate(MagicMock(code_object_id=0))
    assert len(tracer.get_known_data().branch_less_code_objects) == 0


def test_no_branchless_code_object_register_multiple():
    tracer = ExecutionTracer()
    tracer.register_code_object(MagicMock())
    tracer.register_code_object(MagicMock())
    tracer.register_predicate(MagicMock(code_object_id=0))
    tracer.register_predicate(MagicMock(code_object_id=0))
    assert tracer.get_known_data().branch_less_code_objects == {1}


def test_code_object_executed_other_thread():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_code_object(MagicMock())
    thread = threading.Thread(target=tracer.executed_code_object, args=(0,))
    thread.start()
    thread.join()
    assert tracer.get_trace().executed_code_objects == set()


def test_bool_predicate_executed_other_thread():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_code_object(MagicMock())
    tracer.register_code_object(MagicMock(code_object_id=0))
    thread = threading.Thread(target=tracer.executed_bool_predicate, args=(True, 0))
    thread.start()
    thread.join()
    assert tracer.get_trace().executed_predicates == {}


def test_compare_predicate_executed_other_thread():
    tracer = ExecutionTracer()
    tracer.current_thread_identifier = threading.current_thread().ident
    tracer.register_code_object(MagicMock())
    tracer.register_code_object(MagicMock(code_object_id=0))
    thread = threading.Thread(
        target=tracer.executed_compare_predicate, args=(True, False, Compare.EQ, 0)
    )
    thread.start()
    thread.join()
    assert tracer.get_trace().executed_predicates == {}
