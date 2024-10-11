import unittest
from ansible.modules.apt_repository import SourcesList, DEFAULT_SOURCES_PERM, VALID_SOURCE_TYPES


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        self.assertIsInstance(sources_list, SourcesList)

    def test_modify(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        file = 'test.list'
        n = 0
        enabled = True
        source = 'deb http://example.com/ubuntu'
        comment = 'Test comment'
        sources_list.modify(file, n, enabled, source, comment)
        self.assertIn(file, sources_list.files)
        self.assertEqual(sources_list.files[file][n][1:], (True, source, comment))

    def test_add_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        line = 'deb http://example.com/ubuntu'
        comment = 'Test comment'
        file = 'test.list'
        sources_list.add_source(line, comment, file)
        self.assertIn(file, sources_list.files)
        self.assertIn(line, [src for _, _, src, _ in sources_list.files[file]])

    def test_remove_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        line = 'deb http://example.com/ubuntu'
        sources_list.add_source(line)
        sources_list.remove_source(line)
        self.assertNotIn(line, [src for _, _, src, _ in sources_list.files[sources_list.default_file]])

    def test__add_valid_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        source_new = 'deb http://example.com/ubuntu'
        comment_new = 'Test comment'
        file = 'test.list'
        sources_list._add_valid_source(source_new, comment_new, file)
        self.assertIn(file, sources_list.files)
        self.assertIn(source_new, [src for _, _, src, _ in sources_list.files[file]])

    def test__remove_valid_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        source = 'deb http://example.com/ubuntu'
        sources_list.add_source(source)
        sources_list._remove_valid_source(source)
        self.assertNotIn(source, [src for _, _, src, _ in sources_list.files[sources_list.default_file]])

    def test__parse(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        line = 'deb http://example.com/ubuntu'
        result = sources_list._parse(line)
        self.assertEqual(result, (True, True, line, ''))

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
        file = 'test.list'
        result = sources_list._expand_path(file)
        self.assertIsInstance(result, str)

    def test__suggest_filename(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        source = 'deb http://example.com/ubuntu'
        result = sources_list._suggest_filename(source)
        self.assertIsInstance(result, str)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        result = str(sources_list)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        result = repr(sources_list)
        self.assertIsInstance(result, str)

class TestDEFAULT_SOURCES_PERM(unittest.TestCase):
    def test_DEFAULT_SOURCES_PERM(self):
        self.assertEqual(DEFAULT_SOURCES_PERM, 420)

class TestVALID_SOURCE_TYPES(unittest.TestCase):
    def test_VALID_SOURCE_TYPES(self):
        self.assertEqual(VALID_SOURCE_TYPES, ('deb', 'deb-src'))

if __name__ == '__main__':
    unittest.main()