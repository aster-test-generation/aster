# Automatically generated by Pynguin.
import typed_ast._ast3 as module_0
import py_backwards.transformers.super_without_arguments as module_1
import typed_ast.ast3 as module_2

def test_case_0():
    try:
        call_0 = module_0.Call()
        a_s_t_0 = module_0.AST()
        super_without_arguments_transformer_0 = module_1.SuperWithoutArgumentsTransformer(a_s_t_0)
        call_1 = super_without_arguments_transformer_0.visit_Call(call_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'class A(object):\n    def m1(self):\n        super()'
        var_0 = module_2.parse(str_0)
        super_without_arguments_transformer_0 = module_1.SuperWithoutArgumentsTransformer(str_0)
        var_1 = super_without_arguments_transformer_0.visit(var_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'uper()'
        var_0 = module_2.parse(str_0)
        super_without_arguments_transformer_0 = module_1.SuperWithoutArgumentsTransformer(var_0)
        var_1 = super_without_arguments_transformer_0.visit(var_0)
        int_0 = 0
        var_2 = var_1.body[int_0]
        var_3 = var_1.body[int_0]
        var_4 = var_3.value
        var_5 = var_1.body[int_0]
        var_6 = var_5.value.func
        var_7 = var_1.body[int_0]
        var_8 = var_7.value.args
        var_9 = len(var_8)
        var_10 = var_1.body[int_0]
        var_11 = var_10.value.args[int_0]
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'super(Q)'
        var_0 = module_2.parse(str_0)
        super_without_arguments_transformer_0 = module_1.SuperWithoutArgumentsTransformer(var_0)
        var_1 = super_without_arguments_transformer_0.visit(var_0)
        list_0 = [str_0]
        var_2 = super_without_arguments_transformer_0.visit(list_0)
    except BaseException:
        pass