# Automatically generated by Pynguin.
import cookiecutter.zipfile as module_0

def test_case_0():
    try:
        str_0 = "'$eIB;j9&W|"
        var_0 = module_0.unzip(str_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b'\x90\xd2'
        bool_0 = False
        var_0 = module_0.unzip(bytes_0, bool_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'https://github.com/audreyr/cookiecutter-pypackage/archive/1.0.0.zip'
        bool_0 = True
        var_0 = module_0.unzip(str_0, bool_0, str_0)
    except BaseException:
        pass