# Automatically generated by Pynguin.
import youtube_dl.downloader.ism as module_0

def test_case_0():
    try:
        int_0 = -2802
        var_0 = module_0.box(int_0, int_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'S'
        list_0 = [str_0, str_0]
        list_1 = [str_0, list_0, list_0]
        str_1 = '17uul+'
        list_2 = [str_0, str_1, str_0, list_0]
        list_3 = [list_2, list_0, str_1, str_1]
        var_0 = module_0.full_box(list_1, str_1, list_2, list_3)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'kr;J.d0.8'
        str_1 = 'B\n^eC[<J)'
        int_0 = 1009
        tuple_0 = (str_0, str_1, int_0)
        ism_f_d_0 = module_0.IsmFD(tuple_0, tuple_0)
        bytes_0 = b'\x16\n\x1f!\x16\xe1x\xd5\x08\x9a'
        var_0 = module_0.write_piff_header(ism_f_d_0, bytes_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b'\x00\x00\x00 ftypavc1'
        bytes_1 = b'ftyp'
        bytes_2 = (bytes_1, bytes_0)
        var_0 = module_0.extract_box_data(bytes_0, bytes_2)
    except BaseException:
        pass

def test_case_4():
    try:
        dict_0 = {}
        str_0 = 'Q}Z*:F%Jl>D-;^\x0c-|\\y]'
        ism_f_d_0 = module_0.IsmFD(str_0, dict_0)
        var_0 = ism_f_d_0.real_download(dict_0, str_0)
    except BaseException:
        pass