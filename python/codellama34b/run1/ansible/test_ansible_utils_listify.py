import unittest
from ansible.utils.listify import listify_lookup_plugin_terms
from ansible.utils.listify import *


class TestListifyLookupPluginTerms(unittest.TestCase):
    def test_listify_lookup_plugin_terms(self):
        terms = "test"
        templar = "test"
        loader = "test"
        fail_on_undefined = True
        convert_bare = False
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["test"])

class TestListifyLookupPluginTerms(unittest.TestCase):
    def test_listify_lookup_plugin_terms(self):
        terms = "test"
        templar = "test"
        loader = "test"
        fail_on_undefined = True
        convert_bare = False
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["test"])

    def test_listify_lookup_plugin_terms_2(self):
        terms = ["test"]
        templar = "test"
        loader = "test"
        fail_on_undefined = True
        convert_bare = False
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["test"])

    def test_listify_lookup_plugin_terms_3(self):
        terms = "test"
        templar = "test"
        loader = "test"
        fail_on_undefined = False
        convert_bare = False
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["test"])

    def test_listify_lookup_plugin_terms_4(self):
        terms = ["test"]
        templar = "test"
        loader = "test"
        fail_on_undefined = False
        convert_bare = False
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["test"])

    def test_listify_lookup_plugin_terms_5(self):
        terms = "test"
        templar = "test"
        loader = "test"
        fail_on_undefined = True
        convert_bare = True
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["test"])

    def test_listify_lookup_plugin_terms_6(self):
        terms = ["test"]
        templar = "test"
        loader = "test"
        fail_on_undefined = True
        convert_bare = True
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["test"])

    def test_listify_lookup_plugin_terms_7(self):
        terms = "test"
        templar = "test"
        loader = "test"
        fail_on_undefined = False
        convert_bare = True
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["test"])

    def test_listify_lookup_plugin_terms_8(self):
        terms = ["test"]
        templar = "test"
        loader = "test"
        fail_on_undefined = False
        convert_bare = True
        result = listify_lookup_plugin_terms(terms, templar, loader, fail_on_undefined, convert_bare)
        self.assertEqual(result, ["test"])

if __name__ == '__main__':
    unittest.main()