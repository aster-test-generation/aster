# Automatically generated by Pynguin.
import ansible.plugins.become.sudo as module_0

def test_case_0():
    try:
        become_module_0 = module_0.BecomeModule()
        bool_0 = True
        bool_1 = True
        var_0 = become_module_0.build_become_command(bool_0, bool_1)
    except BaseException:
        pass

def test_case_1():
    try:
        become_module_0 = module_0.BecomeModule()
        str_0 = 'become_exe'
        str_1 = 'sudo'
        var_0 = become_module_0.set_option(str_0, str_1)
        str_2 = 'become_flags'
        var_1 = become_module_0.set_option(str_2, str_1)
        bool_0 = False
        var_2 = become_module_0.build_become_command(str_1, bool_0)
    except BaseException:
        pass

def test_case_2():
    try:
        become_module_0 = module_0.BecomeModule()
        str_0 = 'become_exe'
        var_0 = become_module_0.set_option(str_0, str_0)
        str_1 = 'become_flags'
        str_2 = 'become_pass'
        var_1 = become_module_0.set_option(str_2, str_1)
        var_2 = become_module_0.set_option(str_1, str_0)
        bool_0 = True
        var_3 = become_module_0.build_become_command(str_0, bool_0)
    except BaseException:
        pass

def test_case_3():
    try:
        become_module_0 = module_0.BecomeModule()
        str_0 = 'become_exe'
        var_0 = become_module_0.set_option(str_0, str_0)
        str_1 = 'become_flags'
        var_1 = become_module_0.set_option(str_1, str_1)
        str_2 = 'become_pass'
        var_2 = become_module_0.set_option(str_2, str_1)
        str_3 = 'become_user'
        var_3 = become_module_0.set_option(str_3, str_0)
        bool_0 = True
        var_4 = become_module_0.build_become_command(str_3, bool_0)
    except BaseException:
        pass

def test_case_4():
    try:
        become_module_0 = module_0.BecomeModule()
        str_0 = 'become_exe'
        var_0 = become_module_0.set_option(str_0, str_0)
        str_1 = 'become_flags'
        var_1 = become_module_0.set_option(str_1, var_0)
        str_2 = 'become_pass'
        var_2 = become_module_0.set_option(str_2, str_1)
        str_3 = 'become_sr'
        var_3 = become_module_0.set_option(str_3, str_0)
        bool_0 = True
        var_4 = become_module_0.build_become_command(str_3, bool_0)
    except BaseException:
        pass

def test_case_5():
    try:
        become_module_0 = module_0.BecomeModule()
        str_0 = 'become_exe'
        var_0 = become_module_0.set_option(str_0, str_0)
        str_1 = 'become_flags'
        var_1 = become_module_0.set_option(str_1, str_1)
        str_2 = 'become_pass'
        var_2 = become_module_0.set_option(str_2, str_1)
        bool_0 = True
        bytes_0 = b''
        var_3 = become_module_0.set_option(str_0, bytes_0)
        become_module_1 = module_0.BecomeModule()
        list_0 = [str_2, become_module_1, str_1, str_0]
        bool_1 = True
        list_1 = [bool_0, var_0, bool_1]
        var_4 = become_module_0.build_become_command(list_0, list_1)
    except BaseException:
        pass

def test_case_6():
    try:
        become_module_0 = module_0.BecomeModule()
        str_0 = 'become_exe'
        str_1 = 'sudo'
        var_0 = become_module_0.set_option(str_0, str_1)
        str_2 = 'become_flags'
        var_1 = become_module_0.set_option(str_2, str_1)
        str_3 = 'become_pass'
        dict_0 = None
        var_2 = become_module_0.set_option(str_3, dict_0)
        str_4 = 't`mFY'
        str_5 = 'A\\@`"V4sf80:,Ht~'
        var_3 = become_module_0.set_option(str_4, str_5)
        float_0 = 1000.0
        set_0 = None
        var_4 = become_module_0.build_become_command(float_0, set_0)
    except BaseException:
        pass

def test_case_7():
    try:
        become_module_0 = module_0.BecomeModule()
        str_0 = 'become_exe'
        str_1 = 'sudo'
        var_0 = become_module_0.set_option(str_0, str_1)
        str_2 = 'become_flags'
        str_3 = None
        set_0 = set()
        var_1 = become_module_0.set_option(str_3, set_0)
        str_4 = '-H -S -n'
        var_2 = become_module_0.set_option(str_2, str_4)
        str_5 = 'become_pass'
        become_module_1 = module_0.BecomeModule()
        str_6 = '123'
        var_3 = become_module_0.set_option(str_5, str_6)
        str_7 = 'become_user'
        var_4 = become_module_0.set_option(str_7, str_3)
        str_8 = 'ls'
        var_5 = become_module_0.build_become_command(str_8, str_2)
    except BaseException:
        pass