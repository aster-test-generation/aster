# Automatically generated by Pynguin.
import docstring_parser.rest as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = '\n    Short description holds a single line.\n\n    :param str arg1: description of arg1\n    :param int arg2: description of arg2\n    :param arg3: description of arg3\n    :type arg3: float\n    :param arg4: multi-\n    line\n    description\n    :type arg4: int\n\n    Long description can hold multiple lines.\n    It is marked by a blank line above and below.\n    '
    docstring_0 = module_0.parse(str_0)

def test_case_2():
    str_0 = '\n\n    This is text\n\n    :param a: This is param a\n    :param b: This is param b defaults to b\n    :type b: Optional[str]\n    :param c: This is param c\n    :type c: int\n    :param d: This is param d\n    :type d: int\n    :returns: This is return\n    :type returns: int\n    :raises TypeError: a type error description\n    '
    docstring_0 = module_0.parse(str_0)

def test_case_3():
    str_0 = 'Other Arguments'
    docstring_0 = module_0.parse(str_0)

def test_case_4():
    str_0 = ''
    docstring_0 = module_0.parse(str_0)

def test_case_5():
    str_0 = '\n\n    This is text\n\n    :param a: This is param a\n    :param b: This is param b defaults to b\n    :type b: Optional[str]\n    :param c: This is param c\n    :type c: int\n    :param d: This is param d\n    :type d: int\n    :returns: This is return\n    :type returns: int\n o  :raises TypeError: a type error description\n    '
    docstring_0 = module_0.parse(str_0)

def test_case_6():
    str_0 = '\n:returns: Number of characters\n:param str s: String for counting\n    '
    docstring_0 = module_0.parse(str_0)

def test_case_7():
    str_0 = '\n    This function parses ReST-style docstrings into their components.\n\n    :param args: arguments to parse.\n    :param desc: the arguments and their descriptions.\n    :type args: List[str]\n    :type desc: str\n    :returns: parsed docstring\n    :raises: ParseError - if there is an error parsing.\n    :yields: Docstring component\n    '
    docstring_0 = module_0.parse(str_0)

def test_case_8():
    str_0 = 'Shrinkage limit\n\n    The shrinkage limit is used to define the boundaries of t#e plastic and brittle states. It is defined as the moisture content at which a soil ceases to shrink.\n\n    :param str name: The name of the person\n    \n    :returns str: The name of the person\n    :raises KeyError: raises an exception\n    '
    docstring_0 = module_0.parse(str_0)
    var_0 = docstring_0.meta

def test_case_9():
    str_0 = '\n        An example function\n\n        :param object: The object to retrieve from\n        :param index: The index to retrieve\n        :param int start: The offset to start from\n        :param int end: The offset to end at\n        :param int? limit: The maximum amount of items to return\n        :param str? order: The order to return the items in\n        :returns: a list of objects\n        :raises IndexError: if the index is out of range\n        :raises IndexError: if the limit is too high\n        '
    docstring_0 = module_0.parse(str_0)