import os
import unittest
from ansible.errors import AnsibleLookupError
from ansible.module_utils.common._collections_compat import Mapping, Sequence
from ansible.module_utils.six import string_types
from ansible.plugins.lookup import LookupBase
from ansible.plugins.lookup.first_found import _split_on


class TestFirstFoundLookup(unittest.TestCase):
    def test_split_on(self):
        terms = "hello,world"
        expected = ["hello", "world"]
        actual = _split_on(terms)
        self.assertEqual(actual, expected)

        terms = ["hello", "world"]
        expected = ["hello", "world"]
        actual = _split_on(terms)
        self.assertEqual(actual, expected)

        terms = {"hello": "world"}
        expected = [{"hello": "world"}]
        actual = _split_on(terms)
        self.assertEqual(actual, [expected])

    def test_process_terms(self):
        terms = ["file1.txt", "file2.txt"]
        variables = {}
        kwargs = {}
        expected = ["file1.txt", "file2.txt"]
        actual, skip = self.lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(actual, expected)
        self.assertFalse(skip)

        terms = [{"files": "file1.txt", "paths": "/path/to/files"}, "file2.txt"]
        variables = {}
        kwargs = {}
        expected = ["/path/to/files/file1.txt", "file2.txt"]
        actual, skip = self.lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(actual, expected)
        self.assertFalse(skip)

        terms = [{"files": "file1.txt", "paths": "/path/to/files", "skip": True}, "file2.txt"]
        variables = {}
        kwargs = {}
        expected = ["/path/to/files/file1.txt", "file2.txt"]
        actual, skip = self.lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(actual, expected)
        self.assertTrue(skip)

    def test_run(self):
        terms = ["file1.txt", "file2.txt"]
        variables = {}
        kwargs = {}
        expected = ["path/to/file1.txt"]
        def test_run_first_found_lookup(self):
        self.assertEqual(actual, expected)

        terms = [{"files": "file1.txt", "paths": "/path/to/files"}, "file2.txt"]
        variables = {}
        kwargs = {}
        expected = ["/path/to/files/file1.txt"]
        actual = self.lookup.run(terms, variables, **kwargs)
        self.assertEqual(actual, expected)

        terms = [{"files": "file1.txt", "paths": "/path/to/files", "skip": True}, "file2.txt"]
        variables = {}
        kwargs = {}
        expected = []
        actual = self.lookup.run(terms, variables, **kwargs)
        self.assertEqual(actual, expected)

if __name__ == '__main__':
    unittest.main()