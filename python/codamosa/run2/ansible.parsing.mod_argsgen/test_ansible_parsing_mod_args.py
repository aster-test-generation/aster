# Automatically generated by Pynguin.
import ansible.parsing.mod_args as module_0

def test_case_0():
    pass

def test_case_1():
    module_args_parser_0 = module_0.ModuleArgsParser()

def test_case_2():
    str_0 = 'action'
    str_1 = {str_0: str_0}
    module_args_parser_0 = module_0.ModuleArgsParser(str_1)
    var_0 = module_args_parser_0.parse()

def test_case_3():
    str_0 = 'command'
    str_1 = {str_0: str_0}
    module_args_parser_0 = module_0.ModuleArgsParser(str_1)
    var_0 = module_args_parser_0.parse()

def test_case_4():
    str_0 = 'ame'
    str_1 = 'hello world1'
    str_2 = 'shellecho hello world1'
    str_3 = {str_0: str_1, str_1: str_2}
    str_4 = 'command'
    str_5 = {str_0: str_1, str_4: str_3}
    module_args_parser_0 = module_0.ModuleArgsParser(str_5)
    var_0 = module_args_parser_0.parse()

def test_case_5():
    str_0 = 'shell'
    dict_0 = {str_0: str_0, str_0: str_0}
    module_args_parser_0 = module_0.ModuleArgsParser(dict_0)
    str_1 = 'data'
    var_0 = module_args_parser_0.parse()
    module_args_parser_1 = module_0.ModuleArgsParser()
    var_1 = None
    str_2 = 'command'
    str_3 = 'action'
    str_4 = 'ell ata=ls'
    str_5 = {str_3: str_4}
    module_args_parser_2 = module_0.ModuleArgsParser(str_5)
    var_2 = module_args_parser_2.parse()
    str_6 = {str_1: str_5, str_2: var_1}
    module_args_parser_3 = module_0.ModuleArgsParser(str_6)
    var_3 = module_args_parser_3.parse()