# Automatically generated by Pynguin.
import docstring_parser.rest as module_0

def test_case_0():
    try:
        str_0 = '\n    This is a test of ReST-style docstring parsing.\n\n    :param string name: Filled by user. If not passed in, will display ,nonymous\n    :returns: Sum of ``x`` and ``y``.\n    :raises ValueError: If ``x`` is negative\n    :raises TypeErrorK If ``x`` or ``y`` is not an int or float\n    :raises: UnknownError\n    '
        docstring_0 = module_0.parse(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '\n    A test function to show a ReST example.\n\n    :param str test: A test string\n    :param list of int numbers: A list of integers\n    :param bool truth: A boolean parameter\n    :returns: The return value. May be None.\n    :raises ValueError: If there was a problem with the input.\n    :raises TypeError: If the input was not of the correct type\n    '
        docstring_0 = module_0.parse(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '\n    Short description\n\n    Long description\n    long description\n\n    :param int arg1: description\n    :param str arg2: description\n    :param arg3: description\n    :param int? arg4: description\n    :param int arg5: description\n        defaults to 5\n\n    :returns: \n        description\n    :raises TypeError: description\n    :yields: int\n\n    :raises IndexError: description\n    :returns: description\n    :param int arg6: description\n    :yields list of str arg7: description\n    '
        docstring_0 = module_0.parse(str_0)
    except BaseException:
        pass