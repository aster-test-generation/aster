# Automatically generated by Pynguin.
import typed_ast._ast3 as module_0
import py_backwards.transformers.metaclass as module_1

def test_case_0():
    try:
        module_x_var_0 = module_0.Module()
        dict_0 = {}
        a_s_t_0 = module_0.AST(**dict_0)
        metaclass_transformer_0 = module_1.MetaclassTransformer(a_s_t_0)
        module_x_var_1 = metaclass_transformer_0.visit_Module(module_x_var_0)
    except BaseException:
        pass

def test_case_1():
    try:
        module_x_var_0 = None
        list_0 = [module_x_var_0, module_x_var_0, module_x_var_0]
        class_def_0 = module_0.ClassDef(*list_0)
        a_s_t_0 = module_0.AST()
        metaclass_transformer_0 = module_1.MetaclassTransformer(a_s_t_0)
        class_def_1 = metaclass_transformer_0.visit_ClassDef(class_def_0)
        str_0 = '$;M#&|~%{%.'
        list_1 = [str_0, str_0]
        a_s_t_1 = module_0.AST(*list_1)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = "6Se!'(ZPm"
        str_1 = None
        dict_0 = {str_0: str_0, str_1: str_1}
        module_x_var_0 = module_0.Module()
        module_x_var_1 = module_0.Module()
        module_x_var_2 = None
        list_0 = [module_x_var_2, str_1, dict_0, str_0]
        class_def_0 = module_0.ClassDef(*list_0)
        a_s_t_0 = module_0.AST()
        metaclass_transformer_0 = module_1.MetaclassTransformer(a_s_t_0)
        class_def_1 = metaclass_transformer_0.visit_ClassDef(class_def_0)
    except BaseException:
        pass

def test_case_3():
    try:
        class_def_0 = None
        a_s_t_0 = module_0.AST()
        metaclass_transformer_0 = module_1.MetaclassTransformer(a_s_t_0)
        class_def_1 = metaclass_transformer_0.visit_ClassDef(class_def_0)
    except BaseException:
        pass

def test_case_4():
    try:
        list_0 = []
        list_1 = [list_0]
        dict_0 = {}
        module_x_var_0 = module_0.Module(*list_1, **dict_0)
        str_0 = '\x0cS<"]\x0bY'
        dict_1 = {str_0: str_0}
        a_s_t_0 = module_0.AST(**dict_1)
        metaclass_transformer_0 = module_1.MetaclassTransformer(a_s_t_0)
        module_x_var_1 = metaclass_transformer_0.visit_Module(module_x_var_0)
        class_def_0 = module_0.ClassDef(*list_0)
        a_s_t_1 = module_0.AST()
        str_1 = 'XB=\\]xI:B?>gi'
        tuple_0 = (str_1,)
        str_2 = 'WEXx(3{>LfoB}g;?M'
        str_3 = ''
        dict_2 = {str_1: tuple_0, str_1: class_def_0, str_2: str_2, str_3: str_3}
        module_x_var_2 = module_0.Module(**dict_2)
        a_s_t_2 = module_0.AST()
        metaclass_transformer_1 = module_1.MetaclassTransformer(a_s_t_2)
        module_x_var_3 = metaclass_transformer_1.visit_Module(module_x_var_2)
    except BaseException:
        pass