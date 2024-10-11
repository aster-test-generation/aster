import unittest
from ansible.plugins.lookup import first_found


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        result = instance.run(terms=None, variables=None, **kwargs)
        self.assertEqual(result, None)

    def test_process_terms(self):
        instance = LookupModule()
        result = instance._process_terms(terms=None, variables=None, kwargs=None)
        self.assertEqual(result, None)

    def test_find_file_in_search_path(self):
        instance = LookupModule()
        result = instance.find_file_in_search_path(variables=None, subdir=None, fn=None, ignore_missing=None)
        self.assertEqual(result, None)

    def test_set_options(self):
        instance = LookupModule()
        result = instance.set_options(var_options=None, direct=None)
        self.assertEqual(result, None)

    def test_get_option(self):
        instance = LookupModule()
        result = instance.get_option(option=None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()