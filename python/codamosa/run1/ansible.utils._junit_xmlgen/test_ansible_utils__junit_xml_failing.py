# Automatically generated by Pynguin.
import ansible.utils._junit_xml as module_0
import decimal as module_1

def test_case_0():
    try:
        str_0 = 'Return an XML element representing this instance.'
        str_1 = 'id'
        str_2 = 'package'
        str_3 = 'timestamp'
        str_4 = '9N!q5)*j\n)u1'
        test_case_0 = module_0.TestCase(str_0)
        test_case_1 = [test_case_0]
        str_5 = 'system_err'
        test_suite_0 = module_0.TestSuite(str_3, str_1, str_1, str_2, str_3, str_4, test_case_1, str_3, str_5)
        element_0 = test_suite_0.get_xml_element()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'This is only needed for special packages which do not show up in pip freeze\n\n    pip and setuptools fall into this category.\n\n    :returns: a string containing the version number if the package is\n        installed.  None if the package is not installed.\n    '
        test_error_0 = module_0.TestError(str_0)
        list_0 = [test_error_0]
        test_failure_0 = module_0.TestFailure(str_0)
        list_1 = [test_failure_0, test_failure_0, test_failure_0, test_failure_0]
        test_case_0 = module_0.TestCase(str_0, str_0, list_0, list_1)
        element_0 = test_case_0.get_xml_element()
        int_0 = 965
        str_1 = 'I`vHcG6&bb/'
        test_suite_0 = module_0.TestSuite(str_1)
        list_2 = [test_suite_0, test_suite_0, test_suite_0, test_suite_0]
        test_suites_0 = module_0.TestSuites(int_0, list_2)
        element_1 = test_suites_0.get_xml_element()
        test_case_1 = module_0.TestCase(str_0, list_0, str_0)
        str_2 = test_suites_0.to_pretty_xml()
        test_suites_1 = module_0.TestSuites(str_1)
        str_3 = 'Q_B! '
        decimal_0 = module_1.Decimal()
        bool_0 = False
        test_case_2 = module_0.TestCase(str_3, str_0, str_2, decimal_0, list_0, list_1, str_1, bool_0)
        element_2 = test_case_2.get_xml_element()
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '{+Oh_Mp&'
        str_1 = '.1\x0cZ`}r\\u\x0chnn'
        str_2 = '5'
        str_3 = 'Module {0} upgraded.'
        str_4 = 'product_uuid'
        int_0 = -828
        element_0 = None
        list_0 = None
        test_case_0 = module_0.TestCase(str_4, int_0, str_3, str_1, element_0, list_0)
        list_1 = [test_case_0]
        test_suite_0 = module_0.TestSuite(str_0, str_0, str_3, list_1)
        list_2 = [test_suite_0, test_suite_0, test_suite_0]
        test_suites_0 = module_0.TestSuites(list_2)
        var_0 = test_suites_0.__eq__(str_2)
        bytes_0 = b'\xb8\x9a\x9d\x92\x00\xa4\x85\xbd\x9d=qi'
        str_5 = 'a}[Y:7\r^'
        str_6 = '~y)]]Z!D^PWp3D'
        str_7 = '!3:'
        dict_0 = {str_5: str_5, str_6: str_7}
        list_3 = []
        test_suite_1 = module_0.TestSuite(str_1, str_0, bytes_0, dict_0, list_3, str_1)
        element_1 = test_suite_1.get_xml_element()
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'Return an XML element representi.g this instance.'
        list_0 = []
        test_failure_0 = module_0.TestFailure(str_0)
        list_1 = [test_failure_0, test_failure_0]
        bool_0 = True
        test_case_0 = module_0.TestCase(str_0, str_0, list_0, list_1, bool_0)
        str_1 = 'hostname'
        str_2 = 'ig'
        str_3 = 'package'
        str_4 = 'timestamp'
        str_5 = ':DjblwZ[H(&;\x0b'
        test_suite_0 = module_0.TestSuite(str_5, str_1, str_5)
        element_0 = test_suite_0.get_xml_element()
        test_case_1 = [test_case_0]
        str_6 = 'system_out'
        str_7 = 'system_err'
        test_suite_1 = module_0.TestSuite(str_2, str_1, str_2, str_3, str_4, str_6, test_case_1, str_6, str_7)
        element_1 = test_suite_1.get_xml_element()
    except BaseException:
        pass