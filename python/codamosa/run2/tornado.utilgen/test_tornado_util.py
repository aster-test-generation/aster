# Automatically generated by Pynguin.
import tornado.util as module_0
import builtins as module_1

def test_case_0():
    pass

def test_case_1():
    gzip_decompressor_0 = module_0.GzipDecompressor()

def test_case_2():
    gzip_decompressor_0 = module_0.GzipDecompressor()
    bytes_0 = gzip_decompressor_0.flush()
    gzip_decompressor_1 = module_0.GzipDecompressor()

def test_case_3():
    base_exception_0 = module_1.BaseException()
    optional_0 = module_0.errno_from_exception(base_exception_0)

def test_case_4():
    gzip_decompressor_0 = None
    list_0 = [gzip_decompressor_0]
    base_exception_0 = module_1.BaseException(*list_0)
    optional_0 = module_0.errno_from_exception(base_exception_0)
    optional_1 = module_0.errno_from_exception(base_exception_0)

def test_case_5():
    str_0 = 'AW=I'
    str_1 = module_0.re_unescape(str_0)

def test_case_6():
    int_0 = 1
    str_0 = ''
    var_0 = OSError(int_0, str_0)
    optional_0 = module_0.errno_from_exception(var_0)