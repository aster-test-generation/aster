# Automatically generated by Pynguin.
import flutils.packages as module_0

def test_case_0():
    try:
        str_0 = "poO+HSf4Gx7'\x0c8"
        str_1 = module_0.bump_version(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '2.1.3'
        int_0 = 1
        str_1 = 'a'
        str_2 = module_0.bump_version(str_0, int_0, str_1)
        str_3 = module_0.bump_version(str_2, str_1)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '1.2.3'
        int_0 = 1
        str_1 = module_0.bump_version(str_0, int_0)
        str_2 = '1.3.4'
        int_1 = 0
        str_3 = module_0.bump_version(str_2, int_1)
        str_4 = 'a'
        str_5 = '1.2.4a0'
        str_6 = module_0.bump_version(str_5, str_4)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '1.2.4a0'
        str_1 = '2.13'
        int_0 = 2
        str_2 = 'a'
        str_3 = module_0.bump_version(str_1, int_0, str_2)
        int_1 = 3645
        str_4 = module_0.bump_version(str_0, int_1)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '1.2.2a0'
        int_0 = 2
        str_1 = 'a'
        str_2 = module_0.bump_version(str_0, int_0, str_1)
        str_3 = '1.23.24b0'
        str_4 = '2.2.3'
        int_1 = -664
        str_5 = module_0.bump_version(str_4, int_1, str_3)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = '2.13'
        int_0 = 2
        str_1 = 'a'
        str_2 = module_0.bump_version(str_0, int_0, str_1)
        str_3 = '2.2.3'
        str_4 = module_0.bump_version(str_2, int_0, str_3)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = '2.1.3'
        int_0 = -1
        str_1 = 'a'
        str_2 = module_0.bump_version(str_0, int_0, str_1)
        str_3 = module_0.bump_version(str_0)
        version_info_0 = module_0._VersionInfo()
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = '1.2.4b0'
        str_1 = module_0.bump_version(str_0)
        str_2 = '1.2.4a0'
        str_3 = module_0.bump_version(str_2)
        str_4 = '2.1.3'
        int_0 = 0
        str_5 = 'a'
        str_6 = module_0.bump_version(str_4, int_0, str_5)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = '1.23.24a1'
        str_1 = module_0.bump_version(str_0)
        int_0 = 1
        str_2 = module_0.bump_version(str_0, int_0)
        str_3 = 'B'
        str_4 = module_0.bump_version(str_0, int_0, str_3)
        int_1 = 2
        str_5 = 'b'
        str_6 = module_0.bump_version(str_0, int_1, str_5)
        version_part_0 = module_0._VersionPart()
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = '1.2a2'
        str_1 = module_0.bump_version(str_0)
        int_0 = 1
        str_2 = 'B'
        str_3 = module_0.bump_version(str_0, int_0, str_2)
        int_1 = 2
        str_4 = 'b'
        str_5 = module_0.bump_version(str_0, int_1, str_4)
        version_part_0 = module_0._VersionPart()
    except BaseException:
        pass