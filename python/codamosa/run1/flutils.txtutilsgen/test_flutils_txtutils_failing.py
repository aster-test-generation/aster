# Automatically generated by Pynguin.
import flutils.txtutils as module_0

def test_case_0():
    try:
        sequence_0 = None
        int_0 = module_0.len_without_ansi(sequence_0)
    except BaseException:
        pass

def test_case_1():
    try:
        ansi_text_wrapper_0 = module_0.AnsiTextWrapper()
        bool_0 = True
        str_0 = 'eW?h@zInJLv'
        str_1 = 'setup.cfg'
        str_2 = ansi_text_wrapper_0.fill(str_1)
        str_3 = ansi_text_wrapper_0.fill(str_0)
        str_4 = 'aF%lgKlnLT\x0c%#?'
        ansi_text_wrapper_1 = module_0.AnsiTextWrapper(bool_0, placeholder=str_2)
        list_0 = ansi_text_wrapper_1.wrap(str_4)
        dict_0 = {bool_0: bool_0, bool_0: bool_0, bool_0: bool_0}
        int_0 = module_0.len_without_ansi(dict_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'nt'
        bool_0 = False
        ansi_text_wrapper_0 = module_0.AnsiTextWrapper(bool_0)
        list_0 = ansi_text_wrapper_0.wrap(str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '{}a0'
        bool_0 = True
        str_1 = '!Y'
        ansi_text_wrapper_0 = module_0.AnsiTextWrapper(bool_0, bool_0, max_lines=bool_0, placeholder=str_1)
        str_2 = ', cannot be a keyword'
        int_0 = module_0.len_without_ansi(str_2)
        list_0 = ansi_text_wrapper_0.wrap(str_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = None
        int_0 = -1371
        bool_0 = True
        int_1 = 523
        ansi_text_wrapper_0 = module_0.AnsiTextWrapper(int_0, bool_0, int_1)
        str_1 = ansi_text_wrapper_0.fill(str_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'Bl{SJyAP1=<hsyM4WJz\r'
        int_0 = module_0.len_without_ansi(str_0)
        bool_0 = True
        ansi_text_wrapper_0 = module_0.AnsiTextWrapper(bool_0)
        str_1 = ansi_text_wrapper_0.fill(str_0)
        str_2 = ansi_text_wrapper_0.fill(str_0)
        list_0 = ansi_text_wrapper_0.wrap(str_1)
        ansi_text_wrapper_1 = module_0.AnsiTextWrapper(str_0)
        str_3 = '\tHC:]1JV^jJc,%YaDK*'
        str_4 = ansi_text_wrapper_0.fill(str_3)
        str_5 = 'Change ownership of a path.\n\n    This function processes the given ``path`` with\n    :obj:`~flutils.normalize_path`.\n\n    If the given ``path`` does NOT exist, nothing will be done.\n\n    Args:\n        path (:obj:`str`, :obj:`bytes` or :obj:`Path <pathlib.Path>`):\n            The path of the file or directory that will have it\'s ownership\n            changed.  This value can be a :term:`glob pattern`.\n        user (:obj:`str` or :obj:`int`, optional): The "login name" used to set\n            the owner of ``path``.  A value of ``\'-1\'`` will leave the\n            owner unchanged.  Defaults to the "login name" of the current user.\n        group (:obj:`str` or :obj:`int`, optional): The group name used to set\n            the group of ``path``.  A value of ``\'-1\'`` will leave the\n            group unchanged.  Defaults to the current user\'s group.\n        include_parent (:obj:`bool`, optional): A value of :obj:`True` will\n            chown the parent directory of the given ``path`` that contains\n            a :term:`glob pattern`.  Defaults to :obj:`False`.\n\n    Raises:\n        OSError: If the given :obj:`user` does not exist as a "login\n            name" for this operating system.\n        OSError: If the given :obj:`group` does not exist as a "group\n            name" for this operating system.\n\n    :rtype: :obj:`None`\n\n    Examples:\n        >>> from flutils.pathutils import chown\n        >>> chown(\'~/tmp/flutils.tests.osutils.txt\')\n\n        Supports a :term:`glob pattern`.  So to recursively change the\n        ownership of a directory just do:\n\n        >>> chown(\'~/tmp/**\')\n\n\n        To change ownership of all the directory\'s immediate contents:\n\n        >>> chown(\'~/tmp/*\', user=\'foo\', group=\'bar\')\n\n    '
        ansi_text_wrapper_2 = module_0.AnsiTextWrapper(max_lines=int_0, placeholder=str_1)
        str_6 = ansi_text_wrapper_2.fill(str_5)
        bool_1 = False
        ansi_text_wrapper_3 = module_0.AnsiTextWrapper(int_0, bool_1, bool_0)
        str_7 = ansi_text_wrapper_3.fill(str_3)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = 'cy&xiDa4Q('
        str_1 = 'l{SJ]AP<hsyw4z\r'
        int_0 = module_0.len_without_ansi(str_1)
        int_1 = 4843
        str_2 = 'RW{\x0b3+-n|.\\\\q%=`'
        bool_0 = False
        bool_1 = True
        str_3 = 'y9\n=S7;\rR>\ry!e*|q\\bC'
        ansi_text_wrapper_0 = module_0.AnsiTextWrapper(int_1, str_2, str_2, bool_0, bool_1, max_lines=int_1, placeholder=str_3)
        list_0 = ansi_text_wrapper_0.wrap(str_0)
        str_4 = 'k%ll5'
        str_5 = ansi_text_wrapper_0.fill(str_0)
        ansi_text_wrapper_1 = module_0.AnsiTextWrapper(bool_0)
        bool_2 = True
        str_6 = ';WC\tv'
        ansi_text_wrapper_2 = module_0.AnsiTextWrapper(bool_2, max_lines=int_0, placeholder=str_6)
        list_1 = ansi_text_wrapper_2.wrap(str_4)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'cy&xiDa4Q('
        str_1 = 'l{SJ]AP<hsyw4z\r'
        int_0 = module_0.len_without_ansi(str_1)
        bool_0 = True
        str_2 = 'y9\n=S7;\rR>\ry!e*|q\\bC'
        ansi_text_wrapper_0 = module_0.AnsiTextWrapper(bool_0)
        list_0 = ansi_text_wrapper_0.wrap(str_2)
        bool_1 = False
        ansi_text_wrapper_1 = module_0.AnsiTextWrapper(str_0, bool_1)
        str_3 = ansi_text_wrapper_0.fill(str_1)
        str_4 = '8ByV>U(^@B'
        str_5 = ansi_text_wrapper_1.fill(str_4)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = '\x1b[38;5;209mfoobar'
        int_0 = module_0.len_without_ansi(str_0)
        bool_0 = False
        bool_1 = True
        ansi_text_wrapper_0 = module_0.AnsiTextWrapper(bool_0, bool_0, bool_1, placeholder=str_0)
        list_0 = ansi_text_wrapper_0.wrap(str_0)
    except BaseException:
        pass