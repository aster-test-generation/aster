# Automatically generated by Pynguin.
import ansible.parsing.utils.yaml as module_0

def test_case_0():
    try:
        bytes_0 = b'\xce\xf1\xa2\x82\x9f\xeeSV\xbet\xb8R4:\xd5\xba8U'
        var_0 = module_0.from_yaml(bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '"M\r$d.?+xVH8#PXQ:-#'
        var_0 = module_0.from_yaml(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        tuple_0 = ()
        var_0 = module_0.from_yaml(tuple_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b'w`Z\x1db'
        set_0 = {bytes_0, bytes_0}
        list_0 = []
        bytes_1 = None
        var_0 = module_0.from_yaml(bytes_1, set_0, bytes_0, list_0, set_0)
    except BaseException:
        pass