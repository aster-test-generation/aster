# Automatically generated by Pynguin.
import youtube_dl.aes as module_0
import base64 as module_1
import youtube_dl.utils as module_2

def test_case_0():
    try:
        set_0 = None
        var_0 = module_0.mix_columns_inv(set_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b'\xc0\x19\xd1'
        set_0 = {bytes_0, bytes_0}
        tuple_0 = (set_0,)
        int_0 = 4007
        var_0 = module_0.aes_cbc_decrypt(tuple_0, bytes_0, int_0)
    except BaseException:
        pass

def test_case_2():
    try:
        set_0 = set()
        list_0 = [set_0, set_0, set_0]
        var_0 = module_0.aes_cbc_encrypt(set_0, list_0, list_0)
    except BaseException:
        pass

def test_case_3():
    try:
        float_0 = 1429.162667
        bytes_0 = b'\x89m\xa2\xd5\x86\xc5\xd6S]\x96\xd6'
        var_0 = module_0.aes_decrypt_text(float_0, bytes_0, bytes_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'mgu{H1[R7\x0bB}+dqC'
        dict_0 = {str_0: str_0}
        bool_0 = True
        var_0 = module_0.rijndael_mul(dict_0, bool_0)
    except BaseException:
        pass

def test_case_5():
    try:
        bytes_0 = b'\xd4\xa9g\xab+E_'
        var_0 = module_0.shift_rows(bytes_0)
    except BaseException:
        pass

def test_case_6():
    try:
        bytes_0 = b'\x1a\x9b\xca^q/\xe6\xc8\xfd\x0b'
        var_0 = module_0.shift_rows_inv(bytes_0)
    except BaseException:
        pass

def test_case_7():
    try:
        int_0 = 1838
        var_0 = module_0.inc(int_0)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = 'gwn5uQ3dXS0x+Xa6DhBgbq5K9QQrPjq5O0wgQf2m+P4='
        var_0 = module_1.b64decode(str_0)
        str_1 = 'e9mK9I5R1mGguWjL1f7GJg=='
        var_1 = module_1.b64decode(str_1)
        var_2 = module_2.bytes_to_intlist(var_1)
        str_2 = 'r0E5ahmKPWYsnmQsLHJ3PA=='
        var_3 = module_1.b64decode(str_2)
        var_4 = module_2.bytes_to_intlist(var_3)
        var_5 = module_0.aes_cbc_decrypt(var_2, var_2, var_4)
        int_0 = -372
        var_6 = module_1.b64decode(int_0)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = '9JhHtyzJV6QLHJ3K/XfOGQ=='
        var_0 = module_1.b64decode(str_0)
        str_1 = 'yvKz7QS1qckFjQpn7NVmSw=='
        var_1 = module_1.b64decode(str_1)
        var_2 = module_2.bytes_to_intlist(var_1)
        str_2 = ')'
        var_3 = module_1.b64decode(str_2)
        var_4 = module_2.bytes_to_intlist(var_3)
        var_5 = module_0.aes_cbc_decrypt(var_0, var_2, var_4)
    except BaseException:
        pass