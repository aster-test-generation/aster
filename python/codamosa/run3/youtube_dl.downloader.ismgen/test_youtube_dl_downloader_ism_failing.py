# Automatically generated by Pynguin.
import youtube_dl.downloader.ism as module_0

def test_case_0():
    try:
        float_0 = 326.46392
        tuple_0 = None
        var_0 = module_0.box(float_0, tuple_0)
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = 858
        bytes_0 = b'\xac\x04\xf4\xd5\x016^\x07\x9ff'
        bool_0 = False
        str_0 = ''
        var_0 = module_0.full_box(int_0, bytes_0, bool_0, str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        float_0 = -687.1468
        str_0 = ']E{(}U7.i6[~skR:7"It'
        set_0 = {str_0, float_0, str_0, str_0}
        str_1 = 'Time to wait before giving up, in seconds'
        bytes_0 = b'\x06}\x0c\x93AC\xed'
        ism_f_d_0 = module_0.IsmFD(str_1, bytes_0)
        dict_0 = None
        bytes_1 = b''
        list_0 = [dict_0, set_0, bytes_1]
        var_0 = module_0.write_piff_header(ism_f_d_0, list_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b'mvhd'
        var_0 = module_0.extract_box_data(bytes_0, bytes_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bytes_0 = b'({\xe8!-u'
        list_0 = [bytes_0, bytes_0, bytes_0]
        int_0 = 4225
        dict_0 = {}
        ism_f_d_0 = module_0.IsmFD(int_0, dict_0)
        var_0 = ism_f_d_0.real_download(bytes_0, list_0)
    except BaseException:
        pass

def test_case_5():
    try:
        bytes_0 = b'\x00\x00\x00\x10mvhd\x01\x02\x03\x04\x01\x02\x03\x04\x01\x02\x03\x04'
        bytes_1 = b'mvhd'
        bytes_2 = b'mdhd'
        bytes_3 = [bytes_1, bytes_2]
        var_0 = module_0.extract_box_data(bytes_0, bytes_3)
    except BaseException:
        pass