# Automatically generated by Pynguin.
import typed_ast._ast3 as module_0
import py_backwards.transformers.return_from_generator as module_1

def test_case_0():
    pass

def test_case_1():
    bytes_0 = b'\x1d\xd6\xb3\xaaj\xaa-\x9a1\xe9\x87\xa8n\x12\x98~\t'
    list_0 = [bytes_0, bytes_0, bytes_0, bytes_0]
    function_def_0 = module_0.FunctionDef(*list_0)
    a_s_t_0 = module_0.AST()
    return_from_generator_transformer_0 = module_1.ReturnFromGeneratorTransformer(a_s_t_0)
    function_def_1 = return_from_generator_transformer_0.visit_FunctionDef(function_def_0)

def test_case_2():
    bytes_0 = b''
    list_0 = [bytes_0, bytes_0, bytes_0, bytes_0]
    function_def_0 = module_0.FunctionDef(*list_0)
    a_s_t_0 = module_0.AST()
    return_from_generator_transformer_0 = module_1.ReturnFromGeneratorTransformer(a_s_t_0)
    function_def_1 = return_from_generator_transformer_0.visit_FunctionDef(function_def_0)