# Automatically generated by Pynguin.
import youtube_dl.aes as module_0
import youtube_dl.utils as module_1

def test_case_0():
    try:
        str_0 = '!\\kg:eEG(\n~l4" '
        var_0 = module_0.shift_rows(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = -652.491
        int_0 = -973
        dict_0 = {float_0: int_0}
        bool_0 = True
        var_0 = module_0.aes_cbc_decrypt(float_0, dict_0, bool_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b'\x9e\x15\x05\x99\xf9\x0b\x9b'
        bool_0 = True
        tuple_0 = (bool_0,)
        dict_0 = None
        var_0 = module_0.aes_cbc_encrypt(bytes_0, tuple_0, dict_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b'\x86\x802c\xcc\xcbKL\xb6\xb6=\x16\x9dDe\xd3\x14X'
        var_0 = module_0.key_expansion(bytes_0)
    except BaseException:
        pass

def test_case_4():
    try:
        dict_0 = None
        var_0 = module_0.key_expansion(dict_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'x}Z?k'
        var_0 = module_0.rotate(str_0)
    except BaseException:
        pass

def test_case_6():
    try:
        bool_0 = True
        var_0 = module_0.mix_columns_inv(bool_0)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'body[method]'
        var_0 = module_0.shift_rows_inv(str_0)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = '|'
        var_0 = module_0.inc(str_0)
    except BaseException:
        pass

def test_case_9():
    try:
        bytes_0 = b'b8\x00>'
        var_0 = module_0.mix_columns_inv(bytes_0)
    except BaseException:
        pass

def test_case_10():
    try:
        bool_0 = False
        bool_1 = False
        str_0 = ''
        tuple_0 = ()
        list_0 = [str_0, bool_1, str_0]
        set_0 = set()
        var_0 = module_0.rijndael_mul(set_0, bool_0)
        var_1 = module_0.rotate(list_0)
        var_2 = module_0.inc(tuple_0)
        tuple_1 = (bool_1, str_0)
        var_3 = module_0.aes_decrypt(tuple_1, str_0)
        var_4 = module_0.shift_rows_inv(bool_0)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = '6d6c53516b685172347a4b684b694373'
        var_0 = module_1.bytes_to_intlist(str_0)
        var_1 = module_1.bytes_to_intlist(var_0)
        var_2 = module_1.bytes_to_intlist(var_1)
        var_3 = module_0.aes_cbc_decrypt(var_2, var_0, var_1)
        list_0 = [var_2, var_1, str_0]
        float_0 = 89.5976
        var_4 = module_0.aes_cbc_decrypt(list_0, list_0, float_0)
    except BaseException:
        pass