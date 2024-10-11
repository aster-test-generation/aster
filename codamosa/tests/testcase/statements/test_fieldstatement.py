#  This file is part of Pynguin.
#
#  SPDX-FileCopyrightText: 2019–2022 Pynguin Contributors
#
#  SPDX-License-Identifier: LGPL-3.0-or-later
#
from unittest.mock import MagicMock

import pynguin.configuration as config
import pynguin.testcase.defaulttestcase as dtc
import pynguin.testcase.statement as stmt
import pynguin.testcase.variablereference as vr
import pynguin.utils.generic.genericaccessibleobject as gao


def test_field_statement(test_case_mock, variable_reference_mock, field_mock):
    field_statement = stmt.FieldStatement(
        test_case_mock, field_mock, variable_reference_mock
    )
    assert field_statement.field == field_mock


def test_new_source(test_case_mock, variable_reference_mock, field_mock):
    statement = stmt.FieldStatement(test_case_mock, field_mock, variable_reference_mock)
    new_source = MagicMock(vr.VariableReference)
    statement.source = new_source
    assert statement.source == new_source


def test_accessible_object(test_case_mock, variable_reference_mock, field_mock):
    statement = stmt.FieldStatement(test_case_mock, field_mock, variable_reference_mock)
    assert statement.accessible_object() == field_mock


def test_field_statement_eq_same(test_case_mock, variable_reference_mock, field_mock):
    statement = stmt.FieldStatement(test_case_mock, field_mock, variable_reference_mock)
    assert statement.__eq__(statement)


def test_constructor_statement_accept(
    test_case_mock, variable_reference_mock, field_mock
):
    statement = stmt.FieldStatement(test_case_mock, field_mock, variable_reference_mock)
    visitor = MagicMock(stmt.StatementVisitor)
    statement.accept(visitor)

    visitor.visit_field_statement.assert_called_once_with(statement)


def test_get_var_references(test_case_mock, field_mock):
    var = vr.VariableReference(test_case_mock, int)
    statement = stmt.FieldStatement(test_case_mock, field_mock, var)
    assert statement.get_variable_references() == {var, statement.ret_val}


def test_statement_replace(field_mock, test_case_mock):
    ref = vr.VariableReference(test_case_mock, int)
    statement = stmt.FieldStatement(test_case_mock, field_mock, ref)
    new = vr.VariableReference(test_case_mock, int)

    statement.replace(ref, new)
    assert statement.source == new


def test_statement_replace_2(field_mock, test_case_mock):
    ref = vr.VariableReference(test_case_mock, int)
    statement = stmt.FieldStatement(test_case_mock, field_mock, ref)
    new = vr.VariableReference(test_case_mock, int)

    statement.replace(statement.ret_val, new)
    assert statement.ret_val == new


def test_statement_replace_3(field_mock, test_case_mock):
    ref = vr.VariableReference(test_case_mock, int)
    ref_2 = vr.FieldReference(ref, gao.GenericField(MagicMock, "foo", int))
    statement = stmt.FieldStatement(test_case_mock, field_mock, ref_2)
    new = vr.VariableReference(test_case_mock, int)

    statement.replace(ref, new)
    assert statement.source.get_variable_reference() == new


def test_primitive_statement_replace_ignore(field_mock):
    test_case = dtc.DefaultTestCase()
    ref = stmt.IntPrimitiveStatement(test_case, 5)
    statement = stmt.FieldStatement(test_case, field_mock, ref.ret_val)
    new = stmt.FloatPrimitiveStatement(test_case, 0).ret_val
    old = statement.source
    statement.replace(new, new)
    assert statement.source == old


def test_field_statement_eq_other_type(
    test_case_mock, variable_reference_mock, field_mock
):
    statement = stmt.FieldStatement(test_case_mock, field_mock, variable_reference_mock)
    assert not statement.structural_eq(variable_reference_mock, {})


def test_field_statement_eq_clone(test_case_mock, field_mock):
    ref = vr.VariableReference(test_case_mock, float)
    statement = stmt.FieldStatement(test_case_mock, field_mock, ref)
    memo = {ref: ref}
    clone = statement.clone(test_case_mock, memo)
    memo[statement.ret_val] = clone.ret_val
    assert statement.structural_eq(clone, memo)


def test_hash_same(test_case_mock, variable_reference_mock, field_mock):
    statement = stmt.FieldStatement(test_case_mock, field_mock, variable_reference_mock)
    statement2 = stmt.FieldStatement(
        test_case_mock, field_mock, variable_reference_mock
    )
    assert statement.structural_hash() == statement2.structural_hash()


def test_mutate_not(test_case_mock, field_mock, variable_reference_mock):
    config.configuration.search_algorithm.change_parameter_probability = 0.0
    statement = stmt.FieldStatement(test_case_mock, field_mock, variable_reference_mock)
    assert not statement.mutate()


def test_mutate_no_replacements(field_mock, constructor_mock):
    config.configuration.search_algorithm.change_parameter_probability = 1.0
    test_case = dtc.DefaultTestCase()
    const = stmt.ConstructorStatement(test_case, constructor_mock)
    field = stmt.FieldStatement(test_case, field_mock, const.ret_val)
    test_case.add_statement(const)
    test_case.add_statement(field)
    assert not field.mutate()


def test_mutate_success(field_mock, constructor_mock):
    config.configuration.search_algorithm.change_parameter_probability = 1.0
    test_case = dtc.DefaultTestCase()
    const = stmt.ConstructorStatement(test_case, constructor_mock)
    const2 = stmt.ConstructorStatement(test_case, constructor_mock)
    field = stmt.FieldStatement(test_case, field_mock, const.ret_val)
    const3 = stmt.ConstructorStatement(test_case, constructor_mock)
    test_case.add_statement(const)
    test_case.add_statement(const2)
    test_case.add_statement(field)
    test_case.add_statement(const3)
    assert field.mutate()
    assert field.source == const2.ret_val
