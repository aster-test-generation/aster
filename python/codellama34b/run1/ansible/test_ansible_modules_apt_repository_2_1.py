import unittest
from ansible.modules.apt_repository import *



class TestSourcesList(unittest.TestCase):
    def test_init(self):
        instance = SourcesList()
        self.assertEqual(instance.apt, None)
        self.assertEqual(instance.apt_pkg, None)
        self.assertEqual(instance.aptsources_distro, None)
        self.assertEqual(instance.distro, None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_apt_cfg_file(self):
        instance = SourcesList(None)
        result = instance._apt_cfg_file('Dir::Etc::sourcelist')
        self.assertEqual(result, None)

    def test_apt_cfg_dir(self):
        instance = SourcesList()
        result = instance._apt_cfg_dir('Dir::Etc::sourceparts')
        self.assertEqual(result, None)

    def test_expand_path(self):
        instance = SourcesList()
        result = instance._expand_path('path')
        self.assertEqual(result, 'path')

    def test_choice(self):
        instance = SourcesList()
        result = instance._choice('a', 'b')
        self.assertEqual(result, 'a')

    def test_parse(self):
        instance = SourcesList()
        result = instance._parse('line', raise_if_invalid_or_disabled=True)
        self.assertEqual(result, None)

    def test_suggest_filename(self):
        instance = SourcesList()
        result = instance._suggest_filename('source')
        self.assertEqual(result, None)

    def test_load(self):
        instance = SourcesList()
        result = instance.load('file')
        self.assertEqual(result, None)

    def test_add_valid_source(self):
        instance = SourcesList(None)
        result = instance._add_valid_source('source', 'comment', 'file')
        self.assertEqual(result, None)

    def test_remove_valid_source(self):
        instance = SourcesList()
        result = instance._remove_valid_source('source')
        self.assertEqual(result, None)

    def test_add_source(self):
        instance = SourcesList()
        result = instance.add_source('line', 'comment', 'file')
        self.assertEqual(result, None)

    def test_remove_source(self):
        instance = SourcesList()
        result = instance.remove_source('line')
        self.assertEqual(result, None)

    def test_iter(self):
        instance = SourcesList()
        result = instance.__iter__()
        self.assertEqual(result, None)

    def test_len(self):
        instance = SourcesList(None)
        result = instance.__len__()
        self.assertEqual(result, None)

    def test_getitem(self):
        instance = SourcesList()
        result = instance.__getitem__('key')
        self.assertEqual(result, None)

    def test_setitem(self):
        instance = SourcesList()
        result = instance.__setitem__('key', 'value')
        self.assertEqual(result, None)

    def test_delitem(self):
        instance = SourcesList()
        result = instance.__delitem__('key')
        self.assertEqual(result, None)

    def test_contains(self):
        instance = SourcesList()
        result = instance.__contains__('key')
        self.assertEqual(result, None)

    def test_iteritems(self):
        instance = SourcesList()
        result = instance.__iteritems__()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()