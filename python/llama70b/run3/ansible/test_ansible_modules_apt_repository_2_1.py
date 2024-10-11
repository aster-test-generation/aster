import unittest
from ansible.modules.apt_repository import SourcesList, DEFAULT_SOURCES_PERM, VALID_SOURCE_TYPES


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        self.assertIsInstance(sources_list, SourcesList)

    def test_load(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        sources_list.load('/path/to/sources.list')
        self.assertIn('/path/to/sources.list', sources_list.files)

    def test_modify(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        sources_list.files['/path/to/sources.list'] = [(1, True, 'deb', 'http://example.com', 'Comment')]
        sources_list.modify('/path/to/sources.list', 1, enabled=True, source='http://example.com', comment='New Comment')
        self.assertEqual(sources_list.files['/path/to/sources.list'][0][4], 'New Comment')

    def test_add_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        sources_list.add_source('deb http://example.com stable main', comment='New Source', file='/path/to/sources.list')
        self.assertIn('/path/to/sources.list', sources_list.files)
        self.assertIn('http://example.com', [src for _, _, src, _ in sources_list.files['/path/to/sources.list']])

    def test_remove_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        sources_list.files['/path/to/sources.list'] = [(1, True, 'deb', 'http://example.com', 'Comment')]
        sources_list.remove_source('deb http://example.com stable main')
        self.assertNotIn('http://example.com', [src for _, _, src, _ in sources_list.files['/path/to/sources.list']])

    def test__add_valid_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        sources_list._add_valid_source('http://example.com', 'New Source', file='/path/to/sources.list')
        self.assertIn('/path/to/sources.list', sources_list.files)
        self.assertIn('http://example.com', [src for _, _, src, _ in sources_list.files['/path/to/sources.list']])

    def test__remove_valid_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        sources_list.files['/path/to/sources.list'] = [(1, True, 'deb', 'http://example.com', 'Comment')]
        sources_list._remove_valid_source('http://example.com')
        self.assertNotIn('http://example.com', [src for _, _, src, _ in sources_list.files['/path/to/sources.list']])

    def test__parse(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        result = sources_list._parse('deb http://example.com stable main', raise_if_invalid_or_disabled=True)
        self.assertEqual(result, (True, True, 'http://example.com'))

    def test__apt_cfg_file(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        result = sources_list._apt_cfg_file('Dir::Etc::sourcelist')
        self.assertIsInstance(result, str)

    def test__apt_cfg_dir(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        result = sources_list._apt_cfg_dir('Dir::Etc::sourceparts')
        self.assertIsInstance(result, str)

    def test__expand_path(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        result = sources_list._expand_path('/path/to/sources.list')
        self.assertIsInstance(result, str)

    def test__suggest_filename(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        result = sources_list._suggest_filename('http://example.com')
        self.assertIsInstance(result, str)

    def test__choice(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        result = sources_list._choice(True, False)
        self.assertTrue(result)

class TestDEFAULT_SOURCES_PERM(unittest.TestCase):
    def test_DEFAULT_SOURCES_PERM(self):
        self.assertEqual(DEFAULT_SOURCES_PERM, 420)

class TestVALID_SOURCE_TYPES(unittest.TestCase):
    def test_VALID_SOURCE_TYPES(self):
        self.assertEqual(VALID_SOURCE_TYPES, ('deb', 'deb-src'))

if __name__ == '__main__':
    unittest.main()