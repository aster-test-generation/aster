# Automatically generated by Pynguin.
import py_backwards.transformers.base as module_0
import typed_ast._ast3 as module_1

def test_case_0():
    try:
        base_transformer_0 = module_0.BaseTransformer()
    except BaseException:
        pass

def test_case_1():
    try:
        import_from_0 = module_1.ImportFrom()
        a_s_t_0 = module_1.AST()
        base_import_rewrite_0 = module_0.BaseImportRewrite(a_s_t_0)
        var_0 = base_import_rewrite_0.visit_ImportFrom(import_from_0)
    except BaseException:
        pass

def test_case_2():
    try:
        import_0 = module_1.Import()
        a_s_t_0 = module_1.AST()
        base_import_rewrite_0 = module_0.BaseImportRewrite(a_s_t_0)
        var_0 = base_import_rewrite_0.visit_Import(import_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b'n\x18\xd6\xc5{~\xb6'
        list_0 = [bytes_0]
        import_from_0 = module_1.ImportFrom(*list_0)
        a_s_t_0 = module_1.AST()
        base_import_rewrite_0 = module_0.BaseImportRewrite(a_s_t_0)
        var_0 = base_import_rewrite_0.visit_ImportFrom(import_from_0)
    except BaseException:
        pass

def test_case_4():
    try:
        list_0 = []
        list_1 = [list_0, list_0]
        dict_0 = {}
        import_from_0 = module_1.ImportFrom(*list_1, **dict_0)
        a_s_t_0 = module_1.AST(**dict_0)
        base_import_rewrite_0 = module_0.BaseImportRewrite(a_s_t_0)
        var_0 = base_import_rewrite_0.visit_ImportFrom(import_from_0)
        base_import_rewrite_1 = module_0.BaseImportRewrite(a_s_t_0)
        var_1 = base_import_rewrite_1.visit_ImportFrom(import_from_0)
        a_s_t_1 = None
        base_node_transformer_0 = module_0.BaseNodeTransformer(a_s_t_1)
        list_2 = [import_from_0, import_from_0]
        base_transformer_0 = module_0.BaseTransformer(*list_2)
    except BaseException:
        pass