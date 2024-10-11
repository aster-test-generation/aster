import unittest
from ansible.modules.apt_repository import SourcesList, DEFAULT_SOURCES_PERM, VALID_SOURCE_TYPES


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertIsInstance(sources_list, SourcesList)

    def test_iter(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertIsInstance(sources_list.__iter__(), types.GeneratorType)

    def test_expand_path(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._expand_path('file.list'), '/path/to/file.list')

    def test_suggest_filename(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._suggest_filename('deb http://example.com/ubuntu'), 'example_com_ubuntu.list')

    def test_parse(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._parse('deb http://example.com/ubuntu'), (True, True, 'deb http://example.com/ubuntu', ''))
        self.assertEqual(sources_list._parse('# deb http://example.com/ubuntu'), (True, False, 'deb http://example.com/ubuntu', ''))
        self.assertRaises(InvalidSource, sources_list._parse, 'invalid source')

    def test_apt_cfg_file(self):
        self.assertEqual(SourcesList._apt_cfg_file('Dir::Etc::sourcelist'), '/etc/apt/sources.list')

    def test_default_sources_perm(self):
        self.assertEqual(DEFAULT_SOURCES_PERM, 420)

    def test_valid_source_types(self):
        self.assertEqual(VALID_SOURCE_TYPES, ('deb', 'deb-src'))

if __name__ == '__main__':
    unittest.main()