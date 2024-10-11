import unittest
from ansible.modules.apt_repository import SourcesList, DEFAULT_SOURCES_PERM, VALID_SOURCE_TYPES


class TestSourcesList(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        self.assertIsInstance(sources_list, SourcesList)

    def test___iter__(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        self.assertIsInstance(iter(sources_list), iter)

    def test__expand_path(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        filename = 'test.list'
        expanded_path = sources_list._expand_path(filename)
        self.assertEqual(expanded_path, os.path.abspath(os.path.join(sources_list._apt_cfg_dir('Dir::Etc::sourceparts'), filename)))

    def test__suggest_filename(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        filename = sources_list._suggest_filename(line)
        self.assertEqual(filename, 'archive_canonical_com_ubuntu.list')

    def test__parse(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        valid, enabled, source, comment = sources_list._parse(line)
        self.assertTrue(valid)
        self.assertTrue(enabled)
        self.assertEqual(source, 'deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertEqual(comment, '')

    def test_load(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        filename = 'test.list'
        with open(filename, 'w') as f:
            f.write('deb http://archive.canonical.com/ubuntu hardy partner\n')
        sources_list.load(filename)
        self.assertIn(filename, sources_list.files)

    def test_default_file(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        default_file = sources_list.default_file
        self.assertEqual(default_file, sources_list._apt_cfg_file('Dir::Etc::sourcelist'))

class TestDEFAULT_SOURCES_PERM(unittest.TestCase):
    def test_DEFAULT_SOURCES_PERM(self):
        self.assertEqual(DEFAULT_SOURCES_PERM, 420)

class TestVALID_SOURCE_TYPES(unittest.TestCase):
    def test_VALID_SOURCE_TYPES(self):
        self.assertEqual(VALID_SOURCE_TYPES, ('deb', 'deb-src'))

if __name__ == '__main__':
    unittest.main()