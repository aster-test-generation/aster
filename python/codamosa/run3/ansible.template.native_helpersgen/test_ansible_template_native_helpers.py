# Automatically generated by Pynguin.
import ansible.template.native_helpers as module_0
import ansible.utils.native_jinja as module_1

def test_case_0():
    pass

def test_case_1():
    str_0 = '\n  _list:\n    description:\n      - list of composed dictonaries with key and value\n    type: list\n'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
    async_iterator_0 = None
    str_1 = 'P+N;j\n&<coh{'
    tuple_0 = (dict_0, async_iterator_0, str_1)
    var_0 = module_0.ansible_native_concat(tuple_0)

def test_case_2():
    str_0 = 'hello'
    var_0 = module_0.ansible_native_concat(str_0)

def test_case_3():
    str_0 = 'f'
    var_0 = module_0.ansible_native_concat(str_0)

def test_case_4():
    bool_0 = True
    bool_1 = True
    dict_0 = {bool_0: bool_0, bool_0: bool_0, bool_1: bool_1, bool_0: bool_0}
    list_0 = [dict_0]
    var_0 = module_0.ansible_native_concat(list_0)
    bytes_0 = b'\x93(\xbb\xa8\xd6YF`'
    var_1 = module_0.ansible_native_concat(bytes_0)

def test_case_5():
    native_jinja_text_0 = module_1.NativeJinjaText()
    var_0 = module_0.ansible_native_concat(native_jinja_text_0)

def test_case_6():
    native_jinja_text_0 = module_1.NativeJinjaText()
    set_0 = {native_jinja_text_0}
    bytes_0 = b'p\x0cC9`\x1c>\xb1\x01\xabJ\n\x90\xb3\\\x05!V5w'
    var_0 = module_0.ansible_native_concat(bytes_0)
    var_1 = module_0.ansible_native_concat(set_0)