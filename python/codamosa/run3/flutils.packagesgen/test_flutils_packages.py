# Automatically generated by Pynguin.
import flutils.packages as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = '1.2.4a0'
    str_1 = module_0.bump_version(str_0)

def test_case_2():
    str_0 = '1.143'
    int_0 = 1
    str_1 = 'b'
    str_2 = module_0.bump_version(str_0, int_0, str_1)

def test_case_3():
    str_0 = '1.2.2'
    int_0 = 1
    int_1 = 2
    str_1 = module_0.bump_version(str_0, int_0)
    str_2 = 'b'
    str_3 = module_0.bump_version(str_1, int_1, str_2)

def test_case_4():
    str_0 = '1.2.3'
    int_0 = 1
    str_1 = 'a'
    str_2 = module_0.bump_version(str_0, int_0, str_1)

def test_case_5():
    int_0 = 0
    str_0 = '1.2.3'
    str_1 = module_0.bump_version(str_0)
    str_2 = module_0.bump_version(str_0, int_0)

def test_case_6():
    str_0 = '1.2.2'
    int_0 = 1
    str_1 = module_0.bump_version(str_0, int_0)
    str_2 = 'b'
    str_3 = module_0.bump_version(str_1, int_0, str_2)
    str_4 = module_0.bump_version(str_3, int_0, str_2)

def test_case_7():
    str_0 = '1.2.2'
    int_0 = -2
    int_1 = 2
    str_1 = module_0.bump_version(str_0, int_0)
    str_2 = 'b'
    str_3 = module_0.bump_version(str_1, int_0, str_2)
    str_4 = module_0.bump_version(str_1, int_1, str_2)

def test_case_8():
    str_0 = '1.2.3'
    int_0 = 1
    str_1 = 'b'
    str_2 = module_0.bump_version(str_0, int_0, str_1)

def test_case_9():
    str_0 = '1.2.2'
    int_0 = 2
    str_1 = 'b'
    str_2 = module_0.bump_version(str_0, int_0, str_1)

def test_case_10():
    str_0 = '1.2.4'
    int_0 = 2
    str_1 = module_0.bump_version(str_0, int_0)
    str_2 = '1.2.4a0'
    str_3 = module_0.bump_version(str_2, int_0)
    str_4 = '1.2.4a1'
    str_5 = module_0.bump_version(str_4, int_0)
    str_6 = '1.2.4b1'
    str_7 = module_0.bump_version(str_6, int_0)
    str_8 = 'a'
    str_9 = module_0.bump_version(str_2, int_0, str_8)

def test_case_11():
    str_0 = '1.2.3'
    int_0 = 0
    str_1 = module_0.bump_version(str_0, int_0)
    str_2 = '1.2.2'
    int_1 = 1
    str_3 = module_0.bump_version(str_2, int_1)
    int_2 = 2
    str_4 = module_0.bump_version(str_0, int_2)
    str_5 = '1.2.4a1'
    str_6 = module_0.bump_version(str_5, int_1)
    str_7 = module_0.bump_version(str_5, int_2)
    str_8 = 'b'
    str_9 = module_0.bump_version(str_5, int_2, str_8)

def test_case_12():
    str_0 = '1.4a0'
    str_1 = module_0.bump_version(str_0)
    int_0 = 1
    str_2 = 'a'
    str_3 = module_0.bump_version(str_0, int_0, str_2)

def test_case_13():
    str_0 = '1.2.3'
    int_0 = 0
    str_1 = module_0.bump_version(str_0, int_0)
    int_1 = 1
    str_2 = module_0.bump_version(str_1, int_1)
    int_2 = 2
    str_3 = module_0.bump_version(str_0)
    str_4 = module_0.bump_version(str_0, int_2)
    str_5 = module_0.bump_version(str_1, int_1)
    str_6 = module_0.bump_version(str_0, int_2)
    str_7 = 'b'
    str_8 = module_0.bump_version(str_6, int_1, str_7)
    str_9 = module_0.bump_version(str_5, int_2, str_7)
    str_10 = module_0.bump_version(str_9, int_2, str_7)