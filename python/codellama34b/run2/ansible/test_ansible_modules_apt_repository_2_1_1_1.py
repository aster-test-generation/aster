import unittest
from ansible.modules.apt_repository import *



class TestSourcesList(unittest.TestCase):
    def test_init(self):
        instance = SourcesList(None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, self._apt_cfg_file('Dir::Etc::sourcelist'))

    def test_expand_path(self):
        instance = SourcesList(None)
        result = instance._expand_path('filename')
        self.assertEqual(result, 'filename')

    def test_suggest_filename(self):
        instance = SourcesList(None)
        result = instance._suggest_filename('line')
        self.assertEqual(result, '_line.list')

    def test_parse(self):
        instance = SourcesList(None)
        result = instance._parse('line', False)
        self.assertEqual(result, (False, True, 'line', ''))

    def test_load(self):
        instance = SourcesList(None)
        instance.load('filename')
        self.assertEqual(instance.files, {'filename': []})

    def test_iter(self):
        instance = SourcesList(None)
        result = instance.__iter__()
        self.assertEqual(result, [])

    def test_add_source(self):
        instance = SourcesList(None)
        instance.add_source('filename', 'source', 'comment')
        self.assertEqual(instance.files, {'filename': [('source', 'comment')]})

    def test_remove_source(self):
        instance = SourcesList(None)
        instance.remove_source('filename', 'source', 'comment')
        self.assertEqual(instance.files, {'filename': [('source', 'comment')]})

    def test_find_source(self):
        instance = SourcesList(None)
        result = instance.find_source('source')
        self.assertEqual(result, None)

    def test_find_duplicate_source(self):
        instance = SourcesList(None)
        result = instance.find_duplicate_source('source')
        self.assertEqual(result, None)

    def test_write(self):
        instance = SourcesList(None)
        instance.write('filename')
        self.assertEqual(instance.files, {'filename': []})

    def test_save(self):
        instance = SourcesList(None)
        instance.save()
        self.assertEqual(instance.files, {})

    def test_get_updated_sources_list(self):
        instance = SourcesList(None)
        result = instance.get_updated_sources_list()
        self.assertEqual(result, [])

    def test_get_invalid_or_disabled_sources_list(self):
        instance = SourcesList(None)
        result = instance.get_invalid_or_disabled_sources_list()
        self.assertEqual(result, [])

    def test_get_new_sources_list(self):
        instance = SourcesList(None)
        result = instance.get_new_sources_list()
        self.assertEqual(result, [])

    def test_get_removed_sources_list(self):
        instance = SourcesList(None)
        result = instance.get_removed_sources_list()
        self.assertEqual(result, [])

    def test_get_changed_sources_list(self):
        instance = SourcesList(None)
        result = instance.get_changed_sources_list()
        self.assertEqual(result, [])

    def test_get_sources_list(self):
        instance = SourcesList(None)
        result = instance.get_sources_list()
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()