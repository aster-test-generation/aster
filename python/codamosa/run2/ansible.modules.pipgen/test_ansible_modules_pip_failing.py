# Automatically generated by Pynguin.
import ansible.modules.pip as module_0

def test_case_0():
    try:
        bool_0 = None
        int_0 = 2903
        str_0 = ':1!L8*[LzEYxp-)/'
        list_0 = [bool_0, int_0, int_0, str_0]
        float_0 = -617.0
        var_0 = module_0.setup_virtualenv(bool_0, int_0, list_0, int_0, float_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'distribute'
        package_0 = module_0.Package(str_0, str_0)
        package_1 = module_0.Package(str_0)
        var_0 = package_1.__str__()
        int_0 = -222
        var_1 = package_1.canonicalize_name(int_0)
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = 3333
        package_0 = module_0.Package(int_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bool_0 = None
        str_0 = 'J'
        package_0 = module_0.Package(str_0)
        set_0 = {package_0, str_0, str_0, bool_0}
        float_0 = -3378.43954
        package_1 = module_0.Package(float_0, set_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'J'
        package_0 = module_0.Package(str_0)
        var_0 = package_0.is_satisfied_by(str_0)
    except BaseException:
        pass

def test_case_5():
    try:
        bool_0 = True
        complex_0 = None
        list_0 = [complex_0, bool_0, complex_0, complex_0]
        str_0 = '89K!U.3W,/~Q%JnN48V'
        package_0 = module_0.Package(list_0, str_0)
    except BaseException:
        pass