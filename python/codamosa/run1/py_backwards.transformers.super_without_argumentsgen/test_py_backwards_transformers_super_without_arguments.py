# Automatically generated by Pynguin.
import typed_ast.ast3 as module_0
import py_backwards.transformers.super_without_arguments as module_1

def test_case_0():
    pass

def test_case_1():
    str_0 = 'supvr()'
    var_0 = module_0.parse(str_0)
    super_without_arguments_transformer_0 = module_1.SuperWithoutArgumentsTransformer(var_0)
    var_1 = super_without_arguments_transformer_0.visit(var_0)

def test_case_2():
    str_0 = 'def __init__(self, name): super()'
    super_without_arguments_transformer_0 = module_1.SuperWithoutArgumentsTransformer(str_0)
    str_1 = 'class Test(object):\n def test(self): super()'
    var_0 = module_0.parse(str_1)
    super_without_arguments_transformer_1 = module_1.SuperWithoutArgumentsTransformer(var_0)
    var_1 = super_without_arguments_transformer_1.visit(var_0)