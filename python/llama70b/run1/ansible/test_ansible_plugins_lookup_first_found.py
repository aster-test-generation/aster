import unittest
from ansible.plugins.lookup import first_found as LookupModul


class TestLookupModule(unittest.TestCase):
    def test_init(self):
        instance = LookupModule()
        self.assertIsInstance(instance, LookupModule)

    def test_process_terms(self):
        instance = LookupModule()
        terms = ['file1', 'file2']
        variables = {}
        kwargs = {}
        result, skip = instance._process_terms(terms, variables, kwargs)
        self.assertIsInstance(result, list)
        self.assertIsInstance(skip, bool)

    def test_process_terms_mapping(self):
        instance = LookupModule()
        terms = [{'files': 'file1', 'paths': 'path1'}]
        variables = {}
        kwargs = {}
        result, skip = instance._process_terms(terms, variables, kwargs)
        self.assertIsInstance(result, list)
        self.assertIsInstance(skip, bool)

    def test_process_terms_sequence(self):
        instance = LookupModule()
        terms = [['file1', 'file2'], ['file3', 'file4']]
        variables = {}
        kwargs = {}
        result, skip = instance._process_terms(terms, variables, kwargs)
        self.assertIsInstance(result, list)
        self.assertIsInstance(skip, bool)

    def test_run(self):
        instance = LookupModule()
        terms = ['file1', 'file2']
        variables = {}
        result = instance.run(terms, variables)
        self.assertIsInstance(result, list)

    def test_run_skip(self):
        instance = LookupModule()
        terms = ['file1', 'file2']
        variables = {}
        kwargs = {'skip': True}
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [])

    def test_find_file_in_search_path(self):
        instance = LookupModule()
        variables = {}
        subdir = 'files'
        fn = 'file1'
        result = instance.find_file_in_search_path(variables, subdir, fn, ignore_missing=True)
        self.assertIsInstance(result, str)

    def test_set_options(self):
        instance = LookupModule()
        variables = {}
        direct = {'files': 'file1', 'paths': 'path1'}
        instance.set_options(var_options=variables, direct=direct)
        self.assertIsInstance(instance.get_option('files'), str)

    def test_get_option(self):
        instance = LookupModule()
        instance.set_options(var_options={}, direct={'files': 'file1', 'paths': 'path1'})
        result = instance.get_option('files')
        self.assertEqual(result, 'file1')

    def test__templar_template(self):
        instance = LookupModule()
        fn = 'file1'
        result = instance._templar.template(fn)
        self.assertEqual(result, 'file1')

    def test_str_method(self):
        instance = LookupModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = LookupModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestSplitOnFunction(unittest.TestCase):
    def test_split_on(self):
        result = _split_on('file1,file2;file3', ',;')
        self.assertEqual(result, ['file1', 'file2', 'file3'])

    def test_split_on_sequence(self):
        result = _split_on(['file1', 'file2', 'file3'], ',;')
        self.assertEqual(result, ['file1', 'file2', 'file3'])

if __name__ == '__main__':
    unittest.main()