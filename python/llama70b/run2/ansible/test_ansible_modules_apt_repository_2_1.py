import unittest
from ansible.modules.apt_repository import SourcesList, DEFAULT_SOURCES_PERM, VALID_SOURCE_TYPES


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        self.assertIsInstance(sl, SourcesList)

    def test_load(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        file = 'test.list'
        with open(file, 'w') as f:
            f.write('deb http://example.com/ubuntu hardy partner')
        sl.load(file)
        self.assertIn(file, sl.files)

    def test_modify(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        file = 'test.list'
        with open(file, 'w') as f:
            f.write('deb http://example.com/ubuntu hardy partner')
        sl.load(file)
        sl.modify(file, 0, enabled=True, source='deb http://example.com/ubuntu hardy partner', comment='Test comment')
        self.assertEqual(sl.files[file][0][1:], (True, 'deb http://example.com/ubuntu hardy partner', 'Test comment'))

    def test_add_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        line = 'deb http://example.com/ubuntu hardy partner'
        sl.add_source(line)
        self.assertIn(line, [src for _, _, src, _ in sl.files.values()])

    def test_remove_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        line = 'deb http://example.com/ubuntu hardy partner'
        sl.add_source(line)
        sl.remove_source(line)
        self.assertNotIn(line, [src for _, _, src, _ in sl.files.values()])

    def test__add_valid_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        source_new = 'deb http://example.com/ubuntu hardy partner'
        comment_new = 'Test comment'
        file = 'test.list'
        sl._add_valid_source(source_new, comment_new, file=file)
        self.assertIn(file, sl.files)
        self.assertIn(source_new, [src for _, _, src, _ in sl.files.values()])

    def test__remove_valid_source(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        source = 'deb http://example.com/ubuntu hardy partner'
        sl.add_source(source)
        sl._remove_valid_source(source)
        self.assertNotIn(source, [src for _, _, src, _ in sl.files.values()])

    def test__parse(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        line = 'deb http://example.com/ubuntu hardy partner'
        result = sl._parse(line, raise_if_invalid_or_disabled=True)
        self.assertEqual(result, (True, 'deb', 'http://example.com/ubuntu', 'hardy partner'))

    def test__apt_cfg_file(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        result = sl._apt_cfg_file('Dir::Etc::sourcelist')
        self.assertIsInstance(result, str)

    def test__apt_cfg_dir(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        result = sl._apt_cfg_dir('Dir::Etc::sourceparts')
        self.assertIsInstance(result, str)

    def test__expand_path(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        file = 'test.list'
        result = sl._expand_path(file)
        self.assertIsInstance(result, str)

    def test__suggest_filename(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        source = 'deb http://example.com/ubuntu hardy partner'
        result = sl._suggest_filename(source)
        self.assertIsInstance(result, str)

    def test__choice(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        enabled = True
        enabled_old = False
        result = sl._choice(enabled, enabled_old)
        self.assertEqual(result, enabled)

class TestDEFAULT_SOURCES_PERM(unittest.TestCase):
    def test_DEFAULT_SOURCES_PERM(self):
        self.assertEqual(DEFAULT_SOURCES_PERM, 420)

class TestVALID_SOURCE_TYPES(unittest.TestCase):
    def test_VALID_SOURCE_TYPES(self):
        self.assertEqual(VALID_SOURCE_TYPES, ('deb', 'deb-src'))

if __name__ == '__main__':
    unittest.main()