# Automatically generated by Pynguin.
import pytutils.lazy.lazy_import as module_0

def test_case_0():
    try:
        bytes_0 = b'_az]F\x1e\xc5\xcb'
        illegal_use_of_scope_replacer_0 = module_0.IllegalUseOfScopeReplacer(bytes_0, bytes_0)
        var_0 = illegal_use_of_scope_replacer_0.__unicode__()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'oUD|koJ\x0c!G&q'
        illegal_use_of_scope_replacer_0 = module_0.IllegalUseOfScopeReplacer(str_0, str_0, str_0)
        var_0 = illegal_use_of_scope_replacer_0.__unicode__()
    except BaseException:
        pass

def test_case_2():
    try:
        float_0 = -659.779933
        illegal_use_of_scope_replacer_0 = module_0.IllegalUseOfScopeReplacer(float_0, float_0)
        var_0 = illegal_use_of_scope_replacer_0.__str__()
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b'*[i'
        illegal_use_of_scope_replacer_0 = module_0.IllegalUseOfScopeReplacer(bytes_0, bytes_0)
        var_0 = illegal_use_of_scope_replacer_0.__repr__()
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = -661.074331673742
        illegal_use_of_scope_replacer_0 = module_0.IllegalUseOfScopeReplacer(float_0, float_0)
        int_0 = 4
        var_0 = illegal_use_of_scope_replacer_0.__eq__(int_0)
        var_1 = illegal_use_of_scope_replacer_0.__str__()
    except BaseException:
        pass

def test_case_5():
    try:
        dict_0 = {}
        str_0 = 'A.caLd,>zYPVobTQ'
        import_replacer_0 = module_0.ImportReplacer(dict_0, str_0, str_0)
        var_0 = module_0.lazy_import(import_replacer_0, import_replacer_0)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = '\n        import bzrlib.tests\n        '
        var_0 = module_0.disallow_proxying()
        var_1 = module_0.lazy_import(str_0, str_0)
    except BaseException:
        pass

def test_case_7():
    try:
        import_processor_0 = module_0.ImportProcessor()
        int_0 = None
        str_0 = '3'
        str_1 = ''
        dict_0 = {str_0: str_0, str_1: str_1}
        set_0 = {int_0}
        scope_replacer_0 = module_0.ScopeReplacer(dict_0, set_0, str_1)
        bool_0 = True
        str_2 = ''
        str_3 = 'G/)x6>8<_a@AWCT@'
        import_replacer_0 = module_0.ImportReplacer(str_2, str_3, bool_0, dict_0, scope_replacer_0)
    except BaseException:
        pass

def test_case_8():
    try:
        str_0 = '      import bzrlp.tests\n )   l'
        var_0 = module_0.lazy_import(str_0, str_0, str_0)
    except BaseException:
        pass

def test_case_9():
    try:
        str_0 = 'bzrlib.tests'
        var_0 = module_0.lazy_import(str_0, str_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = '\n        import bzrlib.tests\n        '
        var_0 = module_0.lazy_import(str_0, str_0)
    except BaseException:
        pass

def test_case_11():
    try:
        dict_0 = {}
        tuple_0 = None
        str_0 = 'M/<9t{fjz&.E:S=tt7'
        import_replacer_0 = module_0.ImportReplacer(dict_0, tuple_0, str_0, dict_0)
        var_0 = module_0.lazy_import(import_replacer_0, import_replacer_0)
    except BaseException:
        pass

def test_case_12():
    try:
        float_0 = 1704.5701735295822
        str_0 = 'P/(L@bK,A'
        scope_replacer_0 = None
        var_0 = module_0.lazy_import(float_0, str_0, scope_replacer_0)
    except BaseException:
        pass

def test_case_13():
    try:
        str_0 = "\n    Walks up a domain by subdomain.\n\n    >>> split_domain_into_subdomains('this.is.a.test.skywww.net')\n    ['this.is.a.test.skywww.net', 'is.a.test.skywww.net', 'a.test.skywww.net', 'test.skywww.net', 'skywww.net']\n\n    "
        var_0 = module_0.lazy_import(str_0, str_0)
    except BaseException:
        pass

def test_case_14():
    try:
        str_0 = 'pu3L!=.4#)'
        var_0 = module_0.lazy_import(str_0, str_0)
    except BaseException:
        pass

def test_case_15():
    try:
        str_0 = 'Em{*V'
        scope_replacer_0 = None
        float_0 = -1809.2
        int_0 = -1
        list_0 = [float_0, scope_replacer_0, int_0]
        illegal_use_of_scope_replacer_0 = module_0.IllegalUseOfScopeReplacer(str_0, list_0)
        var_0 = illegal_use_of_scope_replacer_0.__eq__(illegal_use_of_scope_replacer_0)
        var_1 = illegal_use_of_scope_replacer_0.__str__()
    except BaseException:
        pass

def test_case_16():
    try:
        dict_0 = {}
        list_0 = [dict_0]
        str_0 = "\n    Loads (and returns) an env file specified by `filename` into the mapping `environ`.\n\n    >>> lines = ['TEST=${HOME}/yeee-$PATH', 'THISIS=~/a/test', 'YOLO=~/swaggins/$NONEXISTENT_VAR_THAT_DOES_NOT_EXIST']\n    >>> load_env_file(lines, write_environ=dict())\n    OrderedDict([('TEST', '.../.../yeee-...:...'),\n             ('THISIS', '.../a/test'),\n             ('YOLO',\n              '.../swaggins/$NONEXISTENT_VAR_THAT_DOES_NOT_EXIST')])\n    "
        var_0 = module_0.lazy_import(list_0, str_0)
    except BaseException:
        pass

def test_case_17():
    try:
        int_0 = 1024
        str_0 = '\n    Set arbitrary node on a tree-like mapping structure, allowing for : notation to signify dimension.\n\n    Arguments:\n        mapping collections.Mapping: Mapping to fetch from\n        key str|unicode: Key to set, allowing for : notation\n        value str|unicode: Value to set `key` to\n (      parent bool: If True, return parent node. Defaults to False.\n\n    Returns:\n        object: Parent node.\n\n    '
        var_0 = module_0.lazy_import(int_0, str_0)
    except BaseException:
        pass