# Automatically generated by Pynguin.
import ansible.utils.py3compat as module_0

def test_case_0():
    pass

def test_case_1():
    text_environ_0 = module_0._TextEnviron()

def test_case_2():
    str_0 = 'subcmd'
    str_1 = {str_0: str_0}
    text_environ_0 = module_0._TextEnviron(str_1, str_0)
    var_0 = text_environ_0[str_0]

def test_case_3():
    bytes_0 = b'c\x08\x1f'
    text_environ_0 = module_0._TextEnviron(bytes_0)
    var_0 = text_environ_0.__len__()