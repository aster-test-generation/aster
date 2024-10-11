import unittest
from ansible.plugins.lookup import first_found


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [path])

    def test__process_terms(self):
        instance = LookupModule()
        result = instance._process_terms(terms, variables, kwargs)
        self.assertEqual(result, (total_search, skip))

    def test__split_on(self):
        instance = LookupModule()
        result = instance._split_on(terms, spliters)
        self.assertEqual(result, termlist)

    def test_set_options(self):
        instance = LookupModule()
        result = instance.set_options(var_options=variables, direct=kwargs)
        self.assertEqual(result, None)

    def test_get_option(self):
        instance = LookupModule()
        result = instance.get_option(files)
        self.assertEqual(result, filelist)

    def test_find_file_in_search_path(self):
        instance = LookupModule()
        result = instance.find_file_in_search_path(variables, subdir, fn, ignore_missing=True)
        self.assertEqual(result, path)

if __name__ == '__main__':
    unittest.main()