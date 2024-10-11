import unittest
from ansible.modules.apt_repository import *



class TestSourcesList(unittest.TestCase):
    def test_init(self):
        instance = SourcesList(None)
        self.assertIsNotNone(instance)

    def test_modify(self):
        instance = SourcesList()
        instance.files = {'file': [(1, True, True, 'source', 'comment')]}
        instance.modify('file', 1, enabled=False)
        self.assertEqual(instance.files['file'][0][2], False)

    def test_add_valid_source(self):
        instance = SourcesList()
        instance._add_valid_source('source', 'comment', 'file')
        self.assertEqual(instance.files['file'][0][3], 'source')

    def test_remove_valid_source(self):
        instance = SourcesList()
        instance.files = {'file': [(1, True, True, 'source', 'comment')]}
        instance._remove_valid_source('source')
        self.assertEqual(instance.files['file'], [])

    def test_add_source(self):
        instance = SourcesList()
        instance.add_source('line', 'comment', 'file')
        self.assertEqual(instance.files['file'][0][3], 'line')

    def test_remove_source(self):
        instance = SourcesList()
        instance.files = {'file': [(1, True, True, 'source', 'comment')]}
        instance.remove_source('line')
        self.assertEqual(instance.files['file'], [])

    def test_parse(self):
        instance = SourcesList()
        result = instance._parse('line', raise_if_invalid_or_disabled=True)
        self.assertEqual(result, (True, True, 'line'))

    def test_expand_path(self):
        instance = SourcesList()
        result = instance._expand_path('path')
        self.assertEqual(result, 'path')

    def test_suggest_filename(self):
        instance = SourcesList()
        result = instance._suggest_filename('source')
        self.assertEqual(result, 'source')

    def test_choice(self):
        instance = SourcesList()
        result = instance._choice('new', 'old')
        self.assertEqual(result, 'new')

    def test_apt_cfg_dir(self):
        instance = SourcesList()
        result = instance._apt_cfg_dir('Dir::Etc::sourceparts')
        self.assertEqual(result, 'Dir::Etc::sourceparts')

    def test_apt_cfg_file(self):
        instance = SourcesList()
        result = instance._apt_cfg_file('Dir::Etc::sourcelist')
        self.assertEqual(result, 'Dir::Etc::sourcelist')

    def test_load(self):
        instance = SourcesList()
        instance.load('file')
        self.assertEqual(instance.files['file'], [])

    def test_iter(self):
        instance = SourcesList()
        instance.files = {'file': [(1, True, True, 'source', 'comment')]}
        result = instance.__iter__()
        self.assertEqual(result, iter(instance.files['file']))

    def test_getitem(self):
        instance = SourcesList()
        instance.files = {'file': [(1, True, True, 'source', 'comment')]}
        result = instance.__getitem__('file')
        self.assertEqual(result, instance.files['file'])

    def test_setitem(self):
        instance = SourcesList(None)
        instance.files = {'file': [(1, True, True, 'source', 'comment')]}
        instance.__setitem__('file', 'value')
        self.assertEqual(instance.files['file'], 'value')

if __name__ == '__main__':
    unittest.main()