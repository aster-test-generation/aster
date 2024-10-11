import unittest
from ansible.plugins.filter.yaml import *


class TestMandatory(unittest.TestCase):
    def test_mandatory(self):
        from jinja2.runtime import Undefined
        a = Undefined()
        msg = None
        result = mandatory(a, msg)

class TestCombine(unittest.TestCase):
    def test_combine(self):
        terms = None
        recursive = False
        list_merge = 'replace'
        result = combine(terms, recursive, list_merge)

class TestComment(unittest.TestCase):
    def test_comment(self):
        text = None
        style = 'plain'
        result = comment(text, style)

class TestExtract(unittest.TestCase):
    def test_extract(self):
        item = None
        container = None
        morekeys = None
        result = extract(item, container, morekeys)

class TestDoGroupby(unittest.TestCase):
    def test_do_groupby(self):
        value = None
        attribute = None
        result = do_groupby(value, attribute)

class TestB64encode(unittest.TestCase):
    def test_b64encode(self):
        string = None
        encoding = 'utf-8'
        result = b64encode(string, encoding)

class TestB64decode(unittest.TestCase):
    def test_b64decode(self):
        string = None
        encoding = 'utf-8'
        result = b64decode(string, encoding)

class TestFlatten(unittest.TestCase):
    def test_flatten(self):
        mylist = None
        levels = None
        skip_nulls = True
        result = flatten(mylist, levels, skip_nulls)

class TestSubelements(unittest.TestCase):
    def test_subelements(self):
        obj = None
        subelements = None
        skip_missing = False
        result = subelements(obj, subelements, skip_missing)

if __name__ == '__main__':
    unittest.main()