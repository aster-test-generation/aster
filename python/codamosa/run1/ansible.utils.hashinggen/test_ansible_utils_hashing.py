# Automatically generated by Pynguin.
import ansible.utils.hashing as module_0

def test_case_0():
    pass

def test_case_1():
    bytes_0 = b'\xd4\xcf\x94'
    var_0 = module_0.secure_hash_s(bytes_0)

def test_case_2():
    bytes_0 = b''
    var_0 = module_0.md5(bytes_0)

def test_case_3():
    list_0 = None
    var_0 = module_0.md5(list_0)

def test_case_4():
    str_0 = 'AL/leG'
    var_0 = module_0.md5s(str_0)

def test_case_5():
    tuple_0 = ()
    var_0 = module_0.md5(tuple_0)

def test_case_6():
    bytes_0 = b'.'
    var_0 = module_0.md5(bytes_0)

def test_case_7():
    str_0 = '/bin/ls'
    var_0 = module_0.secure_hash(str_0)
    str_1 = '/tmp/does_not_exists'
    var_1 = module_0.secure_hash(str_1)
    str_2 = '/tmp'
    var_2 = module_0.secure_hash(str_2)