# Automatically generated by Pynguin.
import docstring_parser.google as module_0

def test_case_0():
    try:
        str_0 = "Initialize self.\n\n        :param args: list of arguments. The exact content of this variable is\n                     dependent on the kind of docstring; it's used to distinguish between\n                     custom docstring meta information items.\n        :param description: associated docstring description.\n        "
        google_parser_0 = module_0.GoogleParser(str_0)
        docstring_0 = google_parser_0.parse(str_0)
        section_0 = None
        var_0 = google_parser_0.add_section(section_0)
    except BaseException:
        pass

def test_case_1():
    try:
        google_parser_0 = module_0.GoogleParser()
        str_0 = '\r'
        str_1 = "Initialize self.\n\n        :param args: list of arguments. The exact content of this variable is\n                     dependent on the kind of docstring; it's used to distinguish between\n                     custom docstring meta information items.\n        :param description: associated docstring description.\n        "
        docstring_0 = module_0.parse(str_1)
        google_parser_1 = module_0.GoogleParser()
        docstring_1 = module_0.parse(str_0)
        section_0 = None
        var_0 = google_parser_0.add_section(section_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = None
        list_0 = []
        bool_0 = False
        google_parser_0 = module_0.GoogleParser(list_0, bool_0)
        docstring_0 = google_parser_0.parse(str_0)
        google_parser_1 = module_0.GoogleParser(docstring_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '\n    Short description.\n\n    Long description.\n\n    Args:\n    h   arg1 (int): description for arg1.\n        arg2 (str, optional): description for arg2. Defaults to foo.\n        arg3 (int, optional): description for arg3. Defaults to 42, which\n            is not th real answer.\n\n    Returns:\n        int: description for return.\n\n    Raises:\n        TypeError: de[cription for TypError.\n\n    Examples:\n       Code Example 1.\n    '
        docstring_0 = module_0.parse(str_0)
    except BaseException:
        pass